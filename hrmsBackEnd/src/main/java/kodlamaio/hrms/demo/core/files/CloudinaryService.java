package kodlamaio.hrms.demo.core.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.ErrorDataResult;
import kodlamaio.hrms.demo.core.utilities.SuccessDataResult;



public class CloudinaryService implements ImageService{

	private Cloudinary cloudinary;
	private Map<String, String> valuesMap = new HashMap<>();
	
	@Autowired
    public CloudinaryService() {
        valuesMap.put("cloud_name","dubah0hlc" );
        valuesMap.put("api_key", "985935844311119" );
        valuesMap.put("api_secret","8xm-Rw6jxvlSILP8PZbhignlteSvJ8A" );
        cloudinary = new Cloudinary(valuesMap);
    }
	
    @Override
    public DataResult<?> save(MultipartFile file) {
        try{
            Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(uploadResult);
        } catch (IOException e){
            e.printStackTrace();
        }
        return new ErrorDataResult<Map>();
    }
	
	@Override
	public DataResult<Map> upload(MultipartFile multipartFile) throws IOException {
		
		 Map<String , Object > options = new HashMap<>();
	        var allowedFormats = Arrays.asList("png","jpg","jpeg");
	        options.put("allowed_formats",allowedFormats);
	        File file = convert(multipartFile);
	        Map result= null;
	        try {
	            result = cloudinary.uploader().upload(file, options);
	        }catch (Exception e){
	            return new ErrorDataResult<>(e.getMessage());
	        }
	        file.delete();
	        return new SuccessDataResult<>(result);

	}

	@Override
	public DataResult<Map> delete(String id) throws IOException {
		
		 Map<String , Boolean> options = new HashMap<>();
	        options.put("invalidate",true);
	        Map result = cloudinary.uploader().destroy(id,options);
	        return new SuccessDataResult<>(result);
	}
	
	 private File convert(MultipartFile multipartFile) throws IOException {
	        File file = new File(multipartFile.getOriginalFilename());
	        FileOutputStream stream = new FileOutputStream(file);
	        stream.write(multipartFile.getBytes());
	        stream.close();

	        return file;
	    }

}

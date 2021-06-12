package kodlamaio.hrms.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import kodlamaio.hrms.demo.core.files.CloudinaryService;
import kodlamaio.hrms.demo.core.files.ImageService;

public class Config {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	
    public Cloudinary cloudinaryService(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dubah0hlc",
                "api_key", "985935844311119",
                "api_secret", "Rw6jxvlSILP8PZbhignlteSvJ8A"));
    }

    @Bean
    public ImageService imageService(){
        return new CloudinaryService();
    }
    
    
}

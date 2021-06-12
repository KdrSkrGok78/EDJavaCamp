package kodlamaio.hrms.demo.core.files;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.demo.core.utilities.DataResult;

public interface ImageService {
	DataResult<?> save(MultipartFile file);
	DataResult<Map> upload(MultipartFile multipartFile) throws IOException;
	DataResult<Map> delete (String id) throws IOException;
}

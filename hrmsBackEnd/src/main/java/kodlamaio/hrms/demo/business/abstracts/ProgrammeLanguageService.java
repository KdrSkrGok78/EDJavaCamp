package kodlamaio.hrms.demo.business.abstracts;

import java.util.List;

import kodlamaio.hrms.demo.core.utilities.DataResult;
import kodlamaio.hrms.demo.core.utilities.Result;
import kodlamaio.hrms.demo.entities.concretes.ProgrammeLanguage;

public interface ProgrammeLanguageService {

	DataResult<List<ProgrammeLanguage>> getAll();
	Result add(ProgrammeLanguage programmeLanguage);
}

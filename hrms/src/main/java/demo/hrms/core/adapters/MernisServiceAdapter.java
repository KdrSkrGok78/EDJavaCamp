package demo.hrms.core.adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import demo.hrms.business.abstracts.CandidateCheckService;
import demo.hrms.entities.concrete.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CandidateCheckService{

	@Override
	public boolean checkIfRealPerson(Candidate candidate) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(Long.parseLong(candidate.getTcNo()),
				candidate.getFirstName(),
				candidate.getLastName(), 
				candidate.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
	}

}

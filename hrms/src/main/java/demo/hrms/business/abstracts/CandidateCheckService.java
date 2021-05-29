package demo.hrms.business.abstracts;

import java.rmi.RemoteException;

import demo.hrms.entities.concrete.Candidate;
import demo.hrms.entities.concrete.User;

public interface CandidateCheckService {

	boolean checkIfRealPerson(Candidate candidate) throws NumberFormatException, RemoteException;
}

package be.ipeters.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.ipeters.home.model.BankAccount;
import be.ipeters.home.repos.BankAccountRepository;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	BankAccountRepository repository;
	
	@Override
	public void transfer(int amount) {

		BankAccount obamasAccount = repository.findById(1).get();
		obamasAccount.setBal(obamasAccount.getBal()-amount);
		repository.save(obamasAccount);
		
		BankAccount trumpsAccount = repository.findById(2).get();
		trumpsAccount.setBal(trumpsAccount.getBal()+amount);
		repository.save(trumpsAccount);
		
	}

	@Override
	public void getInfo(int id) {

		BankAccount obamasAccount = repository.findById(1).get();
		System.out.println("obA: "+obamasAccount.toString());
	}

}

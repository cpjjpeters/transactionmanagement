package be.ipeters.home.repos;

import org.springframework.data.repository.CrudRepository;

import be.ipeters.home.model.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {

}

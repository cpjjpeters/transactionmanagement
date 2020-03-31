package be.ipeters.home;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import be.ipeters.home.service.BankAccountService;


@SpringBootTest
class TransactionmanagementApplicationTests {

	@Autowired
	BankAccountService service;
	
	@Test
	void testTransfer() {
		service.transfer(500);
	}

	@Test
	void testInfo() {
		service.getInfo(1);
		
	}
}

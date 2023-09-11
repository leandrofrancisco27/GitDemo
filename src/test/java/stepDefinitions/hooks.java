package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	// coments
	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("******************");
		System.out.println("setup the entries in Netbanking database");
	}
	// coments
	@After
	public void tearDown() {
		System.out.println("clear the entries");
	}
	// coments
	@Before("@Mortgage")
	public void mortgageSetup() {
		
		System.out.println("setup the entries in mortgage database");
	}
}

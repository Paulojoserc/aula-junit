package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTests {
	
	@Test
	public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
		//Arrange
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = AccountFactory.createEmptyAccount();
		//Act
		acc.deposit(amount);
		//Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
 }
	
	@Test
	public void depositShouldDoNothingWhenNegativeAmount() {
		//Arrange
		double expectedValue = 196.0;
		Account acc = AccountFactory.createAccount(expectedValue);
		double amount = -200.0;
		//Act
		acc.deposit(amount);
		//Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
 }
	
}

package com.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

import com.bank.model.Bank;
import com.bank.repo.BankRepo;

@Service
public class BankServiceImp implements BankService {
	@Autowired
	public BankRepo repo;

	@Override
	public Bank saveBank(Bank bank) {
		bank.setStatus("Active");
		return repo.save(bank);
	}

	@Override
	public void deleteBank(long account_number) {
		// TODO Auto-generated method stub

	}

	@Override
	public Bank getBank(long account_number, String password, Bank bank) {
		String pass = bank.getPassword();

		if (password.equals(pass)) {
			Bank getOne = repo.findById(account_number).get();

			return getOne;
		} else
			return null;

	}

	@Override
	public List<Bank> getAllBank() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bank withdrawBank(Bank bank, long account_number, double amount) {
		Optional<Bank> deposit2 = repo.findById(account_number);

		// Check if deposit2 is not null and the provided account_number matches the one
		// from the database
		if (deposit2.isPresent()) {
			Bank bank1 = deposit2.get();
			double depo = bank1.getAmount() - amount;
			bank1.setAmount(depo);
			return repo.save(bank1);
		}

		else {

			return null; // Or handle it appropriately
		}
	}

	@Override
	public Bank depositBank(Bank bank, long account_number, double amount) {
		Optional<Bank> deposit2 = repo.findById(account_number);

		// Check if deposit2 is not null and the provided account_number matches the one
		// from the database
		if (deposit2.isPresent()) {
			Bank bank1 = deposit2.get();
			double depo = bank1.getAmount() + amount;
			bank1.setAmount(depo);
			return repo.save(bank1);
		}

		else {

			return null; // Or handle it appropriately
		}
	}

	@Override
	public String transferAmount(long senderAccountNumber, long receiverAccountNumber, double amount) {
		Optional<Bank> sender = repo.findById(senderAccountNumber);
		Optional<Bank> receiver = repo.findById(receiverAccountNumber);

		if (sender.isPresent() && receiver.isPresent() && sender.get().getAmount() >= amount) {
			Bank fromBank = sender.get();
			Bank toBank = receiver.get();
			fromBank.setAmount(fromBank.getAmount() - amount);
			toBank.setAmount(toBank.getAmount() + amount); // Corrected the sign here
			repo.save(fromBank);
			repo.save(toBank);
			return "Transfer successful: " + amount + " transferred from account " + senderAccountNumber
					+ " to account " + receiverAccountNumber;
		} else if (sender.isPresent() && receiver.isPresent()) {
			return "Transfer failed: Insufficient funds in account " + senderAccountNumber;
		} else {
			return "Transfer failed: One or both accounts not found";
		}
	}

	@Override
	public String updateStatus(Bank bank, long account_number, String password) {
		if (bank.getAccount_number() == account_number && bank.getPassword().equals(password)) {
			bank.setStatus("DEACTIVE");
			return "success";
		} else {
			return "Please enter valid account number and password";
		}

	}

}

package com.bank.service;

import java.util.List;

import com.bank.model.Bank;

public interface BankService {
 public Bank saveBank(Bank bank);
 public String updateStatus(Bank bank,long account_number,String password);
 public Bank withdrawBank(Bank bank,long account_number,double amount);
 public Bank depositBank(Bank bank,long account_number,double amount);
 public void deleteBank(long account_number);
 public Bank getBank(long account_number,String password,Bank bank);
 public String transferAmount(long senderAccountNumber,long receiverAccountNumber,double amount);
 public List<Bank> getAllBank();
 
}

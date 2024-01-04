package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.model.Bank;
import com.bank.service.BankServiceImp;

@Controller
public class BankController {

	@Autowired
	public BankServiceImp service;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/newacc")
	public String newAccout() {
		return "newaccount";
	}

	@RequestMapping("/save")
	public String saveInfo(Bank bank, ModelMap model) {
		Bank b1 = service.saveBank(bank);
		return "success";
	}

	@RequestMapping("/balance")
	public String banlanceForm() {
		return "balance";
	}

	@RequestMapping("/getbalance")
	public String getBalance(@RequestParam long account_number, @RequestParam String password, ModelMap model,
			Bank bank) {
		Bank bank2 = service.getBank(account_number, password, bank);

		if (bank2 != null) {
			model.addAttribute("bank", bank2);
			return "balanceview";
		} else {
			// Password does not match or bank not found
			model.addAttribute("error", "Invalid account number or password");
			return "errorview"; // You might want to create an error view
		}
	}

	@RequestMapping("/depo2")
	public String balaceDepo() {
		return "depo";
	}

	@RequestMapping("/deposit")
	public String deposit(@RequestParam long account_number, @RequestParam double amount, Bank bank, ModelMap model) {

		Bank bank3 = service.depositBank(bank, account_number, amount);
		if (bank3 != null) {
			model.addAttribute("bank", bank3);
			return "balanceview";
		} else {
			// Password does not match or bank not found
			model.addAttribute("error", "Invalid account number or password");
			return "errorview"; // You might want to create an error view
		}
	}

	@RequestMapping("/withdraw")
	public String banlancewithdraw() {
		return "withdraw";
	}

	@RequestMapping("/withdrawamount")
	public String withdraw(@RequestParam long account_number, @RequestParam double amount, Bank bank, ModelMap model) {

		Bank bank4 = service.withdrawBank(bank, account_number, amount);
		if (bank4 != null) {
			model.addAttribute("bank", bank4);
			return "balanceview";
		} else {
			// Password does not match or bank not found
			model.addAttribute("error", "Invalid account number or password");
			return "errorview"; // You might want to create an error view
		}
	}

	@RequestMapping("/transfer")
	public String transfer() {
		return "transfer";
	}

	@RequestMapping("/transferamount")
	public String transferAmt(@RequestParam long senderAccountNumber, @RequestParam long receiverAccountNumber,
			@RequestParam double amount, ModelMap model) {
		String res = service.transferAmount(senderAccountNumber, receiverAccountNumber, amount);
		model.addAttribute("message", res);
		return "transfersuccess";
	}

	@RequestMapping("/close")
	public String close() {
		return "status";
	}

	@RequestMapping("/closeacc")
	public String closeAcc(@RequestParam long account_number, @RequestParam String password, Bank bank,
			ModelMap model) {
		String res2 = service.updateStatus(bank, account_number, password);
		model.addAttribute("command", res2);
		return "close";
	}

	@RequestMapping("/about")
	public String aboutPage() {
		return "about";
	}
}

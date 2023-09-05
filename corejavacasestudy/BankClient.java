package corejavacasestudy;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BankClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Long, Account> accounts = new HashMap<Long, Account>();
		HashMap<Long, Transaction> transactions = new HashMap<Long, Transaction>();

		long accNo;

		String accHolderName;

		long contactNo;

		float accBalance = 1;

		String typeOfAccount;

		System.out.println("welcome to the bank application");

		boolean value = true;
		Account account;

		while (value) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("***********************");
			System.out.println("1.To create a new bank account");
			System.out.println("2.Check Balance");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Fund transfer");
			System.out.println("6.Print Bank Statement");
			System.out.print("please enter your option:-");
			int option = scan.nextInt();
			switch (option) {

			case 1: {
				System.out.println("*****Your opted for account creation******");
				System.out.print("Enter your name:-");
				accHolderName = scan.next();

				System.out.print("Enter your contact number:-");

				contactNo = scan.nextLong();

				System.out.print("Type of Account:-");

				typeOfAccount = scan.next();

				account = new Account(0, accHolderName, contactNo, typeOfAccount, accBalance);

				accNo = contactNo - 1000000;

				System.out.println("Congrats your account is created with account number:-" + accNo);

				accounts.put(accNo, account);

				break;
			}
			case 2: {
				System.out.println("*****you have opted for balance check********");

				System.out.print("Enter your account number:-");

				accNo = scan.nextLong();

				account = accounts.get(accNo);

				float balance = account.getAccBalance();

				System.out.println("Your account balance is:-" + balance);

				break;
			}
			case 3: {

				System.out.println("*****Deposit*******");
				System.out.print("Enter your acc number:-");
				accNo = scan.nextLong();
				account = accounts.get(accNo);
				System.out.print("Enter your deposit ammount:-");
				float depositAmount = scan.nextFloat();

				float existingAmount = account.getAccBalance();

				float finalAmount = depositAmount + existingAmount;

				account.setAccBalance(finalAmount);

				accounts.put(accNo, account);

				System.out.println("Successfully your amount is created in the account");

				System.out.println("Your current balance is:-" + finalAmount);

				Date date = new Date();

				Random random = new Random();

				int transId = random.nextInt();

				Transaction transaction = new Transaction((int) accNo, "deposit", date, 0, depositAmount, finalAmount,
						transId);

				transactions.put((long) transId, transaction);

				break;
			}
			case 4: {
				System.out.println("*******withdraw**********");

				System.out.print("Enter your account number:-");
				accNo = scan.nextLong();
				account = accounts.get(accNo);
				System.out.print("Enter the withdrawl ammount:-");
				float withdrawlAmount = scan.nextFloat();
				float currentBalance = account.getAccBalance();

				float finalAmount = currentBalance - withdrawlAmount;

				account.setAccBalance(finalAmount);

				System.out.println("Successfully the amount is withdrawn");
				System.out.println("The current balance is:-" + finalAmount);

				Date date = new Date();

				Random random = new Random();

				long transId = random.nextLong();

				Transaction transaction = new Transaction((int) accNo, "withdraw", date, withdrawlAmount, 0,
						finalAmount, (int) transId);

				transactions.put(transId, transaction);

				break;
			}

			case 5: {
				System.out.println("*****Fund Transfer******");
				System.out.print("Enter your from Account number:-");
				long accNoFrom = scan.nextLong();
				System.out.print("Enter your to Account number:-");
				long accNoTo = scan.nextLong();
				System.out.print("Enter your amount to transfer:-");

				float transferAmount = scan.nextFloat();

				Account fromAccount = accounts.get(accNoFrom);

				Account toAccount = accounts.get(accNoTo);

				float fromAccountBalance = fromAccount.getAccBalance();

				float toAccountBalance = toAccount.getAccBalance();

				fromAccountBalance = fromAccountBalance - transferAmount;

				toAccountBalance = toAccountBalance + transferAmount;

				fromAccount.setAccBalance(fromAccountBalance);

				toAccount.setAccBalance(toAccountBalance);

				System.out.println("succesfully the amount is transfered");
				System.out.println("The current balance is:-" + fromAccountBalance);

				Date date = new Date();

				Random random = new Random();

				int transId = random.nextInt();

				Transaction transaction = new Transaction((int) accNoFrom, "fund transfer", date, transferAmount, 0, fromAccountBalance,
						transId);

				transactions.put((long) transId, transaction);

				break;
			}
			case 6: {
				
				System.out.println("******Bank Statement*******");
				
				System.out.println();
				
				System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s","transId","accNo","transType","DOTran","wAmount","DAmount","Balance");
				
				System.out.println();
				Set<Long> set = transactions.keySet();
				
				Iterator itr = set.iterator();
				
				while(itr.hasNext())
				{
					Long key = (Long) itr.next();
					
					Transaction trans = transactions.get(key);
					
					System.out.println(trans.getTransId() + " "+trans.getAccNo() +" "+trans.getTypeOfTrans() + "  "+trans.getDate() +"  "+trans.getWithdrawlammount() +"  "+trans.getDepositammount()+"  "+trans.getBalance());
					
					
					
				}
				
				value = false;
				
				
				
				break;
			}
			default: {
				
				System.out.println("*********Thank you for Choosing our bank***********");
				System.out.println();
				System.out.println("****visit us again*****");
				
				value = false;

				break;

			}

			}

		}

	}

}

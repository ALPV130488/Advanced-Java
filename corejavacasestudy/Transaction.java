package corejavacasestudy;

import java.util.Date;

public class Transaction {
	
	private int accNo;
	
	private String typeOfTrans;
	
	private Date date;
	
	private float withdrawlammount;
	
	private float depositammount;
	
	private float balance;
	
	private int transId;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getTypeOfTrans() {
		return typeOfTrans;
	}

	public void setTypeOfTrans(String typeOfTrans) {
		this.typeOfTrans = typeOfTrans;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getWithdrawlammount() {
		return withdrawlammount;
	}

	public void setWithdrawlammount(float withdrawlammount) {
		this.withdrawlammount = withdrawlammount;
	}

	public float getDepositammount() {
		return depositammount;
	}

	public void setDepositammount(float depositammount) {
		this.depositammount = depositammount;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public long getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Transaction [accNo=" + accNo + ", typeOfTrans=" + typeOfTrans + ", date=" + date + ", withdrawlammount="
				+ withdrawlammount + ", depositammount=" + depositammount + ", balance=" + balance + ", transId="
				+ transId + "]";
	}

	public Transaction(int accNo, String typeOfTrans, Date date, float withdrawlammount, float depositammount,
			float balance, int transId) {
		super();
		this.accNo = accNo;
		this.typeOfTrans = typeOfTrans;
		this.date = date;
		this.withdrawlammount = withdrawlammount;
		this.depositammount = depositammount;
		this.balance = balance;
		this.transId = transId;
	}
	
	

}

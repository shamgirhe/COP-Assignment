/*
 6:create BankAccount   aaplication for operations like withdraw ,
 deposite  and moneyTransfer.
Create menu drive program for bank operations..
 */
package code;

public class Bank {
private int empId;
private int balance;
private String name;
private String emailId;
public Bank(int empId, String name, String emailId,int balance) {
	this.empId = empId;
	this.name = name;
	this.balance=balance;
	this.emailId = emailId;
}
public Bank() {
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}

public void Display()
{
	System.out.println("EmployeeId: "+empId+" \nName: "+name+" \nEmail: "+emailId+"\nbalance:"+balance);
}
 
public void transferMoney(Bank reciver,int amount)
{
	if(this.balance>amount)
	{
	this.balance-=amount;
	}
	else
	{
		System.out.println("low balance");
	}
	reciver.balance+=amount;
	
}

}

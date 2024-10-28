public class BankeApp{
	private String fName;
	private String lName;
	private int pin;
	private double balance;

	public void setName(String fName, String lName){
		this.fName = fName;
		this.lName = lName;
	}
	

	public String getName(){
		return fName + " "+ lName;
	}

	public void setPin(int pin){
		this.pin = pin;
	}
	
	public int getPin(){
		return pin;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setDeposit(double amount){
		if(amount > 0){
			this.balance = balance+amount;
		}
	}
	
	public void setWithdrawal(double amount){
		if(balance > amount){
			this.balance = balance-amount;
		}
		
	}
	
	
	



}
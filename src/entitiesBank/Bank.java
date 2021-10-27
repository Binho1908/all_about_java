package entitiesBank;

public class Bank {

	private int accountNumber;
	private String holderName;
	private Double money;
	
	public void addMoney(Double dinheiro) {
		money = money + dinheiro;
	}
	
	public void removeMoney(Double dinheiro) {
		money = money - dinheiro;
	}

	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return  "Acount"
				+ getAccountNumber()
				+ " Holder: "
				+ getHolderName()
				+ " Balance: $ "
				+ getMoney();
	}
	
	
	
}

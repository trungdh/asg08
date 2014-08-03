public class NormalAccount extends Account {

	static int FLAT_MONTHLY_FEE = 5;

	public NormalAccount(int initialBalance) throws InvalidAmountException {
		super(initialBalance);
	}

	public void withdraw(int amount) throws OverWithdrawException {
		if (amount <= 0 || amount > balance)
			throw new OverWithdrawException(" withdrawal amount is invalid :");
		balance -= amount;
		transactions++;
	}

	public int endMonthCharge() {
		return FLAT_MONTHLY_FEE;
	}

}
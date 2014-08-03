public class NickleNDime  extends Account{

	int withdrawCount;

	public NickleNDime(int initialBalance) throws InvalidAmountException{
		super(initialBalance);
	}

	public void withdraw(int amount) throws OverWithdrawException {
		if (amount <= 0 || amount > balance/2)
			throw new OverWithdrawException(" can not be cashed :");
		balance -= amount;
		transactions++;
		withdrawCount++;
	}
	
	public int endMonthCharge() {
		return 1 * withdrawCount;
	}

	public void endMonth() {
		super.endMonth();
		withdrawCount = 0;
	}
}
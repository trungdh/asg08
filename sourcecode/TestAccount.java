public class TestAccount {
	public static void main(String[] args) {
		try { // khối try - catch để bắt ngoại lệ của NormalAccount.
			NormalAccount account = new NormalAccount(10); //sửa tham số =0 sẽ có lỗi
			System.out.println(account.getBalance());
			account.withdraw(15); //lỗi số tiền rút lớn hơn số dư có.
			System.out.println("NormalAccount: "+account.getBalance());
		} 
		catch (InvalidAmountException e) {
			System.out.println(e);
		} 
		catch (OverWithdrawException ex) {
			System.out.println(ex);
		}
		try{
			NickleNDime acc = new NickleNDime(100);
			System.out.println(acc.getBalance());
			acc.withdraw(75);//số tiền rút lớn hơn 1/2 số dư có.
			System.out.println("NickleDime: "+acc.getBalance());
		} 
		catch(InvalidAmountException e){//kiểm soát số dư ban đầu
			System.out.println(e);
		} 
		catch (OverWithdrawException e){
			System.out.println(e);
		}
	}
}

public class throwbackanexception {

	public int someMethod2(int money) throws Exception {
		if (money < 1)
			throw new ArithmeticException("Error: amount too small");
		return money;
	}

	public int someMethod() throws Exception {
		throwbackanexception a = new throwbackanexception();
		int b = a.someMethod2(1) + 20;
		return b; 
	}

	public static void main(String[] args) {
		try {
			throwbackanexception a = new throwbackanexception();
			int t = a.someMethod();
			System.out.println("" + t);
		} catch (Exception e) {
			System.out.println("Error:");
			e.printStackTrace();

		}
	}
}

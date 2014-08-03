public class someException{

	public void inputminutes(int minute) throws Exception {
		if (minute > 60 || minute < 0)
			throw new Exception("Error");
		System.out.print(minute);

	}
	
	public static void main(String[] args){
	someException a = new someException();
	try{
		int minute = 11;
		a.inputminutes(minute);
	}
	catch(Exception e){
		System.out.print(e.getMessage());
	}
	
	}
}
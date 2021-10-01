package test;

public class stringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FName="Raj";
		String LName="mathur";
		
		String Fullname= FName+" "+LName;
		
		System.out.println("Full name is " + Fullname);
		
		
		String Newname=  Fullname.replace(" ",",");
		System.out.println("New name is" + Newname);
		

	}

}

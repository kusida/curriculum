package check;

import constants.Constants;

public class Check {

	public static void main(String args[]) {	
		
		
	String firstName="櫛田";
	String lastName="諒";
	
	
	System.out.println(printName(firstName, lastName));
	
	
	
	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	
	RobotPet rob = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	
	 pet.introduce();
	 rob.introduce();
	 
	}
	
	private static String printName(String firstName, String lastName){
	return firstName + lastName;
	}
	
	
	
	

	
}



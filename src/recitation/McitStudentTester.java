package recitation;

public class McitStudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		McitStudent walter = new McitStudent("Walter",24,2.0); 
		McitStudent baby = new McitStudent("Baby Belinda",23,4.0);
		
		walter.celebrateBirthday();
		System.out.println();
		baby.celebrateBirthday();
		
		System.out.printf("Walter is %d years old now and Belinda is %d years old now. \n", 
				walter.getAge(), baby.getAge()); 
		System.out.printf("Walter's pre-exam GPA: %.2f \nWalter's post-exam GPA: %.2f",
				walter.getGpa(), walter.addToGPA(-1)); 
		
		walter.setGpa(baby.getGpa()); 
		System.out.println("\n"+walter.getGpa());
		
		walter = baby; 
		
		System.out.printf("Walter's age: %d\nWalter's GPA: %f\n", walter.getAge(),walter.getGpa());
		System.out.printf("Baby's age: %d\nBaby's GPA: %f\n", baby.getAge(),baby.getGpa());
		
		
		
		
		
	}

}

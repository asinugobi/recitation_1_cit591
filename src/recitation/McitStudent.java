package recitation;

public class McitStudent {

	private String name; 
	private int age; 
	private double gpa; 
	
	public McitStudent(String student, int studentAge, double studentGpa){
		name = student; 
		age = studentAge; 
		gpa = studentGpa;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getAge() {
		return age;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void getOlder(){
		age = age + 1; 
	}
	
	public void celebrateBirthday(){
		this.getOlder(); 
		System.out.println("Happy Birthday " + this.getName()+"!");
	}
	
	public double addToGPA(double changeGPA){
		gpa = gpa + changeGPA; 
		return gpa; 
	}
	
	
}

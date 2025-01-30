/**
 * 
 */
package uni;

/**
 * 
 */
public class Admin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setName("Aidan");
		student1.setAge(30);
		student1.setStudentNumber(40234923);
		student1.setNerdStatus(false);
		System.out.println("First student name: "+student1.getName());
		System.out.println("First student age: "+student1.getAge());
		System.out.println("First student number: "+student1.getStudentNumber());
		System.out.println("First student nerd status: "+student1.isNerdStatus());



		Student student2 = new Student();
		student2.setName("Josh");
		student2.setAge(24);
		student2.setStudentNumber(40275616);
		student2.setNerdStatus(true);
		System.out.println("Second student name: "+student2.getName());
		System.out.println("Second student age: "+student2.getAge());
		System.out.println("Second student number: "+student2.getStudentNumber());
		System.out.println("Second student nerd status: "+student2.isNerdStatus());


	}

}


public class Main {

	public static void main(String[] args) {
		

		Student student1 = new Student();
		student1.setName("Oğuz");
		student1.setGradeAverage(4);
		
		Instructor instructor1 = new Instructor();
		instructor1.setName("Engin");
		instructor1.setYearsOfExperience(10);
		
		UserManager[] users = new UserManager[] {new StudentManager(), new InstructorManager()};
		
		for (UserManager user : users) {
			user.Get(5);
			user.SignUp();
			user.Update();
		}
		
		
	}

}

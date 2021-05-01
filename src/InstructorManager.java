
public class InstructorManager extends UserManager{

	public void SignUp() {
		System.out.println("Instructor Created");
	}
	
	public void Update() {
		System.out.println("Instructor Updated");
	}
	
	public void Get(int id) {
		System.out.println("Instructor Found With This Id: " + id);
	}
}

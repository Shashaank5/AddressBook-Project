
public class BuddyInfo {
	
	private String name;
	private String phone;
	private String school;
	
	public BuddyInfo(String name, String phone, String school) {
		this.name = name;
		this.phone = phone;
		this.school = school;
	}
	
	
	
	 public static void main(String[] args) {
		 BuddyInfo bob = new BuddyInfo("Homer", "613-112-1123", "Ottawa University");
		 System.out.println("Hello Universe"); 
	 }
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getSchool() {
		return school;
	}

	public String toString(){
		return name + "#" + phone + "#" + school;
		//“Mr. Buddy#111 Fake Street#613-555-5555”.
	}
	 
	 
	 

}

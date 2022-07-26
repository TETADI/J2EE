class EncapTrail
{
	int rollno;
	String name;
	String subject;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		EncapTrail obj = new EncapTrail();
		obj.setRollno(25);
		obj.setName("Tejeswar");
		obj.setSubject("Maths");
		
		System.out.println(obj.getRollno());
		System.out.println(obj.getName());
		System.out.println(obj.getSubject());
		
	}

}

package test;

public class Person {
	private String name;
	public Telephone myTelephone;
	public Person(String s){
		name = s;
	}
	public void set_myTelephone(Telephone t) {
		myTelephone = t;
	}
	public void set_name(String s) {
		name = s;
	}
	public String get_name() {
		return name;
	}
}

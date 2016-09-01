package test;

public class Telephone {
	private Person contact;

	public void set_contact(Person c) {
		contact = c;
	};

	public void callContact() {
		System.out.println("call "+contact.get_name());
	}
}

package test;

public class Hello {
	public Person person;
	public void set_person(Person p) {
		person = (Person)p;
	}
	public void sayHello() {
		System.out.println("hello "+person.get_name());
	}
}

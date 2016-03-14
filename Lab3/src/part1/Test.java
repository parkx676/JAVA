package part1;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		ContactManager cm1 = new ContactManager("contacts");
		cm1.addContact(new Contact("One Park", "123-456-7890"));
		cm1.addContact(new Contact("Two Park", "123-456-7890"));
		cm1.addContact(new Contact("Three Park", "123-456-7890"));
		cm1.addContact(new Contact("Four Park", "123-456-7890"));
		cm1.addContact(new Contact("Five Park", "123-456-7890"));
		
		System.out.println(cm1.getAllContacts());
		System.out.println(cm1.getContactsByName("Three"));
		System.out.println(cm1.removeContact(2));

		ContactManager cm2 = new ContactManager("contacts");
		
		System.out.println(cm1.getAllContacts());
		System.out.println(cm2.getAllContacts());
		System.out.println(cm2.removeContact(1));
		System.out.println(cm1.getAllContacts());
		System.out.println(cm2.getAllContacts());

	}

}

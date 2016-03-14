package part1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {
	
	private String fileName;
	private List<Contact> listofcontacts = new ArrayList<Contact>();
	
	public ContactManager(String fileName) {
		this.fileName = fileName;
		loadFile(fileName);
	} // Constructor
	
	public boolean addContact(Contact contact){
		try{
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
			writer.println(contact.toString());
			listofcontacts.add(contact);
			writer.close();
			return true;
		}
		catch(IOException e){
			e.printStackTrace();
			return false;
		}
	} //addContact
	
	public List<Contact> getAllContacts() {
		listofcontacts.clear();
		File file = new File(fileName);
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()){
				String line = scanner.nextLine();
				listofcontacts.add(new Contact(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length())));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Something terrible happened with finding the file.");
		}
		// Above this code always refresh and keep track of contact file.
		
		List<Contact> returnContacts = new ArrayList<Contact>();
		for (int i = 0; i < listofcontacts.size(); i++) {
			returnContacts.add(new Contact(listofcontacts.get(i).getName(), listofcontacts.get(i).getNumber()));
		}
		return returnContacts;
	} // getAllContacts

	public List<Contact> getContactsByName(String name) {
		listofcontacts.clear();
		File file = new File(fileName);
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()){
				String line = scanner.nextLine();
				listofcontacts.add(new Contact(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length())));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Something terrible happened with finding the file.");
		}
		// Above this code always refresh and keep track of contact file.
		List<Contact> returnContacts = new ArrayList<Contact>();
		
		for (int i = 0; i < listofcontacts.size(); i++) {
			if (listofcontacts.get(i).getName().substring(0, listofcontacts.get(i).getName().indexOf(" ")).equals(name)) {
				returnContacts.add(new Contact(listofcontacts.get(i).getName(), listofcontacts.get(i).getNumber()));
			}
		}
		return returnContacts;
	} //getContactsByName
	
	public Contact removeContact(int n) {
		Contact target = null; 
		if (listofcontacts.size() > n) { // It checks arraylist has enough size for index n.
			target = listofcontacts.get(n); 
			listofcontacts.remove(n); // remove nth contact in arraylist
			File file = new File(fileName);
			file.delete(); // deleting existing contact file.
			try {
				file.createNewFile();  // create new contact file.
			} 
			catch (IOException e) {
				e.printStackTrace();
				System.err.println("This shouldn't have happened.");
			}
			for (int i = 0; i < listofcontacts.size(); i++) {
				PrintWriter writer;
				try {
					writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
					writer.println(listofcontacts.get(i).toString());
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("This shouldn't have happened.");
				}
			} // This for loop adding contacts into new contact file without removed nth contact.
		}
		return target;
	} // removeContact

	
	private void loadFile(String fileName) {
		File file = new File(fileName);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("This shouldn't have happened.");
			}
		}
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()){
				String line = scanner.nextLine();
				listofcontacts.add(new Contact(line.substring(0, line.indexOf(":")), line.substring(line.indexOf(":") + 2, line.length())));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Something terrible happened with finding the file.");
		}
	} //loadFile
	
} // ContactManager class

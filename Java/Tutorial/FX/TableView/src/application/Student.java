package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
public class Student {
	
	private final SimpleIntegerProperty id;
	private final SimpleStringProperty surname;
	private final SimpleStringProperty name;
	private final SimpleIntegerProperty age;
	
	
	public Student(int id, String surname, String name, int age) {
		this.id = new SimpleIntegerProperty(id);
		this.surname = new SimpleStringProperty(surname);
		this.name = new SimpleStringProperty(name);
		this.age = new SimpleIntegerProperty(age);
	}


	public int getId() {
		return id.get();
	}


	public String getSurname() {
		return surname.get();
	}


	public String getName() {
		return name.get();
	}


	public int getAge() {
		return age.get();
	}
	
	
	
	
	
	

}

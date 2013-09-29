package hack.persistence.model;

public class User {

	public User() {}
	
	String name;
	int tableNumber;
	UserContact contact;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public UserContact getContact() {
		return contact;
	}
	public void setContact(UserContact contact) {
		this.contact = contact;
	}	
	
}

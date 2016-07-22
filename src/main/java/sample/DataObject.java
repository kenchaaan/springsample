package sample;

public class DataObject {
	private int id;
	private String name;
	private String mail;
	
	public DataObject(int id, String name, String mail) {
		this.id = id;
		this.name = name;
		this.mail = mail;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
}

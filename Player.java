package homework4;

public class Player {
	
	

 
	private int id;
	private String name;
	private String surname;
	private String email;
	private String dateOfBirth;
	private String nationalIdentity;
	
	public Player() {
		
	}
	
	
	public Player(int id,String name,String surname,String email,String dateOfBirth,String nationalIdentity) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.email=email;
		this.dateOfBirth=dateOfBirth;
		this.nationalIdentity=nationalIdentity;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	
	

}

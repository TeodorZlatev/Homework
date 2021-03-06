package entities;

import java.util.Date;

public class User {

	public enum CurrentStatus {
		ONLINE, INVISBLE;
	}

	public enum RegisteredStatus {
		NEW, ACTIVATED, DISABLED;
	}

	private int id;
	private String userName;
	private String password;
	private String names;
	private String gender;
	private String email;
	private String age;
	private Date createdAt;
	private Date modifiedAt;
	private CurrentStatus currentStatus;
	private RegisteredStatus registeredStatus;

	public User() {
	}

	public User(int id,String userName, String password,String names, String gender, String email, String age) {
		super();
		this.id=id;
		this.userName = userName;
		this.password = password;
		this.names = names;
		this.gender = gender;
		this.email = email;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public CurrentStatus getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(CurrentStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public RegisteredStatus getRegisteredStatus() {
		return registeredStatus;
	}

	public void setRegisteredStatus(RegisteredStatus registeredStatus) {
		this.registeredStatus = registeredStatus;
	}

}

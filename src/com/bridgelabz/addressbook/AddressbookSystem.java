package com.bridgelabz.addressbook;

public class AddressBookSystem {

	private String fName;
	private String lName;
	private String address;
	private String cityName;
	private String state;
	private int pinCode;
	private long phNum;
	private String emailId;

	public AddressBookSystem(String fName, String lName, String address, String cityName, String state,
			int pinCode,long phNum, String emailId) {
		
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.cityName = cityName;
		this.state = state;
		this.pinCode = pinCode;
		this.phNum = phNum;
		this.emailId = emailId;
		
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getEmailId() {
		return emailId;
	}

	public long getPhNum() {
		return phNum;
	}

	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public static void main(String[] args) {
		System.out.println("welcome to Address Book System");
		AddressBookSystem contact1 = new AddressBookSystem("Sai", "Dheeraj", "106/b vengal rao nagar", "Hyderabad"
				, "Telangana", 500038, 8555914348L , "rayavarapu059@gmail.com");
		System.out.println(contact1.getfName() + " " + contact1.getlName() + "\n" + contact1.getAddress() + ","
				+ contact1.getCityName() + "," + contact1.getState() + "," + contact1.getPinCode() + ". \n"
				+ contact1.getPhNum() + "\n" + contact1.getEmailId() );
	}
}

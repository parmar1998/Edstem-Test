package org.scm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// Linking with mysql DB
@Entity
@Table(name = "USER")
public class User {

	// Not blank and not Null will not allow "" or null values to be entered from User
	@NotBlank(message = "Name cannot be blank")
	@NotNull
	private String userName;

	private String address;

	@Id
	private Long phoneNumber;

	private String useremail;

	public User(@NotBlank(message = "Name cannot be blank") @NotNull String userName, String address, Long phoneNumber,
			String useremail) {
		super();
		this.userName = userName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.useremail = useremail;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", address=" + address + ", phoneNumber=" + phoneNumber + ", useremail="
				+ useremail + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

}

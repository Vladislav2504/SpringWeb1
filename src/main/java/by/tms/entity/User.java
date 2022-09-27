package by.tms.entity;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {



	@NotBlank()
	@Size(min = 2, max = 16)
	private String username;
	@NotBlank
	@Size(min = 6, max = 16)
	private String password;
	@NotBlank
	@Size(min = 6, max = 16)
	private String name;

	public User() {
	}

	public User(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}

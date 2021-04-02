package cn.itrover.bean;

public class User {
	private String id;
	private String username;
	private String password;

	public User(String id, String userName) {
		this.id = id;
		this.username = userName;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", name='" + username + '\'' +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void init(){
		username = "changed by init";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private void destroy() {
		System.out.println("结束了");
	}
}

package com.mybatisgetparams.pojo;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-22 21:42
 */
public class User {
	private Integer id =  null;
	private String name;
	private String pwd;

	public User() {
	}

	public User(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}

	public User(int id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", pwd='" + pwd + '\'' +
				'}';
	}
}

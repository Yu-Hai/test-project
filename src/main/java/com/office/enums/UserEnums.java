package com.office.enums;

public enum UserEnums {
	
	USER_ADMIN(1,"admin","admin_1"),
	USER_MANGER(2,"manger","manger_2"),
	USER_LEADER(3,"leader","leader_3");

	private int id;

	private String name;

	private String password;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	private UserEnums(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

}

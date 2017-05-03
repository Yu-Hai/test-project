package com.office.entity;

import java.util.List;

import com.office.common.util.Bean2String;

public class User {

	private String name;

	private int age;

	private List<Integer> source;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Integer> getSource() {
		return source;
	}

	public void setSource(List<Integer> source) {
		this.source = source;
	}

	public User(String name, int age, List<Integer> source) {
		super();
		this.name = name;
		this.age = age;
		this.source = source;
	}

	@Override
	public String toString() {
		return Bean2String.bean2String(this);
	}

}

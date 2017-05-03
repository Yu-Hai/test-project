package com.office.enums;

public enum TypeEnum {
	
	CODE_01("01","A"),
	CODE_02("02","B"),
	CODE_03("03","C"),
	CODE_04("04","D");

	private String value;

	private String key;

	public String getValue() {
		return value;
	}

	public String getKey() {
		return key;
	}

	private TypeEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	
}

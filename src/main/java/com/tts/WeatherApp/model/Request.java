package com.tts.WeatherApp.model;

//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
public class Request {
    private String zipCode;
    public Request() {
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

    @Override
	public String toString() {
		return "{" +
			" zipCode='" + getZipCode() + "'" +
			"}";
	}

}

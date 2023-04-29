package com.avega.training.example.comparable;

import java.util.Objects;

public class Address implements Comparable<Address> {
	
private int doorno;

private String street;

private String city;

private String pincode;

public Address(int doorno, String street, String city, String pincode) {
	super();
	this.doorno = doorno;
	this.street = street;
	this.city = city;
	this.pincode = pincode;
}



public Address() {
	super();
	// TODO Auto-generated constructor stub
}



/**
 * @return the doorno
 */
public int getDoorno() {
	return doorno;
}

/**
 * @param doorno the doorno to set
 */
public void setDoorno(int doorno) {
	this.doorno = doorno;
}

/**
 * @return the street
 */
public String getStreet() {
	return street;
}

/**
 * @param street the street to set
 */
public void setStreet(String street) {
	this.street = street;
}

/**
 * @return the city
 */
public String getCity() {
	return city;
}

/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}

/**
 * @return the pincode
 */
public String getPincode() {
	return pincode;
}

/**
 * @param pincode the pincode to set
 */
public void setPincode(String pincode) {
	this.pincode = pincode;
}

@Override
public String toString() {
	return "Address [doorno=" + doorno + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
}

@Override
public int hashCode() {
	return Objects.hash(city, doorno, pincode, street);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Address other = (Address) obj;
	return Objects.equals(city, other.city) && doorno == other.doorno && Objects.equals(pincode, other.pincode)
			&& Objects.equals(street, other.street);
}


@Override
public int compareTo(Address a) {
	return this.street.compareTo(a.street);
}


}

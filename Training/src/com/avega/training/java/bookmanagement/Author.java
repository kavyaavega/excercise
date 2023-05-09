package com.avega.training.java.bookmanagement;

import java.util.Objects;

public class Author {
	
private int id;

private String	name;

private int	contact;

private String	mailId;

public Author(int id, String name, int contact, String mailId) {
	super();
	this.id = id;
	this.name = name;
	this.contact = contact;
	this.mailId = mailId;
}
public Author() {
	super();
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
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
@Override
public String toString() {
	return "Author [id=" + id + ", name=" + name + ", contact=" + contact + ", mailId=" + mailId + "]";
}
@Override
public int hashCode() {
	return Objects.hash(contact, id, mailId, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Author other = (Author) obj;
	return contact == other.contact && id == other.id && Objects.equals(mailId, other.mailId)
			&& Objects.equals(name, other.name);
 }
}

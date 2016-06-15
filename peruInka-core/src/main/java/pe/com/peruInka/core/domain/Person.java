package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Person extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String lastNameF;
	private String lastNameM;
	private String numDocument;
	private String phone;
	private String address;
	// private String typeDocument;
	// private String statusPerson;
	private TypeDocument typeDocument;
	private StatusPerson statusPerson;

	public String getCompleteName() {
		return getLastNameM() + " " + getLastNameM() + ", " + getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastNameF() {
		return lastNameF;
	}

	public void setLastNameF(String lastNameF) {
		this.lastNameF = lastNameF;
	}

	public String getLastNameM() {
		return lastNameM;
	}

	public void setLastNameM(String lastNameM) {
		this.lastNameM = lastNameM;
	}

	public String getNumDocument() {
		return numDocument;
	}

	public void setNumDocument(String numDocument) {
		this.numDocument = numDocument;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TypeDocument getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(TypeDocument typeDocument) {
		this.typeDocument = typeDocument;
	}

	public StatusPerson getStatusPerson() {
		return statusPerson;
	}

	public void setStatusPerson(StatusPerson statusPerson) {
		this.statusPerson = statusPerson;
	}

}

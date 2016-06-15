package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Customer extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Enterprice enterprice;
	private Person person;
	private StatusCustomer statusCustomer;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Enterprice getEnterprice() {
		return enterprice;
	}
	public void setEnterprice(Enterprice enterprice) {
		this.enterprice = enterprice;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String productType;
	private String createBy;
	
	

}
		
	
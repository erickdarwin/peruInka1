package pe.com.peruInka.core.domain;

import java.io.Serializable;

/**
 * 
 * @author ocalsin
 *
 */

public class BaseType implements Serializable {

	private static final long serialVersionUID = 1L;
	private String description;
	private String typeCode;
	private String typeCategory;
	private String attribute1;
	private Long orderBy;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeCategory() {
		return typeCategory;
	}

	public void setTypeCategory(String typeCategory) {
		this.typeCategory = typeCategory;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public Long getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Long orderBy) {
		this.orderBy = orderBy;
	}

}
package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Enterprice extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private String businessName;
	private String ruc;
	private String address;
	private String phone;
	private StatusEnterprice statusEnterprice;
	
	
	
	

}

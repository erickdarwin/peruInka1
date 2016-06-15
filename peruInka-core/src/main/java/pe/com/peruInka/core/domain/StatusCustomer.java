package pe.com.peruInka.core.domain;

public class StatusCustomer extends BaseType{

private static final long serialVersionUID = 1L;
	
	public enum Status {
		CUSTOMER_ACT("CUSTOMER_ACT"), CUSTOMER_INACT("CUSTOMER_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}
}

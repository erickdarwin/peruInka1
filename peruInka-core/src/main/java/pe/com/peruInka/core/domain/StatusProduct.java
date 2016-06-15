package pe.com.peruInka.core.domain;

public class StatusProduct extends BaseType {
	
private static final long serialVersionUID = 1L;
	
	public enum Status {
		PRODUCT_ACT("PRODUCT_ACT"), PRODUCT_INACT("PRODUCT_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}
}

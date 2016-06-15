package pe.com.peruInka.core.domain;

public class StatusHotel extends BaseType {
	
	private static final long serialVersionUID = 1L;
	
	public enum Status {
		HOTEL_ACT("HOTEL_ACT"), HOTEL_INACT("HOTEL_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}
}

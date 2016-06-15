package pe.com.peruInka.core.domain;

public class StatusEnterprice {
private static final long serialVersionUID = 1L;
	
	public enum Status {
		ENTERPRICE_ACT("ENTERPRICE_ACT"), ENTERPRICE_INACT("ENTERPRICE_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}

package com.ityousee.util;

public class CommonResponse {

	private String result;

	private String message;

	private Object params;

	public final static String RESULT_SUCCESSFUL = "successful";
	public final static String RESULT_FAILED = "failed";
	public final static String RESULT_REDIRECT = "redirect";

	public final static String MESSAGE_404 = "404";
	public final static String MESSAGE_403 = "403";

	public String getResult() {
		return result;
	}

	public void setResultSuccessful() {
		this.result = RESULT_SUCCESSFUL;
	}

	public void setResultFailed() {
		this.result = RESULT_FAILED;
	}

	public void setResultRedirect() {
		this.result = RESULT_REDIRECT;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessageIfNull(String message) {
		if (this.message == null || this.message.equals("")) {
			this.message = message;
		}
	}


	public CommonResponse() {
		super();
		setResultFailed();
	}

	public CommonResponse(String message) {
		super();
		setResultFailed();
		this.message = message;
	}

	public boolean isSuccessful() {
		return RESULT_SUCCESSFUL.equals(result);
	}

	public Object getParams() {
		return params;
	}

	public void setParams(Object params) {
		this.params = params;
	}
}

package com.kpleasing.esb.model.crm008;

import java.io.Serializable;

import com.kpleasing.esb.model.ResponseHeader;

public class CRM008Response extends ResponseHeader implements Serializable {

	/**	 * 	 */
	private static final long serialVersionUID = -7831864983808886904L;
	
	private String result_code;
	
	private String result_desc;

	public String getResult_code() {
		return result_code;
	}

	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}

	public String getResult_desc() {
		return result_desc;
	}

	public void setResult_desc(String result_desc) {
		this.result_desc = result_desc;
	}
}

package testPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestData {
	private String strUserName;
	private String strPassWord;
	
	public String getStrUserName() {
		return strUserName;
	}
	public String getStrPassword() {
		return strPassWord;
	} 
	
}

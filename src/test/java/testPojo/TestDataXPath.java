package testPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestDataXPath {
	private String myAcccountXpath;
	
	public String getStrMyAccountXPath() {
		return myAcccountXpath;
	}
}

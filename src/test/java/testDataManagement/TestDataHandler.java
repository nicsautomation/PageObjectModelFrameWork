package testDataManagement;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import testPojo.TestData;
public class TestDataHandler {
	
	public static TestData tc1_LoginIntoTheApplicationData;	
//	public static TestDataXPath tc2_LoginIntoTheApplicationData;
	private static ObjectMapper mapper;
	
	public static void testDataInit() throws StreamReadException, DatabindException, IOException {
		mapper = new ObjectMapper(new YAMLFactory());
//		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		tc1_LoginIntoTheApplicationData = mapper.readValue(new File( System.getProperty("user.dir")+ "\\src\\test\\resources\\testData\\testData.yaml"), TestData.class);
	//	tc2_LoginIntoTheApplicationData = mapper.readValue(new File( System.getProperty("user.dir")+ "\\src\\test\\resources\\testData\\testDataXPath.yaml"), TestDataXPath.class);
	}
}

package testDataManagement;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import testPojo.TC2_TransferFunds;
import testPojo.TestData;

public class TestDataHandler {

	public static TestData tc1_LoginIntoTheApplicationData;	
	public static TC2_TransferFunds tC2_TransferFundsData;
	
	private static ObjectMapper mapper;
	public static void testDataInit() throws StreamReadException, DatabindException, IOException {
		mapper = new ObjectMapper(new YAMLFactory());
		tc1_LoginIntoTheApplicationData = mapper.readValue(new File( System.getProperty("user.dir")+ "\\src\\test\\resources\\testData\\testData.yaml"), TestData.class);
		tC2_TransferFundsData = mapper.readValue(new File( System.getProperty("user.dir")+ "\\src\\test\\resources\\testData\\TC2_TransferFunds.yaml"), TC2_TransferFunds.class);
	}
	
}

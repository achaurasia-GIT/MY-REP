package APITesting.com.org.api.utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.cli.*;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.xml.sax.SAXException;
import org.testng.xml.Parser; 
public class RunnerClass {
	
	
	

		public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException  {
			// TODO Auto-generated method stub
		
				
				TestNG suit = new TestNG();
				
		        final Parser parser = new Parser("src\\test\\java\\APITesting\\com\\org\\api\\utils\\testng.xml");
		        final List<XmlSuite> suites = parser.parseToList();
		        System.out.println("set suites" );
		        suit.setXmlSuites(suites);
		        System.out.println("run" );
		        suit.run();
		

	        
	    }

			
			
			
			

		

	}




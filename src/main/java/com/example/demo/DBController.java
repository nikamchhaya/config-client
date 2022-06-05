package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {		
	
	@Value("${msg}")
	String msg;
	
//	@Value("${password}")
	//String password;
	
	/*@Value("${usern}")
	String usern;
		
	@Value("${dbname}")
	String dbname;	
	
	@RequestMapping(value="/db",method= RequestMethod.GET )
	public String getProperties()
	{
		Map<String,String> mymap=new HashMap<>();
		mymap.put("usern", usern);
		mymap.put("dbname", dbname);
		//mymap.put("password", password);
		return mymap.toString();
	}	

	*/
	
	@RequestMapping(value="/dbqa",method= RequestMethod.GET )
	public String getQAProperties()
	{
		Map<String,String> mymap=new HashMap<>();
		mymap.put("msg", msg);
		return mymap.toString();
	}

}

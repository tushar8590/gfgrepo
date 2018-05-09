package com.matrices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LarestRectangleFrom2DMatrix {

	public static void main(String[] args) throws Exception {
		String c = "'"+"=5 - 3 cmd calc ";
		System.out.println(c);	
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		dateFormat.setLenient(false);
		Date convertedDate = null;
		try {
			convertedDate = dateFormat.parse("05/25/2017");
		} catch (ParseException e) {
			throw new Exception("Date Parameter has invalid format");
		}
		String formattedDate= dateFormat.format(convertedDate);
		if(!formattedDate.equalsIgnoreCase("05/25/2017"))
		{
			throw new Exception("Date Parameter has invalid format");
		}
		
		System.out.println(convertedDate);
	}

}
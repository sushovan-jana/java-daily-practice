package com.kodewala.exception.day48;

/**
 * Closing resources with finally block
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver1 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String fileName = "text.xls";
		FileOutputStream fis = null;
		try {
			fis = new FileOutputStream(fileName); // creating connection with file system
//			100 lines biz logic
			String name = null;
			name.charAt(0); // NPE
			/*
			 * fis.close(); // Before closing if any exception rises then connection will
			 * not be closed.. System.out.println(" Closing the connection - Closed");
			 */

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println(" Finally executed");
			System.out.println(" Closing resources");


			try {
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(" Closed");

		}
	}
}

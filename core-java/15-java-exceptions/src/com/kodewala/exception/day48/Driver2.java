package com.kodewala.exception.day48;

/**
 * try with resources automatically close the resource
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String fileName = "text.xls";
		
		/**
		 * fis will closed automatically
		 * we no need to write fis.close() in finally block...
		 * if class implements Closeable / AutoCloseable, then we can use that class in try with resources
		 */
		try (FileOutputStream fis = new FileOutputStream(fileName);
				Connection connection = DriverManager.getConnection(" ")
				) // try with resources
		{
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
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

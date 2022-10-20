package util;

import java.sql.*;

public class ConnectionPostgres {
	/*
	private static final String url = "jdbc:postgresql://localhost:5432/nombreDataBAse";
	private static final String user = "usuario";
	private static final String pass = "pass";
	private static Boolean conexion = true;
	*/
	
	public ConnectionPostgres() {
		
	}
	
	static Connection conexion = null;
	static Statement sentencia;
	
	public static Connection conectarDB() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conexion;
	}

}

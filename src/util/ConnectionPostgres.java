package util;

import java.sql.*;

public class ConnectionPostgres {
	
	private static final String url = "jdbc:postgresql://localhost:5432/nombreDataBAse";
	private static final String user = "usuario";
	private static final String pass = "pass";
	
	public ConnectionPostgres() {
		
	}
	
	static Connection conexion = null;
	static Statement sentencia;
	
	public static Connection conectarDB() {
		try {
			Class.forName("org.postgresql.Driver");
			conexion = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			System.out.println("No se conecto");
		}
		return conexion;
	}

}

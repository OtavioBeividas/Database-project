/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factory;

import gui.Inter;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/projeto02";
	
	//Conexão com o banco 
	public static Connection createConnectionToMySQL() throws Exception {
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		Connection con = createConnectionToMySQL();
		Inter abc = new Inter();
                abc.setVisible(true);
		if(con!=null) {
			System.out.println("Conexao OK");
			con.close();
		}
            
            
	}
}
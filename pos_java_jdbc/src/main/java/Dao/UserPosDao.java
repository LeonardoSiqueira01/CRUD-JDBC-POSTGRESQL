package Dao;

import java.sql.Connection;

import conexaoJdbc.SingleConnection;

public class UserPosDao {

	private Connection connection;
	
	public UserPosDao() {
		connection = SingleConnection.getConnection();
	}
}

package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import Dao.UserPosDao;
import conexaoJdbc.SingleConnection;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userposjava = new Userposjava();
		userposjava.setId(4L);
		userposjava.setNome("Carol Gomes");
		userposjava.setEmail("spacegomes@hotmail.com");
		userPosDao.salvar(userposjava);

	}
	
	
}

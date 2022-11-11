package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import Dao.UserPosDao;
import conexaoJdbc.SingleConnection;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userposjava = new Userposjava();
		userposjava.setId(0L);
		userposjava.setNome("Carol Gomes");
		userposjava.setEmail("spacegomes@hotmail.com");
		userPosDao.salvar(userposjava);

	}
	
	@Test
	public void InitListar() {
		UserPosDao dao = new UserPosDao();
		try {
			List<Userposjava> list =  dao.listar();
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("-----------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	@Test
	public void initBuscar() {
		 UserPosDao dao = new UserPosDao();
		 try {
			Userposjava userposjava = dao.buscar(2L);
			System.out.println(userposjava);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

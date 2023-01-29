package model.dao;

import model.dao.impl.VendedorDaoJDBC;

public class FabricaDeDao {
	
	public static VendedorDao criarVendedorDao() {
		
		return new VendedorDaoJDBC();
	}

}

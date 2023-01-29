package application;



import java.util.Date;

import model.dao.FabricaDeDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {
		Departamento obj = new Departamento(1,"Livros");
		
		Vendedor vendedor = new Vendedor(21,"Bob","bob@gmail.com",new Date(),3000.00,obj);
		
		VendedorDao vendedorDao = FabricaDeDao.criarVendedorDao();
		
		System.out.println(vendedor);

	}

}

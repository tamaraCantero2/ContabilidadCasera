package controladores;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConfiguracionDB {

	private static EntityManagerFactory factory = null;
	
	public static EntityManager getEntityManager(){
		if(factory == null)
			factory = Persistence.createEntityManagerFactory("BD_CONEXION");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
}

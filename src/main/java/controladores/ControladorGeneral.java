package controladores;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public abstract class ControladorGeneral< C extends Serializable > {

	   private Class< C > clase;

	   EntityManager entityManager = ConfiguracionDB.getEntityManager();
	   
	   public final void setClase( Class< C > claseAUtilizar ){
		  this.clase = claseAUtilizar;
	   }

	   public C buscarXID( int id ){
	      return entityManager.find( clase, id );
	   }
           
           public C buscarXID( long id ){
               return entityManager.find(clase, id);
           }
	   public List< C > buscarTodos(){
	      return entityManager.createQuery( "from " + clase.getName() )
	    		  .getResultList();
	   }

	   public void guardar( C entity ){
                EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		    entityManager.persist( entity );
                tx.commit();
	   }

	   public C actualizar( C entity ){
		   EntityTransaction tx = entityManager.getTransaction();
		   tx.begin();
		   C entityMerged = entityManager.merge( entity );
		   tx.commit();
		   return entityMerged;
	   }
	   
	   public void borrarTotalmente( C entity ){
		  EntityTransaction tx = entityManager.getTransaction();
		  tx.begin();
		  	entityManager.remove( entity );
	      tx.commit();
	   }
           
	}
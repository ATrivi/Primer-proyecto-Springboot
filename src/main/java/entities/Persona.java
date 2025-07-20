package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tbl_Personas")


public class Persona {
	
	@Id
	private long id;
	
	private String name;
	
	private int edad;
	

}

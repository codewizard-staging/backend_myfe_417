package com.app.myfe.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.myfe.model.Manager;
import com.app.myfe.model.Pet;
import com.app.myfe.model.PetCareCenter;
import com.app.myfe.model.PetOwner;
import com.app.myfe.model.Document;
import com.app.myfe.model.PetService;
import com.app.myfe.enums.PetServiceType;
import com.app.myfe.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterPets")
@Table(schema = "\"myfe\"", name = "\"PetCareCenterPets\"")
@Data
public class PetCareCenterPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}
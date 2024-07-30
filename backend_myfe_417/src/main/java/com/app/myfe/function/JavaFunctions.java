package com.app.myfe.function;

import com.app.myfe.model.Manager;
import com.app.myfe.model.Pet;
import com.app.myfe.model.PetCareCenter;
import com.app.myfe.model.PetOwner;
import com.app.myfe.model.Document;
import com.app.myfe.model.PetService;
import com.app.myfe.enums.PetServiceType;
import com.app.myfe.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.myfe.repository.PetServiceRepository;
import com.app.myfe.repository.PetOwnerRepository;
import com.app.myfe.repository.PetCareCenterRepository;
import com.app.myfe.repository.ManagerRepository;
import com.app.myfe.repository.DocumentRepository;
import com.app.myfe.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   

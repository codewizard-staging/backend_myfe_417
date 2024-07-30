package com.app.myfe.function;

import com.app.myfe.model.Manager;
import com.app.myfe.model.Pet;
import com.app.myfe.model.PetCareCenter;
import com.app.myfe.model.PetOwner;
import com.app.myfe.model.Document;
import com.app.myfe.model.PetService;




import com.app.myfe.enums.PetServiceType;
import com.app.myfe.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  
package com.app.flower.function;

import com.app.flower.model.College;
import com.app.flower.model.Subject;
import com.app.flower.model.Department;
import com.app.flower.model.PreviousEducation;
import com.app.flower.model.Student;
import com.app.flower.model.Course;
import com.app.flower.model.Lecturer;




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
  
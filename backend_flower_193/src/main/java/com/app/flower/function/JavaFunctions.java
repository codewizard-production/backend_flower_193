package com.app.flower.function;

import com.app.flower.model.College;
import com.app.flower.model.Subject;
import com.app.flower.model.Department;
import com.app.flower.model.PreviousEducation;
import com.app.flower.model.Student;
import com.app.flower.model.Course;
import com.app.flower.model.Lecturer;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.flower.repository.DepartmentRepository;
import com.app.flower.repository.CollegeRepository;
import com.app.flower.repository.PreviousEducationRepository;
import com.app.flower.repository.StudentRepository;
import com.app.flower.repository.CourseRepository;
import com.app.flower.repository.LecturerRepository;
import com.app.flower.repository.SubjectRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   

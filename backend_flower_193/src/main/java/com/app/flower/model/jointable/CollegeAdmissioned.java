package com.app.flower.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.flower.model.College;
import com.app.flower.model.Subject;
import com.app.flower.model.Department;
import com.app.flower.model.PreviousEducation;
import com.app.flower.model.Student;
import com.app.flower.model.Course;
import com.app.flower.model.Lecturer;

@Entity(name = "CollegeAdmissioned")
@Table(schema = "\"flower\"", name = "\"CollegeAdmissioned\"")
@Data
public class CollegeAdmissioned{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CollegeID\"")
	private Integer collegeID;

    
    @Column(name = "\"StudentID\"")
    private Integer studentID;
 
}
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

@Entity(name = "LecturerTeaches")
@Table(schema = "\"flower\"", name = "\"LecturerTeaches\"")
@Data
public class LecturerTeaches{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"StaffID\"")
	private String staffID;

    
    @Column(name = "\"SubjectID\"")
    private Integer subjectID;
 
}
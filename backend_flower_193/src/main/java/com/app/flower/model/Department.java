package com.app.flower.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.flower.model.College;
import com.app.flower.model.Subject;
import com.app.flower.model.Department;
import com.app.flower.model.PreviousEducation;
import com.app.flower.model.Student;
import com.app.flower.model.Course;
import com.app.flower.model.Lecturer;
import com.app.flower.converter.DurationConverter;
import com.app.flower.converter.UUIDToByteConverter;
import com.app.flower.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Department")
@Table(name = "\"Department\"", schema =  "\"flower\"")
@Data
                        
public class Department {
	public Department () {   
  }
	  
  @Id
  @Column(name = "\"DeptID\"", nullable = true )
  private String deptID;
	  
  @Column(name = "\"DeptName\"", nullable = true )
  private String deptName;
  
	  
  @Column(name = "\"DeptHOD\"", nullable = true )
  private String deptHOD;
  
	  
  @Column(name = "\"DeptSize\"", nullable = true )
  private Integer deptSize;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"DepartmentBranchbelongsto\"", referencedColumnName = "\"CourseID\"", insertable = false, updatable = false)
	private Course branchbelongsto;
	
	@Column(name = "\"DepartmentBranchbelongsto\"")
	private String departmentBranchbelongsto;
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"DepartmentBelongsto\"",
            joinColumns = @JoinColumn( name="\"DeptID\""),
            inverseJoinColumns = @JoinColumn( name="\"StaffID\""), schema = "\"flower\"")
private List<Lecturer> belongsto = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Department [" 
  + "DeptID= " + deptID  + ", " 
  + "DeptName= " + deptName  + ", " 
  + "DeptHOD= " + deptHOD  + ", " 
  + "DeptSize= " + deptSize 
 + "]";
	}
	
}
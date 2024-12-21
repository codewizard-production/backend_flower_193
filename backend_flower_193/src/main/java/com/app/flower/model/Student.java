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

@Entity(name = "Student")
@Table(name = "\"Student\"", schema =  "\"flower\"")
@Data
                        
public class Student {
	public Student () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"StudentID\"", nullable = true )
  private Integer studentID;
	  
  @Column(name = "\"StudentName\"", nullable = true )
  private String studentName;
  
	  
  @Column(name = "\"StudentAddress\"", nullable = true )
  private String studentAddress;
  
	  
  @Column(name = "\"ParentNames\"", nullable = true )
  private String parentNames;
  
	  
  @Column(name = "\"PhoneNumber\"", nullable = true )
  private Long phoneNumber;
  
	  
  @Column(name = "\"State\"", nullable = true )
  private String state;
  
	  
  @Column(name = "\"CompetitiveExamRank\"", nullable = true )
  private String competitiveExamRank;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"StudentEnrolledWith\"", referencedColumnName = "\"CourseID\"", insertable = false, updatable = false)
	private Course enrolledWith;
	
	@Column(name = "\"StudentEnrolledWith\"")
	private String studentEnrolledWith;
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"StudentEducationDetails\"",
            joinColumns = @JoinColumn( name="\"StudentID\""),
            inverseJoinColumns = @JoinColumn( name="\"EducationID\""), schema = "\"flower\"")
private List<PreviousEducation> educationDetails = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Student [" 
  + "StudentID= " + studentID  + ", " 
  + "StudentName= " + studentName  + ", " 
  + "StudentAddress= " + studentAddress  + ", " 
  + "ParentNames= " + parentNames  + ", " 
  + "PhoneNumber= " + phoneNumber  + ", " 
  + "State= " + state  + ", " 
  + "CompetitiveExamRank= " + competitiveExamRank 
 + "]";
	}
	
}
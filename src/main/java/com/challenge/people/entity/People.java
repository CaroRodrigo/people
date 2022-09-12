package com.challenge.people.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Rodrigo Caro
 */
@Entity
@Table (name = "PEOPE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class People implements Serializable {
  
  @Id
  private Integer document;
   
  @Column(name = "NAME", nullable = false)
  private String name;
  
  @Column(name = "COUNTRY", nullable = false)
  private String country;
    
  @Column(name = "AGE", nullable = false)
  private Integer age;
  
  @Column(name = "HAS_CHILDREN", nullable = true)
  private Boolean hasChildren;
  
  @Column(name = "SON", nullable = true)
  private Integer son;
  
  @Column(name = "DAD", nullable = true)  
  private Integer dad;

}

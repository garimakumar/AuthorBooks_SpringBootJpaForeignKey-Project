package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "aid")
public class Author {
@Id
	private int aid;
	private String aname;
	private String aemail;
@OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
    private Books book;  //acts as a foreign key
}

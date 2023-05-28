package com.example.demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Books {
@Id
	private int bookid;
	private String bookname;
@OneToOne(cascade = CascadeType.ALL)	
	private Author author;
}

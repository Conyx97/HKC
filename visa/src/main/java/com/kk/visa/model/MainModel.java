package com.kk.visa.model;


import java.io.Serializable;

import lombok.Data;

@Data
public class MainModel implements Serializable{
	
	
	
	 private static final long serialVersionUID = 1L;
	 private int id;
	 private String name;
	 private String remaining;
	 private String day ;
	 
	 

}

package com.lmig.consume;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IDclass {
	
	private String id;
   

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
    public String toString() {
//		return null;
        return "ID{" +
        		"ID='" + id + '\'' +
                '}';
    }
}
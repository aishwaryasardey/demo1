package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Component("emp")
@ConfigurationProperties(prefix ="emp")
@ToString
public class Employee {
	
	 private int id;
	
	 private String name;
	
	 private double salary;
	
	 private List<String> technology;
	
	 private Set<Integer> mobile;
	
	 private Map<String, Integer> idcard;
	 
	 private Company company;
	
	
	 
}

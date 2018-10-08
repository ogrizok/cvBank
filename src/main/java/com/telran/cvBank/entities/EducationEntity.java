package com.telran.cvBank.entities;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EducationEntity {
	private String schoolInstitutionName;
	private String degree;
	private LocalDate graduationYear;
	private String location;
	private String details;
}

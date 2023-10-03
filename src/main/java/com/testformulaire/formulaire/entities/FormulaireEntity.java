package com.testformulaire.formulaire.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="utilisateur")
public class FormulaireEntity {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public FormulaireEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FormulaireEntity(long id, String firstName, String lastName, long age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="nom")
	private String firstName;
	@Column(name="prenom")
	private String lastName;
	@Column(name="age")
	private long age;
	
}

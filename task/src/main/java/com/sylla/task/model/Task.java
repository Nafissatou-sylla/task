/**
 * 
 */
package com.sylla.task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Class Task pour représenter une tâche
 * @Entity une annotation de JPA, elle indique à Hibernate (l'ORM utilisé par Spring Data JPA)
 * que la classe Task est une entité (une table) dans la base de données
 */

@Entity
public class Task {
	
	@Id
	/**
	 * @generatedValue indique que la valeur de l'id doit être générée automatiquement
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	/**
	 * les attributs seront mappés automatiquement par Hibernate en tant que colonnes dans la table Task
	 */
	private Long id;
	private String title;
	private String description;
	private boolean completed;
	
	
	//contructeurs
	
	public Task() {}
	
	public Task(String title, String description, boolean completed) {
		this.title = title;
		this.description = description;
		this.completed = completed;
	}

	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	

}

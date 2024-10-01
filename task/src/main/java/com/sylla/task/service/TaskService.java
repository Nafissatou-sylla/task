/**
 * 
 */
package com.sylla.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sylla.task.model.Task;
import com.sylla.task.repository.TaskRepository;

/**
 * Classe TaskService pour gérer la logique du métier
 * Elle se situe entre le controleur et le repository
 * Elle permet de centraliser les opérations sur les entités, de manière à ce que le controleur
 * ne contienne pas directement de code d'accés aux données.
 * 
 * @Service indique que la classe est un Service, cad elle contient la logique métier de mon application
 * Elle rend cette classe éligible à des fonctionnalités supplémentaires de Spring comme la gestion des transactions 
 */

@Service
public class TaskService {
	
	/**
	 * @Autowired est une annotation utilisée pour injecter automatiquement une dépendance dans une classe
	 * Ici elle est utilisée dans le constructeur de TaskService pour injecter une instance de TaskRepository
	 * cela permet d'accéder aux méthodes de TaskRepository pour interagir avec la bdd
	 */
	@Autowired
	private TaskRepository taskRepository;
	
	/**
	 * 
	 * @return la liste de toute les taches présentent dans la table task
	 */
	
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	
	/**
	 * 
	 * @param task la tache à créer
	 * @return return la nouvelle tache
	 */
	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}
	
	
	/**
	 * Méthode pour supprimer l'enregistrement d'une tache dans la bdd
	 * @param id l'id de la tache à supprimer
	 */
	public void deleteTask(Long id) {
		taskRepository.deleteById(id);
	}
}

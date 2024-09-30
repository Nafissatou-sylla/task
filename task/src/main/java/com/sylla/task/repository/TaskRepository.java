/**
 * 
 */
package com.sylla.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sylla.task.model.Task;

/**
 * Interface qui étend JpaRepository pour la gestion des entités Task
 * @Repository indique à Spring que cet interface est composant de type DAO (Data Access Object) ou repository
 * @extends.. JpaRepository<> est une interface fournie par Spring Data Jpa
 * qui contient plusieurs méthodes pour interagir avec la base de données.
 */

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}

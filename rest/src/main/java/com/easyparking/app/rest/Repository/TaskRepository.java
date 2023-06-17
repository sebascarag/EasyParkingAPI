package com.easyparking.app.rest.Repository;

import com.easyparking.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {
}

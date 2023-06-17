package com.easyparking.app.rest.Controller;

import com.easyparking.app.rest.Model.Task;
import com.easyparking.app.rest.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TaskRepository todoRepository;

    @GetMapping(value = "/tasks")
    public List<Task> getTasks(){
        return todoRepository.findAll();
    }

    @PostMapping (value = "/savetasks")
    public String saveTasks(@RequestBody Task task){
        todoRepository.save(task);
        return "Saved Tasks";
    }

    @PutMapping(value = "/update/{id}")
    public String updatedTask(@PathVariable long id,  @RequestBody Task task){
        Task updatedTask = todoRepository.findById(id).get();
        updatedTask.setTitle(task.getTitle());
        updatedTask.setDescription(task.getDescription());
        todoRepository.save(updatedTask);
        return "Updated Task";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteTask(@PathVariable long id){
        Task deleteTask = todoRepository.findById(id).get();
        todoRepository.delete(deleteTask);
        return "Deleted Task";


    }
}

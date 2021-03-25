package services;

import dao.ToDoRepository;
import model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddToDo {

    @Autowired
    private ToDoRepository toDoRepository;

    public  boolean addToDo(ToDo todo){

        boolean status = true;
        try {
            toDoRepository.save(todo);
        }catch (Exception e){
            status = false;
        }

        return status;
    }
}

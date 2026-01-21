package edu.icet.controller;

import edu.icet.model.dto.StudentDTO;
import edu.icet.service.Impl.StudentServiceImpl;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudnetController {

    @Autowired
    StudentService service;

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDTO studentDTO){
        service.addStudent(studentDTO);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentDTO studentDTO){
        service.updateStudent(studentDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(Integer integer){
        Integer id = 0;
        service.deleteStudent(id);
    }

    @GetMapping("/get-all")
    public List<StudentDTO> getAll(){
        return service.getAll();
    }

}

package edu.icet.controller;

import edu.icet.service.Impl.StudentServiceImpl;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudnetController {

    @Autowired
    StudentService service;


}

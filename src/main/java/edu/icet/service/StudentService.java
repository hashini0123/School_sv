package edu.icet.service;

import edu.icet.model.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    void addStudent(StudentDTO student);

    void updateStudent(StudentDTO student);

    void deleteStudent(Integer Id);

    StudentDTO searchById(Integer Id);

    List<StudentDTO> getAll();
}

package edu.icet.service.Impl;

import edu.icet.model.dto.StudentDTO;
import edu.icet.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {


    @Override
    public void addStudent(StudentDTO student) {

    }

    @Override
    public void updateStudent(StudentDTO student) {

    }

    @Override
    public void deleteStudent(Integer Id) {

    }

    @Override
    public StudentDTO searchById(Integer Id) {
        return null;
    }

    @Override
    public List<StudentDTO> getAll() {
        return List.of();
    }
}

package edu.icet.service.Impl;

import edu.icet.model.dto.StudentDTO;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addStudent(StudentDTO student) {
        StudentEntity entity = mapper.map(student,StudentEntity.class);
        repository.save(entity);

    }

    @Override
    public void updateStudent(StudentDTO student) {

        repository.save(mapper.map(student,StudentEntity.class));
    }

    @Override
    public void deleteStudent(Integer Id) {

        repository.deleteById(Id);

    }

    @Override
    public StudentDTO searchById(Integer Id) {
        StudentEntity studentEntity = repository.findById(Id).get();
        StudentDTO studentDTO = mapper.map(studentEntity,StudentDTO.class);
        return studentDTO;
    }

    @Override
    public List<StudentDTO> getAll() {
        List<StudentEntity> studentEntities = repository.findAll();
        ArrayList<StudentDTO> studentDTOArrayList = new ArrayList<>();
        studentEntities.forEach(studentEntity -> {
            StudentDTO studentDTO = mapper.map(studentEntity,StudentDTO.class);
            studentDTOArrayList.add(studentDTO);
        });
        return studentDTOArrayList;
    }
}

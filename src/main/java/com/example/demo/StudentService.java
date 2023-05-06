package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {

        Optional optional = studentRepository.findStudentByEmail(student.getEmail());

        if (optional.isPresent()) {
            throw new IllegalStateException("Email is already exists");

        } else {
            studentRepository.save(student);
        }
    }

    public void deleteStudent(Long id) {
        boolean isExists = studentRepository.existsById(id);

        if (isExists) {
            studentRepository.deleteById(id);
        } else {
            throw new IllegalStateException("Student is not exists");
        }
    }

    @Transactional
    public void updateStudent(Long id, String name, String email) {

        Student student = studentRepository.findById(id)
                .orElseThrow(
                        () -> new IllegalStateException("Student does not exists")
                );

        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
            Optional<Student> optional = studentRepository.findStudentByEmail(email);

            if (optional.isPresent()) {
                throw new IllegalStateException("Email is exists");
            }
            student.setEmail(email);
        }
    }
}

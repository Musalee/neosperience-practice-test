package esercizio_3.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    final ArrayList<Student> students = new ArrayList<>();

    @PostMapping(value = "/students")
    public Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @GetMapping(value = "/students")
    public List<Student> getStudents() {
        return students;
    }
}

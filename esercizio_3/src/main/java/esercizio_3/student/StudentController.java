package esercizio_3.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


// Creazione del controller rest necessario per le richieste HTTP all'API
@RestController
public class StudentController {
    final ArrayList<Student> students = new ArrayList<>();

    // Creazione di un mapping di tipo POST sull'endpoint /students
    @PostMapping(value = "/students")
    public Student createStudent(@RequestBody Student student) {
        // Aggiunta dello studente ottenuto dal body della richiesta alla collezione student
        students.add(student);

        // Resituzione dello studente aggiunto come risposta
        return student;
    }

    // Creazione di un mapping di tipo GET sull'endpoint /students
    @GetMapping(value = "/students")
    public List<Student> getStudents() {
        // Restituzione della lista su richiesta
        return students;
    }
}

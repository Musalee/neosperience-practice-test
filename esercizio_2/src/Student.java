import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class Student {
    private String firstname;
    private String lastname;
    private String birthdate;
    private String grades;

    public Student(String firstname, String lastname, String birthdate, String grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.grades = grades;
    }

    public int age() throws DateTimeParseException {
        var format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        var birthdate = LocalDate.parse(this.birthdate, format);
        var today = LocalDate.now();

        return Period.between(birthdate, today).getYears();

    }

    public double avg_grade() {
        var parsedGrades = Arrays.stream(this.grades.split(",")).mapToInt(Integer::parseInt).toArray();

        var gradesSum = 0;

        for (var grade : parsedGrades) {
            gradesSum += grade;
        }

        return  (double) gradesSum / parsedGrades.length;
    }

}

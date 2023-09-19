import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class Student {
    // Variabili come richieste dalla traccia (tutte stringhe)
    private String firstname;
    private String lastname;
    private String birthdate;
    private String grades;

    // Costruttore
    public Student(String firstname, String lastname, String birthdate, String grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.grades = grades;
    }

    public int age() throws DateTimeParseException {
        // Selezione del pattern di formattazione desiderato
        var format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parsing della data a LocalTime utilizzando il pattern precedentemente selezionato
        var birthdate = LocalDate.parse(this.birthdate, format);

        // Creazione di una data corrispondente a oggi
        var today = LocalDate.now();

        // Ottenimento degli anni trascorsi tra la data di nascita e oggi (età)
        return Period.between(birthdate, today).getYears();

    }

    public double avg_grade() {
        // Parsing dei voti
        // Dato che i voti sono rappresentati da una stringa essi saranno in formato CSV
        // Splittiamo quindi la stringa utilizzando come separatore la virgola e mappiamo l'array ottenuto a Integer
        var parsedGrades = Arrays.stream(this.grades.split(",")).mapToInt(Integer::parseInt).toArray();

        // Calcolo del totale dei voti
        var gradesSum = 0;

        for (var grade : parsedGrades) {
            gradesSum += grade;
        }

        // Calcolo della media castando la somma a double per avere come risultato un decimale
        return  (double) gradesSum / parsedGrades.length;
    }

}

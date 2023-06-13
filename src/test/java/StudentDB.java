import models.Student;
import org.testng.annotations.Test;
import utils.DBReader;

import java.util.List;


public class StudentDB {
    @Test
    public static void checkStudent () {
        printStudents(DBReader.getStudentsFromDB());
        DBReader.insert(4, "Ivan", "Kuznecov");
        printStudents(DBReader.getStudentsFromDB());
        DBReader.update(4, "Polozov");
        printStudents(DBReader.getStudentsFromDB());
        DBReader.delete(4);
        printStudents(DBReader.getStudentsFromDB());
    }





    private static void printStudents (List<Student> students) {
        for (Student student: students) {
            System.out.println(student.toString());
        }
        System.out.println();
    }
}

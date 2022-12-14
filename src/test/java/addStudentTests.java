import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class addStudentTests {

    /**
     * Test that a list of students can be set as a modules students
     */
    @Test
    public void testSetStudentsModule(){
        Student student1 = new Student("Steve", 20, new DateTime(2002, 1, 1, 0, 0), 123456);
        Student student2 = new Student("Mary", 20, new DateTime(2002, 1, 1, 0, 0), 123456);
        Lecturer lecturer1 = new Lecturer("Bob", 32, new DateTime(1990, 1, 1, 0, 0), 123456);
        Module module1 = new Module("Software Engineering", "CT417", lecturer1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        module1.setStudents(students);
        Assertions.assertEquals(students, module1.getStudents());
    }

    /**
     * Test that the student can be added to a module, separately to being added to course
     */
    @Test
    public void testAddStudentsModule(){
        Lecturer lecturer1 = new Lecturer("Bob", 32, new DateTime(1990, 1, 1, 0, 0), 123456);
        Module module1 = new Module("Software Engineering", "CT417", lecturer1);
        Student student1 = new Student("John", 22, new DateTime(2000, 1, 1, 0, 0), 123456);
        module1.addStudent(student1);
        Assertions.assertTrue(module1.getStudents().contains(student1));
    }

    /**
     * Test that the student can be added to a course
     */
    @Test
    public void testAddStudentCourse(){
        Student student1 = new Student("Steve", 20, new DateTime(2002, 1, 1, 0, 0), 123456);
        Course course1 = new Course("ECE", new ArrayList<>(), new DateTime(2020, 1, 1, 0, 0), new DateTime(2020, 5, 1, 0, 0));
        course1.addStudent(student1);
        Assertions.assertTrue(course1.getStudents().contains(student1));
    }
}

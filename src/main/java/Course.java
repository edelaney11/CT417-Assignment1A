import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {
    String name;
    ArrayList<Module> modules;
    ArrayList<Student> students;
    DateTime startDate;
    DateTime endDate;

    public Course(String name, ArrayList<Module> modules, DateTime startDate, DateTime endDate){
        this.name = name;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

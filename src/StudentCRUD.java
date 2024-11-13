import java.util.Arrays;

public class StudentCRUD {
    private Student[] dataBaceStudents = new Student[0];
    private int size = 0;

    public boolean add(Student newStudent) {
        dataBaceStudents = Arrays.copyOf(dataBaceStudents, size + 1);
        dataBaceStudents[size] = newStudent;
        size++;
        return true;
    }

    public String add(Student... newStudents) {
        for (Student newStudent : newStudents) {
            add(newStudent);
        }
        return "Successfull saved student !";
    }
}

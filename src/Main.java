import java.util.Scanner;

public class Main {
        StudentCRUD studentCRUD = new StudentCRUD();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Student student = new Student("Baiel",19,'M');
        System.out.println(student);

        while (true){
            System.out.println("""
                           Commands:
                           Press to 1: Add new Student
                    
                    """);
            String command = scanner.nextLine();

            switch (command.toLowerCase()){
                case "1","add" -> {
                    Student student1 = new Student(name, age, gender);
                    var result = studentCRUD.add(student);
                    System.out.println(result);
                }
                case "2", "addAll" -> {
                    System.out.println("Amound students : ");

                    var amound = scanner2.nextInt();

                    Student[] students = new Student[amound];
                    for (int i = 0; i < amound; i++) {
                        Student student1 = seetStudentInfo(new Student());
                        students
                    }
                }
            }
        }

    }
    public static Student seetStudentInfo(Student student){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("write the student name : ");
        var name = scanner.nextLine();

        System.out.println("write the student gender : ");
        var gender = scanner1.next().charAt(0);

        System.out.println("write the student age : ");
        var age = scanner2.nextInt();


        return student;
    }
}
public class Student {
    private Long id;
    private String name;
    private int age;
    private char gender;

    private static long generateId = 0;

    public Student(){
        this.id = ++generateId;
    }

    public Student(String name, int age, char gender) {
        this.id = ++generateId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student ->\n" +
                "Name : " + name +
                "\nAge  : " + age +
                "\nGender : " + gender;
    }
}

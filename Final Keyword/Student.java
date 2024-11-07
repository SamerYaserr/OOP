final public class Student {
    final int STUDENT_ID;
    String name;
    int yearOfBirth;
    final static float DEGREE_OF_SUCCESS;

    static {
        DEGREE_OF_SUCCESS = 50;
    }

    public Student() {
        this.STUDENT_ID = 2002;
    }
    public Student(final int studentID, String name, int yearOfBirth) {
        this.STUDENT_ID = studentID;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    final public String toString() {
        return "Student{" +
                "STUDENT_ID=" + STUDENT_ID +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
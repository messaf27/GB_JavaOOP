package Lesson_04;


public class Employee {
    String fio;
    double salary;
    String jobTitle;

    public Employee(String fio, double salary, String jobTitle) {
        this.fio = fio;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString(){
        return String.format("%s, %.2f, %s", fio, salary, jobTitle);
    }
}

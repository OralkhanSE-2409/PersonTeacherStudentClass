package javaClasses;

public class Teacher extends Person {
    private String subject;
    private int  yearsOfExperience;
    private int salary;


//    Constructors
    public Teacher() {
        super();
    }

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }


//    Accessors and Modifiers
    public String getSubject() {
        return subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    Methods
    @Override
    public String toString() {
        return super.toString() + " I teach %s".formatted(subject);
    }


}

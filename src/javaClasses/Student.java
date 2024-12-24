package javaClasses;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int id = 1;
    private final int studentID;
    private List<Integer> grades;


//    Constructors
    public Student() {
        super();
        this.studentID = id++;
        this.grades = new ArrayList<>();
    }

    public Student(String name, String surname, int age, boolean gender, int studentID) {
        super(name, surname, age, gender);
        this.studentID = id++;
        this.grades = new ArrayList<>();
    }

    public Student(String name, String surname, int age, boolean gender, List<Integer> grades) {
        super(name, surname, age, gender);
        this.studentID = id++;
        this.grades = grades;
    }


//    Accessors and Mutators
    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public int getStudentID() {
        return studentID;
    }

//    Methods
    @Override
    public String toString() {
        return super.toString() + " I am a student with ID: " + studentID;
    }



}

import javaClasses.School;
import javaClasses.Student;
import javaClasses.Teacher;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File studentFile = new File("src/inputFile/students.txt");
        File teacherFile = new File("src/inputFile/teachers.txt");
        Scanner studentScanner = new Scanner(studentFile);
        Scanner teacherScanner = new Scanner(teacherFile);

        ArrayList<Student> students = new ArrayList<>();

        while (studentScanner.hasNextLine()) {
            String line = studentScanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            String name = lineScanner.next();
            String surname = lineScanner.next();
            int age = Integer.parseInt(lineScanner.next());
            boolean gender = lineScanner.next().equals("Male");
            List<Integer> grades = new ArrayList<>();

            while (lineScanner.hasNextInt()) {
                grades.add(lineScanner.nextInt());
            }

            Student student = new Student(name, surname, age, gender, grades);

            students.add(student);
        }

        ArrayList<Teacher> teachers = new ArrayList<>();

        while (teacherScanner.hasNextLine()) {
            String line = teacherScanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            String name = lineScanner.next();
            String surname = lineScanner.next();
            int age = Integer.parseInt(lineScanner.next());
            boolean gender = lineScanner.next().equals("Male");
            String subject = lineScanner.next();
            int years = Integer.parseInt(lineScanner.next());
            int salary = Integer.parseInt(lineScanner.next());

            Teacher teacher = new Teacher(name, surname, age, gender, subject, years, salary);
            teachers.add(teacher);
        }

        School hogwarts = new School();

        for (Teacher teacher : teachers) {
            hogwarts.addMember(teacher);
        }
        for (Student student : students) {
            hogwarts.addMember(student);
        }

        System.out.println(hogwarts);
    }
}
package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.util.*;


public class MyStudentRecordsMgmtApp {

    public static void main(String[]args) {

        Student [] students= {
                new Student(1, "Alice", LocalDate.of(2022,6,8)),
                new Student(2, "Zawedde", LocalDate.of(2003,7,11)),
                new Student(3, "Charlie", LocalDate.of(2006,12,4)),
                new Student(3, "Sumaya", LocalDate.of(1967,5,7)),
                new Student(3, "Xavier", LocalDate.of(1994,6,12))

        };
        printListOfStudents(students);
//        List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students);
//        printListOfStudents(platinumAlumni.toArray(new Student[0]));

    }

    public static void printListOfStudents(Student [] arr) {

        Arrays.sort(arr, Comparator.comparing(Student::getName));

        for(Student s : arr){
            System.out.println(s);
        }
    }

    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        List<Student> platinumAlumni = new ArrayList<>();
        LocalDate cutoffDate = LocalDate.now().minusYears(30);

        for (Student student : students) {
            if (student.getDateOfAdmission().isBefore(cutoffDate)) {
                platinumAlumni.add(student);
            }
        }

        platinumAlumni.sort(Comparator.comparing(Student::getDateOfAdmission).reversed());
        return platinumAlumni;
    }
}

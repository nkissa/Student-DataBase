package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){
        System.out.print("Enter how many students you want to enroll: ");
        Scanner n = new Scanner(System.in);
        int numOfStudents = n.nextInt();
        Student[] students = new Student[numOfStudents];
        for(int val = 0; val < numOfStudents; val++){
            students[val] = new Student();
            students[val].enroll();
            students[val].enroll();
            students[val].payTuition();
        }
        System.out.println(students[0].toString());
        System.out.println(students[numOfStudents-1].toString());
    }

}

package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName,lastName, studentID;
    private String courses = "";
    private int gradeYear;
    private static int costOfCourse = 600;
    private static int id = 1001, tuitionBalance = 0;

    //Student Constructor
    public Student(){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = n.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = n.nextLine();
        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior");
        this.gradeYear = n.nextInt();
        setStudentId();
    }
    //setting studentID
    private void setStudentId(){
        id++;
        this.studentID = gradeYear + "" + id;
    }
    //enroll in classes
    public void enroll(){
        do{
            System.out.println("Enter course to enroll ( Q to quit)");
            Scanner n = new Scanner(System.in);
            String course = n.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n  " + course;
                tuitionBalance+=costOfCourse;
            }
            else{break;}
        }while(1!=0);
    }
    public void viewBalance(){
        System.out.println("Your Tuition Balance is : $" + tuitionBalance);
    }
    public void payTuition(){
        System.out.print("Enter your payment: $");
        Scanner n = new Scanner(System.in);
        int payment = n.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for you payment of $" + payment);
        viewBalance();
    }
    public String toString(){
        return "-----------STUDENT INFO-----------"+"\nName: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: "+ courses +
                "\nBalance: $" + tuitionBalance;
    }

}

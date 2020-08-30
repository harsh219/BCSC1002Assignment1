/*  Created by IntelliJ IDEA.
 *  User: Harsh Agarwal
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */

package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your details : First name, Middle name, Last name, University Roll Number, Number Of Books Issued : ");
        String studentFirstName = object.nextLine();
        String studentMiddleName = object.nextLine();
        String studentLastName = object.nextLine();
        long studentUniversityRollNumber = object.nextLong();
        int totalBooksIssuedByStudent = object.nextInt();
        Student studentDetails = new Student(studentFirstName, studentMiddleName, studentLastName, studentUniversityRollNumber, totalBooksIssuedByStudent);
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student id: ");
        String StudentID = sc.next();
        System.out.print("Enter Full Name: ");
        sc.nextLine();
        String FullName = sc.nextLine();
        System.out.print("Enter  age: ");
        int age = sc.nextInt();
        while (age < 15 || age > 35) {
            System.out.println("Inavlid Age ");
            System.out.print("Enter  age between 15 and 35: ");
            age = sc.nextInt();

        }
        System.out.print("Enter Email: ");
        String Email = sc.next();
        String course;
        int basesemesterfee = 0;
        System.out.print("Enter Course Choice: ");
        int courseChoice = sc.nextInt();
        while (courseChoice < 1 || courseChoice > 5) {
            System.out.println("Invalid course choice. Select 1 to 5:");
            System.out.print("Enter Course Choice: ");
            courseChoice = sc.nextInt();
        }
        switch (courseChoice) {

            case 1:
                course = "BCA";
                basesemesterfee = 35000;
                break;
            case 2:
                course = "B.Sc Computer Science";
                basesemesterfee = 30000;
                break;
            case 3:
                course = "B.E/B.Tech";
                basesemesterfee = 50000;
                break;
            case 4:
                course = "MCA";
                basesemesterfee = 45000;
                break;
            case 5:
                course = "Other";
                basesemesterfee = 25000;
                break;
            default:
                System.out.println("Invalid course choice. Select a value from 1 to 5.");
        }

        System.out.print("Enter semester (1-8):  ");
        int semester = sc.nextInt();
        while (semester < 1 || semester > 8) {
            System.out.println("Invalid semester. Enter between 1 and 8.");
            System.out.print("Enter semester (1-8): ");
            semester = sc.nextInt();
        }
        sc.nextLine();
        System.out.print("Enter Carrer Goal:");
        String Carrergoal = sc.nextLine();
        System.out.print("Enter Java marks: ");
        int javamarks = sc.nextInt();
        while (javamarks < 0 || javamarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
            System.out.print("Enter Java marks: ");
            javamarks = sc.nextInt();

        }
        System.out.print("Enter SQL marks: ");
        int sqlmarks = sc.nextInt();
        while (sqlmarks < 0 || sqlmarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
            System.out.print("Enter SQL marks: ");
            sqlmarks = sc.nextInt();
        }
        System.out.print("Enter Web Technology marks: ");
        int webtechnologymarks = sc.nextInt();
        while (webtechnologymarks < 0 || webtechnologymarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
            System.out.print("Enter Web Technology marks: ");
            webtechnologymarks = sc.nextInt();
        }
        System.out.print("Enter Aptitude marks: ");
        int apptitudemarks = sc.nextInt();
        while (apptitudemarks < 0 || apptitudemarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
            System.out.print("Enter Aptitude marks: ");
            apptitudemarks = sc.nextInt();
        }
        System.out.print("Enter Communication marks: ");
        int communicationmarks = sc.nextInt();
        while (communicationmarks < 0 || communicationmarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
            System.out.print("Enter Communication marks: ");
            communicationmarks = sc.nextInt();
        }

        int totalmarks = javamarks + sqlmarks + webtechnologymarks + apptitudemarks + communicationmarks;
        double percentage = (totalmarks / 500.0) * 100;
        String academicresult = javamarks >= 35 && sqlmarks >= 35 && webtechnologymarks >= 35 && apptitudemarks >= 35
                && communicationmarks >= 35 && percentage >= 40 ? "PASSED" : "FAILED";
        String grade;
        if (academicresult.equals("FAILED")) {
            grade = "F";
        } else if (percentage >= 85) {
            grade = "A+";
        } else if (percentage >= 75) {
            grade = "A";
        } else if (percentage >= 65) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.print("enter total classes conducted: ");
        int totalclasses = sc.nextInt();
        while (totalclasses <= 0) {
            System.out.println("Total classes must be greater than 0.");
            System.out.print("Enter total classes conducted: ");
            totalclasses = sc.nextInt();
        }
        System.out.print("enter classes attended: ");
        int classesattended = sc.nextInt();
        while (classesattended < 0 || classesattended > totalclasses) {
            System.out.println("Invalid attendance. Attended classes cannot exceed or less than zero " + totalclasses);
            System.out.print("enter classes attended: ");
            classesattended = sc.nextInt();

        }
        double attendancepercentage = (classesattended / (double) totalclasses) * 100;
        String attendancestatus = attendancepercentage >= 75 ? "REGULAR" : "SHORTAGE";
        System.out.print("totalAssignments: ");
        int totalAssignments = sc.nextInt();
        while (totalAssignments < 1 || totalAssignments > 10) {
            System.out.println("Invalid Assignmnets please type between 1 to 10");
            System.out.print("totalAssignments: ");
            totalAssignments = sc.nextInt();
        }
        int assignmentScore;
        int totalAssignmentScore = 0;
        int validAssignments = 0;
        for (int i = 1; i <= totalAssignments; i++) {
            System.out.print("Enter assignment score " + i + ": ");
            assignmentScore = sc.nextInt();
            if (assignmentScore == -1) {
                break;
            } else if (assignmentScore < -1 || assignmentScore > 10) {
                continue;

            } else {

                totalAssignmentScore += assignmentScore;
                validAssignments++;
            }

        }
        double AssignmentAverage = 0;
        if (validAssignments > 0) {
            AssignmentAverage = (double) totalAssignmentScore / validAssignments;
        }
        String AssignmentCriteria = validAssignments >= 1 && AssignmentAverage >= 5 ? "SATISFACTORY"
                : "NEEDS IMPROVEMENT";
        double scholarshipdiscount;
        if (academicresult.equals("PASSED") && percentage >= 85 && attendancepercentage >= 85) {
            scholarshipdiscount = 10;

        } else if (academicresult.equals("PASSED") && percentage >= 75 && attendancepercentage >= 75) {

            scholarshipdiscount = 5;

        } else {

            scholarshipdiscount = 0;
        }
        double Scholarshipamount = basesemesterfee * scholarshipdiscount / 100;
        double finalAmount = basesemesterfee - Scholarshipamount;
        System.out.println("final amount after discount is: " + finalAmount);
        System.out.print("Amount paid ");
        double amountpaid = sc.nextDouble();
        while (amountpaid < 0 || amountpaid > finalAmount) {
            System.out.println("Invalid amount");
            System.out.print("Amount paid ");
            amountpaid = sc.nextDouble();

        }
        double feebalance = finalAmount - amountpaid;
        String feestatus = feebalance == 0 ? "PAID" : "PENDING";
        String res = academicresult.equals("PASSED") && attendancepercentage >= 75
                && AssignmentCriteria.equals("SATISFACTORY")
                && feebalance == 0 ? "CLEARED FOR NEXT SEMESTER" : "ACTION REQUIRED";

        System.out.println("========================================================");
        System.out.println("                 STUDENT SEMESTER REPORT");
        System.out.println("========================================================");
        System.out.println("Student ID                 :" + StudentID);
        System.out.println("Student Name               :" + FullName);
        System.out.println("Age                        :" + age);
        System.out.println("Email                      :" + Email);
        System.out.println("Course                     :" + courseChoice);
        System.out.println("Semester                   :" + semester);
        System.out.println("Career Goal                :" + Carrergoal);

        System.out.println();
        System.out.println("---------------- ACADEMIC SUMMARY --------------------");
        System.out.println("Java Marks                 :" + javamarks);
        System.out.println("SQL Marks                  :" + sqlmarks);
        System.out.println("Web Technology Marks       :" + webtechnologymarks);
        System.out.println("Aptitude Marks              :" + apptitudemarks);
        System.out.println("Communication Marks        :" + communicationmarks);
        System.out.println("Total Marks                :" + totalmarks);
        System.out.println("Percentage                 :" + percentage);
        System.out.println("Academic Result            :" + academicresult);
        System.out.println("Grade                      :" + grade);

        System.out.println();
        System.out.println("---------------- ATTENDANCE SUMMARY ------------------");
        System.out.println("Classes Conducted          :" + totalclasses);
        System.out.println("Classes Attended           :" + classesattended);
        System.out.println("Attendance Percentage      :" + attendancepercentage);
        System.out.println("Attendance Status          :" + attendancestatus);

        System.out.println();
        System.out.println("---------------- ASSIGNMENT SUMMARY ------------------");
        System.out.println("Valid Assignments          :" + validAssignments);
        System.out.println("Assignment Total           :" + totalAssignmentScore);
        System.out.println("Assignment Average         :" + AssignmentAverage);
        System.out.println("Assignment Status          :" + AssignmentCriteria);

        System.out.println();
        System.out.println("---------------- FEE SUMMARY -------------------------");
        System.out.println("Base Semester Fee          :" + basesemesterfee);
        System.out.println("Scholarship Percentage     :" + scholarshipdiscount);
        System.out.println("Scholarship Amount         :" + Scholarshipamount);
        System.out.println("Final Payable Fee          :" + finalAmount);
        System.out.println("Amount Paid                :" + amountpaid);
        System.out.println("Fee Balance                :" + feebalance);
        System.out.println("Fee Status                 :" + feestatus);

        System.out.println();
        System.out.println("---------------- FINAL STATUS ------------------------");
        System.out.println("Semester Clearance         :" + res);

        System.out.println();
        System.out.println("---------------- FAILED CONDITIONS -------------------");
        if (javamarks < 35) {
            System.out.println("Failed in Java");
        }

        if (sqlmarks < 35) {
            System.out.println("Failed in SQL");
        }

        if (webtechnologymarks < 35) {
            System.out.println("Failed in Web Technology");
        }

        if (apptitudemarks < 35) {
            System.out.println("Failed in Aptitude");
        }

        if (communicationmarks < 35) {
            System.out.println("Failed in Communication");
        }

        if (percentage < 40) {
            System.out.println("Overall percentage is below 40%");
        }

        if (attendancepercentage < 75) {
            System.out.println("Attendance is below 75%");
        }

        if (AssignmentCriteria.equals("NEEDS IMPROVEMENT")) {
            System.out.println("Assignment performance needs improvement");
        }

        if (feebalance > 0) {
            System.out.println("Fee payment is pending");
        }

        if (academicresult.equals("PASSED")
                && attendancepercentage >= 75
                && AssignmentCriteria.equals("SATISFACTORY")
                && feebalance == 0) {

            System.out.println("NoNe");
        }

        System.out.println();
        System.out.println("---------------- RECOMMENDATIONS ---------------------");

        if (javamarks < 35) {
            System.out.println("Improve Java preparation and practice more problems.");
        }

        if (sqlmarks < 35) {
            System.out.println("Practice SQL queries and database concepts.");
        }

        if (webtechnologymarks < 35) {
            System.out.println("Improve Web Technology concepts and practical skills.");
        }

        if (apptitudemarks < 35) {
            System.out.println("Practice aptitude questions regularly.");
        }

        if (communicationmarks < 35) {
            System.out.println("Improve communication skills through regular practice.");
        }

        if (attendancepercentage < 75) {
            System.out.println("Maintain attendance above 75%.");
        }

        if (AssignmentCriteria.equals("NEEDS IMPROVEMENT")) {
            System.out.println("Complete assignments regularly and improve assignment scores.");
        }

        if (feebalance > 0) {
            System.out.println("Clear the pending semester fee.");
        }

        if (academicresult.equals("PASSED")
                && attendancepercentage >= 75
                && AssignmentCriteria.equals("SATISFACTORY")
                && feebalance == 0) {

            System.out.println("Good performance. Continue maintaining your academic standards.");
        }

        System.out.println("========================================================");

        sc.close();

    }
}

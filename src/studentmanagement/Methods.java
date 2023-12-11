/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author Shehan Rashmika
 */
public class Methods {
    
    
    double gpa = 0;
    int rounds = 0;
    
    public String credit (int marks){
        
        String grade ="...";
        double credit = 0;

        if (marks >= 80 && marks <= 100) {
            grade = "A";
            credit = 4.00; 
            rounds++;
        } else if (marks >= 70 && marks <= 79) {
            grade = "A-";
            credit = 3.70;
            rounds++;
        } else if (marks >= 65 && marks <= 69) {
            grade = "B+";
            credit = 3.30;
            rounds++;
        } else if (marks >= 60 && marks <= 64) {
            grade = "B";
            credit = 3.00;
            rounds++;
        } else if (marks >= 55 && marks <= 59) {
            grade = "B-";
            credit = 2.70;
            rounds++;
        } else if (marks >= 50 && marks <= 54) {
            grade = "C+";
            credit = 2.30;
            rounds++;
        } else if (marks >= 45 && marks <= 49) {
            grade = "C";
            credit = 2.00;
            rounds++;
        } else if (marks >= 40 && marks <= 44) {
            grade = "C-";
            credit = 1.70;
            rounds++;
        } else if (marks >= 35 && marks <= 39) {
            grade = "D+";
            credit = 1.30;
            rounds++;
        } else if (marks >= 30 && marks <= 34) {
            grade = "D";
            credit = 1.00;
            rounds++;
        } else if (marks >= 1 && marks <= 29) {
            grade = "F";
            credit = 0.00;
            rounds++;
        } else if (marks == 0) {
            grade = "A/B";
        }
        else {
            System.out.println("Invalid marks entered.");
            
        }
        
        gpa = gpa + credit;
        
        return grade;
    }
    
    int creditsSub1 = 2;
        int creditsSub2 = 2;
        int creditsSub3 = 2;
        int creditsSub4 = 2;
        int creditsSub5 = 3;
    
    public double sem1gpa (int marks){
                
        
        
        if (marks >= 80 && marks <= 100) {
        return 4.00;
    } else if (marks >= 70 && marks <= 79) {
        return 3.70;
    } else if (marks >= 65 && marks <= 69) {
        return 3.30;
    } else if (marks >= 60 && marks <= 64) {
        return 3.00;
    } else if (marks >= 55 && marks <= 59) {
        return 2.70;
    } else if (marks >= 50 && marks <= 54) {
        return 2.30;
    } else if (marks >= 45 && marks <= 49) {
        return 2.00;
    } else if (marks >= 40 && marks <= 44) {
        return 1.70;
    } else if (marks >= 35 && marks <= 39) {
        return 1.30;
    } else if (marks >= 30 && marks <= 34) {
        return 1.00;
    } else {
        return 0;
    }
         
        
        
    }
    
}

package week1A_Recap.JavaBasics;

import java.text.DecimalFormat;

/****
 ***** Created by pcurr on 04/11/2024
 ***** UPDATE PROGRAM DESCRIPTION
 *****/

public class P1VariablesDataTypes {
    public static void main(String[] args) {

        //declare and initialise variables
        String surname = "Curran";
        char initial = 'P';
        int age = 40;
        double salary = 40000;
        boolean isEmployed = true;
        String status;

        DecimalFormat decimalFormat = new DecimalFormat("00,000.00");

        //if else to determine status
        if(isEmployed){
            status = "employed";
        }//if
        else{
            status = "not employed";
        }//else

        System.out.println(initial + " " + surname + " is " + age + " years old, is currently " + status +
                " and has a salary of £" + decimalFormat.format(salary) + " per year.");

    }//main
}//class

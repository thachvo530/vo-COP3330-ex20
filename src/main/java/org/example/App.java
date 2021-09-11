/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double totaltax = 0, totalorder = 0;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("What is the order amount? ");
        double order = scan.nextDouble();

        System.out.print("What state do you live in? ");
        String state = scan.next();

        if (state.equals("Wisconsin")) {

            System.out.print("What county do you live in? ");
            String county = scan.next();

            if (county.equals("Eau Claire")) {

                totaltax = (.05 + .005) * order;
                totalorder = totaltax + order;

            }

            else if (county.equals("Dunn")) {

                totaltax = (.05 + .004) * order;
                totalorder  = totaltax + order;

            }

            else {

                totaltax = .05 * order;
                totalorder = totaltax + order;
            }


        }

         else if (state.equals("Illinois")) {

            totaltax = .08 * order;
            totalorder = order + totaltax;
        }

         else {
             totaltax = 0;
             totalorder = order + totaltax;
        }
         System.out.print("The tax is $"+df.format(totaltax)+".\nThe total is $"+df.format(totalorder)+". ");
    }
}

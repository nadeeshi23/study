/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet5;

/**
 *
 * @author shinr
 */
public class Q1 {
 public static void main(String[] args) {
        // a. Display the numbers from 1 to 10 line by line
        int numA = 1;
        System.out.println("a. Displaying the numbers from 1 to 10 line by line");
        while (numA <= 10) {
            System.out.println(numA);
            numA++;
        }

        // b. Display the numbers from 10 to 1 line by line
        int numB = 10;
        System.out.println("b. Displaying the numbers from 10 to 1 line by line");
        while (numB >= 1) {
            System.out.println(numB);
            numB--;
        }

        // c. Display the sequence 1, 3, 5, 7, 9 line by line
        int numC = 1;
        System.out.println("c. Displaying the sequence 1, 3, 5, 7, 9 line by line");
        while (numC <= 9) {
            System.out.println(numC);
            numC += 2;
        }

        // d. Display the sequence 1, 4, 7, 10, 13, 16, … up to 52 line by line
        int numD = 1;
        System.out.println("d. Displaying the sequence 1, 4, 7, 10, 13, 16, … up to 52 line by line");
        while (numD <= 52) {
            System.out.println(numD);
            numD += 3;
        }

        // e. Display the sequence 2, 3, 5, 9, 17, … up to 33 line by line
        int numE = 2;
        System.out.println("e. Displaying the sequence 2, 3, 5, 9, 17, … up to 33 line by line");
        while (numE <= 33) {
            System.out.println(numE);
            numE = numE * 2 - 1;
        }

        // f. Display all the odd numbers between 1 to 50
        int numF = 1,k=1;
        System.out.println("f. Displaying all the odd numbers between 1 to 50");
        while (numF <= 50) {
            System.out.println(numF);
            numF += 2;
            //can use the equation getting odd numbers(n= 2k-1)
            //numF= (2*k)-1;
            //i++;
        }

        // g. Display all the even numbers between 1 to 50
        int numG = 2;
        System.out.println("g. Displaying all the even numbers between 1 to 50");
        while (numG <= 50) {
            System.out.println(numG);
            numG += 2;
        }

        // h. Display all the numbers that are multiples of 3 between 1 to 50
        int numH = 3;
        System.out.println("h. Displaying all the numbers that are multiples of 3 between 1 to 50");
        while (numH <= 50) {
            System.out.println(numH);
            numH += 3;
        }

        // i. Summation of all the numbers from 1 to 10
        int numI = 1;
        int sumI = 0;
        System.out.println("i. Summation of all the numbers from 1 to 10");
        while (numI <= 10) {
            sumI += numI;
            numI++;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sumI);

        // j. Multiplication of all the numbers from 1 to 10
        int numJ = 1;
        int productJ = 1;
        System.out.println("j. Multiplication of all the numbers from 1 to 10");
        while (numJ <= 10) {
            productJ *= numJ;
            numJ++;
        }
        System.out.println("Product of numbers from 1 to 10: " + productJ);

        // k. Number of even numbers from 1 to 50
        int numK = 2;
        int countK = 0;
        System.out.println("k. Number of even numbers from 1 to 50");
        while (numK <= 50) {
            countK++;
            numK += 2;
        }
        System.out.println("Number of even numbers from 1 to 50: " + countK);

        // l. Number of odd numbers from 1 to 50
        int numL = 1;
        int countL = 0;
        System.out.println("l. Number of odd numbers from 1 to 50");
        while (numL <= 50) {
            countL++;
            numL += 2;
        }
        System.out.println("Number of odd numbers from 1 to 50: " + countL);

        // m. Sum of the even integers from 2 to 30
        int numM = 2;
        int sumM = 0;
        System.out.println("m. Sum of the even integers from 2 to 30");
        while (numM <= 30) {
            sumM += numM;
            numM += 2;
        }
        System.out.println("Sum of even integers from 2 to 30: " + sumM);

        // n. Product of the odd integers from 1 to 15
        int numN = 1;
        int productN = 1;
        System.out.println("n. Product of the odd integers from 1 to 15");
        while (numN <= 15) {
            productN *= numN;
            numN += 2;
        }
        System.out.println("Product of odd integers from 1 to 15: " + productN);
    }
}
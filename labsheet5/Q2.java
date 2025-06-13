/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet5;

/**
 *
 * @author shinr
 */
public class Q2 {
     public static void main(String[] args) {
        // a. Display the numbers from 1 to 10 line by line
        int numA = 1;
        do {
            System.out.println(numA);
            numA++;
        } while (numA <= 10);

        // b. Display the numbers from 10 to 1 line by line
        int numB = 10;
        do {
            System.out.println(numB);
            numB--;
        } while (numB >= 1);

        // c. Display the sequence 1, 3, 5, 7, 9 line by line
        int numC = 1;
        do {
            System.out.println(numC);
            numC += 2;
        } while (numC <= 9);

        // d. Display the sequence 1, 4, 7, 10, 13, 16, … up to 52 line by line
        int numD = 1;
        do {
            System.out.println(numD);
            numD += 3;
        } while (numD <= 52);

        // e. Display the sequence 2, 3, 5, 9, 17, … up to 33 line by line
        int numE = 2;
        do {
            System.out.println(numE);
            numE = numE * 2 - 1;
        } while (numE <= 33);

        // f. Display all the odd numbers between 1 to 50
        int numF = 1;
        do {
            System.out.println(numF);
            numF += 2;
        } while (numF <= 50);

        // g. Display all the even numbers between 1 to 50
        int numG = 2;
        do {
            System.out.println(numG);
            numG += 2;
        } while (numG <= 50);

        // h. Display all the numbers that are multiples of 3 between 1 to 50
        int numH = 3;
        do {
            System.out.println(numH);
            numH += 3;
        } while (numH <= 50);

        // i. Summation of all the numbers from 1 to 10
        int numI = 1;
        int sumI = 0;
        do {
            sumI += numI;
            numI++;
        } while (numI <= 10);
        System.out.println("Sum of numbers from 1 to 10: " + sumI);

        // j. Multiplication of all the numbers from 1 to 10
        int numJ = 1;
        int productJ = 1;
        do {
            productJ *= numJ;
            numJ++;
        } while (numJ <= 10);
        System.out.println("Product of numbers from 1 to 10: " + productJ);

        // k. Number of even numbers from 1 to 50
        int numK = 2;
        int countK = 0;
        do {
            countK++;
            numK += 2;
        } while (numK <= 50);
        System.out.println("Number of even numbers from 1 to 50: " + countK);

        // l. Number of odd numbers from 1 to 50
        int numL = 1;
        int countL = 0;
        do {
            countL++;
            numL += 2;
        } while (numL <= 50);
        System.out.println("Number of odd numbers from 1 to 50: " + countL);

        // m. Sum of the even integers from 2 to 30
        int numM = 2;
        int sumM = 0;
        do {
            sumM += numM;
            numM += 2;
        } while (numM <= 30);
        System.out.println("Sum of even integers from 2 to 30: " + sumM);

        // n. Product of the odd integers from 1 to 15
        int numN = 1;
        int productN = 1;
        do {
            productN *= numN;
            numN += 2;
        } while (numN <= 15);
        System.out.println("Product of odd integers from 1 to 15: " + productN);
    }
}
    


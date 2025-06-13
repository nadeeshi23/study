/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet5;

/**
 *
 * @author shinr
 */
public class Q5G {
  public static void main(String[] args) {
        int n = 4;

        // Counting the number of star pyramid parts
        for(int p=0;p<3;p++){
        //printing the star pyramids to create a tree
            for (int i = 1; i <= n; i++) {
                for (int j = n - 1; j >= i; j--) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("X ");
                }
                System.out.println();
            }
        }
    
    }
}


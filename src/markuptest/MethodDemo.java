/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package markuptest;

/**
 *
 * @author sibon
 */
public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 5 is" + sum(1, 5)+ "using a method");
        
    }
    public static int sum(int i1, int i2) {
        int result = 0;
        for (int i = i1; i<=i2; i++)
            result +=i;
        return result;
    }
    
}

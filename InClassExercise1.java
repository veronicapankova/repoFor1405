/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ice1.inclassexercise1;

/**
 *
 * @author Veronica
 * 
 * 
 * Name      : 
 * Synopsis  : 
 * Parameters: 
 * Output    :
 * Errors    : 
 */
public class InClassExercise1 
{

    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        System.out.println("In Class Exercise 1:");
        
        int i;
//        // write a for loop to print 1 3 5 7 9 11
//        for(i = 1; i < 12; i += 2)
//        {
//            System.out.println(i + " ");
//        }
//        
//        // write a for loop to print 5 4 3 2 1
//        for(i = 5; i > 0; i -= 1)
//        {
//            System.out.println(i + " ");
//        }
//        
//        // write a for loop to print -5 -4 -3 -2 -1
//        for(i = -5; i < 0; i += 1)
//        {
//            System.out.println(i + " ");
//        }
//        
//        // write the multiplication table for 3:
//        for(i = 1; i < 31; i++)
//        {
//            System.out.println("3 * " + i + " = " + i * 3);
//        }
//        
//        // write the multiplication table for 3 backwards:
//        for(i = 30; i > 0; i--)
//        {
//            System.out.println("3 * " + i + " = " + i * 3);
//        }
//        
//        // write a loop to prut=nt 1 -3 5 -7 9 -11
//        for(i = 1; i < 12; i += 4)
//        {
//            System.out.println(i + "\n" + (- (i + 2)));
//        }
        
        // experiment with math.pow()
        // write the code to print 2 to the power 3 (which is 8)
        System.out.println(Math.pow(2, 3));
        
        // write your own factorial method
        System.out.println(factorial(5));
        
        // write a method to get the sum if 0-5
        System.out.println(sum());
    }
    
    /**
     *
     * @return
     */
    public static int sum()
    {
        int result = 0;
        for(int i = 1; i < 6; i++){
            result += i;
        }
        return result;
    }
    
    /**
     *
     * @param x
     * @return
     */
    public static int factorial(int x)
    {
        if (x == 0 || x == 1)
        {
            return 1;
        }
        
        return x * factorial(x - 1);
    }
}

package org.example.fizzbuzz;

public class FizzBuzz {

    public static void main(String...args) {
        // TODO implement me
        // 1, send, ++, loop
        int i = 1;
        while (i < 101) { 
            String result = fizzbuzz(i);
            System.out.print(result);
            if (i<100){
                System.out.print(", ");
            
            }
            i++;
        } 


        
    }

    public static String fizzbuzz(int number) {
        
        if ( number % 15 == 0) {
            return "FizzBuzz";
        } else if ( number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else { return Integer.toString(number);
        }
    }
}

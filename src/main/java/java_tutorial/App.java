package java_tutorial;

import java.util.Arrays;
import java.util.Date;
import java.awt.*;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("variableAssignment: 0\nobjectInstances: 1\nreferenceTypes: 2\narrayExample: 3\nmathOperators: 4\nconditionalLogic: 5\nloopTypes: 6");
        input = scanner.next().toLowerCase();        
        Integer result = Integer.parseInt(input);
        switch(result) {
            case 0:
                variableAssignment();
                break;

            case 1:
                objectInstances();
                break;

            case 2:
                referenceTypes();
                break;
            
            case 3:
                arrayExample();
                break;
            
            case 4:
                mathOperators();
                break;
            
            case 5:
                conditionalLogic();
                break;
            
            case 6:
                loopTypes();
                break;
        }
    }

    public static void variableAssignment() 
    {

        // Primitive types
        byte byteAge = 25;
        int age = 30;
        int age2 = age;
        int temperature = 20, distance = 50;

        float price = 10.99f;

        long viewsCount = 3_123_456_789l;

        char letter = 'A';

        boolean isGameover = true;
        age = 35;
        System.out.println(age);

        final float changeMe = 3.14f;   // constants
        // changeMe = 5.0f;

        String name = "name";
    }

    public static void arrayExample()
    {
        // array creation
        int[] numbers = { 2, 3, 5, 1, 4};
        // accessing array methods
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);

        // multi-dimensional arrays
        int[][] multiArray = new int[2] [3];
        multiArray[0][0] = 1;
        System.out.println(Arrays.deepToString(multiArray));
    }

    public static void objectInstances()
    {
        // Instantiation
         Date now = new Date();
          // Creating an instance
           // Creating an instance
         now.getTime();          // Accessing a method

         System.out.println(now);

         String message = "Hello!!";                      // accessing instance methods
         System.out.println(message.startsWith("!!"));   // right to left execution
         System.out.println(message.endsWith("!!"));
         System.out.println(message.length());


    }

    public static void referenceTypes()
    {

        // primitive type
        byte x = 1;
        byte y = x;

        x = 2;

        System.out.println("X: " + x + " Y: " + y);

        // reference type
        Point point1 = new Point(1, 1);
        Point point2 = point1;

        point1.x = 2;

        System.out.println(point2);

    }

    public static void mathOperators()
    {
        // operators
        int result = 10 * 3;
        result = 10 / 3;
        result = 10 + 3;
        result = 10 - 3;
        result = 10 % 3;

        System.out.println(result);

        
        // type casting
        double preciseResult = (double)10 / (double)3;
        System.out.println(preciseResult);

        // shorthand incrementing
        result++;
        result += 5;
    }

    public static void conditionalLogic() 
    {

        // comparison operators
        int x = 1;
        int y = 1;

        System.out.println(x > y);
        // > // < // <= // >== 

        // logical operators
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean isRaining = true;

        boolean goOutside = temperature > 20 || isRaining == false;
        goOutside = temperature >= 20 || !isRaining == false;
        System.out.println(goOutside);

        // if statements
        if (temperature > 20) {
            isRaining = false;
            goOutside = !isRaining;
            System.out.println(goOutside);
        } 
        else if(temperature < 20)
        {
            isRaining = true;
            goOutside = !isRaining;
            System.out.println(goOutside);
        }

        // Ternary operator

        String weather = temperature > 20 ? "Sunny" : "Cold";
        System.out.println(weather);

    }

    public static void loopTypes()
    {
        /*
        for (int i = 0; i < 5; i++) {
            System.err.println("Hello " + "i: " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.err.println("Hello " + "i: " + i);
        }
        */


        int i = 5;
        while (i > 0) {
            System.out.println("Hello " + "i: " + i);
            i--;
        }

        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass")) {
                continue;
            }
            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }

        /*
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
        */

        String[] colours = {"Red", "Green", "Blue"};
        
        for (String colour : colours) {
            System.out.println(colour);
        }

    }
}

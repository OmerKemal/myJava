package day33exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions01 {

    /*
            1)If you get red underline while you type code, it means it is CompileTime Exception (Checked Exception)
            2)To handle Checked Exception you can use "try-catch" block.
            3)If you use multiple catch blocks after try block anf the Exception Classes have parent-child relationship
              Child Exception Class must be typed first, Parent must be typed later.

            Interview Question:
            What is the difference between "throw" and "throws" keywords?
            i)"throw" is used in the method body, "throws" is used in the method signature line.
            ii)"throw" can be used many times in a method body, but "throws" can be used just once.
            iii)After using "throw" keyword we create an Exception Class Object, but after using "throws" we type just the name of the Exception Class
            iv)After using "throw" keyword we can use just one Exception Class, but after using "throws" we can use multiple Exception Classes
            v)"throw" keyword handles the Exception and lets next codes to be executed, but "throws" makes the code throw exception and stops the execution
     */
    public static void main(String[] args) throws IOException {
        readTextFile1();

        readTextFile2(); // when it complains you can also create throw-catch here

    }

    //Example 1: Create a method that reads the text in a text file.

    //1. Way: Use try-catch
    public static void readTextFile1(){


        try {
            FileInputStream fis = new FileInputStream("src/main/java/day33exceptions/MyTextFile.txt");
            int k= 0;
            while ((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) { //FİleNotFoundException is for path and the existence of the file. (CompileTime Exception or checked exception)
            System.out.println("The address is wrong or the file is deleted");
        } catch (IOException e) { // IOException is for all the issues related with Input and Output. (CompileTime Exception or checked exception)
            System.out.println("Some characters are not in English");
        } // IOException is the parent of FileNotFound Exception - using only IOException would be enough

    }

    //2. Way: Use "throws keyword:
    public static void readTextFile2() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/day33exceptions/MyTextFile.txt");

        int k= 0;
        while ((k=fis.read())!=-1){
            System.out.print((char)k);
        }
    }
}

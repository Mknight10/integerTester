//Main.java Created by Matthew Knight 01/15/21
//Goal is to test the functions of the MyInteger class - designed to find various properties of a given integer.
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner get = new Scanner (System.in);

    System.out.println("Begin testing program. Please enter a value to test the constructor method as well as the no parameter versions of the isEven, isOdd, and isPrime methods" );
    System.out.print("Value: ");
    int value = get.nextInt();

    MyInteger test = new MyInteger(value);

    System.out.println("\nisEven:" + test.isEven() + " isOdd:" + test.isOdd() + " isPrime:" + test.isPrime());

    System.out.println("\nPlease enter a value to test the isXXX(int) methods.");
    System.out.print("Value: ");
    value = get.nextInt();

    System.out.println("\nisEven:" + test.isEven(value) + " isOdd:" + test.isOdd(value) + " isPrime:" + test.isPrime(value));


    System.out.println("\nPlease enter a value to test the isXXX(MyInteger) methods.");
    System.out.print("Value: ");
    value = get.nextInt();

    MyInteger two = new MyInteger(value);


   System.out.println("\n isEven:" + MyInteger.isEven(two) + " isOdd:" + MyInteger.isOdd(two) + " isPrime:" + MyInteger.isPrime(two));

   System.out.print("\nPlease enter the first value for the equals(int) method tests:");
   int e1 = get.nextInt();
   MyInteger obj1 = new MyInteger(e1);

   System.out.print("\n");

   System.out.print("\nPlease enter the second value for the equals(int) method tests:");
   int e2 = get.nextInt();


   System.out.print("\neqauls(int) test:" + obj1.equals(e2));

   System.out.print("\nPlease enter the first value for the equals(MyInteger) method tests:");
   e1 = get.nextInt();
   MyInteger obj2 = new MyInteger(e1);

   System.out.print("\nPlease enter the second value for the equals(MyInteger) method tests:");
   e2 = get.nextInt();
   MyInteger obj3 = new MyInteger(e2);

   System.out.print("\neqauls(MyInteger) test:" + obj2.equals(obj3));

   System.out.print("\nPlease enter an integer to test the parseInt(char[]) method.");
   System.out.print("\nValue:");
   value = get.nextInt();

   char [] chars = ("" + value).toCharArray();

   System.out.print("\nResults:" + MyInteger.parseInt(chars));


   System.out.print("\nPlease enter an integer to test the parseInt(String) method.");
   System.out.print("\nValue:");
   value = get.nextInt();

   String holder = Integer.toString(value);

   System.out.print("\nResults:" + MyInteger.parseInt(holder));

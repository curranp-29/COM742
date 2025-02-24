package week1A_Recap.JavaBasics;

import java.util.Scanner;

/****
 ***** Created by pcurr on 28/01/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
class P7Person {
   public static void main(String[] args) {
      Person person1 = new Person();
      person1.name = "Alice";
      person1.age = 30;
      person1.introduce();

      Person person2 = new Person();
      person2.name = "Bob";
      person2.age = 25;
      person2.introduce();

      Person person3 = new Person();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter name: ");
      person3.name = scanner.nextLine();
      System.out.println("Enter age: ");
      person3.age = scanner.nextInt();
      person3.introduce();
   }
}
class Person {
   String name;
   int age;

   void introduce() {
      System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
   }
}
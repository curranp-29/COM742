import java.util.Scanner;

public class Person {

    public static void main(String[] args) {

        //create instance of person class
        Person person = new Person("John Doe", 25);

        //access fields through get and set
        System.out.println("Original Age: " + person.getAge());
        person.setAge(30);
        System.out.println("Updated Age: " + person.getAge());

        //display info
        person.displayInfo();

        Scanner scanner = new Scanner(System.in);

        //Create new person
        Person me = new Person();
        System.out.print("Enter name: ");
        me.setName(scanner.next());
        System.out.print("Enter age: ");
        me.setAge(scanner.nextInt());

        //displayInfo
        me.displayInfo();

    }//main

    //private fields encapsulation
    private String name;
    private int age;

    public Person(){
    }//defaultConstructor

    //Public constructor
    public Person(String name, int age){
        this.name = name;
         //validateAge
        if( age > 0){
            this.age = age;
        }//if
        else{
            throw new IllegalArgumentException("Age must be a positive value");
        }//else
    }//Person

    //Public getter method for name field
    public String getName(){
        return name;
    }//getName

    public int getAge(){
        return age;
    }//getAge

    // Public setter method for the name field
    public void setName(String name){
        this.name = name;
    }//setName

    // Public setter method for the age field
    public void setAge(int age){
        try{
            //validateAge
            if( age > 0){
                this.age = age;
            }//if
            else{
                throw new IllegalArgumentException("Age must be a positive value");
            }//else
        } catch (IllegalArgumentException e){
            //Handle exception print error
            System.out.println("Error: " + e.getMessage());
        }//catch

    }//setAge

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }//displayInfo


}

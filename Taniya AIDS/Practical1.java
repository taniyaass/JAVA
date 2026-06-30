//PRACTICAL-1 : Hello World program,variables,data types and type casting demonstration 
public class Practical1{
    public static void main(String[]args){
        System.out.println("Hello World!");
        System.out.println();

        int age = 20;
        double salary = 35000.75;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Rahul";

        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Salary:"+ salary);
        System.out.println("Grade:"+ grade);
        System.out.println("Student:"+ isStudent);

        System.out.println();

        int number = 50;
        double result = number;

        System.out.println("Implicit Type Casting");
        System.out.println("Integer Value :" + number);
        System.out.println("Converted to double:" + result);

        System.out.println();


        double marks = 89.75;
        int totalMarks = (int) marks;

        System.out.println("Explicit Type Casting");
        System.out.println("Double Value :" + marks);
        System.out.println("Converted to integer:" + totalMarks);

    
    }
}
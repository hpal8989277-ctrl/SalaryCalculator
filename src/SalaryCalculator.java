import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {

        //Salary Calculator
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your salary : ");
        double salary = sc.nextDouble();

        System.out.print("enter your interest : ");
        double interest = sc.nextDouble();

        double tax =  salary * interest / 100;

        System.out.println("your Tax on "+ salary + " salary is : "+ tax);
        
        double remainingSalary = salary - tax;
        System.out.println("your remaining salary(after tax) is : "+ remainingSalary);

        sc.close();
    }
}

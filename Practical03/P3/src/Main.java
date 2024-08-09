import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.setdata();
        Employee e2 = new Employee();
        e2.setdata();
        e1.getdata();
        e2.getdata();
        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}

class Employee
{
    String Fname, Lname;
    double monthly_salary , yearly_salary , total_salary;
    Scanner sc = new Scanner(System.in);

    void setdata()
    {
        System.out.println("Enter your First Name: ");
        Fname = sc.nextLine();
        System.out.println("Enter your Last Name: ");
        Lname = sc.nextLine();
        System.out.println("Enter your Salary: ");
        monthly_salary = sc.nextInt();
        if(monthly_salary < 0)
        {
            monthly_salary = 0.0;
        }
        yearly_salary = monthly_salary * 12;
        total_salary = (yearly_salary*0.1) + yearly_salary;

    }

    void getdata()
    {
        System.out.println("First Name: " + Fname + " " + Lname);
        System.out.println("Monthly Salary: " + monthly_salary);
        System.out.println("Yearly Salary: " + yearly_salary);
        System.out.println("Total Salary: " + total_salary);
    }


}
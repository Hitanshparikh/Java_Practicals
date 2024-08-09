import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float length , breadth;
        System.out.println("Enter length: ");
        length = sc.nextFloat();
        System.out.println("Enter breadth: ");
        breadth = sc.nextFloat();
        area a1 = new area(length, breadth);
        a1.returnArea();
        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }

}

class area
{
    float area;

    area(float length, float breadth)
    {
        area = length * breadth;
    }
    void returnArea()
    {
        System.out.println("The area of rectangle: " + area);
    }
}

class Employee 
{

    public void display() 
    {
        System.out.println("Name of class is Employee");
    }
   
}

class Engineer extends Employee 
{
    public void display() 
    {
        System.out.println("Name of class is Engineer");
        super.display();
    }
}

public class MethodOverriding 
{
    public static void main(String[] args) 
    {
        Engineer e = new Engineer();
        e.display();
    }
}

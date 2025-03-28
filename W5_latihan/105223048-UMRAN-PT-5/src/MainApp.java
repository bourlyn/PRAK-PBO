class Person 
{
    private String name;
    private int age;

    public Person(String n, int a) 
    {
        name = n;
        age = a;
    }

    public void display() 
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person 
{
    private double salary;
    public Employee(String n, int a, double s) 
    {
        super(n, a); 
        salary = s;
    }

    public void showSalary() 
    {
        System.out.println("Salary: " + salary);
    }

    public void displayAll() 
    {
        display();      
        showSalary();   
    }
}

public class MainApp 
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee("Alice", 25, 5000.0);
        emp.displayAll();
    }
}

class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getsalary() {
        return salary;
    }
}

public class ObjectOriented {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry = new Employee();// INSTATIATE A NEW EMPLOYEE OBJECT
        // SETTING ATTRIBUTES
        harry.id = 12;
        harry.salary = 30;
        harry.name = "CodeWithHarry";
        // PRINTING THE ATTRIBUTE
        // System.out.println(harry.id);
        // System.out.println(harry.name);
        harry.printDetails();
        int salary = harry.getsalary();
        System.out.println(salary);
    }
}

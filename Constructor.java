/**
 * MyMainEmployee
 */
class MyMainEmployee {

    private int id;
    private String name;

    public MyMainEmployee() {
        id = 45;
        name = "your name here";
    }

    public MyMainEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        MyMainEmployee abhishek = new MyMainEmployee();
        abhishek.setId(10);
        abhishek.setName("Abhishek Singh Rawat");
        System.out.println(abhishek.getId());
        System.out.println(abhishek.getName());

        MyMainEmployee aman = new MyMainEmployee();
        System.out.println(aman.getId());
        System.out.println(aman.getName());
        MyMainEmployee raj = new MyMainEmployee(10, "raj vashishth");
        System.out.println(raj.getId());
        System.out.println(raj.getName());
    }
}

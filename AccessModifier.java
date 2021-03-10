/**
 * MyEmployee
 */
class MyEmployee {

    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int n) {
        id = n;
    }

    public int getId() {
        return id;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        MyEmployee abhishek = new MyEmployee();
        // this will throw an error because of private access modifier
        // abhishek.id = 45;
        // abhishek.name = "code with abhishek";
        abhishek.setId(10);
        abhishek.setName("abhishek singh rawat");
        System.out.println(abhishek.getId());
        System.out.println(abhishek.getName());
    }
}

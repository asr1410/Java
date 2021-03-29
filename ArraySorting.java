//STUDENT CLASS FOR THE DATA
class Student {
    public int rollNo;
    public String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class ArraySorting {
    public static void main(String[] args) {
        // INTIALIZE THE ARRAY
        // int[] arr;
        // arr = new int[20];
        // arr = new int[]{1,2,3,4,5,6};
        // int[] arr = { 1, 2, 3, 4, 5, 6 };

        // GET ARRAY LENGTH
        // // System.out.println(arr.length);

        // ITERATION OF THE ARRAY
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("element at index " + i + " : " + arr[i]);
        // }

        // USING CLASS FOR ARRAY
        // Student[] arr = new Student[3];
        // arr[0] = new Student(1, "aman");
        // arr[1] = new Student(2, "abhishek");
        // arr[2] = new Student(3, "ayushi");

        // ITERATE THE OBJECT WITH FORI LOOP
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("element at " + i + " : " + arr[i].rollNo + " " +
        // arr[i].name);
        // }

        // FIND THE SUM OF THE ARRAY BY FUNCTION
        // int arr[] = { 1, 2, 3, 4, 5, 6 };
        // sum(arr);

        // RETURN THE ARRAY FROM THE FUCTION
        int arr[] = m1();
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    // FUNCTION FOR GETTING SUM OF THE ARRAY
    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array values : " + sum);
    }

    // FUNCTION FOR RETURNING THE ARRAY
    public static int[] m1() {
        return new int[] { 1, 2, 3 };
    }
}

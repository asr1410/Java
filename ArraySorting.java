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
        // int arr[] = m1();
        // for (int i : arr) {
        // System.out.println(i + " ");
        // }

        // DECLARE THE ARRAY
        // int intArray[] = new int[3];
        // byte byteArray[] = new byte[3];
        // short shortArray[] = new short[3];
        // String strArray[] = new String[3];
        // System.out.println(intArray.getClass());
        // System.out.println(intArray.getClass().getSuperclass());
        // System.out.println(byteArray.getClass());
        // System.out.println(shortArray.getClass());
        // System.out.println(strArray.getClass());

        // CLONE THE ARRAY
        // using clone method it create a reference where it store the reference of the
        // array we want to clone thus the copy array is created using the reference of
        // original array
        // int intArray[] = { 1, 2, 3 };
        // int cloneArray[] = intArray.clone();
        // System.out.println(cloneArray == intArray);
        // for (int i : cloneArray) {
        // System.out.println(i);
        // }

        // CLONE 2D ARRAY
        int intArray[][] = { { 1, 2, 3 }, { 4, 5 } };
        int cloneArray[][] = intArray.clone();
        System.out.println(intArray == cloneArray);
        System.out.println(intArray[0] == cloneArray[0]);
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

import java.util.Scanner;
// PRACTICE PROBLEM 1

public class ArrayPractice {
    public static void main(String[] args) {
        int marks[] = new int[5];
        int sum = 0;
        Scanner insert = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("enter the marks of subject " + (i + 1) + " -> ");
            marks[i] = insert.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("Total sum of marks are " + sum);
        insert.close();
    }
}

// PRACTICE PROBLEM 2

// public class ArrayPractice {

// public static void main(String[] args) {
// int arr[] = new int[5];
// byte found = 0;
// Scanner insert = new Scanner(System.in);
// System.out.println("Insert the values");
// for (int i = 0; i < arr.length; i++) {
// arr[i] = insert.nextInt();
// }
// int find;
// System.out.println("Enter the number to find");
// find = insert.nextInt();
// for (int element : arr) {
// if (find == element) {
// found++;
// break;
// }
// }
// if (found > 0) {
// System.out.println("element present in the array");
// } else {
// System.out.println("element not present in the array");
// }
// insert.close();
// }
// }

// PROBLEM PROBLEM 3

/**
 * ArrayPractice
 */
// public class ArrayPractice {

// public static void main(String[] args) {
// float marks[] = new float[5];
// float sum = 0f;
// Scanner insert = new Scanner(System.in);
// System.out.println("Enter the marks to find avg");
// for (int i = 0; i < marks.length; i++) {
// marks[i] = insert.nextFloat();
// }
// for (float element : marks) {
// sum += element;
// }
// System.out.println("The avg of marks is " + (sum / marks.length));
// insert.close();
// }
// }

// PRACTICE PROBLEM 4

/**
 * ArrayPractice
 */
// public class ArrayPractice {

// public static void main(String[] args) {
// int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
// int mat2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
// int res[][] = { { 0, 0, 0 }, { 0, 0, 0 } };
// for (int i = 0; i < mat1.length; i++) {
// for (int j = 0; j < mat1[i].length; j++) {
// res[i][j] = mat1[i][j] + mat2[i][j];
// }
// }
// for (int i = 0; i < res.length; i++) {
// for (int j = 0; j < res[i].length; j++) {
// System.out.print(res[i][j] + " ");
// }
// System.out.println();
// }
// }
// }

// PRACTICE PROBLEM 4
/**
 * ArrayPractice
 */
// public class ArrayPractice {

// public static void main(String[] args) {
// byte arr[] = { 1, 2, 3, 4, 5, 6 };
// byte temp;
// for (int i = 0; i < arr.length / 2; i++) {
// temp = arr[i];
// arr[i] = arr[arr.length - i - 1];
// arr[arr.length - i - 1] = temp;
// }
// for (byte b : arr) {
// System.out.println(b);
// }
// }
// }

// PRACTICE PROBLEM 5

/**
 * ArrayPractice
 */
// public class ArrayPractice {

// public static void main(String[] args) {
// int arr[] = { 1, 2, 6, 4, 5, 6 };
// boolean sorted = true;
// for (int i = 1; i < arr.length; i++) {
// if (arr[i - 1] > arr[i]) {
// sorted = false;
// break;
// }
// }
// if (sorted) {
// System.out.println("The array is sorted");
// } else {
// System.out.println("The array is not sorted");
// }
// }
// }
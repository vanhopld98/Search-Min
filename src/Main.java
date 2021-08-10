import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int size;
        System.out.println("Nhập độ dài của mảng");
        size = scanner.nextInt();
        int[] arr;
        arr = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        System.out.println("min = " + arr[index]);
    }
}
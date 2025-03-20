import java.util.*;
public class arr{
    public static void main(String args[]){
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the numbers: ");
        for(i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(i = 0; i<size; i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }
}
//백준 3003번
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[6];
//         int[] arr1 = {1,1,2,2,2,8};
//         for(int i = 0; i < 6; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i < 6; i++){
//             System.out.print(arr1[i] - arr[i]);
//             if(i < 5){
//                 System.out.print(" ");
//             }
//         }

//     }
// }


//백준 2444번
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*(num - i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}

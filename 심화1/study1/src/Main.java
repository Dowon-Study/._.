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
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i = 1; i <= num; i++){
//             for(int j = 1; j <= num - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= 2*i - 1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = 1; i < num; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= 2*(num - i) - 1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();

//     }
// }

//10988번
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         String str = sc.next();
//         int len1 = str.length() - 1;
//         int istrue = 0;
//         for(int i = 0; i <= len1 / 2; i++){
//             if(str.charAt(i) != str.charAt(len1 - i)){
//                 istrue = 1;
//             }
//         }
//         System.out.println(istrue == 0? 1:0);
//     }
// }

//

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int test = sc.nextInt();
        
//         for(int i = 0; i < test; i++){

//             int note1 = sc.nextInt();
//             int note1_num[] = new int[note1];
//             for (int j = 0; j < note1; j++){
//                 note1_num[j] = sc.nextInt();
//             }

//             int note2 = sc.nextInt();
//             int note2_num[] = new int[note2];
//             for (int k = 0; k < note2; k++){
//                 note2_num[k] = sc.nextInt();
//             }

//             for(int y = 0; y < note2; y++){
//                 int check = 0;
//                 for(int n = 0; n < note1; n++){
//                     if(note2_num[y] == note1_num[n]){
//                         check = 1;
//                         break;
//                     }
//                 }
//                 System.out.println(check);
//             }
//         }
//     }
// }

// import java.util.HashSet;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int test = sc.nextInt();
        
//         for(int i = 0; i < test; i++){

//             int note1 = sc.nextInt();
//             HashSet<Integer> note1Set = new HashSet<>();
//             for (int j = 0; j < note1; j++){
//                 note1Set.add(sc.nextInt());
//             }

//             int note2 = sc.nextInt();
//             for (int k = 0; k < note2; k++){
//                 int num = sc.nextInt();
//                 if(note1Set.contains(num)){
//                     System.out.println(1);
//                 } else {
//                     System.out.println(0);
//                 }
//             }
//         }
//         sc.close();
//     }
// }


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < test; i++){
            int note1 = Integer.parseInt(br.readLine());
            HashSet<Integer> note1Set = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < note1; j++){
                note1Set.add(Integer.parseInt(st.nextToken()));
            }

            int note2 = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < note2; k++){
                int num = Integer.parseInt(st.nextToken());
                if(note1Set.contains(num)){
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
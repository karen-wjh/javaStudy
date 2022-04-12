package System.out;

import java.util.Scanner;

public class aizuTP2_7 {
    public static void main(String[] args) {
         Scanner sc  =  new Scanner(System.in);
        int a = sc.nextInt ();
        int b = sc.nextInt ();
        int c = sc.nextInt ();
        int d = sc.nextInt ();
        int e = sc.nextInt ();
        int f = sc.nextInt ();
        int[] ns ={a,b,c,d};
        int x = a;
        for(int i = 0 ;i<4;i++){
            if(x>ns[i]){
                x=ns[i];

            }
        }
        int sum =0;
        for(int i =0;i<4;i++){
            if(ns[i]!=x){
                sum +=ns[i];
            }
        }
        int t;
        if(e<f){
            t=e;e=f;f=t;
        }
        System.out.println(e);
        System.out.println (sum);
        System.out.print(sum+e);

    }
    
}

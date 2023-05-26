package lp;

import java.util.*;
public class ex02 {
    public static void main(String[]args){
        Scanner e=new Scanner(System.in);
        System.out.println("valor de N");
        int n=e.nextInt();
        System.out.println(serie2( n));
    }
    public static int serie2(int n){
        int somatoria;
        if (n!=1){
            somatoria=n+serie2(n-1);
            return somatoria;
        }else{
            return 1;
        }
    }
}

package EstruturaDeDados;
import java.util.*;

public class ex1 {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Num:");
        int n=sc.nextInt();
        System.out.println(somatoria(n));
    }

    public static int somatoria(int n){
        if (n>1){
            n=n+somatoria(n-1);
            return n;
        }else if(n==1){
            return 1;
        }
        return 0;
    }
}

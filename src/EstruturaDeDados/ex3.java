package EstruturaDeDados;
import java.util.*;
public class ex3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n= sc.nextInt();
        System.out.println(somatoria(n));
    }
    public static double somatoria(double n){
        if(n>1){
            n=1/n+somatoria(n-1);
            return n;
        }
        return 1;
    }
}

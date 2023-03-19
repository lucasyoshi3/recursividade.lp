import java.util.*;
public class ex05 {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);
        System.out.println("Insira o valor de n: ");
        int n=e.nextInt();
        System.out.println(serie5(n));
    }
    public static int serie5(int n){
        int i;
        int fat=n;
        for(i=n-1;i>=1;i--){
            fat=fat*i;
        }
        if (n!=1){
            n=fat+serie5(n-1);
            return n;
        }else{
            return 1;
        }
    }
}

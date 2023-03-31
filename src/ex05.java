import java.util.*;
public class ex05 {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);
        System.out.println("Insira o valor de n: ");
        int n=e.nextInt();
        int soma=0;
        int numeroMax=n;
        System.out.println(serie5(n,soma,numeroMax));
    }
    public static int serie5(int n,int soma,int numeroMax) {
        if (numeroMax != 1) {
            int fat=fatorial(n);
            n=numeroMax-1;
            soma=fat+serie5(n,soma,numeroMax-1);
            return soma;
        } else{
            return 1;
        }
    }
    public static int fatorial(int n){
        if (n!=1){
            n=n*fatorial(n-1);
            return n;
        }else{
            return 1;
        }
    }
}

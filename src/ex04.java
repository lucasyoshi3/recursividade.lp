import java.util.*;
public class ex04 {
    public static void main(String [] args){
        Scanner e=new Scanner(System.in);
        System.out.println("Insira o valor de n");
        float n=e.nextFloat();
        float divisor=n;
        System.out.println("Resultado: "+serie4(n,divisor));
    }
    public static float serie4(float num, float divisor){
        if(num!=1){
            num=(num/(divisor-(num-1)))+serie4(num-1,divisor);
            return num;
        }else{
            return 1/divisor;
        }
    }
}

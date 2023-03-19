import java.util.*;
public class ex04 {
    public static void main(String [] args){
        Scanner e=new Scanner(System.in);
        System.out.println("Insira o valor de n");
        float n=e.nextFloat();
        float cta=0;
        System.out.println("Resultado: "+serie4(n,cta));
    }
    public static float serie4(float num, float cta){
        cta=cta+1;
        System.out.println(cta);
        if(num!=1){
            num=(num/cta)+serie4(num-1,cta);
            return num;
        }else{
            return 1/cta;
        }
    }
}

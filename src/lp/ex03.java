package lp;

import java.util.*;
public class ex03 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Insira o valor de n");
        float n=e.nextFloat();
        System.out.println(serie3(n));
    }
    public static float serie3(float num){
        if(num!=1){
            num=1/num+serie3(num-1);
            return num;
        }else{
            return 1;
        }
    }
}
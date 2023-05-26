package EstruturaDeDados;
import java.util.*;
public class ex2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero decimal para binario");
        int decimal=sc.nextInt();
        String binario="";
        System.out.println(converter(decimal,binario));
    }
    public static String converter(int decimal,String binario){
        if(decimal>=1){
            binario=String.valueOf(decimal%2)+binario;
            return converter(decimal/2, binario);
        }else{
            return binario;
        }
    }
}

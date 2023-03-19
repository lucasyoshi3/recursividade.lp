public class ex01 {
    public static void main(String[]args){
        int serie1=1;
        System.out.println(serie(serie1));
    }

    public static int serie(int serie1){
        if(serie1!=100){
            serie1=serie1+serie(serie1+1);
            return serie1;
        }else{
            return 100;
        }
    }
}
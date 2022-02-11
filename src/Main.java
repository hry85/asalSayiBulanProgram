import java.util.Scanner;
public class Main {
    static int prime(int a , int b) {
       if( b < a ){
           if(a % b !=0)
               return (prime(a, ++b));
           else {
               return 0;
           }
       }
       return 1;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Sayi giriniz : " );
        n=sc.nextInt();

        if (prime(n,2)==1){
            System.out.println(n +  " sayisi ASALDIR ! ");
        }else {
            System.out.println(n +  " sayisi ASAL DEGILDIR ! ");
        }


    }
}

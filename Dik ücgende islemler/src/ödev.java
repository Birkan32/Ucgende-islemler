import java.util.Scanner ;

public class ödev {
    public static void main(String[] args) {
        //Değiskenleri oluşturalım.
        int a,b  ;
        double c , alan ,u ,cevre;


        // Kullanıcıdan verileri alalım.
         Scanner girdi = new Scanner(System.in);
         System.out.print("1. Kenarı Giriniz : ");
         a =girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b =girdi.nextInt();

        c =Math.sqrt((a*a) + (b*b)) ;
        System.out.println(c);


        u = (a+b+c) / 2 ;
        cevre = 2 * u ;
        System.out.println("cevre :" + cevre);

        alan =Math.sqrt(u * (u-a) * (u-b) * (u-c)) ;
        System.out.println("alan :" + alan);

    }
}

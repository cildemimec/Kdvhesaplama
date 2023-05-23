import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        double tutar, kdvOran1 = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını Giriniz : ");
        tutar= input.nextDouble();

        kdvTutar = tutar+ kdvOran1;
        kdvliTutar =tutar +kdvTutar;

        System.out.println("KDV'siz Tutar: "+ tutar);
        System.out.println("KDV Oranı : "+ kdvOran1);
        System.out.println("KDV Tutarı: "+ kdvTutar);
        System.out.println("KDV'li Tutarı: "+ kdvliTutar);
    }
}
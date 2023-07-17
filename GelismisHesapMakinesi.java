import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Fark : " + result);
        return result;
    }
    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpım : " + result);
        return result;
    }
    static int divided(int a, int b){
        int result = a / b;
        System.out.println("Bölüm : " + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
            System.out.println("Üs hesabı : " + result);
        }
        return result;
    }
    static int mod(int a, int b){
        int result = a % b;
        System.out.println("Mod : " + result);
        return result;
    }
    static void calc(int a, int b){
        System.out.println("Çevresi : " + (2*(a+b)));
        System.out.println("Alanı : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int select;

        while (true) {
            System.out.print("1-Toplama\n" +
                    "2-Çıkartma\n" +
                    "3-Çarpma\n" +
                    "4-Bölme\n" +
                    "5-Üslü sayı hesaplama\n" +
                    "6-Mod alma\n" +
                    "7-Dikdörtgen alan ve çevre hesabı\n" +
                    "8-Çıkış\n" +
                    "Yapmak İstediğiniz İşlemi Seçin :  ");
            select = imp.nextInt();

            if (select == 8){
                break;
            }

            System.out.print("İlk sayıyı giriniz : ");
            int a = imp.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = imp.nextInt();


            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calc(a, b);
                    break;
            }
        }
    }
}

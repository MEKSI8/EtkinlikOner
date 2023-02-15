import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sicaklik;
        System.out.println("1:5'den küçük | 2:5-15 arasında | 3:15-25 arasında | 4:25'ten büyük");
        System.out.println("Hava Sıcaklık Değeri Seçin:");
        sicaklik = input.nextInt();
        switch (sicaklik){
            case 1:
                System.out.println("Kayak");
                break;
            case 2:
                System.out.println("Sinema");
                break;
            case 3:
                System.out.println("Piknik");
                break;
            case 4:
                System.out.println("Yüzme");
                break;
            default:
                System.out.println("Hatalı Değer Girdiniz");
        }
    }
}
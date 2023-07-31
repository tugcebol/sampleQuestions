package week03;

public class P08 {

    // Soru29). 1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir program yazın.

    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 1; i <= 100 ; i++) {
            toplam += i;
        }

        System.out.println("1'den 100'e kadar olan doğal sayıların toplamı: " + toplam);
    }
}

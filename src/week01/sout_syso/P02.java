package week01.sout_syso;

public class P02 {

    // Soru 2). Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.


    public static void main(String[] args) {


        int kisaKenar = 5;
        int uzunKenar = 10;

        int cevre = 2 * (uzunKenar + kisaKenar);
        int alan = uzunKenar * kisaKenar;

        System.out.println("Dikdörtgenin çevresi: " + cevre +
                "\nDikdörtgenin alanı: " + alan);
    }
}

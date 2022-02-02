package GeometrikŞekilHesaplama;

import java.util.Scanner;

// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
      

        String islemler = "İşlemler...\n"
                          +"1. Kare Alan Hesapla\n"
                          +"2. Üçgen Alan Hesapla\n"
                          +"3. Daire Alan Hesapla\n"
                          + "Çıkış : q";

        while(true) {
          System.out.println(islemler);
          System.out.println("hangi şeklin alanını hesaplamak istiyorsun");
          String sekıl_turu = scanner.nextLine();
          Sekil sekil = null; 

          if(sekıl_turu.equals("q")) {
              System.out.println("sistemden çıkılıyor");
              break;
          }
          else if (sekıl_turu.equals("1")) {
            System.out.println("karenin kenarı : ");
            int kenar = scanner.nextInt();
            scanner.nextLine();

            sekil = new Kare("kare1", kenar);
            sekil.alanHesapla();
          }
          else if(sekıl_turu.equals("2")){
            System.out.println("1. kenarı : ");
            int kenar1 = scanner.nextInt();
            System.out.println("2. kenarı : ");
            int kenar2 = scanner.nextInt();
            System.out.println("3. kenarı : ");
            int kenar3 = scanner.nextInt();
            scanner.nextLine();

            sekil = new Ucgen("ücgen1", kenar1, kenar2, kenar3);
            sekil.alanHesapla();

          }
          else if(sekıl_turu.equals("3")) {
            System.out.println("dairenin yarıçapı: ");
            int yarıcap = scanner.nextInt();
            scanner.nextLine();
            sekil = new Daire("Daire 1", yarıcap);

            sekil.alanHesapla();
          }
          else{
            System.out.println("geçersiz işlem...");
          }

            
          }
        }
       
    }
  } 


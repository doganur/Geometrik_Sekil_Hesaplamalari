package GeometrikŞekilHesaplama;

public class Kare extends Sekil {
    
    private int kenar;
    public Kare(String isim, int kenar) {

        super(isim);
        this.kenar = kenar;
        // Auto-generated constructor stub
    }


    @Override
    public void alanHesapla() {
        //  Auto-generated method stub
        System.out.println(getIsim()+ " in alanı "+ (kenar*kenar));
    }
}

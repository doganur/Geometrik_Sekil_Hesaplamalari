package GeometrikŞekilHesaplama;

public class Daire extends Sekil {

    private int yarıCap;

    public Daire(String isim, int yarıCap) {
        super(isim);
        this.yarıCap= yarıCap;
        //Auto-generated constructor stub
    }

    @Override
    void alanHesapla() {
        // Auto-generated method stub
        System.out.println(getIsim()+ " in alanı " + (Math.PI * yarıCap* yarıCap));
    }

    
}

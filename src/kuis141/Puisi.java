package kuis141;

public class Puisi implements NilaiAkhir{
    private double idh, eyd, str, kre;

    public Puisi(double idh, double eyd, double str, double kre) {
        this.idh = idh;
        this.eyd = eyd;
        this.str = str;
        this.kre = kre;
    }

    public double getIdh() {
        return idh;
    }

    public double getEyd() {
        return eyd;
    }

    public double getStr() {
        return str;
    }

    public double getKre() {
        return kre;
    }
    
    @Override
    public double nilai() {
        double nilai = (idh*30/100)+(eyd*20/100)+(str*20/100)+(kre*30/100);
        return nilai;
    }
    
}

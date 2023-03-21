package kuis141;

public class KTulis implements NilaiAkhir{
    private double bhs, eyd, str, kre;

    public KTulis(double bhs, double eyd, double str, double kre) {
        this.bhs = bhs;
        this.eyd = eyd;
        this.str = str;
        this.kre = kre;
    }

    public double getBhs() {
        return bhs;
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
        double nilai = (bhs*30/100)+(eyd*20/100)+(str*20/100)+(kre*30/100);
        return nilai;
    }
    
    
    
}

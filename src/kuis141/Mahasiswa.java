package kuis141;

public class Mahasiswa implements dataMhs{
    private String n, j;
    private double Ni;


    public Mahasiswa(String n, String j, double Ni) {
        this.n = n;
        this.j = j;
        this.Ni = Ni;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public double getNi() {
        return Ni;
    }

    public void setNi(double Ni) {
        this.Ni = Ni;
    }

    @Override
    public int Ident() {
        System.out.println("Nama :" +n);
        System.out.println("Jurusan :" +j);
        System.out.println("NIM :" +Ni);
        return Ident();
    }
    
    

    
    
}

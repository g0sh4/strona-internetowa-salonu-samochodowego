package baza_bdbt_proj;

public class Modele {
    private int idModelu;
    private String kod;
    private String opis;
    private int idMarki;

    public Modele(){

    }

    public Modele(int idModelu, String kod, String opis, int idMarki) {
        super();
        this.idModelu = idModelu;
        this.kod = kod;
        this.opis = opis;
        this.idMarki = idMarki;
    }

    public int getIdModelu() {
        return idModelu;
    }

    public void setIdModelu(int idModelu) {
        this.idModelu = idModelu;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getIdMarki() {
        return idMarki;
    }

    public void setIdMarki(int idMarki) {
        this.idMarki = idMarki;
    }

    @Override
    public String toString() {
        return "Modele{" +
                "idModelu=" + idModelu +
                ", kod='" + kod + '\'' +
                ", opis='" + opis + '\'' +
                ", idMarki=" + idMarki +
                '}';
    }
}

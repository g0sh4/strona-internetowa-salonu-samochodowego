package baza_bdbt_proj;

public class Marki {
    private int idMarki;
    private String nazwa;
    private String opis;

    public Marki(){

    }

    public Marki(String nazwa, String opis, int idMarki) {
        super();
        this.idMarki = idMarki;
        this.opis = opis;
        this.nazwa = nazwa;
    }
    public Marki(String nazwa){
        super();
        this.nazwa=nazwa;
    }


    public String nazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
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
        return "Marki{" +
                "idMarki=" + idMarki +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}

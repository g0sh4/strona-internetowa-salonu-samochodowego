package baza_bdbt_proj;

public class Modele {
    //private int idModelu;
    private String kod;
    //private String opis;
    //private int idMarki;
    private String nazwa;
    private String rokProdukcji;
    private String pojemnoscSilnika;
    private String rodzajPaliwa;
    private String standartWyposazenia;
    private int cena;
    private String dostepnosc;

    public Modele(){

    }

    public Modele(String kod,String nazwa,String rokProdukcji,
                  String pojemnoscSilnika,String rodzajPaliwa,String standartWyposazenia,int cena,String dostepnosc) {
        //int idModelu, String opis, int idMarki,
        super();
        //this.idModelu = idModelu;
        this.kod = kod;
        //this.opis = opis;
        //this.idMarki = idMarki;
        this.nazwa = nazwa;
        this.rokProdukcji=rokProdukcji;
        this.pojemnoscSilnika=pojemnoscSilnika;
        this.rodzajPaliwa=rodzajPaliwa;
        this.standartWyposazenia=standartWyposazenia;
        this.cena=cena;
        this.dostepnosc=dostepnosc;
    }
    /*
    public int getIdModelu() {
        return idModelu;
    }

    public void setIdModelu(int idModelu) {
        this.idModelu = idModelu;
    }

     */

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
    /*
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

     */

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(String rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(String pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public String getRodzajPaliwa() {
        return rodzajPaliwa;
    }

    public void setRodzajPaliwa(String rodzajPaliwa) {
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public String getStandartWyposazenia() {
        return standartWyposazenia;
    }

    public void setStandartWyposazenia(String standartWyposazenia) {
        this.standartWyposazenia = standartWyposazenia;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getDostepnosc() {
        return dostepnosc;
    }

    public void setDostepnosc(String dostepnosc) {
        this.dostepnosc = dostepnosc;
    }

    @Override
    public String toString() {
        return "Modele{" +
                ", kod='" + kod + '\'' +
                ", nazwaMarki='" + nazwa + '\'' +
                ", rokProdukcji='" + rokProdukcji + '\'' +
                ", pojemnoscSilnika='" + pojemnoscSilnika + '\'' +
                ", rodzajPaliwa='" + rodzajPaliwa + '\'' +
                ", standartWyposazenia='" + standartWyposazenia + '\'' +
                ", cena=" + cena +
                ", dostepnosc='" + dostepnosc + '\'' +
                '}';
    }
}

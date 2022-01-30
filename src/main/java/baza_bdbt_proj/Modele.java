package baza_bdbt_proj;

public class Modele {

    private String modelAuta;
    private String markaAuta;
    private String rokProdukcji;
    private String pojemnoscSilnika;
    private String rodzajPaliwa;
    private String standartWyposazenia;
    private int cena;
    private String dostepnosc;

    public Modele(){

    }

    public Modele(String modelAuta,String markaAuta,String rokProdukcji,
                  String pojemnoscSilnika,String rodzajPaliwa,String standartWyposazenia,int cena,String dostepnosc) {

        super();
        this.modelAuta = modelAuta;
        this.markaAuta = markaAuta;
        this.rokProdukcji=rokProdukcji;
        this.pojemnoscSilnika=pojemnoscSilnika;
        this.rodzajPaliwa=rodzajPaliwa;
        this.standartWyposazenia=standartWyposazenia;
        this.cena=cena;
        this.dostepnosc=dostepnosc;
    }

    public String getModelAuta() {
        return modelAuta;
    }

    public void setModelAuta(String modelAuta) {
        this.modelAuta = modelAuta;
    }

    public String getMarkaAuta() {
        return markaAuta;
    }

    public void setMarkaAuta(String markaAuta) {
        this.markaAuta = markaAuta;
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
                "modelAuta='" + modelAuta + '\'' +
                ", markaAuta='" + markaAuta + '\'' +
                ", rokProdukcji='" + rokProdukcji + '\'' +
                ", pojemnoscSilnika='" + pojemnoscSilnika + '\'' +
                ", rodzajPaliwa='" + rodzajPaliwa + '\'' +
                ", standartWyposazenia='" + standartWyposazenia + '\'' +
                ", cena=" + cena +
                ", dostepnosc='" + dostepnosc + '\'' +
                '}';
    }
}

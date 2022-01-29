package baza_bdbt_proj;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String pesel;
    private String plec;
    private String dataZatrudniena;
    private String nrTelefonu;
    private String wysokoscWynagrodzenia;
    private String miasto;
    private String ulica;


    public Pracownik(){

    }
    public Pracownik(String imie, String nazwisko, String dataUrodzenia,
                  String pesel, String plec, String dataZatrudniena,String nrTelefonu, String wysokoscWynagrodzenia
                , String miasto, String ulica) {
        super();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.pesel = pesel;
        this.plec = plec;
        this.dataZatrudniena = dataZatrudniena;
        this.nrTelefonu = nrTelefonu;
        this.wysokoscWynagrodzenia = wysokoscWynagrodzenia;
        this.miasto = miasto;
        this.ulica = ulica;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getDataZatrudniena() {
        return dataZatrudniena;
    }

    public void setDataZatrudniena(String dataZatrudniena) {
        this.dataZatrudniena = dataZatrudniena;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getWysokoscWynagrodzenia() {
        return wysokoscWynagrodzenia;
    }

    public void setWysokoscWynagrodzenia(String wysokoscWynagrodzenia) {
        this.wysokoscWynagrodzenia = wysokoscWynagrodzenia;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia='" + dataUrodzenia + '\'' +
                ", pesel='" + pesel + '\'' +
                ", plec='" + plec + '\'' +
                ", dataZatrudniena='" + dataZatrudniena + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", wysokoscWynagrodzenia='" + wysokoscWynagrodzenia + '\'' +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                '}';
    }
}

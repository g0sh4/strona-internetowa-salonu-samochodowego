package baza_bdbt_proj;

public class KlientPrywatny {
    private int id_klienta;
    private String imie;
    private String nazwisko;
    private String miasto;
    private String ulica;
    private String nrTelefonu;
    private String email;


    public KlientPrywatny() {

    }

    public KlientPrywatny(int id_klienta,String imie, String nazwisko, String miasto,
                          String ulica, String nrTelefonu, String email) {
        super();
        this.id_klienta=id_klienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrTelefonu = nrTelefonu;
        this.email = email;
    }

    public int getId_klienta() {
        return id_klienta;
    }

    public void setId_klienta(int id_klienta) {
        this.id_klienta = id_klienta;
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

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "KlientPrywatny{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

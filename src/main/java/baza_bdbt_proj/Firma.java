package baza_bdbt_proj;

public class Firma {
    private int id_klienta;
    private String nazwa;
    private String nip;
    private String nrKRS;
    private String nrREGON;
    private String miasto;
    private String ulica;
    private String nrTelefonu;
    private String email;

    public Firma() {

    }

    public Firma(int id_klienta,String nazwa, String nip, String nrKRS,
                  String nrREGON, String miasto, String ulica, String nrTelefonu, String email) {

        super();
        this.id_klienta=id_klienta;
        this.nazwa = nazwa;
        this.nip = nip;
        this.nrKRS = nrKRS;
        this.nrREGON = nrREGON;
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

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNrKRS() {
        return nrKRS;
    }

    public void setNrKRS(String nrKRS) {
        this.nrKRS = nrKRS;
    }

    public String getNrREGON() {
        return nrREGON;
    }

    public void setNrREGON(String nrREGON) {
        this.nrREGON = nrREGON;
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
        return "Firma{" +
                "nazwa='" + nazwa + '\'' +
                ", nip='" + nip + '\'' +
                ", nrKRS='" + nrKRS + '\'' +
                ", nrREGON='" + nrREGON + '\'' +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
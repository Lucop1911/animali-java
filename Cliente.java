import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cognome;
    private String indirizzo;
    private String telefono;
    private ArrayList<Animale> animali;

    public Cliente(String nome, String cognome, String indirizzo, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.animali = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Animale> getAnimali() {
        return animali;
    }

    public void addAnimale(Animale a){
        animali.add(a);
    }
}

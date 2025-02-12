public class Animale {
    private static int newCode = 1;
    protected String nome;
    protected String descrizione;
    protected int codice;
    protected String razza;
    protected String specie;
    protected int annoNascita;
    protected double prezzo;
    protected String note;

    // Costruttore
    public Animale(String nome, String descrizione, String razza, String specie, int annoNascita, double prezzo, String note) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.codice = newCode++;
        this.razza = razza;
        this.specie = specie;
        this.annoNascita = annoNascita;
        this.prezzo = prezzo;
        this.note = note;
    }

    public Animale(String razza, String specie, int annoNascita, double prezzo, String note) {
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodice() {
        return codice;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo >= 0) {
            this.prezzo = prezzo;
        } else {
            throw new IllegalArgumentException("Il prezzo non può essere negativo!");
        }
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // Metodo per stampare le informazioni dell'animale
    @Override
    public String toString() {
        return "Codice: " + codice +
                " | Specie: " + specie +
                " | Razza: " + razza +
                " | Anno di nascita: " + annoNascita +
                " | Prezzo: €" + prezzo +
                " | Note: " + note;
    }

    // Confronto due animali (utile per liste o set)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animale animale = (Animale) obj;
        return codice == animale.codice;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codice);
    }
}

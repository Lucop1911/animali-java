public class Animale{
    private static int newCode = 1;
    protected int codice;
    protected String razza;
    protected String specie;
    protected int annoNascita;
    protected double prezzo;
    protected String note;

    public Animale(String razza, String specie, int annoNascita, double prezzo, String note) {
        this.codice = newCode;
        newCode++;
        this.razza = razza;
        this.specie = specie;
        this.annoNascita = annoNascita;
        this.prezzo = prezzo;
        this.note = note;
    }

    public int getCodice() {
        return codice;
    }

    public String getRazza() {
        return razza;
    }

    public String getSpecie() {
        return specie;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
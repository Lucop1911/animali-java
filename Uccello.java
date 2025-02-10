public class Uccello extends Animale{
    private String nome;

    public Uccello(String razza, String specie, int annoNascita, double prezzo, String note, String nome) {
        super(razza, specie, annoNascita, prezzo, note);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
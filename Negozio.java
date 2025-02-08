import java.util.ArrayList;

public class Negozio {
    private String nome;
    private ArrayList<Cliente> clienti;
    private ArrayList<Animale> animali;
    private double cassa;

    public Negozio(String nome) {
        this.nome = nome;
        cassa = 0;
        animali = new ArrayList<Animale>();
        clienti = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(ArrayList<Cliente> clienti) {
        this.clienti = clienti;
    }

    public ArrayList<Animale> getAnimali() {
        return animali;
    }

    public void setAnimali(ArrayList<Animale> animali) {
        this.animali = animali;
    }

    public double getCassa() {
        return cassa;
    }

    public void setCassa(double cassa) {
        this.cassa = cassa;
    }

    public void addCliente(Cliente c){
        clienti.add(c);
    }

    public void addAnimale(Animale a){
        animali.add(a);
    }

    public boolean vendiAnimale(int codice, Cliente c){
        Animale venduto = null;
        for(Animale a : animali){
            if(a.getCodice() == codice){
                venduto = a;
                break;
            }
        }
        if(venduto != null){
            animali.remove(venduto);
            c.addAnimale(venduto);
            cassa += venduto.getPrezzo();
            return true;
        }
        else{
            return false;
        }
    }

    public int getNumVenduti(){
        int num = 0;
        for(Cliente c : clienti){
            num += c.getAnimali().size();
        }
        return num;
    }

    public double getValoreComplessivoAnimali(){
        double valore = 0;
        for(Animale a : animali){
            valore += a.getPrezzo();
        }
        return valore;
    }
}

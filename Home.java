import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;

public class Home extends Finestra {
    private Negozio negozio; // Riferimento al negozio

    public Home(Negozio negozio) {
        this.negozio = negozio; // Assegna il negozio
        setTitle("Home - Animal Store");
        setLayout(new GridLayout(0, 1));

        aggiornaBottoni();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    private void aggiornaBottoni() {
        getContentPane().removeAll(); // Pulisce i bottoni esistenti

        for (Animale animale : negozio.getAnimali()) {
            JButton button = new JButton(animale.getNome());
            button.addActionListener(e -> openAnimalPage(animale));
            add(button);
        }

        revalidate();
        repaint();
    }

    private void openAnimalPage(Animale animale) {
        new DettaglioAnimale(animale);
    }

    @Override
    public void creaContenuto() {}

    @Override
    public void actionPerformed(ActionEvent actionEvent) {}
}
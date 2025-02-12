import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Home extends Finestra {
    private Negozio negozio;

    public Home(Negozio negozio) {
        this.negozio = negozio;
        setTitle("Home - Animal Store");
        setLayout(new GridLayout(1, 1));

        aggiornaBottoni();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    private void aggiornaBottoni() {
        getContentPane().removeAll();

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

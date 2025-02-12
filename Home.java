import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Home extends Finestra {
    private Negozio negozio;

    public Home(Negozio negozio) {
        this.negozio = negozio;
        setTitle("Home - Animal Store");
        setLayout(new GridLayout(0, 1));

        aggiornaBottoni();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    private void aggiornaBottoni() {
        getContentPane().removeAll();

        JPanel caniPanel = new JPanel();
        caniPanel.setBorder(BorderFactory.createTitledBorder("Cani"));
        caniPanel.setLayout(new GridLayout(0, 1));

        JPanel gattiPanel = new JPanel();
        gattiPanel.setBorder(BorderFactory.createTitledBorder("Gatti"));
        gattiPanel.setLayout(new GridLayout(0, 1));

        JPanel uccelliPanel = new JPanel();
        uccelliPanel.setBorder(BorderFactory.createTitledBorder("Uccelli"));
        uccelliPanel.setLayout(new GridLayout(0, 1));

        JPanel pongaPanel = new JPanel();
        pongaPanel.setBorder(BorderFactory.createTitledBorder("Ponga"));
        pongaPanel.setLayout(new GridLayout(0, 1));

        for (Animale animale : negozio.getAnimali()) {
            JButton button = new JButton(animale.getNome());
            button.addActionListener(e -> openAnimalPage(animale));

            if (animale instanceof Cane) {
                caniPanel.add(button);
            } else if (animale instanceof Gatto) {
                gattiPanel.add(button);
            } else if (animale instanceof Uccello) {
                uccelliPanel.add(button);
            } else if (animale instanceof Ponga) {
                pongaPanel.add(button);
            }
        }

        add(caniPanel);
        add(gattiPanel);
        add(uccelliPanel);
        add(pongaPanel);

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
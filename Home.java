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

        JButton caniButton = new JButton("Cani");
        caniButton.setLayout(new GridLayout(0, 1));

        JButton gattiButton = new JButton("Gatti");
        gattiButton.setLayout(new GridLayout(0, 1));

        JButton uccelliButton= new JButton("Uccelli");
        uccelliButton.setLayout(new GridLayout(0, 1));

        JButton pongaButton = new JButton("Ponghe");
        pongaButton.setLayout(new GridLayout(0, 1));

        for (Animale animale : negozio.getAnimali()) {
            JButton button = new JButton(animale.getNome());
            button.addActionListener(e -> openAnimalPage(animale));

            if (animale instanceof Cane) {
                caniButton.add(button);
            } else if (animale instanceof Gatto) {
                gattiButton.add(button);
            } else if (animale instanceof Uccello) {
                uccelliButton.add(button);
            } else if (animale instanceof Ponga) {
                pongaButton.add(button);
            }
        }

        add(caniButton);
        add(gattiButton);
        add(uccelliButton);
        add(pongaButton);

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
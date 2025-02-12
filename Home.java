import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Home extends Finestra {
    private Negozio negozio;

    public Home(Negozio negozio) {

        this.negozio = negozio;
        setTitle("Home - Animal Store");

        aggiornaBottoni();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }

    private void aggiornaBottoni() {

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
    public void creaContenuto() {
        setUsername("admin");
        JPanel mainPanel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("Lista animali:");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel inventarioPanel = new JPanel();
        inventarioPanel.setLayout(new GridLayout(1, 3, 10, 10));
        inventarioPanel.add(new JLabel(new ImageIcon("cat.png")));
        inventarioPanel.add(new JLabel(new ImageIcon("dog1.png")));
        inventarioPanel.add(new JLabel(new ImageIcon("dog2.png")));

        JPanel clientiPanel = new JPanel();
        clientiPanel.add(new JLabel("Gestione Clienti"));

        mainPanel.add(tabbedPane, BorderLayout.CENTER);

        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {}
}

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Admin extends Finestra {
    private JTextField userText;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Admin() {
        super();
        setVisible(true);
    }

    @Override
    public void creaContenuto() {
        setUsername("admin");
        JPanel mainPanel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("Admin Overview");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel inventarioPanel = new JPanel();
        inventarioPanel.setLayout(new GridLayout(1, 3, 10, 10));
        inventarioPanel.add(new JLabel(new ImageIcon("cat.png"))); // Placeholder immagine
        inventarioPanel.add(new JLabel(new ImageIcon("dog1.png")));
        inventarioPanel.add(new JLabel(new ImageIcon("dog2.png")));

        JPanel clientiPanel = new JPanel();
        clientiPanel.add(new JLabel("Gestione Clienti"));

        tabbedPane.addTab("INVENTARIO", inventarioPanel);
        tabbedPane.addTab("CLIENTI", clientiPanel);

        mainPanel.add(tabbedPane, BorderLayout.CENTER);

        // Creiamo il bottone "Home" e lo aggiungiamo in basso
        JButton homeButton = new JButton("Home");
        Negozio negozio = new Negozio("Negozio di Animali");

        homeButton.addActionListener(e -> {
            dispose();
            new Home(negozio);
        });

        // Creiamo un pannello per il bottone e lo posizioniamo in basso
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(homeButton);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH); // Ora il bottone è visibile!

        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userText.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("password123")) {
                JOptionPane.showMessageDialog(this, "Login avvenuto con successo!");
                setUsername(username);
            } else {
                JOptionPane.showMessageDialog(this, "Credenziali errate. Riprova.");
            }
        }
    }
}
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
        // Pannello principale
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Titolo
        JLabel titleLabel = new JLabel("Admin Overview");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        
        // Tab con Inventario e Clienti
        JTabbedPane tabbedPane = new JTabbedPane();
        
        JPanel inventarioPanel = new JPanel();
        inventarioPanel.setLayout(new GridLayout(1, 3, 10, 10));
        inventarioPanel.add(new JLabel(new ImageIcon("cat.png"))); // Placeholder per immagine
        inventarioPanel.add(new JLabel(new ImageIcon("dog1.png")));
        inventarioPanel.add(new JLabel(new ImageIcon("dog2.png")));
        
        JPanel clientiPanel = new JPanel();
        clientiPanel.add(new JLabel("Gestione Clienti"));
        
        tabbedPane.addTab("INVENTARIO", inventarioPanel);
        tabbedPane.addTab("CLIENTI", clientiPanel);
        
        mainPanel.add(tabbedPane, BorderLayout.CENTER);
        
        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userText.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("password123")) {
                JOptionPane.showMessageDialog(this, "Login avvenuto con successo!");
                setUsername(username); // Cambia il bottone "User" con il nome dell'utente

                // revalidate();
                // repaint();
            } else {
                JOptionPane.showMessageDialog(this, "Credenziali errate. Riprova.");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}

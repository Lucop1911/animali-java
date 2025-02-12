import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Login extends Finestra {
    private JTextField userText;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login() {
        super();
        setVisible(true);
    }

    @Override
    public void creaContenuto() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel, BorderLayout.CENTER);

        JLabel titleLabel = new JLabel("Benvenuto nel Negozio di Animali!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setBounds(80, 20, 1000, 30);
        panel.add(titleLabel);

        JLabel userLabel = new JLabel("Nome utente:");
        userLabel.setBounds(50, 70, 100, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(150, 70, 150, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 110, 100, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 110, 150, 25);
        panel.add(passwordField);

        loginButton = new JButton("Accedi");
        loginButton.setBounds(150, 150, 100, 30);
        panel.add(loginButton);

        loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userText.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("password123")) {
                JOptionPane.showMessageDialog(this, "Login avvenuto con successo!");
                setUsername(username); // Cambia il bottone "User" con il nome dell'utente
                dispose();
                new Admin();

            } else {
                JOptionPane.showMessageDialog(this, "Credenziali errate. Riprova.");
            }
        }
    }
}


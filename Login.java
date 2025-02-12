import javax.swing.*;
import javax.swing.border.Border;

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
        Font fontTesto = new Font("Arial", Font.PLAIN, 25);
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // titolo sopra
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel titleLabel = new JLabel("Benvenuto/a nel negozio di Animali!", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        panel.add(titleLabel, gbc);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(fontTesto);
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(userLabel, gbc);

        gbc.gridx = 1;
        userText = new JTextField();
        userText.setPreferredSize(new Dimension(100,40));
        userText.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(userText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(fontTesto);
        panel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(100,40));
        passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(50, 50, 0, 50);
        loginButton = new JButton("ACCEDI");
        loginButton.setFont(fontTesto);
        loginButton.setBackground(new Color(255,243,204,255));
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(this);
        panel.add(loginButton, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        JButton registerButton = new JButton("REGISTER");
        registerButton.setFont(fontTesto);
        registerButton.setBackground(new Color(255,243,204,255));
        panel.add(registerButton, gbc);

        add(panel, BorderLayout.CENTER);
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


package animali-java;


public class Login extends Finestra{
    
    public Login() {
        // Impostazione della finestra
        setTitle("Login - Negozio di Animali");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        // Pannello per il layout
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        // Etichetta per il titolo
        JLabel titleLabel = new JLabel("Benvenuto nel Negozio di Animali!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setBounds(80, 20, 240, 30);
        panel.add(titleLabel);

        // Etichetta e campo di testo per l'username
        JLabel userLabel = new JLabel("Nome utente:");
        userLabel.setBounds(50, 70, 100, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(150, 70, 150, 25);
        panel.add(userText);

        // Etichetta e campo di testo per la password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 110, 100, 25);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 110, 150, 25);
        panel.add(passwordField);

        // Bottone per il login
        JButton loginButton = new JButton("Accedi");
        loginButton.setBounds(150, 150, 100, 30);
        panel.add(loginButton);

        // Azione del bottone di login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordField.getPassword());

                // Esegui controllo login (puoi personalizzarlo con i tuoi dati)
                if (username.equals("admin") && password.equals("password123")) {
                    JOptionPane.showMessageDialog(null, "Login avvenuto con successo!");
                } else {
                    JOptionPane.showMessageDialog(null, "Credenziali errate. Riprova.");
                }
            }
        });
    }

}

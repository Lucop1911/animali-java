import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class Finestra extends JFrame implements ActionListener {
    protected JButton userButton = new JButton("LOGIN");

    public Finestra(){
        super();
        creaGUI();
        creaContenuto();
    }

    public void creaGUI(){
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setTitle("Negozio Animali");
        this.setVisible(true);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(255, 200, 200));

        ImageIcon logo = new ImageIcon("logo.png");
        Image resizedLogo = logo.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(resizedLogo));
        topPanel.add(logoLabel, BorderLayout.WEST);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(new Color(255, 200, 200));

        JButton homeButton = new JButton("HOME");
        homeButton.setBackground(Color.WHITE);
        homeButton.setPreferredSize(new Dimension(100,35));
        homeButton.setFont(new Font("Arial", Font.BOLD, 15));
        Negozio negozio = new Negozio("Negozio di Animali");

        userButton.addActionListener(e -> {
            dispose();
            new Login();
        });

        homeButton.addActionListener(e -> {
            dispose();
            new Home(negozio);
        });

        JButton cartButton = new JButton("CART");
        cartButton.setBackground(Color.WHITE);
        cartButton.setPreferredSize(new Dimension(100,35));
        cartButton.setFont(new Font("Arial", Font.BOLD, 15));
        userButton.addActionListener(e -> {
            dispose();
            new Carrello();
        });

        userButton.setBackground(Color.WHITE);
        userButton.setPreferredSize(new Dimension(150,35));
        userButton.setFont(new Font("Arial", Font.BOLD, 15));
        userButton.addActionListener(e -> {
            if(userButton.getText().equals("admin")){
                dispose();
                new Admin();
            }
            else if(userButton.getText().equals("LOGIN")){
                dispose();
                new Login();
            }
        });

        buttonPanel.add(homeButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
        buttonPanel.add(cartButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
        buttonPanel.add(userButton);

        topPanel.add(buttonPanel);

        this.add(topPanel, BorderLayout.NORTH);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    public abstract void creaContenuto();

    public void setUsername(String nome){
        userButton.setText(nome);
    }

}
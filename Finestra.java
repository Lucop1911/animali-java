import javax.swing.*;
import java.awt.*;

public class Finestra extends JFrame {
    
    public Finestra(){
        super();
        creaGUI();
    }

    public void creaGUI(){
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setTitle("Negozio Animali");
        this.setVisible(true);

        // Creazione pannello superiore
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(255, 200, 200));

        // Aggiunta logo a sinsitra
        ImageIcon logo = new ImageIcon("logo.png");
        Image logoImage = logo.getImage();
        Image resizedLogo = logoImage.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(resizedLogo));
        topPanel.add(logoLabel, BorderLayout.WEST);

        // Creazione bottoni
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(new Color(255, 200, 200));

        JButton homeButton = new JButton("HOME");
        homeButton.setBackground(Color.WHITE);
        homeButton.setPreferredSize(new Dimension(100,35));
        homeButton.setFont(new Font("Arial", Font.BOLD, 15));

        JButton cartButton = new JButton("CART");
        cartButton.setBackground(Color.WHITE);
        cartButton.setPreferredSize(new Dimension(100,35));
        cartButton.setFont(new Font("Arial", Font.BOLD, 15));
        
        JButton userButton = new JButton("user");
        userButton.setBackground(Color.WHITE);
        userButton.setPreferredSize(new Dimension(10,35));
        userButton.setHorizontalAlignment(SwingConstants.RIGHT);
        userButton.setFont(new Font("Arial", Font.BOLD, 15));
        
        buttonPanel.add(homeButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
        buttonPanel.add(cartButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
        buttonPanel.add(userButton);

        topPanel.add(buttonPanel);

        this.add(topPanel, BorderLayout.NORTH);
        this.setVisible(true);
    }

}

public class Finestra extends JFrame implements ActionListener {
    public Finestra() {
        super();
        creaGui();
    }

    public void creaGui(){
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setTitle("tris");
        this.setVisible(true);
    }
}
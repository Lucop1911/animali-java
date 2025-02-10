
public class Home extends Finestra {
    public Home() {
        setTitle("Home - Animal Store");
        setLayout(new GridLayout(0, 1));

        JButton caneButton = new JButton("Cani");
        JButton gattoButton = new JButton("Gatti");
        JButton pongaButton = new JButton("Ponga");

        caneButton.addActionListener(e -> openAnimalPage("Cane"));
        gattoButton.addActionListener(e -> openAnimalPage("Gatto"));
        pongaButton.addActionListener(e -> openAnimalPage("Ponga"));

        add(caneButton);
        add(gattoButton);
        add(pongaButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    private void openAnimalPage(String animalType) {
        System.out.println("Opening page for: " + animalType);
        // Here you would typically create a new JFrame or JPanel for the selected animal type
    }
}
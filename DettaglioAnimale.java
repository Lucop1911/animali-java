import javax.swing.*;
import java.awt.*;

public class DettaglioAnimale extends JFrame {
    public DettaglioAnimale(Animale animale) {
        setTitle(animale.getNome());
        setLayout(new BorderLayout());

        JLabel titolo = new JLabel(animale.getNome(), SwingConstants.CENTER);
        titolo.setFont(new Font("Arial", Font.BOLD, 20));
        add(titolo, BorderLayout.NORTH);

        JLabel descrizione = new JLabel("<html><div style='text-align: center;'>" + animale.getDescrizione() + "</div></html>");
        descrizione.setHorizontalAlignment(SwingConstants.CENTER);
        add(descrizione, BorderLayout.CENTER);

        JLabel prezzoLabel = new JLabel("Prezzo: €" + animale.getPrezzo(), SwingConstants.CENTER);
        add(prezzoLabel, BorderLayout.SOUTH);

        JButton chiudiButton = new JButton("Chiudi");
        chiudiButton.addActionListener(e -> dispose());
        add(chiudiButton, BorderLayout.SOUTH);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}


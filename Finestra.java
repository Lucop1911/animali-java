
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

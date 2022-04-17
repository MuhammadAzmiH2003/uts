import javax.swing.JFrame;
public class Pacman {
    
public static class model extends JFrame{

    public model() {
        add(new model());
    }
    public static void main(String[] args) {
       
        model pac = new model();
        pac.setVisible(true);
        pac.setTitle("Pacman");
        pac.setSize(380,420);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);

    }

}
}

    


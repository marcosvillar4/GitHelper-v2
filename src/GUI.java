import javax.swing.*;

public class GUI {
    private JLabel test;
    private JPanel MainPage;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GitHelper V2");
        frame.setContentPane(new GUI().MainPage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

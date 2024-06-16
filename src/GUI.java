import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI {
    private JPanel MainPage;
    private JTextField nombreRepo;
    private JButton confirm;
    private JCheckBox priv;

    public GUI() {
        confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String repoName = nombreRepo.getText();
                boolean repoPriv = priv.isSelected();
                String repoPrivacy = "";

                if (repoPriv){
                    repoPrivacy = "--private";
                }
                else {
                    repoPrivacy = "--public";
                }

                Runtime shell = Runtime.getRuntime();


                try {
                    shell.exec(("gh repo create " + repoName  + " " + repoPrivacy));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GitHelper V2");
        frame.setContentPane(new GUI().MainPage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}

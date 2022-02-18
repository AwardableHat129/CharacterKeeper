import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;
import javax.swing.BoxLayout;

public class CharacterKeeper extends JFrame{
    
    public CharacterKeeper()
    {
        setTitle("Character Keeper");
        setSize(500, 800);
        setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.GRAY);
        //add(panel1);
        //panel1.setBounds(10, 10, 300, 200);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        JScrollPane scrollPane1 = new JScrollPane(panel1);
        add(scrollPane1);
        scrollPane1.setBounds(10, 10, 200, 200);

        for(int i = 0; i < 5; i++)
        {
            JButton button = new JButton(Integer.toString(i + 1));            
            panel1.add(button);
            button.setBackground(Color.LIGHT_GRAY);            
        }
        




        initComponents();
    }

    private void initComponents()
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        
        new CharacterKeeper();

    }


}

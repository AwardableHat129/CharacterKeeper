import javax.swing.*;
import java.awt.*;

public class CharacterTemplate extends JFrame{
    
    public CharacterTemplate()
    {
        setTitle("Character Keeper");
        setSize(800, 1000);
        setLayout(null);
        setBackground(Color.GRAY);

        //Throughout this section, label names will start with "L_", Text Field names will start with
        //"TF_" and so on.

        JLabel L_Instructions = new JLabel("Enter your character's details here: ");
        add(L_Instructions);
        L_Instructions.setBounds(10, 5, 500, 30);
        L_Instructions.setFont(L_Instructions.getFont().deriveFont(24.0f));

        JLabel L_CharacterName = new JLabel("Character Name");
        add(L_CharacterName);
        L_CharacterName.setBounds(10, 40, 300, 20);

        JTextField TF_CharacterName = new JTextField();
        add(TF_CharacterName);
        TF_CharacterName.setBounds(10, 60, 300, 20);

        JLabel L_Age = new JLabel("Age");
        add(L_Age);
        L_Age.setBounds(350, 35, 300, 30);

        JTextField TF_Age = new JTextField();
        add(TF_Age);
        TF_Age.setBounds(350, 60, 75, 20);

        JLabel L_Height = new JLabel("Height (Ft)");
        add(L_Height);
        L_Height.setBounds(450, 35, 100, 30);

        JTextField TF_Height = new JTextField();
        add(TF_Height);
        TF_Height.setBounds(450, 60, 75, 20);

        JLabel L_BodyWeight = new JLabel("Body Weight (Lbs)");
        add(L_BodyWeight);
        L_BodyWeight.setBounds(550, 35, 150, 30);

        JTextField TF_BodyWeight = new JTextField();
        add(TF_BodyWeight);
        TF_BodyWeight.setBounds(550, 60, 100, 20);

        JLabel L_CharacterSize = new JLabel("Character Size");
        add(L_CharacterSize);
        L_CharacterSize.setBounds(10, 90, 100, 30);

        String[] characterSizes = {"Tiny", "Small", "Medium", "Large", "Huge", "Gargantuan"};
        JComboBox<String> CB_CharacterSize = new JComboBox<String>(characterSizes);
        add(CB_CharacterSize);
        CB_CharacterSize.setBounds(10, 115, 100, 20);
        CB_CharacterSize.setSelectedIndex(2);




        initComponents();
    }


    private void initComponents()
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args)
    {
        new CharacterTemplate();
    }

}

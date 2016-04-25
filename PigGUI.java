
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PigGUI extends JFrame implements ActionListener 
{
JPanel mainPanel;
JPanel optionPanel;
JPanel dicePanel;
JButton rollDice;
JButton hold;
JMenu options;
JMenuItem quit;
JMenuItem seeStats;
JMenuBar menuBar;
JLabel diceLabel;
JLabel diceLabel2;
Dice dice;
Graphics die1;
Graphics die2;
private boolean rolling;

public PigGUI()
{
    setTitle("Play Pig!");
    this.setPreferredSize(new Dimension(600,600));

    mainPanel = new JPanel();
    optionPanel = new JPanel();
    dicePanel = new JPanel();
    rollDice = new JButton("Roll Dice");
    hold = new JButton("Hold");
    options = new JMenu("Options");
    quit = new JMenuItem("Quit");
    seeStats = new JMenuItem("See Stats");
    menuBar = new JMenuBar();
    dice = new Dice();
    diceLabel = new JLabel();
    diceLabel2 = new JLabel();

    options.add(quit);
    options.add(seeStats);

    menuBar.add(options);

    optionPanel.add(menuBar);
    optionPanel.setPreferredSize(new Dimension(600,100));
    
    dicePanel = new JPanel(new GridLayout(2,1));

    dicePanel.add(rollDice);
    dicePanel.add(hold);

    dicePanel.add(diceLabel);
    dicePanel.add(diceLabel2);

    mainPanel.setPreferredSize(new Dimension(600,600));
    mainPanel.add(optionPanel);
    mainPanel.add(dicePanel);


    quit.addActionListener(this);
    seeStats.addActionListener(this);
    rollDice.addActionListener(this);

    this.getContentPane().add(mainPanel);

    this.pack();
    this.setVisible(true);
}


public void actionPerformed(ActionEvent e) {
    if (e.getSource()== quit)
        System.exit(0);

    if (e.getSource() == seeStats)
    {
        JOptionPane.showMessageDialog(mainPanel,
                "Your stats are: "); 
    }

    if (e.getSource() == rollDice)
    {


    	rolling = true;
    }
}

}

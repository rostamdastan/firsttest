
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

public class Startingpoint
{
  private JFrame frame;
  private JButton button;

  public static void main (String[] args) 
  {
    Startingpoint guiButton = new Startingpoint();
    guiButton.start();
  }

  public void start() 
  {
    frame = new JFrame("GUI Dialog");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();

    button = new JButton("Click Me");
    //button.addActionListener(this);
    button.setForeground(Color.red);
    button.setText("I've been clicked!");
    contentPane.add(button);

        frame.pack();
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String textToShow;
        textToShow = JOptionPane.showInputDialog(
                frame,
                "Enter the text you want to display:",
                "Input Dialog",
                JOptionPane.QUESTION_MESSAGE);
        if (textToShow != null)
        {
            button.setForeground(Color.red);
            button.setText(textToShow);
        }
    }
}
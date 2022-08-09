package views;

import javax.swing.*;

public class MainWindowView
{
    private JPanel mainPanel;
    private JLabel difficultyLabel;
    private JLabel boardSizeLabel;
    private JButton newGameButton;

    public MainWindowView()
    {
        newGameButton.addActionListener(e -> {
            NewGameView dialog = new NewGameView();
            dialog.pack();
            dialog.setLocationRelativeTo(mainPanel);
            dialog.setVisible(true);
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("MainWindowView");
        frame.setContentPane(new MainWindowView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        NewGameView dialog = new NewGameView();
        dialog.pack();
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
    }
}

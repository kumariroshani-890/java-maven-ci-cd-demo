package com.mycompany.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class App {

    private static int numberToGuess;
    private static int attempts = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::createUI);
    }

    private static void createUI() {
        numberToGuess = new Random().nextInt(100) + 1;

        JFrame frame = new JFrame("🎮 Guess The Number Game");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 144, 255));
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JLabel title = new JLabel("Guess a Number (1–100)", JLabel.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 18));

        JTextField input = new JTextField();
        JButton guessButton = new JButton("Guess 🎯");
        JLabel result = new JLabel("", JLabel.CENTER);
        result.setForeground(Color.YELLOW);

        guessButton.setBackground(Color.GREEN);
        guessButton.setFont(new Font("Arial", Font.BOLD, 14));

        guessButton.addActionListener((ActionEvent e) -> {
            try {
                int guess = Integer.parseInt(input.getText());
                attempts++;

                if (guess == numberToGuess) {
                    JOptionPane.showMessageDialog(frame,
                            "🎉 Correct! Attempts: " + attempts,
                            "You Win!",
                            JOptionPane.INFORMATION_MESSAGE);
                    numberToGuess = new Random().nextInt(100) + 1;
                    attempts = 0;
                } else if (guess < numberToGuess) {
                    result.setText("📉 Too Low!");
                } else {
                    result.setText("📈 Too High!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Enter a valid number!");
            }
        });

        panel.add(title);
        panel.add(input);
        panel.add(guessButton);
        panel.add(result);

        frame.add(panel);
        frame.setVisible(true);
    }
}

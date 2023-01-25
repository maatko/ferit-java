package me.mat.lv9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private static final String[] ACTIONS = new String[]{
            "AC",
            "/",
            "*",
            "-",
            "+",
            "=",
            ".",
            "0"
    };

    private final JLabel displayLabel;

    private String action = null;
    private String left = "";
    private String right = "";

    protected Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(340, 400);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new GridLayout(2, 0));

        final JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new GridBagLayout());
        displayPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        displayPanel.add(displayLabel = new JLabel(""));

        getContentPane().add(displayPanel);
        {
            final JPanel bottomPanel = new JPanel();
            bottomPanel.setLayout(new GridLayout(0, 2));
            {
                final JPanel numberPanel = new JPanel();
                numberPanel.setLayout(new GridLayout(3, 3));
                for (int i = 9; i > 0; i--) {
                    final JButton button = new JButton(String.valueOf(i));
                    button.addActionListener(this);
                    numberPanel.add(button);
                }
                bottomPanel.add(numberPanel);
            }
            {
                final JPanel actionPanel = new JPanel();
                actionPanel.setLayout(new GridLayout(ACTIONS.length, 0));
                for (String action : ACTIONS) {
                    final JButton button = new JButton(action);
                    button.addActionListener(this);
                    actionPanel.add(button);
                }
                bottomPanel.add(actionPanel);
            }
            getContentPane().add(bottomPanel);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String action = event.getActionCommand().toLowerCase();
        try {
            int number = Integer.parseInt(action);
            if (this.action == null) {
                left += number;
            } else {
                right += number;
            }
            displayLabel.setText(displayLabel.getText() + number);
        } catch (NumberFormatException e) {
            switch (action) {
                case "ac":
                    this.action = null;
                    left = "";
                    right = "";
                    displayLabel.setText("");
                    break;
                case "/":
                case "*":
                case "-":
                case "+":
                    this.action = action;
                    displayLabel.setText(displayLabel.getText() + " " + action + " ");
                    break;
                case "=":
                    float value = 0;
                    switch (this.action.toLowerCase()) {
                        case "/":
                            value = Float.parseFloat(left) / Float.parseFloat(right);
                            break;
                        case "*":
                            value = Float.parseFloat(left) * Float.parseFloat(right);
                            break;
                        case "-":
                            value = Float.parseFloat(left) - Float.parseFloat(right);
                            break;
                        case "+":
                            value = Float.parseFloat(left) + Float.parseFloat(right);
                            break;
                    }
                    displayLabel.setText(String.valueOf(value));
                    this.action = null;
                    left = displayLabel.getText();
                    right = "";
                    break;
                case ".":
                    if (this.action == null) {
                        left += action;
                    } else {
                        right += action;
                    }
                    displayLabel.setText(displayLabel.getText() + action);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }

}

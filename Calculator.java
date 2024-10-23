import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder currentInput;
    private double result;
    private String operator;

    public Calculator() {
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);

        currentInput = new StringBuilder();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789.".contains(command)) {
            currentInput.append(command);
            display.setText(currentInput.toString());
        } else if ("/*-+".contains(command)) {
            result = Double.parseDouble(currentInput.toString());
            operator = command;
            currentInput.setLength(0);
        } else if ("=".equals(command)) {
            double secondOperand = Double.parseDouble(currentInput.toString());
            switch (operator) {
                case "/":
                    result /= secondOperand;
                    break;
                case "*":
                    result *= secondOperand;
                    break;
                case "-":
                    result -= secondOperand;
                    break;
                case "+":
                    result += secondOperand;
                    break;
            }
            display.setText(String.valueOf(result));
            currentInput.setLength(0);
        } else if ("C".equals(command)) {
            currentInput.setLength(0);
            result = 0;
            operator = "";
            display.setText("");
        }
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}






// Calculator calculate the value the no of screen display yet the while of the the 
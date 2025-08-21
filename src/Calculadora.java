import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculadora extends JFrame {
    private JTextField txtNum1, txtNum2;
    private JButton btnSuma, btnResta, btnMult, btnDiv;
    private JLabel lblResultado;

    public Calculadora() {
        // Configuración de la ventana
        setTitle("Calculadora");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(230, 230, 255)); // Fondo lila suave

        // Diseño
        setLayout(new GridLayout(5, 2, 10, 10));

        // Inicializar componentes
        JLabel lbl1 = new JLabel("Número 1:");
        JLabel lbl2 = new JLabel("Número 2:");

        txtNum1 = new JTextField();
        txtNum2 = new JTextField();

        btnSuma = new JButton("Sumar");
        btnResta = new JButton("Restar");
        btnMult = new JButton("Multiplicar");
        btnDiv = new JButton("Dividir");

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setFont(new Font("Arial", Font.BOLD, 14));

        // Estilo de botones
        btnSuma.setBackground(new Color(200, 150, 255));
        btnResta.setBackground(new Color(200, 150, 255));
        btnMult.setBackground(new Color(200, 150, 255));
        btnDiv.setBackground(new Color(200, 150, 255));

        // Agregar componentes a la ventana
        add(lbl1);
        add(txtNum1);
        add(lbl2);
        add(txtNum2);
        add(btnSuma);
        add(btnResta);
        add(btnMult);
        add(btnDiv);
        add(lblResultado);

        // Agregar escuchadores de eventos
        btnSuma.addActionListener(e -> realizarOperacion("suma"));
        btnResta.addActionListener(e -> realizarOperacion("resta"));
        btnMult.addActionListener(e -> realizarOperacion("multiplicacion"));
        btnDiv.addActionListener(e -> realizarOperacion("division"));
    }

    private void realizarOperacion(String operacion) {
        try {
            if (txtNum1.getText().trim().isEmpty() || txtNum2.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor ingresa ambos números.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double n1 = Double.parseDouble(txtNum1.getText().trim());
            double n2 = Double.parseDouble(txtNum2.getText().trim());
            double resultado = 0;

            // Realizar operación
            switch (operacion) {
                case "suma":
                    resultado = n1 + n2;
                    break;
                case "resta":
                    resultado = n1 - n2;
                    break;
                case "multiplicacion":
                    resultado = n1 * n2;
                    break;
                case "division":
                    if (n2 == 0) {
                        JOptionPane.showMessageDialog(this, "No se puede dividir entre 0.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    resultado = n1 / n2;
                    break;
            }

            // Mostrar resultado con formato
            DecimalFormat df = new DecimalFormat("###,##0.##");
            lblResultado.setText("Resultado: " + df.format(resultado));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }
}
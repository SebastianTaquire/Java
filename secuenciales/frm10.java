package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtInvertido;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm10 frame = new frm10();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblNumero = new JLabel("Número de 4 cifras:");
        lblNumero.setBounds(50, 50, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblNumeroInvertido = new JLabel("Número invertido:");
        lblNumeroInvertido.setBounds(50, 100, 120, 30);
        getContentPane().add(lblNumeroInvertido);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 50, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtInvertido = new JTextField();
        txtInvertido.setBounds(180, 100, 100, 30);
        txtInvertido.setFocusable(false);
        txtInvertido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInvertido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInvertido);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 150, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerforme());
    }

    protected void btnCalcular_actionPerforme() {
        int numero = Integer.parseInt(txtNumero.getText());
        
        int millares = numero / 1000;
        int centenas = (numero / 100) % 10;
        int decenas = (numero / 10) % 10;
        int unidades = numero % 10;
        
        double numeroInvertido = unidades * 1000 + decenas * 100 + centenas * 10 + millares;

        DecimalFormat df = new DecimalFormat("##.00");
        txtInvertido.setText(String.valueOf(numeroInvertido));
    }
}
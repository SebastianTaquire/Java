package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtSumaCifras;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm09 frame = new frm09();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblNumero = new JLabel("Número de 4 cifras:");
        lblNumero.setBounds(50, 50, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblSumaCifras = new JLabel("Suma de cifras:");
        lblSumaCifras.setBounds(50, 100, 120, 30);
        getContentPane().add(lblSumaCifras);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 50, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtSumaCifras = new JTextField();
        txtSumaCifras.setBounds(180, 100, 100, 30);
        txtSumaCifras.setFocusable(false);
        txtSumaCifras.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSumaCifras.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSumaCifras);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 150, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
        int numero = Integer.parseInt(txtNumero.getText());
        
        int millares = numero / 1000;
        int centenas = (numero / 100) % 10;
        int decenas = (numero / 10) % 10;
        int unidades = numero % 10;
        
        int sumaCifras = millares + centenas + decenas + unidades;

        DecimalFormat df = new DecimalFormat("##.00");
        txtSumaCifras.setText(String.valueOf(sumaCifras));
    }
}
package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtRadio, txtAltura, txtArea, txtVolumen;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm06 frame = new frm06();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblRadio = new JLabel("Radio:");
        lblRadio.setBounds(50, 50, 80, 30);
        getContentPane().add(lblRadio);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(50, 90, 80, 30);
        getContentPane().add(lblAltura);

        JLabel lblArea = new JLabel("Área :");
        lblArea.setBounds(50, 150, 80, 30);
        getContentPane().add(lblArea);

        JLabel lblVolumen = new JLabel("Volumen:");
        lblVolumen.setBounds(50, 190, 80, 30);
        getContentPane().add(lblVolumen);

        txtRadio = new JTextField();
        txtRadio.setBounds(150, 50, 100, 30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRadio);

        txtAltura = new JTextField();
        txtAltura.setBounds(150, 90, 100, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        txtArea = new JTextField();
        txtArea.setBounds(150, 150, 100, 30);
        txtArea.setFocusable(false);
        txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
        txtArea.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtArea);

        txtVolumen = new JTextField();
        txtVolumen.setBounds(150, 190, 100, 30);
        txtVolumen.setFocusable(false);
        txtVolumen.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVolumen.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVolumen);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 240, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
        int radio = Integer.parseInt(txtRadio.getText());
        int altura = Integer.parseInt(txtAltura.getText());

        double area = 2 * Math.PI * radio * (radio + altura);
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        DecimalFormat df = new DecimalFormat("##.00");
        txtArea.setText(df.format(area));
        txtVolumen.setText(df.format(volumen));
    }
}
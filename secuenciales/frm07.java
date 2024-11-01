package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtBase, txtAltura, txtArea, txtPerimetro;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm07 frame = new frm07();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(50, 50, 80, 30);
        getContentPane().add(lblBase);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(50, 90, 80, 30);
        getContentPane().add(lblAltura);

        JLabel lblArea = new JLabel("Área:");
        lblArea.setBounds(50, 150, 80, 30);
        getContentPane().add(lblArea);

        JLabel lblPerimetro = new JLabel("Perímetro:");
        lblPerimetro.setBounds(50, 190, 80, 30);
        getContentPane().add(lblPerimetro);

        txtBase = new JTextField();
        txtBase.setBounds(150, 50, 100, 30);
        txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

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

        txtPerimetro = new JTextField();
        txtPerimetro.setBounds(150, 190, 100, 30);
        txtPerimetro.setFocusable(false);
        txtPerimetro.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPerimetro.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPerimetro);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 240, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
        int base = Integer.parseInt(txtBase.getText());
        int altura = Integer.parseInt(txtAltura.getText());

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        DecimalFormat df = new DecimalFormat("##.00");
        txtArea.setText(df.format(area));
        txtPerimetro.setText(df.format(perimetro));
    }
}
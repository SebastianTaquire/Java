package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPies, txtPulgadas, txtMetros;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm04 frame = new frm04();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblPies = new JLabel("Pies:");
        lblPies.setBounds(50, 50, 80, 30);
        getContentPane().add(lblPies);

        JLabel lblPulgadas = new JLabel("Pulgadas:");
        lblPulgadas.setBounds(50, 90, 80, 30);
        getContentPane().add(lblPulgadas);

        JLabel lblMetros = new JLabel("Metros:");
        lblMetros.setBounds(50, 150, 80, 30);
        getContentPane().add(lblMetros);

        txtPies = new JTextField();
        txtPies.setBounds(150, 50, 80, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPies);

        txtPulgadas = new JTextField();
        txtPulgadas.setBounds(150, 90, 80, 30);
        txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPulgadas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPulgadas);

        txtMetros = new JTextField();
        txtMetros.setBounds(150, 150, 80, 30);
        txtMetros.setFocusable(false);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMetros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 200, 80, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
        double pies = Double.parseDouble(txtPies.getText());
        double pulgadas = Double.parseDouble(txtPulgadas.getText());

        double piesMetros = pies * 0.3048;
        double pulgadasMetros = pulgadas * 0.0254;

        double estaturaTotalMetros = piesMetros + pulgadasMetros;

        DecimalFormat df = new DecimalFormat("##.00");
        txtMetros.setText(df.format(estaturaTotalMetros));
    }
}
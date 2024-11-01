package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtJuan, txtRosa, txtDaniel, txtCapitalTotal, txtPorcJuan, txtPorcRosa, txtPorcDaniel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm15 frame = new frm15();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblJuan = new JLabel("Juan (USD):");
        lblJuan.setBounds(50, 30, 150, 30);
        getContentPane().add(lblJuan);

        JLabel lblRosa = new JLabel("Rosa (USD):");
        lblRosa.setBounds(50, 70, 150, 30);
        getContentPane().add(lblRosa);

        JLabel lblDaniel = new JLabel("Daniel (Soles):");
        lblDaniel.setBounds(50, 110, 150, 30);
        getContentPane().add(lblDaniel);

        txtJuan = new JTextField();
        txtJuan.setBounds(220, 30, 100, 30);
        txtJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        txtJuan.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtJuan);

        txtRosa = new JTextField();
        txtRosa.setBounds(220, 70, 100, 30);
        txtRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRosa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRosa);

        txtDaniel = new JTextField();
        txtDaniel.setBounds(220, 110, 100, 30);
        txtDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDaniel.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDaniel);

        JLabel lblCapitalTotal = new JLabel("Total (USD):");
        lblCapitalTotal.setBounds(50, 150, 150, 30);
        getContentPane().add(lblCapitalTotal);

        txtCapitalTotal = new JTextField();
        txtCapitalTotal.setBounds(220, 150, 100, 30);
        txtCapitalTotal.setFocusable(false);
        txtCapitalTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCapitalTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCapitalTotal);

        JLabel lblPorcJuan = new JLabel("Porcentaje de Juan:");
        lblPorcJuan.setBounds(50, 190, 150, 30);
        getContentPane().add(lblPorcJuan);

        txtPorcJuan = new JTextField();
        txtPorcJuan.setBounds(220, 190, 100, 30);
        txtPorcJuan.setFocusable(false);
        txtPorcJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcJuan.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPorcJuan);

        JLabel lblPorcRosa = new JLabel("Porcentaje de Rosa:");
        lblPorcRosa.setBounds(50, 230, 150, 30);
        getContentPane().add(lblPorcRosa);

        txtPorcRosa = new JTextField();
        txtPorcRosa.setBounds(220, 230, 100, 30);
        txtPorcRosa.setFocusable(false);
        txtPorcRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcRosa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPorcRosa);

        JLabel lblPorcDaniel = new JLabel("Porcentaje de Daniel:");
        lblPorcDaniel.setBounds(50, 270, 150, 30);
        getContentPane().add(lblPorcDaniel);

        txtPorcDaniel = new JTextField();
        txtPorcDaniel.setBounds(220, 270, 100, 30);
        txtPorcDaniel.setFocusable(false);
        txtPorcDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcDaniel.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPorcDaniel);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 310, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
        int Juan = Integer.parseInt(txtJuan.getText());
        int Rosa = Integer.parseInt(txtRosa.getText());
        int DanielSoles = Integer.parseInt(txtDaniel.getText());

        double aporteDaniel = DanielSoles / 3.0;

        double capitalTotal = Juan + Rosa + aporteDaniel;

        double porcJuan = (Juan / capitalTotal) * 100;
        double porcRosa = (Rosa / capitalTotal) * 100;
        double porcDaniel = (aporteDaniel / capitalTotal) * 100;

        txtCapitalTotal.setText(String.format("%.2f", capitalTotal));
        txtPorcJuan.setText(String.format("%.2f", porcJuan) + " %");
        txtPorcRosa.setText(String.format("%.2f", porcRosa) + " %");
        txtPorcDaniel.setText(String.format("%.2f", porcDaniel) + " %");
    }
}
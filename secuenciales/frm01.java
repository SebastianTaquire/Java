package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtVarones, txtMujeres, txtTmujeres, txtTvarones;
    JLabel lblPVarones, lblPMujeres, lblTMujeres, lblTVarones;    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null); 
		
		JLabel lblVarones = new JLabel("Varones: ");
		lblVarones.setBounds(50, 50, 60, 30);
		getContentPane().add(lblVarones);
		
		JLabel lblMujeres = new JLabel("Mujeres: ");
		lblMujeres.setBounds(50, 90, 60, 30);
		getContentPane().add(lblMujeres);
		
		JLabel lblTvarones = new JLabel("Total V: ");
		lblTvarones.setBounds(50, 200, 60, 30);
		getContentPane().add(lblTvarones);
		
		JLabel lblTmujeres = new JLabel("Total M: ");
		lblTmujeres.setBounds(50, 240, 60, 30);
		getContentPane().add(lblTmujeres);
		
		JLabel lblPVarones = new JLabel("%");
		lblPVarones.setBounds(200, 50, 60, 30);
		getContentPane().add(lblPVarones);
		
		JLabel lblPMujeres = new JLabel("%");
		lblPMujeres.setBounds(200, 90, 60, 30);
		getContentPane().add(lblPMujeres);
		
		JLabel lblTVarones = new JLabel("%");
		lblTVarones.setBounds(200, 200, 60, 30);
		getContentPane().add(lblTVarones);
		
		JLabel lblTMujeres1 = new JLabel("%");
		lblTMujeres1.setBounds(200, 240, 60, 30);
		getContentPane().add(lblTMujeres1);
		
		
		txtVarones = new JTextField();
		txtVarones.setBounds(120, 50, 60, 30);
		txtVarones.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVarones.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVarones);
		
		txtMujeres = new JTextField();
		txtMujeres.setBounds(120, 90, 60, 30);
		txtMujeres.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMujeres.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMujeres);
		
		txtTvarones = new JTextField();
		txtTvarones.setBounds(120, 200, 60, 30);
		txtTvarones.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTvarones.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTvarones);
		
		txtTmujeres = new JTextField();
		txtTmujeres.setBounds(120, 240, 60, 30);
		txtTmujeres.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTmujeres.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTmujeres);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e ->btnCalcular_actionPerformer());
		
		
	}
	
	protected void btnCalcular_actionPerformer() {
		int mujeres= Integer.parseInt(txtMujeres.getText());
		int varones= Integer.parseInt(txtVarones.getText());
		
		int total = varones + mujeres;
		double pVarones = varones * 100 / total;
		double pMujeres = mujeres * 100 / total;
		
		DecimalFormat df = new DecimalFormat("###.00");
		txtTmujeres.setText(df.format(pMujeres) + " %");
		txtTvarones.setText(df.format(pVarones) + " %");
	}

}

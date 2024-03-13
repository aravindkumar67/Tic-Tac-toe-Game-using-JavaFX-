import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Start_Page extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String po,px,id;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start_Page frame = new Start_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start_Page() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Get Your Brain Up and Run");
		lblNewLabel_2.setFont(new Font("Berlin Sans FB Demi", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(123, 70, 215, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Playing For Fun");
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(new Color(32, 178, 170));
		lblNewLabel_1.setFont(new Font("Algerian", Font.ITALIC, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(123, 51, 155, 21);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(123, 111, 215, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("PLAYER X");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Agency FB", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 11, 63, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PLAYER O");
		lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 45, 63, 14);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(83, 13, 103, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 43, 103, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("PLAY");
		btnNewButton.setBounds(182, 212, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					px=textField.getText();
					po=textField_1.getText();
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_pro","root","MySql@root01");
					PreparedStatement ps=conn.prepareStatement("select * from xox_details where player_name=?");
					ps.setString(1,px);
					PreparedStatement ps1=conn.prepareStatement("select * from xox_details where player_name=?");
					ps1.setString(1,po);
					ResultSet rs = ps.executeQuery();
					ResultSet rs1 = ps1.executeQuery();
					if(rs.next() && rs1.next()) {
					dispose();
					Page_2 frame = new Page_2(px,po);
					frame.setVisible(true);
					}
					else {JOptionPane.showMessageDialog(rootPane, "Seems Like You Are New To The Game\nCreate Your Profile B Clicking Ok");
					dispose();
					NewPal np=new NewPal();
					np.setVisible(true);
					}
					}
					catch(Exception z) {JOptionPane.showMessageDialog(rootPane, z);}
			}
		});
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setFont(new Font("Algerian", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(47, 79, 79));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\JP2.png"));
		lblNewLabel.setBounds(15, 0, 406, 261);
		contentPane.add(lblNewLabel);
	}
}
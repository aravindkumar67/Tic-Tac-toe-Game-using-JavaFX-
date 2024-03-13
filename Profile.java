import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class Profile extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile("","");
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
	public Profile(final String p1,final String p2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 164, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("PLAYER X");
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 11, 116, 18);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Games Won:");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(10, 110, 69, 17);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Games Played:");
		lblNewLabel_1_2.setFont(new Font("Perpetua", Font.ITALIC, 13));
		lblNewLabel_1_2.setBounds(10, 83, 69, 27);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Games Lost:");
		lblNewLabel_1_2_2.setFont(new Font("Perpetua", Font.ITALIC, 13));
		lblNewLabel_1_2_2.setBounds(10, 171, 69, 27);
		panel.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Games Tie:");
		lblNewLabel_1_2_2_2.setFont(new Font("Perpetua", Font.ITALIC, 13));
		lblNewLabel_1_2_2_2.setBounds(10, 194, 69, 27);
		panel.add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("As X:");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(41, 128, 38, 18);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("As O:");
		lblNewLabel_2_2.setFont(new Font("Perpetua", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(41, 146, 38, 22);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("");
		lblNewLabel_3_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5_1.setBounds(80, 199, 46, 14);
		panel.add(lblNewLabel_3_5_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("");
		lblNewLabel_3_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_1.setBounds(80, 176, 46, 14);
		panel.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1.setBounds(80, 149, 46, 14);
		panel.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setBounds(80, 129, 46, 14);
		panel.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(80, 110, 46, 14);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_6 = new JLabel("");
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6.setBounds(80, 85, 46, 18);
		panel.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 37, 144, 35);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setText(p1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(260, 11, 164, 239);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPlayerO = new JLabel("      PLAYER O");
		lblPlayerO.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerO.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 13));
		lblPlayerO.setBounds(54, 11, 100, 18);
		panel_1.add(lblPlayerO);
		
		JLabel lblNewLabel_1_1 = new JLabel("Games Won:");
		lblNewLabel_1_1.setFont(new Font("Perpetua", Font.ITALIC, 13));
		lblNewLabel_1_1.setBounds(10, 108, 69, 18);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Games Played:");
		lblNewLabel_1_2_1.setFont(new Font("Perpetua", Font.ITALIC, 13));
		lblNewLabel_1_2_1.setBounds(10, 81, 69, 27);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Games Lost:");
		lblNewLabel_1_2_2_1.setFont(new Font("Perpetua", Font.ITALIC, 13));
		lblNewLabel_1_2_2_1.setBounds(10, 170, 69, 27);
		panel_1.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_2_1 = new JLabel("Games Tie:");
		lblNewLabel_1_2_2_2_1.setFont(new Font("Perpetua", Font.ITALIC, 13));
		lblNewLabel_1_2_2_2_1.setBounds(10, 193, 69, 27);
		panel_1.add(lblNewLabel_1_2_2_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("As X:");
		lblNewLabel_2_3.setFont(new Font("Perpetua", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(41, 126, 38, 18);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("As O:");
		lblNewLabel_2_2_1.setFont(new Font("Perpetua", Font.PLAIN, 12));
		lblNewLabel_2_2_1.setBounds(41, 147, 38, 15);
		panel_1.add(lblNewLabel_2_2_1);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(80, 86, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(80, 109, 46, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(80, 127, 46, 14);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(80, 145, 46, 14);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setBounds(80, 175, 46, 14);
		panel_1.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setBounds(80, 198, 46, 14);
		panel_1.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblNewLabel_5.setBounds(10, 40, 144, 30);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setText(p2);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_pro","root","MySql@root01");
			PreparedStatement ps=conn.prepareStatement("select * from xox_details where player_name=?");
			ps.setString(1,p1);
			PreparedStatement ps1=conn.prepareStatement("select * from xox_details where player_name=?");
			ps1.setString(1,p2);
			ResultSet rs = ps.executeQuery();
			ResultSet rs1 = ps1.executeQuery();
			if(rs.next()&&rs1.next()) {
				lblNewLabel_3_6.setText(Integer.toString(rs.getInt("gamesplayed")));
				lblNewLabel_3_1_1.setText(Integer.toString(rs.getInt("gameswon")));
				lblNewLabel_3_2_1.setText(Integer.toString(rs.getInt("xwins")));
				lblNewLabel_3_3_1.setText(Integer.toString(rs.getInt("owins")));
				lblNewLabel_3_4_1.setText(Integer.toString(rs.getInt("gameslost")));
				lblNewLabel_3_5_1.setText(Integer.toString(rs.getInt("ties")));
				
				lblNewLabel_3.setText(Integer.toString(rs1.getInt("gamesplayed")));
				lblNewLabel_3_1.setText(Integer.toString(rs1.getInt("gameswon")));
				lblNewLabel_3_2.setText(Integer.toString(rs1.getInt("xwins")));
				lblNewLabel_3_3.setText(Integer.toString(rs1.getInt("owins")));
				lblNewLabel_3_4.setText(Integer.toString(rs1.getInt("gameslost")));
				lblNewLabel_3_5.setText(Integer.toString(rs1.getInt("ties")));
			}
		}
		catch(Exception z) {JOptionPane.showMessageDialog(rootPane, z);}
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Page_2 pobs = new Page_2(p1,p2);
				pobs.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.ITALIC, 13));
		btnNewButton.setBounds(176, 227, 82, 23);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(215, 23, 1, 199);
		contentPane.add(textArea);
	}
}

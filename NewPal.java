import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class NewPal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	String name1;
	String play=Integer.toString(0);
	int regid;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewPal frame = new NewPal();
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
	public NewPal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Player Name");
		lblNewLabel.setFont(new Font("Algerian", Font.ITALIC, 13));
		lblNewLabel.setBounds(46, 93, 159, 34);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(234, 95, 142, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("JOIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					name1 = textField.getText();
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_pro","root","MySql@root01");
					PreparedStatement p1=conn.prepareStatement("select player_id,player_name from xox_details");
					ResultSet rp = p1.executeQuery();
					while(rp.next()) {regid=rp.getInt("player_id");
					if(rp.getString("player_name").equals(name1)) {
						throw new Exception("Already Existing Name\nChoose Different Name");}
					}
					PreparedStatement ps=conn.prepareStatement("insert into xox_details(player_name,player_id,xwins,owins,ties,gamesplayed,gameslost,gameswon)"+"values(?,?,?,?,?,?,?,?)");
					ps.setString(1, name1);
					ps.setString(2, Integer.toString(regid+1));
					ps.setString(3, play);
					ps.setString(4, play);
					ps.setString(5, play);
					ps.setString(6, play);
					ps.setString(7, play);
					ps.setString(8, play);
					int rs = ps.executeUpdate();
					if(rs>0) {JOptionPane.showMessageDialog(rootPane, "Go Enjoy Your Game\nYour Gaming Will Be Saved From Now");}
					else {JOptionPane.showMessageDialog(rootPane, "Sorry We Failed To Create a Profile For You");}
					dispose();
					ProFront spob=new ProFront();
					spob.setVisible(true);
					}
					catch(Exception z) {JOptionPane.showMessageDialog(rootPane, z);}
			}
		});
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(150, 172, 89, 23);
		contentPane.add(btnNewButton);
	}
}

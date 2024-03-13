import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ProFront extends JFrame {

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
					ProFront frame = new ProFront();
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
	public ProFront() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("READY TO ENJOY THE GAME ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.ITALIC, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(75, 11, 264, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New Player ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				NewPal npl=new NewPal();
				npl.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Algerian", Font.BOLD, 12));
		btnNewButton.setBounds(65, 166, 125, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Existing");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Start_Page spob=new Start_Page();
				spob.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Algerian", Font.BOLD, 12));
		btnNewButton_1.setBounds(275, 166, 103, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\Tic3.1.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 250);
		contentPane.add(lblNewLabel_1);
	}
}

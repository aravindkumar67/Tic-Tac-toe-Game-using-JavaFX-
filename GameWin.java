import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class GameWin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String t[][]= {{" "," "," "},{" "," "," "},{" "," "," "}};
	int l=0,a=0,i=0,j=0;
	int[] count=new int[9];
	int p=0, u=0, e=1, x=0, y=0, w=0, z=0, m=0, h=0, g2=0, h1=0, g1=0;
	int xw=0,ow=0,ti=0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWin frame = new GameWin("","");
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
	public GameWin(final String p1,final String p2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count[0]<1) {
					if(l%2==0) {
					btnNewButton.setText("X");
					t[0][0]="X";
					l=l+1;
				}
					else {
						btnNewButton.setText("O");
						t[0][0]="O";
						l=l+1;
					}count[0]+=1;
					}else {
					JOptionPane.showMessageDialog(rootPane, "Invalid Selection");}
					check(p1,p2);
					
			}
		});
		btnNewButton.setFont(new Font("Agency FB", Font.BOLD, 12));
		btnNewButton.setBounds(142, 81, 45, 28);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count[1]<1) {
					if(l%2==0) {
					btnNewButton_1.setText("X");
					t[0][1]="X";
					l=l+1;
				}
					else {
						btnNewButton_1.setText("O");
						t[0][1]="O";
						l=l+1;
					}count[1]+=1;
					}else {
					JOptionPane.showMessageDialog(rootPane, "Invalid Selection");}
					check(p1,p2);
			}
		});
		btnNewButton_1.setFont(new Font("Agency FB", Font.BOLD, 12));
		btnNewButton_1.setBounds(191, 82, 44, 28);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count[2]<1) {
					if(l%2==0) {
					btnNewButton_2.setText("X");
					t[0][2]="X";
					l=l+1;
				}
					else {
						btnNewButton_2.setText("O");
						t[0][2]="O";
						l=l+1;
					}count[2]+=1;
					}else {
					JOptionPane.showMessageDialog(rootPane, "Invalid Selection");}
					check(p1,p2);
			}
		});
		btnNewButton_2.setFont(new Font("Agency FB", Font.BOLD, 12));
		btnNewButton_2.setBounds(240, 82, 45, 27);
		contentPane.add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count[3]<1) {
					if(l%2==0) {
					btnNewButton_3.setText("X");
					t[1][0]="X";
					l=l+1;
				}
					else {
						btnNewButton_3.setText("O");
						t[1][0]="O";
						l=l+1;
					}count[3]+=1;
					}else {
					JOptionPane.showMessageDialog(rootPane, "Invalid Selection");}
					check(p1,p2);
			}
		});
		btnNewButton_3.setFont(new Font("Agency FB", Font.BOLD, 12));
		btnNewButton_3.setBounds(142, 115, 45, 28);
		contentPane.add(btnNewButton_3);
		
		final JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count[4]<1) {
					if(l%2==0) {
					btnNewButton_4.setText("X");
					t[1][1]="X";
					l=l+1;
				}
					else {
						btnNewButton_4.setText("O");
						t[1][1]="O";
						l=l+1;
					}count[4]+=1;
					}else {
					JOptionPane.showMessageDialog(rootPane, "Invalid Selection");}
					check(p1,p2);
			}
		});
		btnNewButton_4.setFont(new Font("Agency FB", Font.BOLD, 12));
		btnNewButton_4.setBounds(190, 115, 45, 28);
		contentPane.add(btnNewButton_4);
		
		final JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count[5]<1) {
					if(l%2==0) {
					btnNewButton_5.setText("X");
					t[1][2]="X";
					l=l+1;
				}
					else {
						btnNewButton_5.setText("O");
						t[1][2]="O";
						l=l+1;
					}count[5]+=1;
					}else {
					JOptionPane.showMessageDialog(rootPane, "Invalid Selection");}
					check(p1,p2);
			}
		});
		btnNewButton_5.setFont(new Font("Agency FB", Font.BOLD, 12));
		btnNewButton_5.setBounds(240, 116, 45, 27);
		contentPane.add(btnNewButton_5);
		
		final JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count[6]<1) {
					if(l%2==0) {
					btnNewButton_6.setText("X");
					t[2][0]="X";
					l=l+1;
				}
					else {
						btnNewButton_6.setText("O");
						t[2][0]="O";
						l=l+1;
					}count[6]+=1;
					}else {
					JOptionPane.showMessageDialog(rootPane, "Invalid Selection");}
					check(p1,p2);
			}
		});
		btnNewButton_6.setFont(new Font("Agency FB", Font.BOLD, 12));
		btnNewButton_6.setBounds(142, 148, 45, 28);
		contentPane.add(btnNewButton_6);
		
		final JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count[7]<1) {
					if(l%2==0) {
					btnNewButton_7.setText("X");
					t[2][1]="X";
					l=l+1;
				}
					else {
						btnNewButton_7.setText("O");
						t[2][1]="O";
						l=l+1;
					}count[7]+=1;
					}else {
					JOptionPane.showMessageDialog(rootPane, "Invalid Selection");}
					check(p1,p2);
			}
		});
		btnNewButton_7.setFont(new Font("Agency FB", Font.BOLD, 12));
		btnNewButton_7.setBounds(191, 148, 46, 28);
		contentPane.add(btnNewButton_7);
		
		final JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count[8]<1) {
					if(l%2==0) {
					btnNewButton_8.setText("X");
					t[2][2]="X";
					l=l+1;
				}
					else {
						btnNewButton_8.setText("O");
						t[2][2]="O";
						l=l+1;
					}count[8]+=1;
					}else {
					JOptionPane.showMessageDialog(rootPane, "Invalid Selection");}
					check(p1,p2);
			}
		});
		btnNewButton_8.setFont(new Font("Agency FB", Font.BOLD, 12));
		btnNewButton_8.setBounds(240, 148, 45, 28);
		contentPane.add(btnNewButton_8);
	

	JButton btnNewButton_9 = new JButton("PLAY AGAIN");
	btnNewButton_9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
			GameWin frame1 = new GameWin(p1,p2);
			frame1.setVisible(true);
		}
	});
	btnNewButton_9.setFont(new Font("Algerian", Font.ITALIC, 13));
	btnNewButton_9.setBounds(55, 208, 141, 23);
	contentPane.add(btnNewButton_9);
	
	JLabel lblNewLabel = new JLabel("TIC TAC TOE");
	lblNewLabel.setForeground(new Color(255, 255, 255));
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
	lblNewLabel.setBounds(142, 26, 137, 23);
	contentPane.add(lblNewLabel);
	
	JButton btnNewButton_10 = new JButton("BACK");
	btnNewButton_10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
			Page_2 pob=new Page_2(p1,p2);
			pob.setVisible(true);
		}
	});
	btnNewButton_10.setFont(new Font("Algerian", Font.ITALIC, 13));
	btnNewButton_10.setBounds(256, 207, 132, 23);
	contentPane.add(btnNewButton_10);
	
	JLabel lblNewLabel_1 = new JLabel("");
	lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\Tic6.1.jpg"));
	lblNewLabel_1.setBounds(0, 0, 434, 261);
	contentPane.add(lblNewLabel_1);
}
public void check(String p1,String p2) {
	for(i=0;i<3;i++){
	for(j=0;j<3;j++){
	if(t[i][j]=="X"){x=x+1;}
	if(t[i][j]=="O"){y=y+1;}
	if(t[j][i]=="X"){w=w+1;}
	if(t[j][i]=="O"){z=z+1;}
	if(t[i][j]=="X" && i==j){g2=g2+1;}
	if(t[i][j]=="O" && i==j){h=h+1;}
	if(t[i][j]=="X" && i+j==2){g1=g1+1;}
	if(t[i][j]=="O" && i+j==2){h1=h1+1;}}
	if(x==3 || w==3 || g2==3 || g1==3){
	JOptionPane.showMessageDialog(rootPane, "Player X Has Won");
	xw=xw+1; 
	a=3;
	update(p1,p2);
	break;}
	if(y==3 || z==3 || h==3 || h1==3){
	JOptionPane.showMessageDialog(rootPane, "Player O Has Won");
	ow=ow+1;
	a=3;
	update(p1,p2);
	break;}
	w=x=y=z=0;}
	h=g2=h1=g1=0;
	for(i = 0;i < 3;i++){
	for(j = 0;j < 3;j++){
	if(t[i][j]==" "){m = m + 1;}}}
	if(m == 0 && a != 3){
	JOptionPane.showMessageDialog(rootPane, "Tie Match");
	a=3;
	ti=ti+1;
	update(p1,p2);}
	m=0;
}

public void update(String p1,String p2) {
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
			PreparedStatement ps2=conn.prepareStatement("update xox_details set gamesplayed=?,gameswon=?,gameslost=?,xwins=?,owins=?,ties=? where player_name=?");
			ps2.setString(1,Integer.toString(rs.getInt("gamesplayed")+xw+ow+ti));
			ps2.setString(2,Integer.toString(rs.getInt("gameswon")+xw));
			ps2.setString(4,Integer.toString(rs.getInt("xwins")+xw));
			ps2.setString(5,Integer.toString(rs.getInt("owins")));
		    ps2.setString(3,Integer.toString(rs.getInt("gameslost")+ow));
			ps2.setString(6,Integer.toString(rs.getInt("ties")+ti));
			ps2.setString(7, p1);
			PreparedStatement ps3=conn.prepareStatement("update xox_details set gamesplayed=?,gameswon=?,gameslost=?,xwins=?,owins=?,ties=? where player_name=?");
			ps3.setString(1,Integer.toString(rs1.getInt("gamesplayed")+xw+ow+ti));
			ps3.setString(2,Integer.toString(rs1.getInt("gameswon")+ow));
			ps3.setString(4,Integer.toString(rs1.getInt("xwins")));
			ps3.setString(5,Integer.toString(rs1.getInt("owins")+ow));
			ps3.setString(3,Integer.toString(rs1.getInt("gameslost")+xw));
			ps3.setString(6,Integer.toString(rs1.getInt("ties")+ti));
			ps3.setString(7, p2);
			int rs2=ps2.executeUpdate();
			int rs3=ps3.executeUpdate();
			if(rs2>0 & rs3>0) {JOptionPane.showMessageDialog(rootPane, "Progess Saved");}
			else {JOptionPane.showMessageDialog(rootPane, "Progess Could Not Be Saved");}
		}
	}
	catch(Exception z) {JOptionPane.showMessageDialog(rootPane, z);}
}
}

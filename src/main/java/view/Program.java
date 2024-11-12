package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Program extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try {
					Program frame = new Program();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	// test new
	public Program() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Lê Đình Chinh");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l1.setBounds(108, 83, 242, 28);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Lê Công Huy");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l2.setBounds(108, 121, 242, 28);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("Nguyễn Duy Vũ");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l3.setBounds(108, 159, 242, 28);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("Nguyễn Nhật Linh");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l4.setBounds(108, 197, 242, 28); 
		contentPane.add(l4);
		
		JLabel nameGroup = new JLabel("Nhóm 1");
		nameGroup.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nameGroup.setBounds(108, 23, 242, 28);
		contentPane.add(nameGroup);
		// add something 12345656
	}
}

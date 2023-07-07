package sub2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtTextfiled;
	private JTextField txtTextfiled_1;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtCehckbox;
	private JTextField txtRadiobutton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 488, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Component Test");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 142, 15);
		frame.getContentPane().add(lblNewLabel);

		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(12, 68, 97, 23);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(123, 68, 97, 23);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				if (answer == 0) {
					System.out.println("YES 클릭");
				} else {
					System.out.println("NO 클릭");
				}
			}
		});
		btn3.setBounds(232, 68, 97, 23);
		frame.getContentPane().add(btn3);

		txtTextfiled = new JTextField();
		txtTextfiled.setEditable(false);
		txtTextfiled.setText("Button 실습");
		txtTextfiled.setBounds(12, 35, 73, 23);
		frame.getContentPane().add(txtTextfiled);
		txtTextfiled.setColumns(10);

		txtTextfiled_1 = new JTextField();
		txtTextfiled_1.setText("TextFiled 실습");
		txtTextfiled_1.setColumns(10);
		txtTextfiled_1.setBounds(12, 121, 97, 23);
		frame.getContentPane().add(txtTextfiled_1);

		JLabel txtxx = new JLabel("아이디");
		txtxx.setBounds(12, 158, 57, 15);
		frame.getContentPane().add(txtxx);

		txtUid = new JTextField();
		txtUid.setBounds(62, 155, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);

		JLabel lbUid = new JLabel("결과 : ");
		lbUid.setBounds(304, 158, 196, 15);
		frame.getContentPane().add(lbUid);

		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtUid.getText();
				lbUid.setText("결과 : " + uid);
			}
		});
		btnUid.setBounds(190, 154, 97, 23);
		frame.getContentPane().add(btnUid);

		JLabel lblNewLabel_1_1 = new JLabel("이름");
		lblNewLabel_1_1.setBounds(12, 187, 57, 15);
		frame.getContentPane().add(lblNewLabel_1_1);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(62, 184, 116, 21);
		frame.getContentPane().add(txtName);

		JLabel lbName = new JLabel("결과 : ");
		lbName.setBounds(304, 187, 196, 15);
		frame.getContentPane().add(lbName);

		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				lbName.setText("결과 : " + name);
			}
		});
		btnName.setBounds(190, 183, 97, 23);
		frame.getContentPane().add(btnName);

		JLabel lblNewLabel_1_2 = new JLabel("휴대폰");
		lblNewLabel_1_2.setBounds(12, 216, 57, 15);
		frame.getContentPane().add(lblNewLabel_1_2);

		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(62, 213, 116, 21);
		frame.getContentPane().add(txtHp);

		JLabel lbHp = new JLabel("결과 : ");
		lbHp.setBounds(304, 216, 196, 15);
		frame.getContentPane().add(lbHp);

		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp = txtHp.getText();
				lbHp.setText("결과 : " + hp);
			}
		});
		btnHp.setBounds(190, 212, 97, 23);
		frame.getContentPane().add(btnHp);

		txtCehckbox = new JTextField();
		txtCehckbox.setText("checkBox 실습");
		txtCehckbox.setColumns(10);
		txtCehckbox.setBounds(12, 254, 97, 23);
		frame.getContentPane().add(txtCehckbox);

		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(8, 291, 57, 23);
		frame.getContentPane().add(chk1);

		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(69, 291, 57, 23);
		frame.getContentPane().add(chk2);

		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(130, 291, 57, 23);
		frame.getContentPane().add(chk3);

		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(190, 291, 57, 23);
		frame.getContentPane().add(chk4);

		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(251, 291, 57, 23);
		frame.getContentPane().add(chk5);

		JLabel lbChkFruit = new JLabel("선택한 과일 : ");
		lbChkFruit.setBounds(12, 320, 401, 15);
		frame.getContentPane().add(lbChkFruit);

		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> fruits = new ArrayList<>();
				if (chk1.isSelected()) {
					fruits.add(chk1.getText());
				}
				if (chk2.isSelected()) {
					fruits.add(chk2.getText());
				}
				if (chk3.isSelected()) {
					fruits.add(chk3.getText());
				}
				if (chk4.isSelected()) {
					fruits.add(chk4.getText());
				}
				if (chk5.isSelected()) {
					fruits.add(chk5.getText());
				}
				lbChkFruit.setText("선택한 과일 : " + fruits);
			}
		});
		btnChkFruit.setBounds(316, 291, 97, 23);
		frame.getContentPane().add(btnChkFruit);

		txtRadiobutton = new JTextField();
		txtRadiobutton.setText("radioButton 실습");
		txtRadiobutton.setColumns(10);
		txtRadiobutton.setBounds(12, 356, 114, 23);
		frame.getContentPane().add(txtRadiobutton);

		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(12, 385, 57, 23);
		frame.getContentPane().add(rdMale);

		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(69, 385, 57, 23);
		frame.getContentPane().add(rdFemale);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);

		JLabel lbGender = new JLabel("선택 결과 : ");
		lbGender.setBounds(12, 414, 196, 15);
		frame.getContentPane().add(lbGender);

		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdMale.isSelected()) {
					lbGender.setText("선택 결과 : " + rdMale.getText());
				} else if (rdFemale.isSelected()) {
					lbGender.setText("선택 결과 : " + rdFemale.getText());
				}
			}
		});
		btnGender.setBounds(130, 385, 97, 23);
		frame.getContentPane().add(btnGender);
	}
}

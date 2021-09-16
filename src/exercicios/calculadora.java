package exercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JButton btnPonto;
	private JButton btn3;
	private JButton btn6;
	private JButton btn9;
	private JButton btn2;
	private JButton btn5;
	private JButton btn8;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnMais;
	private JButton btnMenos;
	private JButton btnVezes;
	private JButton btnDvidir;
	private JButton btnCalcular;
	private JButton btnLimpar;
	private JTextArea txtMostrar;
	public double valor1;
	public double valor2;
	public String numString;
	public double res;
	public int lenght1;
	public int lenght2;
	public String stringValor2;
	public int sinal;
	public String resultado;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JSeparator separator;
	private JMenuItem mntmNewMenuItem;
	private JSeparator separator_1;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
					//frame.setUndecorated(true);
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
	public calculadora() {
		setTitle("Calculadora Kaique");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("calculadora.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 459);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Menu");
		mnNewMenu.setMargin(new Insets(8, 12, 2, 12));
		mnNewMenu.setFont(new Font("Arial", Font.BOLD, 12));
		mnNewMenu.setForeground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem_1 = new JMenuItem("Limpar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=====
				txtMostrar.setText(null);
				//=====
			}
		});
		
		mntmNewMenuItem = new JMenuItem("Secreto");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tudo bom?");
			}
		});
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnNewMenu.add(mntmNewMenuItem);
		
		separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		separator = new JSeparator();
		mnNewMenu.add(separator);
		
		mntmNewMenuItem_2 = new JMenuItem("Sair");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Obrigado por testar a calculadora Kaique :D");
				System.exit(0);
			}
		});
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mnNewMenu_1 = new JMenu("Sobre");
		mnNewMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esse programa está em testes e desenvolvimento!");
			}
		});
		mnNewMenu_1.setMargin(new Insets(8, 12, 2, 12));
		mnNewMenu_1.setFont(new Font("Arial", Font.BOLD, 12));
		mnNewMenu_1.setForeground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_3 = new JMenuItem("Ver");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Esse programa está em testes e desenvolvimento!");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mnNewMenu_2 = new JMenu("Cr\u00E9ditos");
		mnNewMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				JOptionPane.showMessageDialog(null, "Foi criado e desenvolvido pelo Kaique Miranda :)");
				//========
			}
		});
		mnNewMenu_2.setMargin(new Insets(8, 12, 2, 12));
		mnNewMenu_2.setFont(new Font("Arial", Font.BOLD, 12));
		mnNewMenu_2.setForeground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_4 = new JMenuItem("Ver");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Foi criado e desenvolvido pelo Kaique Miranda :)");
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnPonto = new JButton(".");
		btnPonto.setBackground(SystemColor.inactiveCaption);
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append(".");
				//========
			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPonto.setBounds(10, 334, 54, 51);
		contentPane.add(btnPonto);
		
		btn3 = new JButton("3");
		btn3.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append("3");
				//========
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(10, 272, 54, 51);
		contentPane.add(btn3);
		
		btn6 = new JButton("6");
		btn6.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append("6");
				//========
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(10, 210, 54, 51);
		contentPane.add(btn6);
		
		btn9 = new JButton("9");
		btn9.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append("9");
				//========
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(10, 148, 54, 51);
		contentPane.add(btn9);
		
		btn2 = new JButton("2");
		btn2.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append("2");
				//========
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(74, 272, 54, 51);
		contentPane.add(btn2);
		
		btn5 = new JButton("5");
		btn5.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append("5");
				//========
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(74, 210, 54, 51);
		contentPane.add(btn5);
		
		btn8 = new JButton("8");
		btn8.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append("8");
				//========
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(74, 148, 54, 51);
		contentPane.add(btn8);
		
		btn7 = new JButton("7");
		btn7.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append("7");
				//========
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(138, 148, 54, 51);
		contentPane.add(btn7);
		
		btn4 = new JButton("4");
		btn4.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append("4");
				//========
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(138, 210, 54, 51);
		contentPane.add(btn4);
		
		btn1 = new JButton("1");
		btn1.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append("1");
				double valor1;
				//========
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(138, 272, 54, 51);
		contentPane.add(btn1);
		
		btn0 = new JButton("0");
		btn0.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.append("0");
				//========
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(74, 334, 118, 51);
		contentPane.add(btn0);
		
		btnMais = new JButton("+");
		btnMais.setBackground(new Color(102, 0, 204));
		btnMais.setForeground(Color.WHITE);
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				numString = txtMostrar.getText();
				lenght1 = numString.length();
				valor1 = Double.parseDouble(numString);
				txtMostrar.append("+");
				sinal = 1;
				//========
			}
		});
		btnMais.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMais.setBounds(202, 148, 54, 51);
		contentPane.add(btnMais);
		
		btnMenos = new JButton("-");
		btnMenos.setBackground(new Color(102, 0, 204));
		btnMenos.setForeground(Color.WHITE);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				numString = txtMostrar.getText();
				lenght1 = numString.length();
				valor1 = Double.parseDouble(numString);
				txtMostrar.append("-");
				sinal = 2;
				//========
			}
		});
		btnMenos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMenos.setBounds(202, 210, 54, 51);
		contentPane.add(btnMenos);
		
		btnVezes = new JButton("*");
		btnVezes.setBackground(new Color(102, 0, 204));
		btnVezes.setForeground(Color.WHITE);
		btnVezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				numString = txtMostrar.getText();
				lenght1 = numString.length();
				valor1 = Double.parseDouble(numString);
				txtMostrar.append("*");
				sinal = 3;
				//========
			}
		});
		btnVezes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVezes.setBounds(202, 272, 54, 51);
		contentPane.add(btnVezes);
		
		btnDvidir = new JButton("/");
		btnDvidir.setBackground(new Color(102, 0, 204));
		btnDvidir.setForeground(Color.WHITE);
		btnDvidir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				numString = txtMostrar.getText();
				lenght1 = numString.length();
				valor1 = Double.parseDouble(numString);
				txtMostrar.append("/");
				sinal = 4;
				//========
			}
		});
		btnDvidir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDvidir.setBounds(202, 334, 54, 51);
		contentPane.add(btnDvidir);
		
		btnCalcular = new JButton("=");
		btnCalcular.setForeground(new Color(255, 255, 255));
		btnCalcular.setBackground(new Color(51, 51, 51));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				
				switch(sinal) {
					case 1: numString = txtMostrar.getText();
							lenght2 = numString.length();
							stringValor2 = numString.substring((lenght1+1),lenght2);
							valor2 = Double.parseDouble(stringValor2);
							res = valor1+valor2;
							resultado = String.valueOf(res);
							txtMostrar.append("=");
							txtMostrar.setText(resultado);
							break;
					case 2: numString = txtMostrar.getText();
							lenght2 = numString.length();
							stringValor2 = numString.substring((lenght1+1),lenght2);
							valor2 = Double.parseDouble(stringValor2);
							res = valor1-valor2;
							resultado = String.valueOf(res);
							txtMostrar.append("=");
							txtMostrar.setText(resultado);
							break;
					case 3: numString = txtMostrar.getText();
							lenght2 = numString.length();
							stringValor2 = numString.substring((lenght1+1),lenght2);
							valor2 = Double.parseDouble(stringValor2);
							res = valor1*valor2;
							resultado = String.valueOf(res);
							txtMostrar.append("=");
							txtMostrar.setText(resultado);
							break;
					case 4: numString = txtMostrar.getText();
							lenght2 = numString.length();
							stringValor2 = numString.substring((lenght1+1),lenght2);
							valor2 = Double.parseDouble(stringValor2);
							res = valor1/valor2;
							resultado = String.valueOf(res);
							txtMostrar.append("=");
							txtMostrar.setText(resultado);
							break;
				}
				//========
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalcular.setBounds(138, 86, 118, 51);
		contentPane.add(btnCalcular);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(new Color(255, 255, 255));
		btnLimpar.setBackground(new Color(102, 0, 204));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//========
				txtMostrar.setText(null);
				//========
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.setBounds(10, 86, 118, 51);
		contentPane.add(btnLimpar);
		
		txtMostrar = new JTextArea();
		txtMostrar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		txtMostrar.setBackground(SystemColor.inactiveCaptionBorder);
		txtMostrar.setMargin(new Insets(10, 2, 2, 2));
		txtMostrar.setFont(new Font("Calibri", Font.BOLD, 40));
		txtMostrar.setEditable(false);
		txtMostrar.setBounds(10, 11, 246, 62);
		contentPane.add(txtMostrar);
		
	}
}

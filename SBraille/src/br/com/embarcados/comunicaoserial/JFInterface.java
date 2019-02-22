package br.com.embarcados.comunicaoserial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFInterface extends JFrame {
	
	Arduino conn = new Arduino(); //cria um objeto do tipo Arduino
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFInterface frame = new JFInterface();
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
	public JFInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jBLenOn = new JButton("Ligar"); //criação do botão LIGA
		jBLenOn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				conn.comunicacaoArduino(jBLenOn);
			}
		});
		jBLenOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jBLenOn.setBounds(79, 70, 89, 23);
		contentPane.add(jBLenOn);
		
		JButton jBLenOff = new JButton("Desligar");
		jBLenOff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				conn.comunicacaoArduino(jBLenOff); 
			}
		});
		jBLenOff.setBounds(232, 70, 89, 23);
		contentPane.add(jBLenOff);
		
		JButton jBClose = new JButton("Sair");
		jBClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				conn.comunicacaoArduino(jBClose);
				System.exit(0);
			}
		});
		jBClose.setBounds(157, 154, 89, 23);
		contentPane.add(jBClose);
	}
}

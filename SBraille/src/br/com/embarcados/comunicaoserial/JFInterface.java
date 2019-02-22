//Versão 1.0 da Tela

package br.com.embarcados.comunicaoserial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;



public class JFInterface extends JFrame {
	Arduino conn = new Arduino(); //cria um objeto do tipo Arduino
	private JPanel contentPane;
	private JTextField txtBox;
	AlfabetoBraille[] alfabeto = AlfabetoBraille.values();
	

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
		
		JButton jBLenOn = new JButton("Ligar"); ////////////////////LIGAR
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
		jBLenOn.setBounds(38, 129, 89, 23);
		contentPane.add(jBLenOn);
		
		JButton jBLenOff = new JButton("Desligar"); /////////////////DESLIGAR
		jBLenOff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				conn.comunicacaoArduino(jBLenOff); 
			}
		});
		jBLenOff.setBounds(243, 129, 89, 23);
		contentPane.add(jBLenOff);
		
		JButton jBClose = new JButton("Sair"); /////////////////////////SAIR
		jBClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				conn.comunicacaoArduino(jBClose);
				System.exit(0);
			}
		});
		jBClose.setBounds(152, 199, 89, 23);
		contentPane.add(jBClose);
		
		txtBox = new JTextField(); /////////////////////texto
		txtBox.setBounds(81, 25, 230, 20);
		contentPane.add(txtBox);
		txtBox.setColumns(10);
		
		JButton bEnvia = new JButton("Envia"); ///////////////////////////BOTAO ENVIA
		bEnvia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String letra = txtBox.getText();    //a variavel letra recebe o que está na txtBox
				
				if(letra.equals("a")) {           //comparo a string
					System.out.println(alfabeto[1].getValor()); //p
					JOptionPane.showMessageDialog(null,"Texto: "+ txtBox.getText());
					conn.comunicacaoArduino(bEnvia,alfabeto[1].getValor());
				}
				else {
					JOptionPane.showMessageDialog(null,"NAO PEGOU");
					
				}
			}
		});
		
		bEnvia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				conn.comunicacaoArduino(bEnvia);
			}
		});
		bEnvia.setBounds(99, 71, 89, 23);
		contentPane.add(bEnvia);
	}
}

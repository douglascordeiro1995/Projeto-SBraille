//Versão 1.0 da Tela

package br.com.embarcados.comunicaoserial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.Choice;
import java.awt.BorderLayout;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JTextPane;



public class JFInterface extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Arduino conn = new Arduino(); //cria um objeto do tipo Arduino
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFInterface.class.getResource("/images/newLogo.png")));
		setTitle("SBraille Vers\u00E3o 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 442);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.setIcon(new ImageIcon(JFInterface.class.getResource("/images/page.png")));
		menuBar.add(mnArquivo);
		
		JMenuItem mntmNovo = new JMenuItem("Novo");
		mnArquivo.add(mntmNovo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir...");
		mnArquivo.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mnArquivo.add(mntmSalvar);
		
		JMenuItem mntmSalvarComo = new JMenuItem("Salvar Como...");
		mnArquivo.add(mntmSalvarComo);
		
		JMenu mnNewMenu = new JMenu("Editar");
		mnNewMenu.setIcon(new ImageIcon(JFInterface.class.getResource("/images/page_edit.png")));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Visualizar");
		mnNewMenu_1.setIcon(new ImageIcon(JFInterface.class.getResource("/images/eye.png")));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.setIcon(new ImageIcon(JFInterface.class.getResource("/images/information.png")));
		menuBar.add(mnSobre);
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTextArea boxField = new JTextArea();
		getContentPane().add(boxField, BorderLayout.CENTER);
		
		//SOUTH
		JPanel panelSouth = new JPanel();
		getContentPane().add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton bEnvia = new JButton("Enviar");
		bEnvia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxField.getText(); //armazena todo o conteudo da boxField na variável chamada texto
				char[] letras = boxField.getText().toCharArray(); //pego o texto da minha boxField e separo todo em um Array de char
				System.out.println(AlfabetoBraille.montaVLetras(letras));
				
				JOptionPane.showMessageDialog(null,"Texto: "+ texto);
				
				

				//conn.comunicacaoArduino(bEnvia,alfabeto[1].getValor()); 
			}
		});
		panelSouth.add(bEnvia);
		
		JMenuBar menuBar_1 = new JMenuBar();
		getContentPane().add(menuBar_1, BorderLayout.NORTH); 
	}
		
}

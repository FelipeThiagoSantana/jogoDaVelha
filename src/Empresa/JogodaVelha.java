/*
 * Felipe Thiago Santana 
 * RU: 3578872
 * Trabalho de POO
 * Fiz o game com interface grafica
 */

package Empresa;

//Importação das bibliotecas usadas no projeto
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.beans.JavaBean;
import javax.swing.*;

//Crei uma Classe com o nome de JogodaVelha e usei a biblioteca do java swing
public class JogodaVelha extends JFrame {
	//Usei 9 botões para fazer o Jogo
	JButton[] botao = new JButton[9];
	boolean bloqueio = false;
	boolean[] click = new boolean[9];
		//esse metodo contem algumas propriedades da janela
		public JogodaVelha(){
		setVisible (true);
		setResizable(false);
		setTitle("Jogo da velha");
		setDefaultCloseOperation(3);
		setLayout(null);
		//Esta linha posiciona a janela na tela
		setBounds(350,100,700,500);
		int cont = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++ ) {
				botao[cont] = new JButton();
				add(botao[cont]);
				botao[cont].setBounds((100 * i) + 190,(100*j)+ 50, 95,95);
				//Esta linha escolhi a fote padrão e o tamanho da letra
				botao [cont].setFont(new Font("Bell MT", Font.BOLD,40));
				//Esta Linha mudei a cor da Letra para contrastar com o fundo preto
				botao [cont].setForeground(Color.white);
				//Esta linha setei a cor preta para os botoes
				botao [cont].setBackground(Color.black);
				cont++;
				
			}
		}
		
		//Adicionei eventos de cliques para cada botões
		for (int i = 0; i < 9; i++) {
			click[i] = false; 
		}
		botao[0].addActionListener(new java.awt.event.ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[0] == false ) {
					click[0] = true;
					mudar(botao[0]);
				}
				
			}
		
		});botao[1].addActionListener(new java.awt.event.ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[1] == false ) {
					click[1] = true;
					mudar(botao[1]);
				}
				
			}
		
		});botao[2].addActionListener(new java.awt.event.ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[2] == false ) {
					click[2] = true;
					mudar(botao[2]);
				}
				
			}
		
		});botao[3].addActionListener(new java.awt.event.ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[3] == false ) {
					click[3] = true;
					mudar(botao[3]);
				}
				
			}
		
		});botao[4].addActionListener(new java.awt.event.ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[4] == false ) {
					click[4] = true;
					mudar(botao[4]);
				}
				
			}
		
		});botao[5].addActionListener(new java.awt.event.ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[5] == false ) {
					click[5] = true;
					mudar(botao[5]);
				}
				
			}
		
		});botao[6].addActionListener(new java.awt.event.ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[6] == false ) {
					click[6] = true;
					mudar(botao[6]);
				}
				
			}
		
		});botao[7].addActionListener(new java.awt.event.ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[7] == false ) {
					click[7] = true;
					mudar(botao[7]);
				}
				
			}
		
		});botao[8].addActionListener(new java.awt.event.ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[8] == false ) {
					click[8] = true;
					mudar(botao[8]);
								}
				
			}
		
		});
	}
		//Esse metodo não permite que ao clicar em um botão pre escolhido ele se altere 
	public void mudar(JButton btn) {
		if(bloqueio) {
			btn.setText("O");
			bloqueio = false;
		}else {
			btn.setText("X");
			bloqueio = true;
		}
		//chamei o metodo "vencedor" para executar a ação
		vencedor();
	}
	//criei um metodo para verificar quem foi o vencedor do game
	public void vencedor(){
		int cont = 0;
		//esse for verifica quantos botões foram precisonados
		for (int i = 0 ; i <9; i++) {
			if(click[i] == true) {
				cont++;
			}
		}
		//esse if verifica as posições do X e do O e mostra o ganhador
		if((botao[0].getText() == "X" && botao[1].getText() == "X" && botao[2].getText()== "X")
				||(botao[6].getText() == "X" && botao[7].getText() == "X" && botao[8].getText()== "X")
				||(botao[0].getText() == "X" && botao[3].getText() == "X" && botao[6].getText()== "X")
				||(botao[2].getText() == "X" && botao[5].getText() == "X" && botao[8].getText()== "X")
				||(botao[0].getText() == "X" && botao[4].getText() == "X" && botao[8].getText()== "X")
				||(botao[6].getText() == "X" && botao[4].getText() == "X" && botao[2].getText()== "X")){
			JOptionPane.showMessageDialog(null, "O Jogador que escolheu 'X' Ganhou!");
			limpar();
		} else if((botao[0].getText() == "O" && botao[1].getText() == "O" && botao[2].getText()== "O")
				||(botao[3].getText() == "O" && botao[4].getText() == "O" && botao[5].getText()== "O")
				||(botao[6].getText() == "O" && botao[7].getText() == "O" && botao[8].getText()== "O")
				||(botao[0].getText() == "O" && botao[3].getText() == "O" && botao[6].getText()== "O")
				||(botao[0].getText() == "O" && botao[4].getText() == "O" && botao[8].getText()== "O")
				||(botao[6].getText() == "O" && botao[4].getText() == "O" && botao[2].getText()== "O")){
			JOptionPane.showMessageDialog(null, "O Jogador que escolheu 'O' Ganhou!");
			limpar();
		//esse Else If verifica se todos os botões foram precionados se sim monsta a mensagem que deu velha
		} else if(cont == 9) {
			JOptionPane.showMessageDialog(null, "Ops deu velha!");
			limpar();
		}
	}
	//Esse metodo faz com que limpe a jogada ao finaliza
	public void limpar() {
		for (int i = 0; i<9; i++) {
			botao[i].setText("");
			click[i] = false;
		}
	}
	public static void main(String[] args) {
		
		new JogodaVelha();
	}

}

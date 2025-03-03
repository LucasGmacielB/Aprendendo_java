package Teste;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Teste {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Minha janela");
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setSize(500, 500);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setLayout(null);

        JButton botao = new JButton("Me clique");
        botao.setBounds(225, 225, 150, 50);
        //aqui está sendo criado uma nova classe "new" porém ela esta sendo adicionao direto no setFont ou em outros, eu tambem poderia declarar uma variável com essa classe e apenas adicionar ela direto no setFont// 
        botao.setFont(new Font("Arial", Font.BOLD, 20));
        Color cor1 = new Color(237, 241 ,248);
        Color cor2 = new Color(9, 10, 9);
        botao.setForeground(cor1);
        botao.setBackground(cor2);

        JButton botao2 = new JButton("Me clique");
        botao2.setBounds(10, 20, 150, 50); 
        botao2.setFont(new Font("Arial", Font.BOLD, 20));
        Color cor3 = new Color(200, 200 ,230);
        Color cor4 = new Color(9, 10, 9);
        botao2.setForeground(cor3);
        botao2.setBackground(cor4);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("voce clicou");
            }
        });


        janela.add(botao2) ;
        janela.add(botao) ;

    }
}
package view;

import java.awt.event.ActionListener;
import javax.swing.*;

/*import controller.controla;
import controller.controla.setBotaoListener;
import model.vo;*/

public class executa {
    private JFrame frame;
    private JTextField nome;
    private JTextField sobrenome;
    private JButton botao;

    public void UserView() {
        frame = new JFrame("Saudação");
        nome = new JTextField(20);
        sobrenome = new JTextField(20);
        botao = new JButton("Saudar");

        // Configurar a interface gráfica, adicionar campos de texto, botão e lidar com eventos aqui.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public String getNome() {
        return nome.getText();
    }

    public String getSobrenome() {
        return sobrenome.getText();
    }

    public void setBotaoListener(ActionListener listener) {
    	botao.addActionListener(listener);
    }
    

}
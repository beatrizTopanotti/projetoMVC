package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.vo;
import view.executa;

public class controla {
    public class setBotaoListener {

	}

	private vo model;
    private executa view;

    public controla(vo model, executa view) {
        this.model = model;
        this.view = view;

        // Adicionar ação ao botão no construtor.
        view.setBotaoListener(new setBotao());
    }

    class setBotao implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.setNome(view.getNome());
            model.setSobrenome(view.getSobrenome());

            String nomeCompleto = model.getNomeCompleto();
			JOptionPane.showMessageDialog(null, "Olá, " + nomeCompleto + "!");
        }
    }
    

}
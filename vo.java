
package model;

import controller.controla;
import view.executa;

public class vo {
    private String nome;
    private String sobrenome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

}
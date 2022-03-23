/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author User
 */
public class Aluno {
    private String nome;
    private int ra;
    private char sexo;
    private String rg;
    private String cpf;

    public Aluno(String nome, int ra, char sexo, String rg, String cpf) {
        this.nome = nome;
        this.ra = ra;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
    }
      
   

    public String getNome() {
        return nome;
    }

    public int getRa() {
        return ra;
    }

    public char getSexo() {
        return sexo;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
  
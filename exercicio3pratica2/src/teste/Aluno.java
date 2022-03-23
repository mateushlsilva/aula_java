
package teste;

public class Aluno {
    private String nome;
    private int ra;
    private char sexo;
    private String rg;
    private String cpf;
    private Data dataNascimento;

    public Aluno(String nome, int ra, char sexo, String rg, String cpf, Data dataNascimento) {
        this.nome = nome;
        this.ra = ra;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Data getDataNascimento() {
        return dataNascimento;
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
    public void imprimir(){
        System.out.println(ra);
        System.out.println(nome);
        System.out.println(sexo);
        System.out.println(rg);
        System.out.println(cpf);
        System.out.println(dataNascimento.formatarData());
    }
    
}
  
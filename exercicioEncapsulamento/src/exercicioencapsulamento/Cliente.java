
package exercicioencapsulamento;

public class Cliente {
    private String nome;
    private String dataNascimento;
    private char sexo;
    private String rg;
    private String cpf;
    
    public Cliente (String nome, String dataNascimento, char sexo, String rg, String cpf){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
   
    public String getDataNascimento() {
        return dataNascimento;
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
    
    
    public void setNome(String n) {
        nome=n;
    }
    
    public void setDataNascimento(String data) {
        dataNascimento=data;
    }
    
    public void setSexo(char s) {
        sexo=s;
    }
    
    public void setRg(String Rg) {
        rg=Rg;
    }
    
    public void setCpf(String Cpf) {
        cpf=Cpf;
    }
    
}


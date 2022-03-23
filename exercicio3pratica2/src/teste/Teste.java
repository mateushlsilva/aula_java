
package teste;


public class Teste {

    public static void main(String[] args) {
        Data data = new Data(10,10,1990);
        Aluno cli = new Aluno("Dionisio", 2543823, 'M', "573666212312", "470321141122",data );
        cli.imprimir();

    }

}

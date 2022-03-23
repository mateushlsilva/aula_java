/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

/**
 *
 * @author User
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno cli = new Aluno("Dionisio",2543823,'M',"573666212312","470321141122") ;
        System.out.println(cli.getRa());
        System.out.println(cli.getNome());
        System.out.println(cli.getSexo());
        System.out.println(cli.getRg());
        System.out.println(cli.getCpf());

    }

}

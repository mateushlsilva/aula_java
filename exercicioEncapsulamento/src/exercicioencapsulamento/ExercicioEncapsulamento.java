
package exercicioencapsulamento;

public class ExercicioEncapsulamento {

    
    public static void main(String[] args) {
        Cliente novo=new Cliente("Mateus", "2003/09/20", 'M', "3593993953", "2782742744");
        System.out.println(novo.getNome());
        System.out.println(novo.getDataNascimento());
        System.out.println(novo.getSexo());
        System.out.println(novo.getRg());
        System.out.println(novo.getCpf());
    }
    
}



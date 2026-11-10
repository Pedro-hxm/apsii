public class Principal {

    public static void main(String[] args){

        Banco b1 = new Banco("José", "090909", 0000.1);

        System.out.println(b1.getNome());
        b1.setNome("GUILHERME");
        System.out.println(b1.getNome());

    }

}

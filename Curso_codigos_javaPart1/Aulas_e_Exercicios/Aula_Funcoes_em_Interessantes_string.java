package Curso_codigos_javaPart1.Aulas_e_Exercicios;

public class Aula_Funcoes_em_Interessantes_string {
    public static void main(String[] args) {
        String original = "abcde FGHIj ABC abc DEFG     ";

        String s01 = original.toLowerCase(); //Deixa tudo em minusculo.
        String s02 = original.toUpperCase(); //Deixa tudo em maisculo.
        String s03 = original.trim(); //Remove os espaços do final
        String s04 = original.substring(2); //Monta a string após o valor informado.
        String s05 = original.substring(2, 9); //Monta a string após o valor informado e acaba no valor informado.
        String s06 = original.replace( 'a', 'x'); //Substitui a letra informada pela letra escolhida sempre que a letra informada aparecer.
        String s07 = original.replace("abc", "xy"); //Substitui o sub String por outro quando encontrado.
        int i = original.indexOf("bc"); //Mostra o primeiro valor onde oque foi pedido foi encontrado
        int j = original.lastIndexOf("bc"); //Mostra o ultimo valor onde oque foi pedido foi encontrado

        System.out.println("Original = -"+ original + "-");
        System.out.println("LowerCase = -"+ s01 + "-");
        System.out.println("UpperCase = -"+ s02 + "-");
        System.out.println("trim = -" + s03 + "-");
        System.out.println("Substring (2) = -" + s04 + "-");
        System.out.println("Substring (2, 9) = -" + s05 + "-");
        System.out.println("Replace (a, x) = -" + s06 + "-");
        System.out.println("Replace (abc, xy) = -" + s07 + "-");
        System.out.println("indexOf (bc) = -|" + i + "|-");
        System.out.println("lastindexOf (bc) = -|" + j + "|-");
        System.out.println();

        System.out.println("-------- Aula part 2 split");
        System.out.println();

        String s = "Potato apple lemon";

        String[] vect = s.split(" "); //Faz uma separaçao com o argumento informado nesse caso um espaço e armazena em um vetor
        System.out.println( vect[0]); //Mostra oque foi armazenado na posiçao 0 do vetor
        System.out.println( vect[1]); //Mostra oque foi armazenado na posiçao 1 do vetor
        System.out.println( vect[2]); //Mostra oque foi armazenado na posiçao 2 do vetor

    }
}

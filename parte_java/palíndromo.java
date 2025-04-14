import java.util.Scanner;

public class palíndromo {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = input.nextLine();

        String palavraInvertida = "";

        /* Armazenar a palavra invertida percorrendo de tras
         * para frente!
         */
        for (int i = palavra.length() - 1;i >= 0; --i){
            palavraInvertida += palavra.charAt(i);
        }

        if (palavra.equalsIgnoreCase(palavraInvertida)){
            System.out.println("É um palíndromo!!");
        }else {
            System.out.println("Não é um palíndromo!!");
        }

    }
    
}

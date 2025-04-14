import java.util.Scanner;

public class contadorVogais {

    public static void main(String[] args){

        // Objeto Scanner para entrada de dados pelo teclado
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String frase = input.nextLine();


        int quantidadeVogais = contarVogais(frase);

        System.out.println("Quantidade vogais = " + quantidadeVogais);

        input.close();

    }

    public static int contarVogais(String frase) {

        int contador = 0;

        frase = frase.toLowerCase(); // Ignorar diferença entre maiúscula e minúscula

        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            }
        }
        return contador;

    }
    
}

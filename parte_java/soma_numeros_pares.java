public class soma_numeros_pares {

    public static void main(String[] args){

        int numeros[] = {1, 3, 5, 7};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
            }
        }

        System.out.println("Soma de pares igual a: " + soma);
    }
    
}

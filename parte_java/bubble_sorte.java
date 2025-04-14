public class App {
    public static void main(String[] args) {
      
        int vetor[] = {3,6,2,1,8,4};
        int aux;
        boolean controle;

        
        for(int i = 0; i < vetor.length; i++){
            /* O objetivo desse primeiro ciclo for é garantir que  esse processo que
            * iremos fazer internamente será feito baseado no tamanho do nosso vetor!!
            */
           // controle = true;
            for(int j = 0; j < (vetor.length - 1); j++){
                 /* Ja o objetivo do segundo ciclo for é comprar dois valores, que estão
                 * estão em dois endereços e baseado neles trocar ou não de posição!!
                 */
                //controle = true;
                if(vetor[j] < vetor[j + 1] ){
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    //controle = false;
                }

            }
            /*if(controle){
                break;
            }*/
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] + "");

        }
    }
}

def eh_palindromo(palavra):


    palavra_invertida = palavra[::-1]
    """
        Isso usa fatiamento de Strings (Slicing) com a
        sintaxe: string[inicio:fim:passo]

        palavra[::-1] quer dizer:
         * Começa do fim
         * Vai até o inicio
         * Pulando de -1 em -1 (ou seja , de trás para frente)
    """

    # Verificando se Strings são iguais ignorando maiúsculas e minúsculas
    if palavra.lower() == palavra_invertida.lower():
        print("# True ")
    else:
        print("# False ")

eh_palindromo("Ame a ema")
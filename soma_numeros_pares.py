def soma_pares(lista):
    """
        Recebe uma lista de números inteiros e retorna a soma dos números pares.
    """
    
    soma = 0

    for numero in lista:
        if numero % 2 == 0: # Verifica se o número é par
            soma += numero
    return soma

somaTotal1 = soma_pares([1, 2, 3, 4, 5, 6])
somaTotal2 = soma_pares([10, 15, 22, 33])
somaTotal3 = soma_pares([])
somaTotal4 = soma_pares([1,3, 5, 7])

print(" # ", somaTotal1)
print(" # ", somaTotal2)
print(" # ", somaTotal3)
print(" # ", somaTotal4)
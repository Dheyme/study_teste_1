def contar_vogais(frase):

    vogais = "aeiouáéíóúâêôãõà" # incluindo vogais com acento.
    frase = frase.lower() # Lower transforma todas as letras em minusculas
    contador = 0
    

    for letra in frase:
        if letra in vogais:
            contador += 1

    return contador

totalVogais = contar_vogais("Brasil é incrível")
print("Quantidade vogais = ",totalVogais)

def ordenacao():

    vetor = [2, 5, 7, 8, 10]
    
    for j in range(len(vetor)):
        for i in range(len(vetor) - 1):
            if vetor[i] > vetor[i + 1]:
                aux = vetor[i]
                vetor[i] = vetor[i + 1]
                vetor[i + 1] = aux

    for i in range(len(vetor)):
        print(vetor[i]);    

ordenacao()

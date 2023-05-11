def contarLETRASMAIUSCULAS(palavra):
    vogais = "aeiouAEIOU"
    totalLETRASMAIUSCULAS = 0

    for LETRA in palavra:
        if LETRA in vogais:
            totalLETRASMAIUSCULAS += 1

    return totalLETRASMAIUSCULAS
print(contarLETRASMAIUSCULAS("AEIOU"))

__author__="Gustavo S´avio"

nome = input("Informe o seu nome: ")
notas = input("Infome as suas notas separadas por vírgulas ")
nota1, nota2, nota3 = notas.split(",")
 
print("A sua média é: ", (float(nota1) + float(nota2)) / 2)
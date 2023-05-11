nota1 = float(input("Informe a primeira nota: "))
nota2 = float(input("Informe a segunda nota: "))

def soma(prova1, prova2):
	nota3 = prova1 + prova2
	return nota3


if( ((nota1 + nota2) / 2) >= 7):
	print("Aprovado")
else:
	print("Reprovado")
	
resultado = soma(nota1,nota2)
print("Seu resultado: ", resultado)
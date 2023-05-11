opcao = ''
while opcao != '-1':
	nota1 = float(input('Infome a primeirs nota: '))
	nota2 = float(input('Infomea a segunda nota: '))
	
	print('A média do aluno é: ', (nota1 + nota2) / 2)
	
	opcao = input('Digite qualquer tecla para continuar e -1 para finalizar...')
''' etapa 03 '''
'''
#função
#soma:
def somar(valores):
	somatoria = 0
	
	for valor in valores:
		somatoria += valor
		
	return somatoria
	
lista = [3,4,5,6,7,8,9]
lista2 = [1,10]

resultado_somar_valores = somar(lista)
print(resultado_somar_valores)

resultado_somar_valores2 = somar(lista2)
print(resultado_somar_valores2)
'''

'''
#subtrair
def subtrair(valores):
	subtrair = 0
	
	for valor in valores:
		subtrair -= abs(valor)
		
	return subtrair
	
lista = [3,4,5,6,7,8,9]


resultado_subtrair_valores = subtrair(lista)
print(resultado_subtrair_valores)

'''

'''
#multiplicação

def multiplicar(valores):
	multiplicação = 1
	
	for valor in valores:
		multiplicação *= valor
		
	return multiplicação
	
lista = [3,4,5,6,7,8,9]
lista2 = [1,10]

resultado_multiplicar_valores = multiplicar(lista)
print(resultado_multiplicar_valores)

resultado_multiplicar_valores2 = multiplicar(lista2)
print(resultado_multiplicar_valores2)

'''
'''
# divisão

def dividir(valores):
	divisao = 1
	
	for valor in valores:
		divisao /= valor
		
	return divisao
	
lista = [3,4,5,6,7,8,9]
lista2 = [1,10]

resultado_dividir_valores = dividir(lista)
print(resultado_dividir_valores)

resultado_dividir_valores2 = dividir(lista2)
print(resultado_dividir_valores2)
'''

'''etapa 04 '''
def abrir_arquivo_leitura(nome):
	arquivo = None
	
	try:
		arquivo = open(nome, 'r', encoding='utf-8')
	except FileNotFoundError as e:
		print('arquivo não encontrado')
	
	return arquivo

abrir_arquivo_leitura('serven2.log')













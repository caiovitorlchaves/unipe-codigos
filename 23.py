nome = input("Informe o seu nome: ")
idade = int(input("Informe a sua idade: "))

if not (idade >= 17):
	print("teste")
	
if idade >= 17 and nome == "Caio":
	print("EI", nome, "Você possui", idade, "anos")
def qtd_vogais(texto):
	vogais = "aeiou"
	qtvogais = 0
	for v in texto:
		if v in vogais:
			qtvogais += 1
		
	return qtvogais
	
print(qtd_vogais("caio"))
def Maiscula_e_Minuscula(texto):

	count = [0,0]
	for letra in texto:
		count[0] +=1
	if letra.islower():
		counter[0] +=1
	elif letra.isupper():
		count[1] +=1
		
	return count
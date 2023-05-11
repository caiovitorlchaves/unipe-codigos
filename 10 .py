def converter(hora,minutos,segundos):
	hora *= (60*60)
	minutos *= 60
	
	return hora + minutos + segundos
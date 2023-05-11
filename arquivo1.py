arquivo = open('dados1.txt', 'w', encoding='UTF-8')
lista_nomes = ['\nCaio', '\nNeto', '\nVitor', '\nChaves']
lista_carros = ['\nonix', '\ncolbat','\ncruze','\ns10']

arquivo.write("iai ta ligado? \nsportv o canal campeão")


arquivo.writelines(lista_nomes)
arquivo.writelines(lista_carros)
arquivo.close()
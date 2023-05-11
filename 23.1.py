arquivo = open('arquivo.log','r', encoding='UTF-8')
warning = 0
info = 0
error = 0
sas = 0

for linha in arquivo.readlines()	:	
	if '[WARNING]' in linha:
		warning += 1
	elif '[ERROR]' in linha:
		error += 1
	elif '[INFO]' in linha:
		info += 1
	elif '[sas]' in linha:
		sas += 1

print('existem {0} warning'.format(warning))
print('existem {0} error'.format(error))
print('existem {0} info'.format(info))
print('existem {0} sas'.format(sas))
arquivo.close()
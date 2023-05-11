from tkinter import *

janela = Tk()
janela.title("Usuário")
janela["bg"] = "white"
janela.geometry("300x300+100+100")

Label_1 = Label(janela,text = "Name")
Entry_1 = Entry(janela)
Label_2 = Label(janela,text = "Passworld")
Entry_2 = Entry(janela)
Label_3 = Button(janela,text = "Entrar")
Entry_3 = Entry(janela)

Label_1.grid(row = 0)
Label_2.grid(row = 1)
Label_3.grid(row = 3,column = 1)

Entry_1.grid(row = 0, column = 1 )
Entry_2.grid(row = 1, column = 1 )
def acesso():
    print("Bem Vindo")


janela = Tk()

menu = Menu(janela)
janela.config(menu=menu)

subMenu = Menu(menu)

menu.add_cascade(label="File", menu=subMenu)
subMenu.add_command(label="New project..", command=acesso)
subMenu.add_command(label="Caio..", command=acesso)

subMenu.add_separator()

subMenu.add_command(label="Exit", command = acesso)

editMenu = Menu(menu)
menu.add_cascade(label="Edit", menu=editMenu)
editMenu.add_command(label="gooo", command=acesso)


janela.mainloop()

from tkinter import *

janela = Tk()
janela.title("Meu Aniversario")
janela["bg"] = "white"
janela.geometry("300x300+100+100")
Label_1 = Label(janela, text="Name")
Entry_1 = Entry(janela)
Label_2 = Label(janela, text="Passworld")
Entry_2 = Entry(janela)
Label_1.grid(row=0)
Label_2.grid(row=1)

Entry_1.grid(row=0, column=1)
Entry_2.grid(row=1, column=1)


def name(event):
    print("aceito")

botao1 = Button(janela, text="Entrar")
botao1.bind("<Button-1>", name)
botao1.pack()
janela.mainloop()
#drop down menu
from tkinter import *
from tkinter import Menu


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
#criando botoes

topFrame = Frame(janela)
topFrame.pack()
bottomFrame = Frame(janela)
bottomFrame.pack()
botton1 = Button(topFrame,text = "SIM", fg = "green")
botton2 = Button(topFrame,text = "NÃO", fg = "red")
botton1.pack(side = LEFT)
botton2.pack(side = LEFT)
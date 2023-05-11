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

file = open("mbu.txt","w")
file.write("Good Morning!!!\nMy name is Roshan")
file.close()
print("File created !!!")

file = open("mbu.txt","r")
print("File Content:\n",file.read())
file.close()
print("Reading a file")

import os
os.makedirs("Myfiles/Roshan",exist_ok=True)
print("Folder created!!!")

import shutil
source = "mbu.txt"
destination = "Myfiles/Roshan/mbu.txt"
shutil.move(source,destination)
print("Moved a file !!!")

#!/bin/bash
inte=0
user="hola"
contraseña=123

while [[ $inte<3 ]];do
echo "ingrese la contraseña, tiene 3 intentos"

echo "nombre?"
read nome 

echo "contraseña?"
read contra

if [[ $nome -eq $user ]] && [[ $contra -eq $contraseña ]];then
echo "correcto"
break
else
echo "incorrecto"
echo " "
((inte++))
fi
done

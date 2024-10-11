#!/bin/bash
echo "pone un numero"
read  chocho
 if (( $chocho>0  )) ; then
echo "es positivo"
 
elif (( $chocho<0 ));then
echo "es negativo"

else
echo "neutro"
fi


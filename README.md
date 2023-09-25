
# Bono parcial 

se modificó el proyecto para calcular:

- Sin

- Cos

- Determinar si una cadena es un palíndromo

- Retorna la maginitud de un vector real de dos dimensiones, es decir recibe dos parámetros reales.


**_El proyecto fue subido a Docker_**


# Como correrlo

Para correr el servidor se debe escribir el siguiente comando en cmd 

```
java -cp "target/classes:target/dependency/*" org.example.SparkWebServer
```


## funcion seno

Para correr las funciones se debe incluir el numero en el endpoint en este caso el numero a calcular el seno es *1*

![image](https://github.com/DanielBuilesG/BonoParcial/assets/73034258/09d6decf-f71a-41e8-b498-0ee75b4bd6a4)


## funcion coseno 

De la misma manera incluimos el numero al final del endpoint, en este caso al calcular el coseno de *10* da lo siguiente



![image](https://github.com/DanielBuilesG/BonoParcial/assets/73034258/8103d91a-8140-4968-8d25-5a889727a2c6)


## funcion palindromo 

Para correr la funcion es necesario escribirla de la siguiente manera  ``` http://localhost:4567/esPalindromo/hola ``` en este caso verificamos con la palabra *hola* y nos suelta que no es palindromo

![image](https://github.com/DanielBuilesG/BonoParcial/assets/73034258/cd127a15-39de-45fb-adb1-d83316a9e770)


Pero si intentamos con la palabra ana


![image](https://github.com/DanielBuilesG/BonoParcial/assets/73034258/28b3050a-fe19-4d44-b893-02220be9e75e)


Si es palindromo 

## funcion Magnitud de vector

Para usar la funcion seguimos el mismo principio pero esta vez en el endpoint escribimos el siguiente formato ```http://localhost:4567/magnitudVector/2/3``` en este caso tenemos que las dimenciones de este vector son *2* y *3*

![image](https://github.com/DanielBuilesG/BonoParcial/assets/73034258/a479658a-dd5c-41e9-a3ae-bf91d7c7f453)





# Pieza Industrial

## Descripción

Este programa implementa una clase `PiezaIndustrial` para controlar si una pieza fabricada cumple con la longitud estándar establecida. Se utiliza una tolerancia máxima de **0,5 mm**.

## Funcionamiento

La clase utiliza tres atributos privados:

* `codigoPieza`: identifica la pieza.
* `longitudMilimetros`: representa la longitud medida.
* `longitudEstandar`: representa la longitud que debería tener la pieza.

El constructor valida que ambas longitudes sean mayores que cero.

La clase contiene los siguientes métodos:

* `esAceptable()`: calcula la diferencia entre la longitud medida y la estándar. La pieza es aceptable si la diferencia es menor o igual a `0,5 mm`.
* `mostrarResultado()`: muestra los datos de la pieza y determina si es aceptable o no.

## Código de ejecución 

<img width="318" height="225" alt="image" src="https://github.com/user-attachments/assets/b85363d4-2a06-43cd-91d5-562d965a92bc" />


## Conceptos utilizados

* Clases y objetos
* Encapsulamiento
* Constructores
* Métodos
* Validación de datos
* Condicionales `if/else`
* Tipo `boolean`
* `Math.abs()`
* Tolerancia de medidas
* Excepciones `IllegalArgumentException`

Proceso sin_titulo
	Escribir "Introduce un número"
	Leer num1
	Escribir "Introduce un número"
	Leer num2
	Escribir "Introduce un número"
	Leer num3
	Si num1 > num2 Entonces
		Si num1 > num3 Entonces
			Escribir "El número mayor es " num1
		Sino
			Si num2 > num3 Entonces
				Escribir "El número mayor es " num2
			Sino
				Escribir "El número mayor es " num3
			Fin Si
		Fin Si
	Sino
		Si num2 > num3 Entonces
			Escribir "El número mayor es " num2
		Sino
			Si num3 > num2 Entonces
				Escribir "El número mayor es " num3
			Sino
				Escribir "El número mayor es " num2
			Fin Si
		Fin Si
		
	Fin Si
	Si num1 < num2 Entonces
		Si num1 < num3 Entonces
			Escribir "El número menor es " num1
		Sino
			Si num2 < num3 Entonces
				Escribir "El número menor es " num2
			Sino
				Escribir "El número menor es " num3
			Fin Si
		Fin Si
	Sino
		Si num2 < num3 Entonces
			Escribir "El número menor es " num2
		Sino
			Si num3 < num2 Entonces
				Escribir "El número menor es " num3
			Sino
				Escribir "El número menor es " num2
			Fin Si
		Fin Si
		
	Fin Si
	
FinProceso

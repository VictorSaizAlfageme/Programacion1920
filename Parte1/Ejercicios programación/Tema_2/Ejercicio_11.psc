Proceso sin_titulo
	Escribir "Introduce un n�mero"
	Leer num1
	Escribir "Introduce un n�mero"
	Leer num2
	Escribir "Introduce un n�mero"
	Leer num3
	Si num1 > num2 Entonces
		Si num1 > num3 Entonces
			Escribir "El n�mero mayor es " num1
		Sino
			Si num2 > num3 Entonces
				Escribir "El n�mero mayor es " num2
			Sino
				Escribir "El n�mero mayor es " num3
			Fin Si
		Fin Si
	Sino
		Si num2 > num3 Entonces
			Escribir "El n�mero mayor es " num2
		Sino
			Si num3 > num2 Entonces
				Escribir "El n�mero mayor es " num3
			Sino
				Escribir "El n�mero mayor es " num2
			Fin Si
		Fin Si
		
	Fin Si
	Si num1 < num2 Entonces
		Si num1 < num3 Entonces
			Escribir "El n�mero menor es " num1
		Sino
			Si num2 < num3 Entonces
				Escribir "El n�mero menor es " num2
			Sino
				Escribir "El n�mero menor es " num3
			Fin Si
		Fin Si
	Sino
		Si num2 < num3 Entonces
			Escribir "El n�mero menor es " num2
		Sino
			Si num3 < num2 Entonces
				Escribir "El n�mero menor es " num3
			Sino
				Escribir "El n�mero menor es " num2
			Fin Si
		Fin Si
		
	Fin Si
	
FinProceso

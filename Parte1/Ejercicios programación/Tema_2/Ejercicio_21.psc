Proceso sin_titulo
	Escribir "Introduce un número"
	Leer num

	Para x<-1 Hasta num Con paso 1 Hacer
		Si num%x=0 Entonces
			z <- z +1
			
		Fin Si
	Fin Para
	
	Si z = 2 Entonces
		Escribir "El número es primo"
	Sino
		Escribir "El número no es primo"
	Fin Si
	
FinProceso

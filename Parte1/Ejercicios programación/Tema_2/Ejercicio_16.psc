Proceso sin_titulo
	Escribir "Introduce la edad de un estudidante"
	Leer edad
	Repetir
		
		total <- total + edad
		x <- x+1
		Escribir "¿Quieres parar? S/N"
		Leer parar
		Si parar = "S" Entonces
			Escribir "La media es de " total / x
		Sino
			Escribir "Introduce la edad de un estudidante"
			Leer edad
		Fin Si
	Hasta Que parar = "S" 

	
FinProceso

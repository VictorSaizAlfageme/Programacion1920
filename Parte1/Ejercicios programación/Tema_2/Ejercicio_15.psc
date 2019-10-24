Proceso sin_titulo
	Escribir "Introduce las notas y cuando hayas apuntado todas, escribe 11"
	Leer nota
	Repetir
		
		Si nota >= 6 y nota <= 10 Entonces
			x <- x +1
		Sino
			z <- z +1
		Fin Si
		Escribir "¿Quieres parar? S/N"
		Leer parar
		Si parar = "S" Entonces
			Escribir "Han aprobado " x " personas"
		Sino
			Escribir "Introduce las notas y cuando hayas apuntado todas, escribe 11"
			Leer nota
		Fin Si
	Hasta Que parar = "S" 
	
FinProceso

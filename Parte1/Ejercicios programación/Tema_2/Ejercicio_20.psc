Proceso sin_titulo
	x <- azar(100)
	Repetir
	Escribir "�Qu� n�mero es?"
	Leer n
	
	Si n = x Entonces
		Escribir "Eres una bestia lo has acertado"
	Sino
		Escribir "El n�mero est� entre " x - azar(5) " y " x + azar(5)
		
	Fin Si
Hasta Que n = x
Escribir "FIN"
FinProceso

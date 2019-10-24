Proceso sin_titulo
	Escribir "Escribe la calificación"
	Leer nota
	Si nota >= 0 y nota <=10 Entonces
		
		Si nota >= 5 Entonces
			Escribir "Aprobado"
		Sino
			Escribir "Suspenso"
		Fin Si
	Sino
		Escribir "Introduce un valor valido"
	FinSi
	
FinProceso

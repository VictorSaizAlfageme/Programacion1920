Proceso ejercicio_20
	Definir num como entero
	
	Escribir "introduce un número"
	Leer num
	coc <- num-1
	Repetir
		x<-num%coc
		coc <- coc - 1
	Hasta Que x = 0 o coc=1
	Si coc = 1 y x = 0 Entonces
		Escribir "No es primo"
		
	Sino
		
		Si x=0 Entonces
			Escribir "No es primo"
		Sino
			Escribir "Es primo"
		Fin Si
		
		
	Fin Si

FinProceso

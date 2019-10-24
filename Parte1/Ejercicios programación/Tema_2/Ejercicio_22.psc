Proceso sin_titulo
	
	Escribir "introduce un número"
	Leer num
	
	
	Para a<-num Hasta 2 Con Paso -1 Hacer
		coc <- a-1
		Repetir
			x<-a%coc
			coc <- coc - 1
		Hasta Que x = 0 o coc=1
		Si coc = 1 y x = 0 Entonces
			b <- b
			
		Sino
			
			Si x=0 Entonces
				b <- b
			Sino
				Escribir a
			Fin Si
			
			
		Fin Si
		
	Fin Para
	Escribir "2"
	
	

	
FinProceso

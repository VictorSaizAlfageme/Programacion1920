Proceso ejer
	max <- 0
	min <- 3928490
	t   <- 0
	Repetir
		Escribir "Introduce al alumno"
		Leer alumno
		Escribir "Introduce la nota"
		Leer nota
		
		Si nota > max Entonces
			max <- nota
			maxalumno <- alumno
		Sino
			Si nota < min Entonces
				minnota <- nota
				minalumno <- alumno
			Fin Si
		Fin Si
		t <- t +1 
	Hasta Que t = 2
	Escribir "El/La alumn@ con la mayor nota y su nota es " maxalumno " " max
	Escribir "El/La alumn@ con la menor nota y su nota es " minalumno " " minnota
FinProceso

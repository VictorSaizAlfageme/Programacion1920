Proceso sin_titulo
	Escribir "Escribe la calificación en numeros naturales"
	Leer nota
	Segun nota Hacer
		0,1,2,3:
			Escribir "Muy deficiente"
		4:
			Escribir "Insuficiente"
		5:
			Escribir "Suficiente"
		6:
			Escribir "Bien"
		7,8:
			Escribir "Notable"
		9,10:
			Escribir "Sobresaliente"
		De Otro Modo:
			Escribir "El valor debe ser entre 0 y 10"
		Fin Segun
FinProceso

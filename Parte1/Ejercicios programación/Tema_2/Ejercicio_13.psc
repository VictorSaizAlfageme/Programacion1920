Proceso sin_titulo
	Escribir "Introduce los datos"
	Repetir
		Escribir "Introduce un alumno/a"
		Escribir "Peso: "
		Leer peso
		Escribir "Edad: "
		Leer edad
		Escribir "Nombre: "
		Leer nombre
		Escribir "Género: V o M"
		Leer genero
		Escribir "Estatura: Introducirlo en cm"
		Leer estatura
		Si genero = "V" Entonces
			Si estatura > 170 Entonces
				Si peso > 70 Entonces
					hombres <- hombres + nombre
				Sino
					nohombres <- nohombres+nombre
				Fin Si
			Sino
				nohombres <- nohmbres+nombre
			Fin Si
		Sino
			Si estatura > 160 Entonces
				Si peso > 60 Entonces
					mujeres <- mujeres+nombre
				Sino
					nomujeres <- nomujeres+nombre
					
				Fin Si
			Sino
				nomujeres <- nomujeres+nombre
			Fin Si
		Fin Si
		x <- x+1
	Hasta Que x = 30
	
	Escribir "Aptos: " hombres
	Escribir "Aptas: " mujeres
	Escribir "No aptos: " nohombres
	Escribir "No aptas: " nomujeres

FinProceso

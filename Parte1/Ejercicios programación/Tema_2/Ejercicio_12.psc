Proceso sin_titulo
	Escribir "Introduce el gasto mensual"
	Leer gasto
	Si gasto < 300 Entonces
		Escribir "El consumo es de " gasto * 0.04
	Sino
		Si gasto >= 300 y gasto < 500 Entonces
			Escribir "El consumo es de " gasto * 0.03
		Sino
			Si gasto < 800 Entonces
				Escribir "El consumo es de " 300 * 0.03 + ((gasto - 300)*0.02)
			Sino
				Escribir "El consumo es de " (300 * 0.03 + ((gasto - 300)*0.02)) - (((300 * 0.03 + ((gasto - 300)*0.02))*1.25)/100)
			Fin Si
		Fin Si
	Fin Si
FinProceso


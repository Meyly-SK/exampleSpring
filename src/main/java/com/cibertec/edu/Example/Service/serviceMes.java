package com.cibertec.edu.Example.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.edu.Example.Model.Mes;

@Service
public class serviceMes {
	private final List<Mes> meses = Arrays.asList(
            new Mes("Enero", 31),
            new Mes("Febrero", 28),
            new Mes("Marzo", 31),
            new Mes("Abril", 30),
            new Mes("Mayo", 31),
            new Mes("Junio", 30),
            new Mes("Julio", 31),
            new Mes("Agosto", 30),
            new Mes("Septiembre", 31),
            new Mes("Octubre", 30),
            new Mes("Noviembre", 31),
            new Mes("Diciembre", 30)
    );

    public int getDiasHastaMes(String nombreMes, int anio) {
        int dias = 0;
        boolean mesEncontrado = false;
        for (Mes mes : meses) {
            if (mesEncontrado) {
                break;
            }
            if (mes.getNombre().equals(nombreMes)) {
                mesEncontrado = true;
            }
            dias += mes.getDias();
        }
        if (nombreMes.equals("Febrero") && esAnioBisiesto(anio)) {
            dias++;
        }
        return dias - (mesEncontrado ? 0 : meses.get(meses.size() - 1).getDias());
    }

    private boolean esAnioBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}

package com.axceldev.banca_electronica.helper;
import java.util.Comparator;

import com.axceldev.banca_electronica.domain.Cuenta;


public class OrdenamientoCuentas implements Comparator<Cuenta> {


    @Override
    public int compare(Cuenta cuenta1, Cuenta cuenta2) {
        return cuenta1.getSaldo() > cuenta2.getSaldo() ? -1 : cuenta1.getSaldo() < cuenta2.getSaldo() ? 1 : 0;
    }


    // return cuenta1.getSaldo() > cuenta2.getSaldo() ? -1 : cuenta1.getSaldo() < cuenta2.getSaldo() ? 1 : 0; --> Mayor a menor
    // return cuenta1.getSaldo() > cuenta2.getSaldo() ? 1 : cuenta1.getSaldo() < cuenta2.getSaldo() ? -1 : 0; --> Menor a mayor
}

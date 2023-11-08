package thread;

import model.CuentaMultiplo;
import util.InterfazMultiplo;

public class HiloCuentaMultiplo{

    private InterfazMultiplo principal;
    private CuentaMultiplo cuentaMultiplo;

    public HiloCuentaMultiplo(InterfazMultiplo principal, CuentaMultiplo cuentaMultiplo){
        this.principal = principal;
        this.cuentaMultiplo = cuentaMultiplo;

    }

    public void run(){
        int cantidad = cuentaMultiplo.cuantosMultiplos();

        principal.imprimirCantidadMultiplos(cuentaMultiplo, cantidad);

    }
}

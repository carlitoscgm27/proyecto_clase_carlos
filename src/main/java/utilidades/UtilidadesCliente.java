package utilidades;

import modelos.Cliente;

public class UtilidadesCliente {
    public boolean esDniValido(Cliente cliente){

        //9 elementos
        //8--> numeros
        //9--> letras
        String dni = cliente.getDni();

        boolean tiene9caracteres = dni.length() == 9;
        boolean tiene8PrimerosNumeros = dni.substring(0, 7).matches("[0-9]");
        boolean tieneUltimoElementoLetra = dni.substring(8).matches("[A-Za-z]");

        return  tiene9caracteres && tiene8PrimerosNumeros && tieneUltimoElementoLetra;
    }
}

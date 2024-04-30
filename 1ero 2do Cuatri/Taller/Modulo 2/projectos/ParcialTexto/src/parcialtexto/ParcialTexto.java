/*
 Se desea representar un Banco. El Banco tiene su nombre, cantidad de empleados y la información 
 de sus cuentas (máximo N cuentas). De cada cuenta se conoce su CBU, alias, DNI del titular, moneda y 
 monto. Existen dos tipos de bancos: el tradicional que posee su dirección, localidad y cantidad de 
 cuentas en dólares abiertas y el digital que define su dirección web.

1- Genere las clases necesarias. Provea constructores para iniciar los objetos del modelo a partir 
 de la información necesaria. En particular, los bancos deben iniciarse para un máximo de N cuentas, 
 (inicialmente sin cuentas); el banco tradicional debe Iniciar con cantidad 0 de cuentas en dólares 
 abiertas; una cuenta debe iniciarse con monto en 0.

2- Implemente los métodos necesarios, en las clases que corresponda, para:

a) agregarCuenta: Agrega una cuenta al banco. Considerar que un banco tradicional puede tener un máximo 
 de 100 cuentas abiertas en dólares. El método debe retornar true si pudo agregarse y false en caso 
 contrario.

b) cotenerCuenta: Dado un CBU, obtener la cuenta con dicho CBU

c) depositar Dinero. Dado un CBU y un monto, incrementar el monto de la cuenta en dicha cantidad,

d) puede RecibirTarjetas Recibe un CBU y retorna si es posible asociarle una tarjeta de débito a la 
 cuenta. Este metodo retorna verdadero en las siguientes situaciones:

Si el banco es digital, la cuenta debe ser en pesos y su saldo superior a $100.000. la cuenta debe ser 
 en dólares o pesos. Si es en dólares, con saldo
 */
package parcialtexto;

/**
 *
 * @author Usuario
 */
public class ParcialTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

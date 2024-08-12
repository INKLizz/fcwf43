/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyect_1.pkg1;

import java.util.Scanner;

/**
 *
 * @author Laura Sabillon
 */
public class Sabillon_Cristina_BOLETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        //ASGINACIÓN        
        String ventana, destino = null;        
        String clase = null, clase_a = null, clase_b=null, clase_c=null, clase_d=null;
        
        int contador_reportes = 0, destino_a_negocio = 0, destino_a_turistica=0, 
                destino_b_negocio = 0, destino_b_turista=0 ,destino_c_negocio = 0, 
                destino_c_turista=0 ,destino_d_negocio = 0, destino_d_turistica=0, 
                contador_acceso_boletos = 0, contador_acceso_turistico = 0,
                precio = 0, boletos = 0, persona_paquete, descuento_detalle = 0, 
                paquete_a=0, paquete_b=0, paquete_c=0, paquete_d=0, paquetes=0,
                boletos_a=0, boletos_b=0, boletos_c=0, boletos_d=0, hotel_a=0, 
                hotel_b=0,hotel_c=0,hotel_d=0,auto_a=0,auto_b=0,auto_c=0, auto_d=0
                ,recorrido_a=0,recorrido_b=0,recorrido_c=0,recorrido_d=0, total_a=0, 
                total_b=0, total_c=0, total_d=0, subtotal_a=0,subtotal_b=0,subtotal_c=0,
                subtotal_d=0,descuento_a=0,descuento_b=0, descuento_b2=0, descuento_b3=0,
                descuento_c=0, descuento_c2=0,descuento_d=0,
                monto_a=0,monto_b=0,monto_c=0,monto_d=0;
        
        double subtotal = 0, descuento = 0, total;

        //MENU PRINCIPAL
        while (true) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("|                    *****MENU*****                        |");
            System.out.println("------------------------------------------------------------");
            System.out.println("| a. Venta de Boletos Aerios                               |");
            System.out.println("| b. Venta de Paquetes Turisticos                          |");
            System.out.println("| c. Reportes                                              |");
            System.out.println("| d. Salir del Sistema                                     |");
            System.out.println("------------------------------------------------------------");
            System.out.println("Escribir la letra (a,b,c,d) que corresponde a la opcion que quiere escoger.");

            ventana = scan.next();

            //Restricción
            while (!ventana.equalsIgnoreCase("a") && !ventana.equalsIgnoreCase("b")
                    && !ventana.equalsIgnoreCase("c") && !ventana.equalsIgnoreCase("d")) {
                System.out.println("ERROR. INGRESO INVALIDO. Intente de nuevo");
                ventana = scan.next();
            }

            //Menu de Boletos Aerios
            if (ventana.equalsIgnoreCase("a")) {
                System.out.println("\n------------------------------------------------------------------------------------------");
                System.out.println("|                         ***Venta de Boletos Aerios***                                   |");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("|  Destinos   |       Ciudad, Pais             |               Clase/Precios              |");
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("|  A        |  Ciudad de Mexico, Mexico      |       Negocio: L.8,000   Turista: L.5,500  |");
                System.out.println("|  B        |  San Jose, Costa Rica          |       Negocio: L.7,000   Turista: L.4,800  |");
                System.out.println("|  C        |  Medellin, Colombia            |       Negocio: L.11,200  Turista: L.8,00   |");
                System.out.println("|  D        |  Santaiago, Chile              |       Negocio: L.18,000  Turista: L.11,600 |");
                System.out.println(" -----------------------------------------------------------------------------------------");
                System.out.println("Escribir la letra (a,b,c,d) que corresponde a la opcion que quiere escoger.");
                System.out.println("Escibir 'e' para volver al menu.");

                contador_acceso_boletos++;

                //Input destino
                destino = scan.next();

                //RESTRICCION
                while (!destino.equalsIgnoreCase("a") && !destino.equalsIgnoreCase("b")
                        && !destino.equalsIgnoreCase("c") && !destino.equalsIgnoreCase("d") && !destino.equalsIgnoreCase("e")) {
                    System.out.println("ERROR. INGRESO INVALIDO.");
                    destino = scan.next();
                }

                //VOLVER AL MENU
                if (destino.equalsIgnoreCase("e")) {
                    continue;
                }

                //DESTINO A
                if (destino.equalsIgnoreCase("a")) {
                    
                    //SELECCIÓN NEGOCIO/TURISTA
                    System.out.println("\nEscoger la clase (Escribir Negocio o Turista) "
                            + "\nNegocio: L.8,000"
                            + "\nTurista: L.5,500");

                    clase = scan.next();
                    
                    //RESTRICCION
                    while (!clase.equalsIgnoreCase("negocio") && !clase.equalsIgnoreCase("turista")){
                        System.out.println("INGRESO INVALIDO. Intente de nuevo.");
                        clase = scan.next();
                    }
                    
                    if (clase.equalsIgnoreCase("Negocio")) {
                        precio = 8000;
                    } else if (clase.equalsIgnoreCase("Turista")) {
                        precio = 5500;
                    }
                    System.out.println("Favor ingresar la cantidad de boletos a comprar:");
                    
                    //RESTRICCION DE VALUE INCORRECTO
                    while (!scan.hasNextInt()) {
                        System.out.println("ERROR. INGRESO INVALIDO.");
                        scan.next();
                    } 
                    boletos = scan.nextInt();
                    
                    //BOLETOS RESTRICCIÓN
                    while (boletos <= 0 || boletos>150) {
                        System.out.println("ERROR. NUMERO DE BOLETOS INVALIDO. Intente de nuevo.");
                        boletos = scan.nextInt();
                    }
                    //CONTADOR DE BOLETOS
                    if (clase.equalsIgnoreCase("negocio") && boletos==boletos)
                        destino_a_negocio+=boletos;
                    else if (clase.equalsIgnoreCase("turista") && boletos==boletos){
                        destino_a_turistica +=boletos;
                    }
                    
                    
                    //DESTINO B
                } else if (destino.equalsIgnoreCase("b")) {
                    
                    System.out.println("\nEscoger la clase (Escribir Negocio o Turista) "
                            + "\nNegocio: L.7,000"
                            + "\nTursita: L. 4,800");
                    clase = scan.next();
                    while (!clase.equalsIgnoreCase("Negocio") && !clase.equalsIgnoreCase("Turista")) {
                        System.out.println("ERROR. INGRESO INVALIDO");
                        clase = scan.next();

                    }
                    if (clase.equalsIgnoreCase("Negocio")) {
                        precio = 7000;
                    } else if (clase.equalsIgnoreCase("Turista")) {
                        precio = 4800;
                    }
                    System.out.println("Favor ingresar la cantidad de boletos a comprar:");
                    while (!scan.hasNextInt()) {
                        System.out.println("ERROR. INGRESO INVALIDO.");
                        scan.next();
                    } 
                    boletos = scan.nextInt();
                    
                    //BOLETOS RESTRICCIÓN
                    while (boletos <= 0 || boletos > 150) {
                        System.out.println("ERROR. NUMERO DE BOLETOS INVALIDO. Intente de nuevo.");
                        boletos = scan.nextInt();
                    }
                    
                    //CONTADOR DE BOLETOS
                    if (clase.equalsIgnoreCase("negocio") && boletos==boletos)
                        destino_b_negocio+=boletos;
                    else if (clase.equalsIgnoreCase("turista") && boletos==boletos){
                        destino_b_turista+=boletos;
                    }

                    //DESTINO C
                } else if (destino.equalsIgnoreCase("c")) {
                    
                    
                    System.out.println("\nEscoger la clase (Escribir Negocio o Turista)"
                            + "\nNegocio: L.11,200"
                            + "\nTurista: L.8,000");
                    clase = scan.next();
                    while (!clase.equalsIgnoreCase("Negocio") && !clase.equalsIgnoreCase("Turista")) {
                        System.out.println("ERROR. INGRESO INVALIDO");
                        clase = scan.next();
                    }
                    if (clase.equalsIgnoreCase("Negocio")) {
                        precio = 7000;
                    } else if (clase.equalsIgnoreCase("Turista")) {
                        precio = 4800;
                    }
                    System.out.println("Favor ingresar la cantidad de boletos a comprar:");
                    while (!scan.hasNextInt()) {
                        System.out.println("ERROR. INGRESO INVALIDO.");
                        scan.next();
                    } 
                    boletos = scan.nextInt();
                     
                    //BOLETOS RESTRICCIÓN
                    while (boletos <= 0 || boletos > 150) {
                        System.out.println("ERROR. NUMERO DE BOLETOS INVALIDO. Intente de nuevo.");
                        boletos = scan.nextInt();
                    }
                    
                    //CONTADOR DE BOLETOS
                    if (clase.equalsIgnoreCase("negocio") && boletos==boletos){
                        destino_c_negocio += boletos;

                    }else if ( clase.equalsIgnoreCase("turista") && boletos==boletos){
                        destino_c_turista +=boletos;
                    }
                    

                    //DESTINO D
                } else if (destino.equalsIgnoreCase("d")) {
                    
                    System.out.println("\nEscoger la clase (Escribir Negocio o Turista)"
                            + "\nNegocio: L.18,000"
                            + "\nTurista: L.11,600");
                    clase = scan.next();
                    while (!clase.equalsIgnoreCase("Negocio") && !clase.equalsIgnoreCase("Turista")) {
                        System.out.println("ERROR. INGRESO INVALIDO");
                        clase = scan.next();

                    }
                    if (clase.equalsIgnoreCase("Negocio")) {
                        precio = 7000;
                    } else if (clase.equalsIgnoreCase("Turista")) {
                        precio = 4800;
                    }                 
                    
                    System.out.println("Favor ingresar la cantidad de boletos a comprar:");
                    while (!scan.hasNextInt()) {
                        System.out.println("ERROR. INGRESO INVALIDO.");
                        scan.next();
                    } 
                    boletos = scan.nextInt();
                                        
                    //BOLETOS RESTRICCIÓN
                    while (boletos <= 0 || boletos > 150) {
                        System.out.println("ERROR. NUMERO DE BOLETOS INVALIDO. Intente de nuevo.");
                        boletos = scan.nextInt();
                    }    
                    //CONTADOR DE BOLETOS
                    if (clase.equalsIgnoreCase("Negocio") && boletos==boletos){
                        destino_d_negocio += boletos;
                    }else if (clase.equalsIgnoreCase("Turista") && boletos==boletos){
                        destino_d_turistica += boletos;
                    }
                }

                //SUBTOTAL
                subtotal = precio * boletos;

                //DESCUENTO
                if (destino.equalsIgnoreCase("a") && boletos >= 3) {
                    descuento_detalle = 5;
                    descuento = subtotal * 0.05;
                    descuento_a ++;
                }
                if (destino.equalsIgnoreCase("b") && clase.equalsIgnoreCase("Negocio") && boletos <= 2) {
                    descuento_detalle = 10;
                    descuento = subtotal * 0.1;
                    descuento_b++;
                } else if (destino.equalsIgnoreCase("b") && clase.equalsIgnoreCase("Negocio") && boletos >= 3) {
                    descuento_detalle = 20;
                    descuento = subtotal * 0.2;
                    descuento_b2 ++;
                } else if (destino.equalsIgnoreCase("b") && clase.equalsIgnoreCase("Turista")) {
                    descuento_detalle = 5;
                    descuento = subtotal * 0.05; 
                    descuento_b3 ++;                        
                } else if (destino.equalsIgnoreCase("c") && clase.equalsIgnoreCase("Negocio")){
                    descuento_detalle = 0;
                    descuento = 0;
                    descuento_c ++;
                } else if (destino.equalsIgnoreCase("c") && clase.equalsIgnoreCase("Turista") && boletos >= 2) {
                    descuento_detalle = 15;
                    descuento = subtotal * 0.15;
                    descuento_c2 ++;                        
                } else if (destino.equalsIgnoreCase("d")) {
                    descuento_detalle = 0;
                    descuento = 0;
                    descuento_d++;
                }
                
                //TOTAL 
                total = subtotal - descuento;
                
                //CONTADOR PARA GRAFICOS
                if (destino.equalsIgnoreCase("a")){
                    subtotal_a += subtotal/1000;
                    monto_a = (int) (total/1000);
                }
                else if (destino.equalsIgnoreCase("b")){
                    subtotal_b += subtotal/1000;
                    monto_b = (int) (total/1000);
                }
                else if (destino.equalsIgnoreCase("c")){
                    subtotal_c += subtotal/1000;
                    monto_c += subtotal/1000;
                }
                else if (destino.equalsIgnoreCase("d")){
                    subtotal_d += subtotal/1000;
                    monto_d += subtotal/1000;
                }
                
                //PRINT
                System.out.println("     *****FACTURA*****        ");
                System.out.println("Destino Seleccionado: " + destino.toUpperCase());
                System.out.println("Clase seleccionado: " + clase.toUpperCase());
                System.out.println("Cantidad de Boletos: " + boletos);
                System.out.println("Subtotal: Lps." + subtotal);
                System.out.println("Descuento %" + descuento_detalle + " : Lps." + descuento);
                System.out.println("Total Neto a pagar: Lps." + total);
            }
    
            //ASIGNACIÓN
            String destino_2 = null;
            int personas = 0, boletos_gratis = 0, boletos_comprados = 0;
            String recorrido = null, renta_auto = null, aumentar = null;
            int boletos_comprados_precio = 0, boletos_total = 0, dias = 0, hotel = 0, renta_auto_precio = 0, recorrido_precio = 0, grupo_3 = 0, paquete = 0, extra_paquete = 0;
            double renta_extra = 0, renta_total = 0;

            //Ventana de Paquetes Turisticos
            if (ventana.equalsIgnoreCase("b")) {
                System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("|                                                 ****Ventana de Paquetes Turisitcos****                                                         |");
                System.out.println(" ------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("|                                       |           Incluye Servicios                                                                            |");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("| Destino  |  Pais, Ciudad              |  Boleto Aereo     Boleto Aereo (personas > 1) |   Hotel(3 personas max)  |  Renta de Auto |  Recorrido |");
                System.out.println("|    A     |  Ciudad de Mexico, Mexico  |  1 incluido        Lps. 5,500                 |     L. 5,500             |   L. 3,000     |  L. 1,800  |");
                System.out.println("|    B     |  San Jose, Costa Rica      |  1 incluido        Lps. 4,800                 |     L. 4,000             |   L. 2,500     |  L. 2,000  |");
                System.out.println("|    C     |  Medellin, Colombia        |  1 incluido        Lps. 8,000                 |     L. 4,800             |   L. 3,200     |  L. 3,000  |");
                System.out.println("|    D     |  Santiago, Chile           |  1 incluido        Lps. 11,600                |     L. 6,000             |   L. 3,500     |  L. 3,800  |");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Escribir la letra (a,b,c,d) que corresponde a la opcion que quiere escoger.");
                System.out.println("Escribir 'e' para volver al menu");

                contador_acceso_turistico++;

                destino_2 = scan.next();
                while (!destino_2.equalsIgnoreCase("a") && !destino_2.equalsIgnoreCase("b") && !destino_2.equalsIgnoreCase("c")
                        && !destino_2.equalsIgnoreCase("d") && !destino_2.equalsIgnoreCase("e")) {
                    System.out.println("ERROR. INGRESO INVALIDO.");
                    destino_2 = scan.next();
                }
                //VOLVER MENU
                if (destino_2.equalsIgnoreCase("e")) {
                    continue;
                }

                //DESTINO A           
                if (destino_2.equalsIgnoreCase("a")) {
                    System.out.println("Favor indicar la cantidad de personas que va a tomar el paquete turistico:");
                    
                    //RESTRICCION DE VALOR INCORRECTO
                    while (!scan.hasNextInt()) {
                        System.out.println("ERROR. INGRESO INVALIDO.");
                        scan.next();
                    } 
                    personas = scan.nextInt();
                    
                    while (personas <= 0 || personas > 150) {
                        System.out.println("ERROR. NUMERO DE PERSONAS INVALIDO. Intene de nuevo.");
                        personas = scan.nextInt();
                    }
                    //Paquetes
                    if (destino_2.equalsIgnoreCase("a")) {
                        paquetes = personas / 3;
                        if (personas % 3 != 0) {
                            paquetes++; 
                        }
                        paquete_a += paquetes;
                    }       
                    //BOLETOS
                    boletos_gratis = paquete_a;
                    boletos_comprados = personas - boletos_gratis; 
                    
                    boletos_total = boletos_comprados * boletos_comprados_precio;
                    boletos_a += boletos_total/1000;
                    

                    if (destino_2.equalsIgnoreCase("a")) {
                        boletos_comprados_precio = 5500;

                    } else if (destino_2.equalsIgnoreCase("b")) {
                        boletos_comprados_precio = 4800;

                    } else if (destino_2.equalsIgnoreCase("c")) {
                        boletos_comprados_precio = 8000;

                    } else if (destino_2.equalsIgnoreCase("d")) {
                        boletos_comprados_precio = 11600;
                    }


                    //RENTA
                    System.out.println("Favor indicar si desea utilizar el renta de auto (Si o No):");
                    renta_auto = scan.next();

                    //RESTRICCION
                    while (!renta_auto.equalsIgnoreCase("si") && !renta_auto.equals("no")) {
                        System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo");
                        renta_auto = scan.next();
                    }

                    //CONDICION RENTA AUTO
                    if (renta_auto.equalsIgnoreCase("si")) {
                        System.out.println("\nEl monto presentado en la tabla solo es valido para 5 dias en la renta del auto,"
                                + "si desea aumuentar los dias del alquiler le costara Lps.744.60 por dia extra.");
                        System.out.println("Desea aumento los dias? (Si o No)");
                        aumentar = scan.next();

                        //RESTRICCIONES
                        while (!aumentar.equalsIgnoreCase("si") && !aumentar.equalsIgnoreCase("no")) {
                            System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo.");
                            aumentar = scan.next();
                        }
                        if (aumentar.equalsIgnoreCase("si")) {
                            System.out.println("\nFavor escribir la cantidad de dias extra:");
                            dias = scan.nextInt();
                            renta_extra = (dias * 744.60);
                        } else if (aumentar.equalsIgnoreCase("no")) {
                            renta_extra = 0;
                        }
                    }

                    //RECORRIDO    
                    System.out.println("Favor indicar si desea utilizar el recorrido (Si o No) : ");
                    recorrido = scan.next();
                    while (!recorrido.equalsIgnoreCase("si") && !recorrido.equalsIgnoreCase("no")) {
                        System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo.");
                        recorrido = scan.next();
                    }

                    //RENTA=SI,RECORRIDO=NO
                    if (personas <= 3 && renta_auto.equalsIgnoreCase("si") && recorrido.equalsIgnoreCase("no")) {
                        hotel = 5500;
                        renta_auto_precio = 3000;
                        recorrido_precio = 0;
                        paquete = hotel + renta_auto_precio + recorrido_precio;
                    } //RENTA=NO, RECORRIDO=SI
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("no") && recorrido.equalsIgnoreCase("si")) {
                        hotel = 5500;
                        renta_auto_precio = 0;
                        recorrido_precio = 1800;
                        paquete = hotel + renta_auto_precio + recorrido_precio;

                    } //RENTA=SI, RECORRIDO=SI
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("si") && recorrido.equalsIgnoreCase("si")) {
                        hotel = 5500;
                        renta_auto_precio = 3000;
                        recorrido_precio = 1800;
                        paquete = hotel + renta_auto_precio + recorrido_precio;

                    } //RECORRIDO=NO, RENTA=NO
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("no") && recorrido.equalsIgnoreCase("no")) {
                        hotel = 5500;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                    }

                    //PERSONAS > 3, RECORRIDO = SI, RENTA = SI
                    if (personas > 3 && recorrido.equalsIgnoreCase("si") && renta_auto.equalsIgnoreCase("si")) {
                        hotel = boletos_gratis * 5500;
                        renta_auto_precio = boletos_gratis * 3000;
                        recorrido_precio = boletos_gratis * 1800;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;

                        //PERSONAS > 3, RECORRIDO = NO, RENTA = SI    
                    }
                    if (personas > 3 && recorrido.equalsIgnoreCase("no") && renta_auto.equalsIgnoreCase("si")) {
                        hotel = boletos_gratis * 5500;
                        renta_auto_precio = boletos_gratis * 3000;
                        recorrido_precio = 0;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }
                    //PERSONAS > 3, RECORRIDO = SI, RENTA = NO
                    if (personas > 3 && recorrido.equalsIgnoreCase("si") && renta_auto.equalsIgnoreCase("no")) {

                        hotel = boletos_gratis * 5500;
                        renta_auto_precio = 0;
                        recorrido_precio = boletos_gratis * 1800;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }

                    //PERSONAS > 3, RECORRIDO = NO, RENTA = NO
                    if (personas > 3 && recorrido.equalsIgnoreCase("no") && renta_auto.equalsIgnoreCase("no")) {
                        hotel = boletos_gratis * 5500;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }

                    //RENTA TOTAL
                    renta_total = renta_auto_precio + renta_extra;
                    hotel_a += hotel/1000;
                    auto_a += renta_total/1000;
                    recorrido_a += recorrido_precio/1000;
                }

                //DESTINO B
                if (destino_2.equalsIgnoreCase("b")) {
                    System.out.println("Favor indicar la cantidad de personas que va a tomar el paquete turistico:");
                    while (!scan.hasNextInt()) {
                        System.out.println("ERROR. INGRESO INVALIDO.");
                        scan.next();
                    } 
                    personas = scan.nextInt();
                    
                    while (personas <= 0 || personas > 150) {
                        System.out.println("ERROR. NUMERO DE PERSONAS INVALIDO. Intene de nuevo.");
                        personas = scan.nextInt();
                    }

                    //BOLETOS
                    boletos_gratis = personas / 3;
                    boletos_comprados = personas % 3;
                    if (boletos_comprados > 0) {
                        boletos_gratis += boletos_comprados / 2;
                    }
                    boletos_comprados = personas - boletos_gratis;

                    if (destino_2.equalsIgnoreCase("a")) {
                        boletos_comprados_precio = 5500;

                    } else if (destino_2.equalsIgnoreCase("b")) {
                        boletos_comprados_precio = 4800;

                    } else if (destino_2.equalsIgnoreCase("c")) {
                        boletos_comprados_precio = 8000;

                    } else if (destino_2.equalsIgnoreCase("d")) {
                        boletos_comprados_precio = 11600;
                    }
                    //Paquetes
                    if (destino_2.equalsIgnoreCase("b")) {
                        paquetes = personas / 3;
                        if (personas % 3 != 0) {
                            paquetes++; 
                        }
                        paquete_b += paquetes;
                    }                    

                    //BOLETOS TOTAL
                   if (personas == 1){
                        boletos_gratis = 1;
                        boletos_comprados =0;
                    }
                    if (personas ==4){
                        boletos_gratis = 2;
                        boletos_comprados =2;
                    }
                    boletos_total = boletos_comprados * boletos_comprados_precio;
                    boletos_b += boletos_total/1000;
  

                    //RENTA
                    System.out.println("Favor indicar si desea utilizar el renta de auto (Si o No):");
                    renta_auto = scan.next();

                    //RESTRICCION
                    while (!renta_auto.equalsIgnoreCase("si") && !renta_auto.equals("no")) {
                        System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo");
                        renta_auto = scan.next();
                    }

                    //CONDICION RENTA AUTO
                    if (renta_auto.equalsIgnoreCase("si")) {
                        System.out.println("\nEl monto presentado en la tabla solo es valido para 5 dias en la renta del auto,"
                                + "si desea aumuentar los dias del alquiler le costara Lps. 744.60 por dia extra.");
                        System.out.println("Desea aumento los dias? (Si o No)");
                        aumentar = scan.next();

                        //RESTRICCIONES
                        while (!aumentar.equalsIgnoreCase("si") && !aumentar.equalsIgnoreCase("no")) {
                            System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo.");
                            aumentar = scan.next();
                        }
                        if (aumentar.equalsIgnoreCase("si")) {
                            System.out.println("\nFavor escribir la cantidad de dias extra:");
                            dias = scan.nextInt();
                            renta_extra = (dias * 744.60);
                        } else if (aumentar.equalsIgnoreCase("no")) {
                            renta_extra = 0;
                        }
                    }

                    //RECORRIDO    
                    System.out.println("Favor indicar si desea utilizar el recorrido (Si o No) : ");
                    recorrido = scan.next();
                    while (!recorrido.equalsIgnoreCase("si") && !recorrido.equalsIgnoreCase("no")) {
                        System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo.");
                        recorrido = scan.next();
                    }

                    //RENTA=SI,RECORRIDO=NO
                    if (personas <= 3 && renta_auto.equalsIgnoreCase("si") && recorrido.equalsIgnoreCase("no")) {
                        hotel = 4000;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                        paquete = hotel + renta_auto_precio + recorrido_precio;
                    } //RENTA=NO, RECORRIDO=SI
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("no") && recorrido.equalsIgnoreCase("si")) {
                        hotel = 4000;
                        renta_auto_precio = 0;
                        recorrido_precio = 2000;
                        paquete = hotel + renta_auto_precio + recorrido_precio;

                    } //RENTA=SI, RECORRIDO=SI
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("si") && recorrido.equalsIgnoreCase("si")) {
                        hotel = 4000;
                        renta_auto_precio = 2500;
                        recorrido_precio = 2000;
                        paquete = hotel + renta_auto_precio + recorrido_precio;

                    } //RECORRIDO=NO, RENTA=NO
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("no") && recorrido.equalsIgnoreCase("no")) {
                        hotel = 4000;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                    }

                    //PERSONAS > 3, RECORRIDO = SI, RENTA = SI
                    if (personas > 3 && recorrido.equalsIgnoreCase("si") && renta_auto.equalsIgnoreCase("si")) {
                        hotel = boletos_gratis * 4000;
                        renta_auto_precio = boletos_gratis * 2500;
                        recorrido_precio = boletos_gratis * 2000;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;

                        //PERSONAS > 3, RECORRIDO = NO, RENTA = SI    
                    }
                    if (personas > 3 && recorrido.equalsIgnoreCase("no") && renta_auto.equalsIgnoreCase("si")) {
                        hotel = boletos_gratis * 4000;
                        renta_auto_precio = boletos_gratis * 2500;
                        recorrido_precio = 0;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }
                    //PERSONAS > 3, RECORRIDO = SI, RENTA = NO
                    if (personas > 3 && recorrido.equalsIgnoreCase("si") && renta_auto.equalsIgnoreCase("no")) {

                        hotel = boletos_gratis * 4000;
                        renta_auto_precio = 0;
                        recorrido_precio = boletos_gratis * 2000;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }

                    //PERSONAS > 3, RECORRIDO = NO, RENTA = NO
                    if (personas > 3 && recorrido.equalsIgnoreCase("no") && renta_auto.equalsIgnoreCase("no")) {
                        hotel = boletos_gratis * 4000;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }

                    //RENTA TOTAL
                    renta_total = renta_auto_precio + renta_extra;
                    hotel_b += hotel/1000;
                    auto_b += (int) (renta_total/1000);
                    recorrido_b += recorrido_precio/1000;
                }
                //DESTINO C
                if (destino_2.equalsIgnoreCase("c")) {
                    System.out.println("Favor indicar la cantidad de personas que va a tomar el paquete turistico:");
                    
                    //RESTRICCION DE VALOR INCORRECTO
                    while (!scan.hasNextInt()) {
                        System.out.println("ERROR. INGRESO INVALIDO.");
                        scan.next();
                    } 
                    personas = scan.nextInt();
                    
                    while (personas <= 0 || personas > 150) {
                        System.out.println("ERROR. NUMERO DE PERSONAS INVALIDO. Intene de nuevo.");
                        personas = scan.nextInt();
                    }

                    //BOLETOS
                    boletos_gratis = personas / 3;
                    boletos_comprados = personas % 3;
                    if (boletos_comprados > 0) {
                        boletos_gratis += boletos_comprados / 2;
                    }
                    boletos_comprados = personas - boletos_gratis;

                    if (destino_2.equalsIgnoreCase("a")) {
                        boletos_comprados_precio = 5500;

                    } else if (destino_2.equalsIgnoreCase("b")) {
                        boletos_comprados_precio = 4800;

                    } else if (destino_2.equalsIgnoreCase("c")) {
                        boletos_comprados_precio = 8000;

                    } else if (destino_2.equalsIgnoreCase("d")) {
                        boletos_comprados_precio = 11600;
                    }
                    //Paquetes
                    if (destino_2.equalsIgnoreCase("c")) {
                        paquetes = personas / 3;
                        if (personas % 3 != 0) {
                            paquetes++; 
                        }
                        paquete_c += paquetes;
                    }
                    
                    
                    //BOLETOS TOTAL
                   if (personas == 1){
                        boletos_gratis = 1;
                        boletos_comprados =0;
                    }
                    if (personas ==4){
                        boletos_gratis = 2;
                        boletos_comprados =2;
                    }
                    boletos_total = boletos_comprados * boletos_comprados_precio;
                    boletos_c += boletos_total/1000;

                    
                    //RENTA
                    System.out.println("Favor indicar si desea utilizar el renta de auto (Si o No):");
                    renta_auto = scan.next();

                    //RESTRICCION
                    while (!renta_auto.equalsIgnoreCase("si") && !renta_auto.equals("no")) {
                        System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo");
                        renta_auto = scan.next();
                    }

                    //CONDICION RENTA AUTO
                    if (renta_auto.equalsIgnoreCase("si")) {
                        System.out.println("\nEl monto presentado en la tabla solo es valido para 5 dias en la renta del auto,"
                                + "si desea aumuentar los dias del alquiler le costara Lps. 744.60 por dia extra.");
                        System.out.println("Desea aumento los dias? (Si o No)");
                        aumentar = scan.next();

                        //RESTRICCIONES
                        while (!aumentar.equalsIgnoreCase("si") && !aumentar.equalsIgnoreCase("no")) {
                            System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo.");
                            aumentar = scan.next();
                        }
                        if (aumentar.equalsIgnoreCase("si")) {
                            System.out.println("\nFavor escribir la cantidad de dias extra:");
                            dias = scan.nextInt();
                            renta_extra = (dias * 744.60);
                        } else if (aumentar.equalsIgnoreCase("no")) {
                            renta_extra = 0;
                        }
                    }

                    //RECORRIDO    
                    System.out.println("Favor indicar si desea utilizar el recorrido (Si o No) : ");
                    recorrido = scan.next();
                    while (!recorrido.equalsIgnoreCase("si") && !recorrido.equalsIgnoreCase("no")) {
                        System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo.");
                        recorrido = scan.next();
                    }

                    //RENTA=SI,RECORRIDO=NO
                    if (personas <= 3 && renta_auto.equalsIgnoreCase("si") && recorrido.equalsIgnoreCase("no")) {
                        hotel = 4800;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                        paquete = hotel + renta_auto_precio + recorrido_precio;
                    } //RENTA=NO, RECORRIDO=SI
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("no") && recorrido.equalsIgnoreCase("si")) {
                        hotel = 4800;
                        renta_auto_precio = 0;
                        recorrido_precio = 3000;
                        paquete = hotel + renta_auto_precio + recorrido_precio;

                    } //RENTA=SI, RECORRIDO=SI
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("si") && recorrido.equalsIgnoreCase("si")) {
                        hotel = 4800;
                        renta_auto_precio = 3200;
                        recorrido_precio = 3000;
                        paquete = hotel + renta_auto_precio + recorrido_precio;

                    } //RECORRIDO=NO, RENTA=NO
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("no") && recorrido.equalsIgnoreCase("no")) {
                        hotel = 4800;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                    }

                    //PERSONAS > 3, RECORRIDO = SI, RENTA = SI
                    if (personas > 3 && recorrido.equalsIgnoreCase("si") && renta_auto.equalsIgnoreCase("si")) {
                        hotel = boletos_gratis * 4800;
                        renta_auto_precio = boletos_gratis * 3200;
                        recorrido_precio = boletos_gratis * 3000;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;

                        //PERSONAS > 3, RECORRIDO = NO, RENTA = SI    
                    }
                    if (personas > 3 && recorrido.equalsIgnoreCase("no") && renta_auto.equalsIgnoreCase("si")) {
                        hotel = boletos_gratis * 4800;
                        renta_auto_precio = boletos_gratis * 3200;
                        recorrido_precio = 0;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }
                    //PERSONAS > 3, RECORRIDO = SI, RENTA = NO
                    if (personas > 3 && recorrido.equalsIgnoreCase("si") && renta_auto.equalsIgnoreCase("no")) {

                        hotel = boletos_gratis * 4800;
                        renta_auto_precio = 0;
                        recorrido_precio = boletos_gratis * 3000;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }

                    //PERSONAS > 3, RECORRIDO = NO, RENTA = NO
                    if (personas > 3 && recorrido.equalsIgnoreCase("no") && renta_auto.equalsIgnoreCase("no")) {
                        hotel = boletos_gratis * 4800;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }

                    //RENTA TOTAL
                    renta_total = renta_auto_precio + renta_extra;
                    hotel_c += hotel/1000;
                    auto_c += (int) (renta_total/1000);
                    recorrido_c += recorrido_precio/1000; 
                }
                //DESTINO D
                if (destino_2.equalsIgnoreCase("d")) {
                    System.out.println("Favor indicar la cantidad de personas que va a tomar el paquete turistico:");
                    
                    //VALOR INCORRECTO RESTRICCION
                    while (!scan.hasNextInt()) {
                        System.out.println("ERROR. INGRESO INVALIDO.");
                        scan.next();
                    } 
                    personas = scan.nextInt();
                    
                    while (personas <= 0 || personas > 150) {
                        System.out.println("ERROR. NUMERO DE PERSONAS INVALIDO. Intene de nuevo.");
                        personas = scan.nextInt();
                    }

                    //BOLETOS
                    boletos_gratis = personas / 3;
                    boletos_comprados = personas % 3;
                    if (boletos_comprados > 0) {
                        boletos_gratis += boletos_comprados / 2;
                    }
                    boletos_comprados = personas - boletos_gratis;

                    if (destino_2.equalsIgnoreCase("a")) {
                        boletos_comprados_precio = 5500;

                    } else if (destino_2.equalsIgnoreCase("b")) {
                        boletos_comprados_precio = 4800;

                    } else if (destino_2.equalsIgnoreCase("c")) {
                        boletos_comprados_precio = 8000;

                    } else if (destino_2.equalsIgnoreCase("d")) {
                        boletos_comprados_precio = 11600;
                    }
                    //Paquetes
                    if (destino_2.equalsIgnoreCase("d")) {
                        paquetes = personas / 3;
                        if (personas % 3 != 0) {
                            paquetes++; 
                        }
                        paquete_d += paquetes;
                    }
                    
                    
                    //BOLETOS TOTAL
                   if (personas == 1){
                        boletos_gratis = 1;
                        boletos_comprados =0;
                    }
                    if (personas ==4){
                        boletos_gratis = 2;
                        boletos_comprados =2;
                    }
                    boletos_total = boletos_comprados * boletos_comprados_precio;
                    boletos_d += boletos_total/1000;
                    
                    //RENTA
                    System.out.println("Favor indicar si desea utilizar el renta de auto (Si o No):");
                    renta_auto = scan.next();

                    //RESTRICCION
                    while (!renta_auto.equalsIgnoreCase("si") && !renta_auto.equals("no")) {
                        System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo");
                        renta_auto = scan.next();
                    }

                    //CONDICION RENTA AUTO
                    if (renta_auto.equalsIgnoreCase("si")) {
                        System.out.println("\nEl monto presentado en la tabla solo es valido para 5 dias en la renta del auto,"
                                + "si desea aumuentar los dias del alquiler le costara Lps. 744.60 por dia extra.");
                        System.out.println("Desea aumento los dias? (Si o No)");
                        aumentar = scan.next();

                        //RESTRICCIONES
                        while (!aumentar.equalsIgnoreCase("si") && !aumentar.equalsIgnoreCase("no")) {
                            System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo.");
                            aumentar = scan.next();
                        }
                        if (aumentar.equalsIgnoreCase("si")) {
                            System.out.println("\nFavor escribir la cantidad de dias extra:");
                            dias = scan.nextInt();
                            renta_extra = (dias * 744.60);
                        } else if (aumentar.equalsIgnoreCase("no")) {
                            renta_extra = 0;
                        }
                    }

                    //RECORRIDO    
                    System.out.println("Favor indicar si desea utilizar el recorrido (Si o No) : ");
                    recorrido = scan.next();
                    while (!recorrido.equalsIgnoreCase("si") && !recorrido.equalsIgnoreCase("no")) {
                        System.out.println("ERROR.INGRESO INVALIDO. Intente de nuevo.");
                        recorrido = scan.next();
                    }

                    //RENTA=SI,RECORRIDO=NO
                    if (personas <= 3 && renta_auto.equalsIgnoreCase("si") && recorrido.equalsIgnoreCase("no")) {
                        hotel = 6000;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                        paquete = hotel + renta_auto_precio + recorrido_precio;
                    } //RENTA=NO, RECORRIDO=SI
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("no") && recorrido.equalsIgnoreCase("si")) {
                        hotel = 6000;
                        renta_auto_precio = 0;
                        recorrido_precio = 3800;
                        paquete = hotel + renta_auto_precio + recorrido_precio;

                    } //RENTA=SI, RECORRIDO=SI
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("si") && recorrido.equalsIgnoreCase("si")) {
                        hotel = 6000;
                        renta_auto_precio = 3500;
                        recorrido_precio = 3800;
                        paquete = hotel + renta_auto_precio + recorrido_precio;

                    } //RECORRIDO=NO, RENTA=NO
                    else if (personas <= 3 && renta_auto.equalsIgnoreCase("no") && recorrido.equalsIgnoreCase("no")) {
                        hotel = 6000;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                    }

                    //PERSONAS > 3, RECORRIDO = SI, RENTA = SI
                    if (personas > 3 && recorrido.equalsIgnoreCase("si") && renta_auto.equalsIgnoreCase("si")) {
                        hotel = boletos_gratis * 6000;
                        renta_auto_precio = boletos_gratis * 3500;
                        recorrido_precio = boletos_gratis * 3800;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;

                        //PERSONAS > 3, RECORRIDO = NO, RENTA = SI    
                    }
                    if (personas > 3 && recorrido.equalsIgnoreCase("no") && renta_auto.equalsIgnoreCase("si")) {
                        hotel = boletos_gratis * 6000;
                        renta_auto_precio = boletos_gratis * 3500;
                        recorrido_precio = 0;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }
                    //PERSONAS > 3, RECORRIDO = SI, RENTA = NO
                    if (personas > 3 && recorrido.equalsIgnoreCase("si") && renta_auto.equalsIgnoreCase("no")) {

                        hotel = boletos_gratis * 6000;
                        renta_auto_precio = 0;
                        recorrido_precio = boletos_gratis * 3800;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }

                    //PERSONAS > 3, RECORRIDO = NO, RENTA = NO
                    if (personas > 3 && recorrido.equalsIgnoreCase("no") && renta_auto.equalsIgnoreCase("no")) {
                        hotel = boletos_gratis * 6000;
                        renta_auto_precio = 0;
                        recorrido_precio = 0;
                        extra_paquete = hotel + renta_auto_precio + recorrido_precio;
                    } else {
                        extra_paquete = 0;
                    }

                    //RENTA TOTAL
                    renta_total = renta_auto_precio + renta_extra;
                    hotel_d += hotel/1000;
                    auto_d += (int) (renta_total/1000);
                    recorrido_d += recorrido_precio/1000;
                }
                //TOTAL
                total = boletos_total + hotel + renta_total + recorrido_precio;
                
                //CONTADORES DE MONTOS TOTALES
                if (destino_2.equalsIgnoreCase("a")){
                    total_a +=total/1000;
                }
                if (destino_2.equalsIgnoreCase("b")){
                    total_b +=total/1000;
                }                
                if (destino_2.equalsIgnoreCase("c")){
                    total_c +=total/1000;
                }
                if (destino_2.equalsIgnoreCase("d")){
                    total_d +=total/1000;
                }                           
                
                //RESULTADO FACTURA
                System.out.println("\n*********FACTURA**********");
                System.out.println("Destino: " + destino_2.toUpperCase());
                System.out.println("Cantidad de Paquetes: " + paquetes);
                System.out.println("Boletos gratis por pasajero: " + boletos_gratis);
                System.out.println("Boletos comprados por pasajero : " + boletos_comprados);
                System.out.println("Costo por boletos aereos: Lps." + boletos_total);
                System.out.println("Costo por hotel: Lps." + hotel);
                System.out.println("Costo por renta de auto: Lps." + renta_total);
                System.out.println("Costo por recorrido: Lps." + recorrido_precio);
                System.out.println("Monto total: Lps." + total);
            }

            //ASIGNACIÓN
            String reportes = null;

            if (ventana.equalsIgnoreCase("c")) {
                
                //CONTADOR DE ACCESO
                contador_reportes++;
                
                System.out.println("\n--------------------------------------------------------------------------------------");
                System.out.println("|         ******Reportes******                                                      |");
                System.out.println("|-----------------------------------------------------------------------------------|");
                System.out.println("| a. Reporte de reserva de boletos Aereos                                           |");
                System.out.println("| b. Subtotal descuentos aplicados y total pagados de la reserva de boletos         |");
                System.out.println("| c. Reporte de ventas de paquetes turisticos detallado                             |");
                System.out.println("| d. Reporte de accesos                                                             |");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Escribir la letra (a,b,c,d) que corresponde a la opcion que quiere escoger.");
                System.out.println("Escribir 'e' para volver al menu ");
                reportes = scan.next();

                while (!reportes.equalsIgnoreCase("a") && !reportes.equalsIgnoreCase("b") && !reportes.equalsIgnoreCase("c")
                         && !reportes.equalsIgnoreCase("e") && !reportes.equalsIgnoreCase("d")) {
                    System.out.println("ERROR. INGRESO INVALIDO. Intente de nuevo.");
                    reportes = scan.next();
                }
                
                //VOLVER MENU
                if (reportes.equalsIgnoreCase("e")) {
                    continue;
                }
                
                //REPORTES DE RESERVA DE BOLETOS AEREOS
                if (reportes.equalsIgnoreCase("a")) {
                    System.out.print("\nReporte de reserva de boletos Aereos");
                    System.out.print("\n------------------------------------------------------------------");
                    System.out.print("\n| Destino: | Destino A | Clase: Negocion   | Boletos: |");
                    for (int boleto_a = 0 ; boleto_a < destino_a_negocio ; boleto_a++){
                        System.out.print(" *");
                    }
                    System.out.print("\n-----------------------------------------------------------------");
                    System.out.print("\n| Destino: | Destino A | Clase: Turistica  | Boletos: |");
                    for (int boleto_a = 0 ; boleto_a < destino_a_turistica ; boleto_a++){
                        System.out.print(" *");
                    }
                    System.out.print("\n-----------------------------------------------------------------");
                    System.out.print("\n| Destino: | Destino B | Clase: Turistica  | Boletos: |");
                    for (int boleto_b = 0 ; boleto_b < destino_b_turista ; boleto_b++){
                        System.out.print(" *");
                    }
                    System.out.print("\n-----------------------------------------------------------------");
                    System.out.print("\n| Destino: | Destino B | Clase: Negocio    | Boletos: |");
                    for (int boleto_b = 0 ; boleto_b < destino_b_negocio ; boleto_b++){
                        System.out.print(" *");
                    }
                    System.out.print("\n-----------------------------------------------------------------");
                    System.out.print("\n| Destino: | Destino C | Clase: Negocio    | Boletos: |");
                    for (int boleto_c= 0 ; boleto_c < destino_c_negocio ; boleto_c++){
                        System.out.print(" *");
                    }   
                    System.out.print("\n-----------------------------------------------------------------");
                    System.out.print("\n| Destino: | Destino C | Clase: Turistica  | Boletos: |");
                    for (int boleto_c= 0 ; boleto_c < destino_c_turista ; boleto_c++){
                        System.out.print(" *");
                    }          
                    System.out.print("\n-----------------------------------------------------------------");
                    System.out.print("\n| Destino: | Destino D | Clase: Negocio    | Boletos: |");
                    for (int boleto_d = 0 ; boleto_d < destino_d_negocio ; boleto_d++){
                        System.out.print(" *");
                    }    
                    System.out.print("\n------------------------------------------------------------------");
                    System.out.print("\n| Destino: | Destino D | Clase: Turistica  | Boletos: |");
                    for (int boleto_d = 0 ; boleto_d < destino_d_turistica ; boleto_d++){
                        System.out.print(" *");
                    }  
                    System.out.print("\n--------------------------------------------------------------------");
                    System.out.println("\nEl '*' representa la cantidad de boletos comprados por destion y clase.");

                }
                //Subtotal descuentos aplicados y total pagados
                if(reportes.equalsIgnoreCase("b")){
                    System.out.print("\nSubtotal descuentos aplicados y total pagados de la Reserva de boletos");
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\nDestino A");
                    System.out.print("\nSubtotal: ");
                    for (subtotal = 0; subtotal < subtotal_a ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\nDescuentos: ");
                    System.out.print("\n5%  : ");
                    for (descuento = 0; descuento < descuento_a ; descuento++){
                        System.out.print(" *");
                    }
                    System.out.print("\nTotal Pagado: "); 
                    for (subtotal = 0; subtotal < monto_a ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\nDestino B");
                    System.out.print("\nSubtotal: ");
                    for (subtotal = 0; subtotal < subtotal_b ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\nDescuentos: ");
                    System.out.print("\n5%  : ");
                    for (subtotal = 0; subtotal < descuento_b3 ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\n10% : ");
                    for (subtotal = 0; subtotal < descuento_b ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\n20% : ");
                    for (subtotal = 0; subtotal < descuento_b2 ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\nTotal Pagado: "); 
                    for (subtotal = 0; subtotal < monto_b ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\nDestino C");
                    System.out.print("\nSubtotal: ");
                    for (subtotal = 0; subtotal < subtotal_c ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\nDescuentos: ");
                    System.out.print("\n15% : ");
                    for (subtotal = 0; subtotal < descuento_c ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\n0%  : ");
                    for (subtotal = 0; subtotal < descuento_c2 ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\nTotal Pagado: "); 
                    for (subtotal = 0; subtotal < monto_c ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\nDestino D");
                    System.out.print("\nSubtotal: ");
                    for (subtotal = 0; subtotal < subtotal_d ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\nDescuentos: ");
                    System.out.print("\n0%  : ");
                    for (subtotal = 0; subtotal < descuento_d; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\nTotal Pagado: "); 
                    for (subtotal = 0; subtotal < monto_d ; subtotal++){
                        System.out.print(" *");
                    }
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\nEl '*' representa Lps. 1000.");
                    System.out.println("\nEl '*' en Descuentos representan la cantidad de veces que se "
                            + "ha usado ese descuento.");
                }
                
                //REPORTES DE VENTAS DE PAQUETES DETALLADO
                if (reportes.equalsIgnoreCase("c")) {
                    
                    System.out.print("\n|Reportes de vetnas de paquetes turisticos detallado");
                    System.out.print("\n-------------------------------------------------------");
                    System.out.print("\n| Destino A");
                    System.out.print("\n| Pauqetes Turisticos :  ");
                    
                    for (paquete = 0; paquete < paquete_a ; paquete++){
                        System.out.print(" *");
                    }
                    System.out.print("\n| Boletos Aereos Pago : ");
                     for (int i = 0; i < boletos_a; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Hotel: ");
                     for (int i = 0; i < hotel_a; i++) {
                        System.out.print("*");
                    }
                     System.out.print("\n| Renta de Auto: ");
                     for (int i = 0; i < auto_a; i++) {
                        System.out.print("*");
                    }                    
                    System.out.print("\n| Recorrido: ");
                     for (int i = 0; i < recorrido_a; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Monto Total: ");  
                     for (int i = 0; i < total_a; i++) {
                        System.out.print("*");
                    }                    
                     
                    System.out.print("\n-------------------------------------------------------");
                    System.out.print("\n| Destino B");
                    System.out.print("\n| Pauqetes Turisticos :  ");
                    
                    for (paquete = 0; paquete < paquete_b ; paquete++){
                        System.out.print(" *");
                    }                    
                    System.out.print("\n| Boletos Aereos Pago : ");
                     for (int i = 0; i < boletos_b; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Hotel: ");
                     for (int i = 0; i < hotel_b; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Renta de Auto: ");
                     for (int i = 0; i < auto_b; i++) {
                        System.out.print("*");
                    }                    
                    System.out.print("\n| Recorrido: ");
                     for (int i = 0; i < recorrido_b; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Monto Total: ");  
                     for (int i = 0; i < total_b; i++) {
                        System.out.print("*");
                    }                    
                    System.out.print("\n-------------------------------------------------------");
                    System.out.print("\n| Destino C");
                    System.out.print("\n| Pauqetes Turisticos :  ");
                    
                    for (paquete = 0; paquete < paquete_c ; paquete++){
                        System.out.print(" *");
                    }
                    System.out.print("\n| Boletos Aereos Pago : ");
                     for (int i = 0; i < boletos_c; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Hotel: ");
                     for (double i = 0; i < hotel_c; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Renta de Auto: ");
                     for (int i = 0; i < auto_c; i++) {
                        System.out.print("*");
                    }                    
                    System.out.print("\n| Recorrido: ");
                     for (int i = 0; i < recorrido_c; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Monto Total: ");  
                     for (int i = 0; i < total_c; i++) {
                        System.out.print("*");
                    } 
                    System.out.print("\n-------------------------------------------------------");
                    System.out.print("\n| Destino D");
                    System.out.print("\n| Pauqetes Turisticos :  ");
                    
                    for (paquete = 0; paquete < paquete_d ; paquete++){
                        System.out.print(" *");
                    }
                    System.out.print("\n| Boletos Aereos : ");
                     for (int i = 0; i < boletos_d; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Hotel: ");
                     for (double i = 0; i < hotel_d; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Renta de Auto: ");
                     for (int i = 0; i < auto_d; i++) {
                        System.out.print("*");
                    }                    
                    System.out.print("\n| Recorrido: ");
                     for (int i = 0; i < recorrido_d; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n| Monto Total: ");  
                     for (int i = 0; i < total_d; i++) {
                        System.out.print("*");
                    } 
                    System.out.print("\n-------------------------------------------------------");
                    System.out.print("\nEl '*' en destino representa 1 . ");
                    System.out.println("\nEl '*' en el resto representa Lps. 1000.");
                }      
                
                //REPORTE DE ACCESOS
                if (reportes.equalsIgnoreCase("d")) {
                    System.out.print("\nReporte de accesos");
                    System.out.print("\n------------------------------------------");
                    System.out.print("\nAcceso a ventana de paquetes turisticos: ");
                    for (int b = 0; b < contador_acceso_turistico; b++) {
                        System.out.print(" *");
                    }
                    System.out.print("\n------------------------------------------");
                    System.out.print("\nAcceso a ventana de boletos aereos: ");
                    for (int a=0; a <contador_acceso_boletos; a++){
                        System.out.print(" *");
                    }
                    System.out.print("\n-------------------------------------------");
                    System.out.print("\nAcceso a Reportes: ");
                    for (int c=0; c<contador_reportes; c++){
                        System.out.print(" *");
                    }
                    System.out.print("\n--------------------------------------------");
                    System.out.println("\nEl '*' representa las veces que se a entrada al correspondiente submenu.");
                }
            }
            
            //Salir de Sistema
            if (ventana.equalsIgnoreCase("d")) {
                System.out.println("\nGracias por escogernos.");
                System.out.println("Saliendo del sistema......");
                System.exit(0);
            }
        }
    }
}

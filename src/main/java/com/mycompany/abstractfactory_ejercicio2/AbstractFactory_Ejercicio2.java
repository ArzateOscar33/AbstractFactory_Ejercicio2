/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractfactory_ejercicio2;

/**
 *
 * @author Arzate
 */
public class AbstractFactory_Ejercicio2 {

    public static void main(String[] args) {
        //Se necesita instanciar la FABRICA CONCRETA en base a laFABRICA ABSTRACTA
        IAbstractFactory AB= new FabricaVehiculoGasolina();
       //SE MANDA A LLAMAR A LA INTERFAZ DE LO QUE QUIERO CREAR EN ESTE CASO UN AUTOMOVIL 
       IAutomovil auto=AB.crearAutomovil();
       auto.Render();
        
    }
}

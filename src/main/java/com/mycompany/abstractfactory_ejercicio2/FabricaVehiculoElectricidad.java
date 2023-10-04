/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory_ejercicio2;

/**
 *
 * @author Arzate
 */
public class FabricaVehiculoElectricidad implements IAbstractFactory{

    @Override
    public IAutomovil crearAutomovil() {
    return new AutomovilElectricidad(); }

    @Override
    public IScooter crearScooter() {
   return new ScooterElectricidad();
    }

   
    
}

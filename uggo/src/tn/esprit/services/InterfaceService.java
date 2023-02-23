/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tn.esprit.services;

import java.util.List;

/**
 *
 * @author Omnya
 */
public interface InterfaceService<C> {
     public void ajouter(C c);
    public void modifier(C c);
    public void supprimer(C c);
    public List<C> afficher();
}

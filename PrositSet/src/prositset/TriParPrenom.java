/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prositset;

import java.util.Comparator;

/**
 *
 * @author iskander
 */
public class TriParPrenom implements Comparator<Enseignant> {

    @Override
    public int compare(Enseignant o1, Enseignant o2) {
        return o1.getPrenom().compareTo(o2.getPrenom());
    }
    
    
    
    
}

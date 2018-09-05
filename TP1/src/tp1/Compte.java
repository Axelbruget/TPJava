/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author axbruget1
 */
public class Compte {
    
    private int number;
    private int solde;

    public Compte(int number,int solde) {
        this.number = number;
        this.solde = solde;
    }

    public int getSolde() {
        return solde;
    }

    public int getNumber() {
        return number;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compte other = (Compte) obj;
        if (this.number != other.number) {
            return false;
        }
        return true;
    }
}

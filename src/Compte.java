/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author professor
 */
public class Compte {

    private int saldo;

    /**
     * Constructor de la classe Compte, la qual s'instancia amb un saldo inicial (int)
     * @param saldoInicial
     */
    public Compte(int saldoInicial) {
        saldo = saldoInicial;
    }

    /**
     * Mètode void per actualitzar el saldo del compte, sumant-li una quantitat passada per paràmetres.
     * @param quantitat
     */
    public void Diposit(int quantitat) {
        saldo += quantitat;
    }

    /**
     * Mètode void per actualitzar el saldo del compte, restant-li una quantitat passada per paràmetres.
     * @param quantitat
     */
    public void Enretirament(int quantitat) {
        saldo -= quantitat;
    }

    /**
     * Mètode void per realitzar una transferència. Indiquem per paràmetres el compte al qual realitzarem
     * la transferència i la quantitat.
     * @param desti
     * @param quantitat
     */
    public void Transferencia(Compte desti, int quantitat) {
        desti.Diposit(quantitat);
        Enretirament(quantitat);
    }

    /**
     * Mètode que ens retorna el saldo del Compte.
     * @return
     */
    public int Saldo() {
        return saldo;
    }
}

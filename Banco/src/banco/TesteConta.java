/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author lucyv
 */
public class TesteConta {
     public static void main(String[] args) {
        
        Conta c = new ContaCorrente();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupança cp = new ContaPoupança();
        
        c.deposita(2000);
        cc.deposita(2000);
        cp.deposita(2000);
        
        c.atualiza(0.15);
        cc.atualiza(0.15);
        cp.atualiza(0.15);
        
        System.out.println("Conta: " + c.getSaldo());
        System.out.println("Conta Corrente: " + cc.getSaldo());
        System.out.println("Conta Poupança: " + cp.getSaldo());
    }
}

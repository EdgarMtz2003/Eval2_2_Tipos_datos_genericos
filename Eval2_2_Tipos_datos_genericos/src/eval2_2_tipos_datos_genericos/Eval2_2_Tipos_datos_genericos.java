/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval2_2_tipos_datos_genericos;

import java.util.LinkedList;

/**
 *
 * @author moviles
 */
public class Eval2_2_Tipos_datos_genericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> miList = new LinkedList<String>();
        //miLista.
        TiposDatosGenericos<Integer> miObj = new TiposDatosGenericos<Integer>();
        miObj.setValor(100);
        System.out.println(miObj.getValor());
    }
    
}

class TiposDatosGenericos<T>{
    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    
}
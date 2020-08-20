/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_f_pesos;

/**
 *
 * @author abi
 */
public enum UnidadPeso {
    
    GRAMO("G", 1),
    KILOGRAMO("KG", 1000),
    TONELADA ("T", 10_000);
    
    private final String abreviacion;
    private final int valor;
    
    private UnidadPeso(String abreviacion, int valor){
        this.abreviacion = abreviacion;
        this.valor = valor;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public int getValor() {
        return valor;
    }
        
}

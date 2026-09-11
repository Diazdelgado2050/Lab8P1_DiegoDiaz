/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_diegodiaz;

/**
 *
 * @author diego
 */
public class Videojuego {
    
    private int cantidadSt;
    private String program;
    private String nomProducto;
    private int codigo;
    private int precioJue;
    
    
    
    
    public Videojuego(int codigo, String program, String nomProducto, int cantidadSt, int precioJue){
        
        this.program = program;
        
        this.nomProducto = nomProducto;
        this.cantidadSt = cantidadSt;       
        this.precioJue = precioJue;
        this.codigo = codigo;
        
       
    
}
 public int Gcodigo(){
     return this.codigo;
 }  
 
  public String Gprogram(){
     return this.program;
 }  
    public String Gnomproducto(){
     return this.nomProducto;
 }
    public int GcantidadSt(){
     return this.cantidadSt;
 }
  public int GprecioJuegos(){
     return this.precioJue;
     
     
     
     
     
     
 }  
  public void Scodigo(int codigo){
      this.codigo = codigo;
  }
  public void Sprogram(String program){
     this.program = program;
     
  }
  public void SnomProducto(String nomProducto){
      this.nomProducto = nomProducto;
  }
  public void ScantidadSt(int catidadSt){
      this.cantidadSt = cantidadSt;
  }
  public void SprecioJuegos(int precioJue){
      this.precioJue = precioJue;
  }
    
}

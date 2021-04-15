public class Musica{
    private String nombre;
    private String genero;
    private String artista;
    private double tiempoDuracion;
    public Musica(){
    }
    
    public Musica(String nombre, String genero, String artista, double tiempoDuracion){
        this.nombre = nombre;
        this.genero = genero;
        this.artista = artista;
        this.tiempoDuracion = tiempoDuracion;
    }
    
    public String reproducir(boolean reproducir){
        String rep;
        if(reproducir){
            rep = "Su musica se esta reproduciendo";
        }
        else{
            rep = "Su musica no se esta reproduciendo";
        }
        return rep;
    }
     
    public String pausar(boolean pausar){
        String res;
        if(pausar){
            res = "Su musica a sido pausado";
        }
        else{
            res = "Su musica no esta pausado";
        }
        return res;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getGenero(){        
        return genero;
    }
    
    public String getArtista(){
              return artista;
    }
    
    public double getTiempoDuracion(){
        return tiempoDuracion;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public void setNombre(double TiempoDuracion){
        this.tiempoDuracion = tiempoDuracion;
    }
}
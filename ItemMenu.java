package ExamenTienda;

public class ItemMenu{
    
    private int id;
    private String nombre;
    private int precio;
    

    public ItemMenu(int id, String nombre, int precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void obtenerDetalles(Bebida PlatoComida){
        System.out.println("El menu del dia es"+ id + nombre + "y su precio es"+ precio);
    }


    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId(int id){
        return id;

    }
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }



}

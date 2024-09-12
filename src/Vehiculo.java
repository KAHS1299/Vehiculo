public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String tipo;
    private String color;

    //Constructor
    public Vehiculo(String placa,String marca, String modelo,String tipo, String color){
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.tipo=tipo;
        this.color=color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

}

package generic.carro;

public abstract class Carro {
    
    private String marca;
    private String modelo;

    public void imprimirCarro() {
        System.out.println("Marca : "+getMarca()+" , Modelo : "+getModelo());
    }

    /**
     * @return String return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}

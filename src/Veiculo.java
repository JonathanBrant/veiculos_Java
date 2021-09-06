public abstract  class Veiculo {
    private String fabricante;
    private String modelo;
    private int anoDeFabricação;
    private String tipo;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFabricação() {
        return anoDeFabricação;
    }

    public void setAnoDeFabricação(int anoDeFabricação) {
        this.anoDeFabricação = anoDeFabricação;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

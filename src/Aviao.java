public class Aviao extends Veiculo{
    private String capacidadeDeCarga;
    private String horasDeVoo;
    private String categoria;
    private int assentos;
    private  Turbina turbina;

    public void decolar(){

    };

    public void plainar() {

    };

    public  void aterrissar(){

    }


    public void setCapacidadeDeCarga(String capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public void setHorasDeVoo(String horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTurbina(Turbina turbina) {
        this.turbina = turbina;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
}

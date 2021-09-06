public class Barco extends Veiculo{
    private String tamanho;
    private int passageiros;
    private String potencia;
    private int quantidadeDeMotores;
    private Helice helice;

    public void navegar() {

    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public void setQuantidadeDeMotores(int quantidadeDeMotores) {
        this.quantidadeDeMotores = quantidadeDeMotores;
    }
}

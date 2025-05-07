public class Caminhao extends Veiculo {
    protected float capacidadeCarga;
    //construtor
    protected Caminhao(String marca, String modelo, int ano, float velocidade, float capacidadeCarga) {
        super(marca, modelo, ano, velocidade);
        this.capacidadeCarga = capacidadeCarga;
    }
    //metodos

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Numero de Portas: " + this.capacidadeCarga);
    }
}

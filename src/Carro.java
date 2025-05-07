public class Carro extends Veiculo {
    protected int numPortas;
    //construtor
    protected Carro(String marca, String modelo, int ano, float velocidade, int numPortas) {
        super(marca, modelo, ano, velocidade);
        this.numPortas = numPortas;
    }
    //metodos

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Numero de Portas: " + this.numPortas);
    }
}
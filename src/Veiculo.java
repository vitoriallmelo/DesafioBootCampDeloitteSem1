//velocidade em km/h e peso em T
public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected float velocidade;
    //construtor
    protected Veiculo(String marca, String modelo, int ano, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }
    //metodos get e set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(float velocidade) {
        if (velocidade >= 0) { //aceitar a partir de 0.0
            this.velocidade = velocidade;
        }
    }
    //outros metodos
    public float acelerar(float velocidade) {
        velocidade += 10;
        return velocidade;
    }
    public float frear(float velocidade) {
        if (velocidade > 10) { //se a velocidade for maior que 10 km/h, subtrair normalmente
            velocidade -= 10;
        }else{ //se a velocidade for menor que 10 km/h, zerar para que nao fique negativa
            velocidade = 0;
        }
        return velocidade;
    }
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }
}

public class Motorista {
    private String nome;
    private String cnh;
    private Veiculo veiculoAtual; //pode ser None
    //construtor
    private Motorista(String nome, String cnh, Veiculo veiculoAtual) {
        this.nome = nome;
        this.cnh = cnh;
        this.veiculoAtual = veiculoAtual;
    }
    //metodos get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public Veiculo getVeiculoAtual() {
        return veiculoAtual;
    }
    public void setVeiculoAtual(Veiculo veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }
    //outros metodos
    private void atribuirVeiculo(Veiculo nome){
        this.veiculoAtual = nome;
    }
    private void removerVeiculo(Veiculo nome){
        this.veiculoAtual = null;
    }
    private void dirigirVeiculo(Veiculo nome){
        System.out.println(this.nome + "está dirigindo" + this.veiculoAtual);
    }
}

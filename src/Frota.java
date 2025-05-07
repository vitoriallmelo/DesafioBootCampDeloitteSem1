public class Frota {
    private Veiculo[] veiculos;
    private Motorista[] motoristas;
    //construtor
    public Frota(Veiculo[] veiculos, Motorista[] motoristas) {
        this.veiculos = veiculos;
        this.motoristas = motoristas;
    }
    //metodos
    public Motorista[] getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(Motorista[] motoristas) {
        this.motoristas = motoristas;
    }

    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

    public void adicionarVeiculo(Veiculo veiculo, int i) {
        veiculos[i] = veiculo;
    }
    public void adicionarMotorista(Motorista motorista, int i) {
        motoristas[i] = motorista;
    }
    public void listarFrota(){
        System.out.println("Veiculos da Frota:");
        for (int i = 0; i < veiculos.length; i++) {
            System.out.println(veiculos[i]);
        }
        System.out.println("Motoristas da Frota:");
        for (int i = 0; i < motoristas.length; i++) {
            System.out.println(motoristas[i]);
        }
    }
}

package solid.srp;

public class Posto {

    public void reabastecimento(Veiculos veiculo){
        veiculo.setQuantidadeCombustivel(veiculo.getCapacidadeTanqueCombustivel());
    }
}

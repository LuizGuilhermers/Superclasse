package AtividadeUm;

public class Principal {
	
	public static void main (String [] args) {
		
		Veiculo veiculo = new Veiculo ("Carro1", "2000", 2019, "vermelho");
		System.out.println("Veículo");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		
		Automovel automovel = new Automovel (4, "3000px");
		System.out.println("Automovel");
		System.out.println("Numero de portas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		
		Moto moto = new Moto (250);
		System.out.println("Moto");
		System.out.println("Cilindrada: " +  moto.getCilindrada());
		
		
		
	}

}

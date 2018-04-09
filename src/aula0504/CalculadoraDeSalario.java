// adicionar cargo supervisor -> salario=1.5*salario base
// adicionar regra se o vendedor bater a meta, ganha bonus de 50. A meta � definida para cada vendedor.
package aula0504;

public class CalculadoraDeSalario {
	double incentivo;

	public CalculadoraDeSalario(double incentivo) {
		super();
		this.incentivo = incentivo;
	}

	public double calcula(Funcionario funcionario) {
		
            return funcionario.calculaSalario() + incentivo;
	}
}

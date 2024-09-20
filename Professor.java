package Atividade01;

public class Professor extends Funcionarios {

    // Sobrescrevendo o método para retornar o salário integral
    @Override
    public double getSalarioPrimeiraParcela() {
        return getSalario(); // Retorna o salário integral
    }

    // Sobrescrevendo o método para retornar zero
    @Override
    public double getSalarioSegundaParcela() {
        return 0.0; // Professores não têm segunda parcela
    }
}

package Atividade01;

public class Funcionarios extends Pessoa {
    private int matricula;
    private double salario;

    // Métodos get e set para matrícula
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Métodos get e set para salário (com verificação)
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    // Método que retorna 60% do salário
    public double getSalarioPrimeiraParcela() {
        return salario * 0.6;
    }

    // Método que retorna 40% do salário
    public double getSalarioSegundaParcela() {
        return salario * 0.4;
    }
}
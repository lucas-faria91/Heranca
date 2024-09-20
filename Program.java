package Atividade01;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionarios func = new Funcionarios();
        func.setNome("João");
        func.setSobrenome("Silva");
        func.setMatricula(12345);
        func.setSalario(3000.0);
        System.out.println("Nome completo: " + func.getNomeCompleto());
        System.out.println("Primeira parcela do salário: " + func.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela do salário: " + func.getSalarioSegundaParcela());

        // Criando um professor
        Professor prof = new Professor();
        prof.setNome("Maria");
        prof.setSobrenome("Santos");
        prof.setMatricula(67890);
        prof.setSalario(5000.0);
        System.out.println("Nome completo: " + prof.getNomeCompleto());
        System.out.println("Primeira parcela do salário (Professor): " + prof.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela do salário (Professor): " + prof.getSalarioSegundaParcela());
    }
}
package Factory_Method;

public class Main {

	public static void main(String[] args) {
		FactoryPessoa factory = new ConcretCreatorFactoryPessoa();
		
		String nome = "José";
		String sexo = "M";
		
		factory.getPessoa(nome, sexo);
		
		nome = "Maria";
		sexo = "F";
		
		factory.getPessoa(nome, sexo);

	}

}

package Heranca;


public class Principal {
	
	public static void main (String [] args) {
		
		Pessoa pessoa = new Pessoa ("João da Silva", "15 9 88358604");
		System.out.println ("Pessoa");
		System.out.println ("Nome: " + pessoa.getNome());		
		System.out.println ("Telefone: " + pessoa.getTelefone());
		
		PessoaFisica pessoaFisica = new PessoaFisica ("João da Silva", "15 9 88358604", "15 9 8835.8604", "15 9 883.58604");
		System.out.println ("\n Pessoa física: ");
		System.out.println ("Nome: " +  pessoaFisica.getNome());
		System.out.println ("Telefone: " + pessoaFisica.getTelefone());
		System.out.println ("CPF: " + pessoaFisica.getCpf());		
		System.out.println ("RG: " + pessoaFisica.getRg());
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica ("Empresa X", "15 9 88358604", "15 9 8835.8604"
				);
		System.out.println ("\n Pessoa juridica: ");
		System.out.println ("Nome: " +  pessoaJuridica.getNome());
		System.out.println ("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println ("CNPJ: " + pessoaJuridica.getCnpj());		
		
		
	}

}

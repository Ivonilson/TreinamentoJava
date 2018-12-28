import java.util.Scanner;

class Usando_While {

	public static void main (String [] args){

		String usuario;
		String senha;

		Scanner entrada = new Scanner(System.in);

		System.out.println("DIGITE O USUARIO: ");
		usuario = entrada.next();

		System.out.println("DIGITE A SENHA: ");
		senha = entrada.next();

		while(usuario.intern() != "IVONILSON" && senha.intern() != "123"){
			System.out.println("O USUARIO "+usuario+" NAO TEM PERMISSAO PARA LOGAR. TENTE NOVAMENTE...");
			
			System.out.println("DIGITE O USUARIO: ");
			usuario = entrada.next();

			System.out.println("DIGITE A SENHA: ");
			senha = entrada.next();

			if(usuario.intern() == "IVONILSON" && senha.intern() == "123"){
				System.out.println("USUARIO "+usuario+" LOGADO COM SUCESSO.");
			}
		}

	}

}
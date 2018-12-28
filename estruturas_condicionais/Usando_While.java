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

		int contador = 3;

		while(usuario.intern() != "IVONILSON" && senha.intern() != "123" && contador >= 2){
			System.out.println("O USUARIO "+usuario+" NAO TEM PERMISSAO PARA LOGAR. TENTE NOVAMENTE...");
			
			contador--;

				if(contador == 1) {

					System.out.println("ESTA E SUA ULTIMA CHANCE...");

						System.out.println("VOCE TEM MAIS "+contador+" CHANCES...");
						System.out.println("DIGITE O USUARIO: ");
						usuario = entrada.next();

						System.out.println("DIGITE A SENHA: ");
						senha = entrada.next();

					} else {

						System.out.println("VOCE TEM MAIS "+contador+" CHANCES...");
						System.out.println("DIGITE O USUARIO: ");
						usuario = entrada.next();

						System.out.println("DIGITE A SENHA: ");
						senha = entrada.next();

					}
			}

			if(usuario.intern() == "IVONILSON" && senha.intern() == "123"){
				System.out.println("USUARIO "+usuario+" LOGADO COM SUCESSO.");
			}


	}

}
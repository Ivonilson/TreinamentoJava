import java.util.Scanner;

class If_Else {

	public static void main (String [] args){

		String usuario;
		String senha;

		Scanner entrada = new Scanner(System.in);

		System.out.println("DIGITE O USUARIO: ");
		usuario = entrada.next();

		System.out.println("DIGITE A SENHA: ");
		senha = entrada.next();

		if(usuario.intern() == "IVONILSON" && senha.intern() == "123"){
			System.out.println("USUARIO "+usuario+" LOGADO COM SUCESSO.");
		} else {
			System.out.println("O USUARIO "+usuario+" NAO TEM PERMISSAO PARA LOGAR.");
		}

	}

}
import javax.swing.JOptionPane;	

class Usando_JOptionPane {

	public static void main(String [] args){

		String num1 = JOptionPane.showInputDialog("DIGITE O PRIMEIRO NUMERO: ");
		String num2 = JOptionPane.showInputDialog("DIGITE O SEGUNDO NUMERO: ");

		int soma = Integer.parseInt(num1) + Integer.parseInt(num2);

		JOptionPane.showMessageDialog(null, "SOMA DOS NUMEROS DIGITADOS: " +soma);


	}

}
package view;
import controller.FatController;
import javax.swing.JOptionPane;

public class Principal 
{

	public static void main(String[] args) 
	{    
		FatController f = new FatController();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 10"));
		while (numero > 10 ||numero < 0 )
		{
			System.out.println("Valor inválido");
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 10 paizão"));
		}
		int fat = f.Fat(numero);
		System.out.println("O fatorial de " + numero + " é " + fat);
	}

}

package controller;
import starman.PilhaInt;

public class FatController 
{

	public FatController() 
	{
		super();
	}

	public int Fat(int valor)
	{
		PilhaInt p = new PilhaInt();
		for (int i = valor; i >  0; i--)
		{
			p.push(i);
		}
		
		int fat = 1;
		
		for(int i = 0; i < valor; i++)
		{
			try {
				
				int aux = p.pop();
				fat = fat * aux;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
		return fat;
	}
	
}

package Clases_abstractas_e_Interfaces;

public class Robot_Sirviente extends Robot{
	private String Nombre;
	
	public Robot_Sirviente(String Nombre) 
	{
		this.Nombre = Nombre;
	}
	
	@Override
	public void ID(int i) 
	{
		System.out.println("\n"+"Robot: "+i);
	}
	
	@Override
	public void NombreRP() 
	{
		System.out.println(this.Nombre);
	}
	
	@Override
	public void UltimaAccion() 
	{
		System.out.println("Que-lo-disfruten!");
		System.out.println(this.Nombre+" ha servido la comida");
	}
	
	@Override
	public void Bateria(int i) 
	{
		System.out.println("Bateria restante: "+(100-i)+"%");
	}
	
}

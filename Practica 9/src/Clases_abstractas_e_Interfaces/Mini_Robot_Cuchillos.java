package Clases_abstractas_e_Interfaces;

public class Mini_Robot_Cuchillos extends Robot{
	
	private String Nombre;
	
	public Mini_Robot_Cuchillos(String Nombre) 
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
		System.out.println("Cor-tar");
		System.out.println(this.Nombre+" ha cortado los ingredientes");
	}
	
	@Override
	public void Bateria(int i) 
	{
		System.out.println("Bateria restante: "+(100-i)+"%");
	}
}

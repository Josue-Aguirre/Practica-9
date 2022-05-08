package Clases_abstractas_e_Interfaces;

public class Mini_Robot_Version extends Robot implements Version{
	
	private String Nombre;
	private int Version;
	public Mini_Robot_Version(String Nombre)
	{
		this.Nombre = Nombre;
	}
	
	@Override
	public void v(int version)
	{
		switch(version)
		{
			case 1: System.out.println(">>Hora de preparar el desayuno<<");
			this.Version = version;
				break;
			case 2: System.out.println(">>Hora de preparar la comida<<");
			this.Version = version;
				break;
			case 3: System.out.println(">>Hora de preparar la cena<<");
			this.Version = version;
				break;
		}
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
		switch(this.Version)
		{
		case 1: System.out.println(this.Nombre+" ha cocinado el desayuno");
			break;
		case 2: System.out.println(this.Nombre+" ha cocinado la comida");
			break;
		case 3: System.out.println(this.Nombre+" ha cocinado la cena");
			break;
		}
		
	}
	
	@Override
	public void Bateria(int i)
	{
		System.out.println("Bateria restante: "+(100-i)+"%");
	}

}

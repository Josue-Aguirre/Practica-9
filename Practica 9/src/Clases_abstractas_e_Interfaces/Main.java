package Clases_abstractas_e_Interfaces;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner rst = new Scanner(System.in);
		int i,j;
		Boolean op = false;
		
		Mini_Robot_Cuchillos MRC = new Mini_Robot_Cuchillos("Alfredo");
		Mini_Robot_Version MRV = new Mini_Robot_Version("Saul");
		Robot_Sirviente RS = new Robot_Sirviente("Josue");
		Temporizador.inicio();
		
		do 
		{
			do 
			{
				System.out.println("|------------------|");
				System.out.println("|       MENU       |\n|------------------|\n| 1.Desayuno       |\n| 2.Comida         |\n| 3.Cena           |\nQue desea ordenar?");
				i = rst.nextInt();
				System.out.println(((i>3||i<1) ? "Opcion invalida, ingrese una opcion valida" : ""));
			}while(i>3||i<1);
			
			System.out.println("*Los robots se han encendido*");
			
			Temporizador.restablecer();
			do 
			{
				System.out.println("\n1.Preparar ingredientes\n2.Cocinar\n3.Servir\nSeleccione una opcion:");
				j = rst.nextInt();
				
				switch(j) 
				{
					case 1:
						MRC.ID(1);
						MRC.NombreRP();
						MRV.v(i);
						MRC.UltimaAccion();
						break;
					case 2:
						System.out.println("\nError, los ingredientes todavia no han sido preparados");
						break;
					case 3:
						System.out.println("\nError, los ingredientes todavia no han sido preparados");
						break;
					default:
						System.out.println("Opcion invalida, ingrese una opcion valida");
						break;
				}
			}while(j!=1);
			MRC.Bateria(Temporizador.mostrar());
			Temporizador.restablecer();
			
			do 
			{
				System.out.println("\n1.Preparar ingredientes\n2.Cocinar\n3.Servir\nSeleccione una opcion:");
				j = rst.nextInt();
				
				switch(j) 
				{
					case 1:
						System.out.println("\nError, recuerda que los ingredientes ya se habian sido preparados");
						break;
					case 2:
						MRV.ID(2);
						MRV.NombreRP();
						MRV.v(i);
						MRV.UltimaAccion();
						break;
					case 3:
						System.out.println("\nError, los ingredientes se necesitan cocinar para poder servirse");
						break;
					default:
						System.out.println("Opcion invalida, ingrese una opcion valida");
						break;
				}
			}while(j!=2);
			MRV.Bateria(Temporizador.mostrar());
			Temporizador.restablecer();
			
			do 
			{
				System.out.println("\n1.Preparar ingredientes\n2.Cocinar\n3.Servir\nSeleccione una opcion:");
				j = rst.nextInt();
				
				switch(j) 
				{
					case 1:
						System.out.println("\nError, recuerda que los ingredientes ya habian sido preparados");
						break;
					case 2:
						System.out.println("\nError, recuerda que la comida ya se habia cocinado");
						break;
					case 3:
						RS.ID(3);
						RS.NombreRP();
						MRV.v(i);
						RS.UltimaAccion();
						break;
					default:
						System.out.println("Opcion invalida, ingrese una opcion valida");
						break;
				}
			}while(j!=3);
			RS.Bateria(Temporizador.mostrar());
			Temporizador.restablecer();
			
			System.out.println("\n -----------------------------------------");
			System.out.println("| ¡Magnifico! El plato estaba en su punto |");
			System.out.println(" -----------------------------------------");
			
			System.out.println("\nDesea realizar otra comida? \n1.Si\n2.No");
			i = rst.nextInt();
			op = (i==1)? false:true;
			
		}while(op==false);
		
		Temporizador.interrumpir();
		System.out.println("\n ----------------------------------");
		System.out.println("| Gracias por venir, vuelva pronto |");
		System.out.println(" ----------------------------------");
		System.exit(1);
	}

}

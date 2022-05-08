package Clases_abstractas_e_Interfaces;

import java.util.Timer;
import java.util.TimerTask;

public class Temporizador {
	public static int temp = 0;
	public static Timer tiempo = new Timer();
	
	public static TimerTask pendiente = new TimerTask()
	{
		@Override
		public void run() 
		{
            temp++;
        }
	};
	
	public static void inicio() 
	{
		tiempo.scheduleAtFixedRate(pendiente, 0, 1000);
	}
	
	public static int mostrar() 
	{
		return temp;
	}
	
	public static void restablecer() 
	{
		temp=0;
	}
	
	public static void interrumpir() 
	{
		pendiente.cancel();
		tiempo.cancel();
	}
	
}

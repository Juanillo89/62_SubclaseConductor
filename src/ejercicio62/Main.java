package ejercicio62;

public class Main
{

	public static void main(String[] args)
	{
		Conductor conductor = new Conductor("Paco", "913245876");
		conductor.sumarKilometros(567.45);
		System.out.println("Kilometros iniciales: " + conductor.getTotalKilometros());
		conductor.sumarKilometros(1837.35);
		System.out.println(conductor.getTotalKilometros());
		conductor.pasaPorCiudad("Madrid");
		conductor.pasaPorCiudad("Valencia");
		conductor.pasaPorCiudad("Cadiz");
		conductor.pasaPorCiudad("Santander");
		System.out.println("Ciudades visitadas:");
		for (int i = 0; i < conductor.getCiudadesRecorridas().length; i++)
		{
			System.out.println(conductor.getCiudadesRecorridas()[i]);
		}
	}
}
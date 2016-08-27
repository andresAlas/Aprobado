import javax.swing.*;
public class Aprobado {
	public static void main(String[] args)
	{
		int nota = 0, cont, resul;
		double promedio = 0;
		boolean activado = true;
		String inputUser, materia, estado;

		while(activado)
		{
			System.out.println("---------------------------");
			materia = JOptionPane.showInputDialog("Deme el nombre de la materia");

			for(cont = 0; cont < 3; cont++)
			{
				inputUser = JOptionPane.showInputDialog("Ingrese su nota");
				nota = Integer.parseInt(inputUser);

				promedio += nota;
			}

			promedio = promedio / cont;

			if(promedio >= 70)
			{
				estado = "Aprobado";
			}else{
				estado = "Reprobado";
			}

			System.out.println("La materia es: " + materia + "\nEl promedio es: " + promedio + "\nEl estado es: " + estado);
			System.out.println("---------------------------");

			promedio = 0;// es para que comiense de nuevo en 0

			do{
				inputUser = JOptionPane.showInputDialog("Digite 1 para seguir o 2 para salir\n1) Para seguir\n2) Para salir");
				resul = Integer.parseInt(inputUser);

				if(resul == 1)
				{
					activado = true;
				}else{
					activado = false;
				}
			}while(resul < 1 || resul > 2);
		}
	}
}
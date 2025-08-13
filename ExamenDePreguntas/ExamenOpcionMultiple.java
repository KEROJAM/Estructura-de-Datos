package ExamenPreguntas;

import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExamenOpcionMultiple {
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	static void main(String[] args) throws IOException {
		ArrayList<Pregunta> Preguntas = new ArrayList<Pregunta>();
		int o = 0;
		int r = 0;
		Boolean x = true;
		ArrayList<String> letras = new ArrayList<String>();
        letras.add("a");
        letras.add("b");
        letras.add("c");
        letras.add("d");
		Preguntas.add(new Pregunta("Cual es la distancia de la tierra a la luna?", "384,400 km", "200,802 km", "498,340 km", "178,980 km", 1));
		Preguntas.add(new Pregunta("Cuantos años puede vivir una tortuga de tierra?", "70 a 200", "20 a 60", "50 a 100", "70 a 80", 3));
		Preguntas.add(new Pregunta("Cual es el planeta mas frio del Sistema Solar?", "Urano", "Pluton", "Saturno", "Neptuno", 4));
		for (Pregunta i : Preguntas){
			System.out.println(Preguntas.get(o).PreguntaEnSi);
			int u = 0;
			System.out.println();
			for (Preguntas.get(o).GetRespuestas() > u){
				System.out.print( letras.get(u) + Preguntas.get(o).Respuestas[u]);
				u++;
			}
			while(x){
				String opcionUsuario = input.readLine();
				if (letras.contains(opcionUsuario)){
					r++;
                    o++;
					x = false;
				} else {
					x = false;
                    o++;
				} 
			}
		}
		System.out.println("Respondiste: " + r +" Preguntas Correctas");
	}
}

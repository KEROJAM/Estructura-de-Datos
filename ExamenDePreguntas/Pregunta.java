public class Pregunta {
	public String PreguntaEnSi;
	public String[] Respuestas;
	public int Correcta;

	public Pregunta(String valPregunta, String valRespuesta1, String valRespuesta2, String valRespuesta3, String valRespuesta4, int valCorrecta) {
		this.PreguntaEnSi = valPregunta;
		this.Respuestas= new String[]{valRespuesta1,valRespuesta2,valRespuesta3,valRespuesta4};
		this.Correcta = valCorrecta;
	}
}

public int GetRespuestas(){
    return this.Respuestas.lenght;
}

void main() {
}

public class Principal {
	//calcula montante de juros compostos
	public float calcularValor(float quantiaOriginal, float numAnos, float taxaJuros) {
		float valorFinal = (float) (quantiaOriginal*Math.pow((1+taxaJuros), numAnos));
		return valorFinal;
	}
}

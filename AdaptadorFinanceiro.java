
public class AdaptadorFinanceiro extends Financeiro{
	Principal quantiaEmAdaptacao = null;

	public AdaptadorFinanceiro(Principal quantiaEmAdaptacao) {
		super();
		this.quantiaEmAdaptacao = quantiaEmAdaptacao;
	}
	
	public float quantia(float quantiaOriginal, float numAnos, float taxaJuros) {
		return quantiaEmAdaptacao.calcularValor(super.getQuantiaOriginal(), super.getNumAnos(), super.getTaxaJuros());
	}
}

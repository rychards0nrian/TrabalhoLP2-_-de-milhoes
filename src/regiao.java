public class regiao //extends estado
{
	//private estado estados[];
	private String nome;
	private String sigla;
	private double area;
	private int populacao;
	private float PIB;
	private float IDH;
	private float PIBperCapita;
	private double densidade;

	String getNome() {
		return this.nome;
	}
	
	String getSigla() {
		return this.sigla;
	}
	
	double getArea() {
		return this.area;
	}
	
	int getPopulacao() {
		return this.populacao;
	}
	
	float getPIB() {
		return this.PIB;
	}
	
	float getIDH() {
		return this.IDH;
	}
	
	float getPIBperCapita() {
		return this.PIBperCapita;
	}
	
	double getDensidade() {
		return this.densidade;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	void setArea(double area) {
		this.area = area;
	}
	
	void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	void setPIB(float PIB) {
		this.PIB = PIB;
	}
	
	void setIDH(float IDH) {
		this.IDH = IDH;
	}
		
	void setPIBperCapita(float PIBperCapita) {
		this.PIBperCapita = PIBperCapita;
	}
	
	void setDensidade(double densidade) {
		this.densidade = densidade;
	}
	
	public void PIBperCapita(float PIB, int populacao) {
		this.PIB = PIB;
		this.populacao = populacao;
		float PIBperCapitaCalc = PIB/populacao;
		this.setPIBperCapita(PIBperCapitaCalc); 
	}
	
	public void densidade(int populacao, double area) {
		this.populacao = populacao;
		this.area = area;
		double densidadeCalc = populacao/area;
		this.setDensidade(densidadeCalc);
		
	}
	
	public void getInformacao(String nome, String sigla, double area, int populacao, float PIB, float IDH, float PIBperCapita, double densidade) {		
		this.nome = nome;
		this.sigla = sigla;
		this.area = area;
		this.populacao = populacao;
		this.PIB = PIB;
		this.IDH = IDH;
		this.PIBperCapita = PIBperCapita;
		this.densidade = densidade;		
	}
	
}
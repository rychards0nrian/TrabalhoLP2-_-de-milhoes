import java.util.ArrayList;

public class estado {	
	
	private String nome;
	private String sigla;
	private String capital;
	private String regiao;
	private double area;
	private int populacao;
	public float PIB;
	private float IDH;
	private estado estadoSimilar;
	private float PIBperCapita;
	private double densidade;
	
	ArrayList<estado> estados = new ArrayList<>();
	
	//estado piaui = new estado("Maranhao", "MA", "Sao Luis", "Nordeste", (double) 331983.3, (int) 6424340, (int) 28621860, (float) 0.683);
	
	//estados.add("Maranhão; MA; São Luís; Nordeste; 331983.3; 6424340; 28621860; 0.683");
	
	public estado(String nome, String sigla, String capital, String regiao, double area, int populacao, int PIB, float IDH) {
		this.nome = nome;
		this.sigla = sigla;
		this.capital = capital;
		this.regiao = regiao;
		this.area = area;
		this.populacao = populacao;
		this.PIB = PIB;
		this.IDH = IDH;
	}
	
	String getNome() {
		return this.nome;
	}
	
	String getSigla() {
		return this.sigla;
	}
	
	String getCapital() {
		return this.capital;
	}
	
	String getRegiao() {
		return this.regiao;
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
	
	estado getEstadoSimilar() {
		return this.estadoSimilar;
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
	
	void setCapital(String capital) {
		this.capital = capital;
	}
	
	void setRegiao(String regiao) {
		this.regiao = regiao;
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
	
	void setEstadoSimilar(estado estadoSimilar) {
		this.estadoSimilar = estadoSimilar;
	}
	
	void setPIBperCapita(float PIBperCapita) {
		this.PIBperCapita = PIBperCapita;
	}
	
	void setDensidade(double densidade) {
		this.densidade = densidade;
	}
	
	public float PIBperCapita() {
		float PIBperCapita = (PIB/populacao);
		return PIBperCapita;		
	}
	
	public double densidade() {
		double densidade = populacao/area;
		return densidade;		
	}

	/*public void definirEstadoSimilar() {	
		for(int i=0; i<=26;i++) {
			float somaPIB = (estados.get(i).getPIB() - this.getPIB());
			if(somaPIB < 0) {
				somaPIB = somaPIB*-1;
			}
			if(somaPIB < 5000000) {
				float somaIDH = (estados.get(i).IDH - this.IDH);
				if(somaIDH < 0) {
					somaIDH = somaIDH*-1;
				}
				if(somaIDH < 0.2) {
					double somaDensidade = (estados.get(i).densidade - this.densidade);
					if(somaDensidade < 0) {
						somaDensidade = somaDensidade*-1;
					}
					if(somaDensidade < 50) {
						System.out.print(estados);
						System.out.print(", ");
					}
				}
			}
		}	
	}*/
	/*	public ArrayList<Pais> definirEstadosSimilares(ArrayList<Pais> paises) {
        for (int i = 0; i < paises.size(); i++) {
            for (int j = 0; j < paises.get(i).getRegioes().size(); j++) {
                for (int k = 0; k < paises.get(i).getRegioes().get(j).getestados().size(); k++) {
                    estado estado1 = paises.get(i).getRegioes().get(j).getestados().get(k);
                    for (int l = 0; l < paises.size(); l++) {
                        for (int m = 0; m < paises.get(l).getRegioes().size(); m++) {
                            for (int n = 0; n < paises.get(l).getRegioes().get(m).getestados().size(); n++) {
                                estado estado2 = paises.get(l).getRegioes().get(m).getestados().get(n);

                                if (!estado1.equals(estado2)) {
                                    if (estado1.getEstadoSimilar() == null) {
                                        estado1.definirEstadoSimilar(estado2);
                                    } else {
                                        if (calcularDistanciaEuclidiana(estado1, estado2) < calcularDistanciaEuclidiana(estado1, estado1.getEstadoSimilar())) {
                                            estado1.definirEstadoSimilar(estado2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    paises.get(i).getRegioes().get(j).getEstados().set(k, estado1);
                }
            }
        }
	} */

	
	public double calcularDistanciaEuclidiana(estado estado1, estado estado2) {
        return (Math.sqrt(
                Math.pow(estado1.getIDH() - estado2.getIDH(), 2) +
                Math.pow(estado1.getPIB() - estado2.getPIB(), 2) +
                Math.pow(estado1.getDensidade() - estado2.getDensidade(), 2)));
    }

	public void getInformacao(String nome, String sigla, String capital, double area, int populacao, float PIB, float IDH, estado estadoSimilar, float PIBperCapita, double densidade) {	
		this.nome = nome;
		this.sigla = sigla;
		this.capital = capital;
		this.area = area;
		this.populacao = populacao;
		this.PIB = PIB;
		this.IDH = IDH;
		//this.estadoSimilar = estadoSimilar;
		this.PIBperCapita = PIBperCapita;
		this.densidade = densidade;		
		
	}
	
}

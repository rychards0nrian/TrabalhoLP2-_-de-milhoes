public class Pais {
    
    private String nome;
	private String sigla;
	private String capital;
	private double area;
	private int populacao;
	private float PIB;
	private float IDH;
    private float PIBperCapita;
    private double densidade;
    
    public Pais(){}





    //GETTERS
    public double getDensidade() {
        return densidade;
    }

    public float getPIBperCapita() {
        return PIBperCapita;
    }

    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public String getCapital() {
        return capital;
    }
    public double getArea() {
        return area;
    }
    public int getPopulacao() {
        return populacao;
    }
    public float getPIB() {
        return PIB;
    }
    public float getIDH() {
        return IDH;
    }

    //SETTERS
    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    public void setPIB(float pIB) {
        PIB = pIB;
    }
    public void setIDH(float iDH) {
        IDH = iDH;
    }
    private void setPIBperCapita(float PIBperCapita) {      
        this.PIBperCapita = PIBperCapita;
    }

    //Constructor
    public Pais(String nome, String sigla, String regiao, double area, int populacao, float pIB, float iDH,float pIBperCapita, double densidade) {
        this.nome = nome;
        this.sigla = sigla;
        this.area = area;
        this.populacao = populacao;
        PIB = pIB;
        IDH = iDH;
        PIBperCapita = pIBperCapita;
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


}

/*import java.util.ArrayList;

public class estado {	
	private String nome;
	private String sigla;
	private String capital;
	private String regiao;
	private double area;
	private int populacao;
	private float PIB;
	private float IDH;
	private estado estadoSimilar;
	private float PIBperCapita;
	private double densidade;
	private ArrayList<estado> estado = new ArrayList<>();

	public estado() {}
	
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
	
	public ArrayList<estado> getEstado() {
		return estado;
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
	
	public void setEstado(ArrayList<estado> estado) {
		this.estado = estado;
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
	
	public void definirEstadoSimilar(float PIB, double densidade, float IDH) {
		this.PIB = PIB;
		this.densidade = densidade;
		this.IDH = IDH;
		
		for(int i=0; i<=27;i++) {
			float soma = (this.estado.get(i).PIB - this.PIB);
			if(soma < 0) {
				soma = soma*-1;
			}
			if(soma < 5000000) {
				for(int j=0; j<=27;j++) {
					float somaIDH = (this.estado.get(j).IDH - this.IDH);
					if(somaIDH < 0) {
						somaIDH = somaIDH*-1;
					}
					if(somaIDH < 0.2) {
						for(int k=0; k<=27;k++) {
							double somaDensidade = (this.estado.get(k).densidade - this.densidade);
							if(somaDensidade < 0) {
								somaDensidade = somaDensidade*-1;
							}
							if(somaDensidade < 50) {
								System.out.println(estado);
							}
						}
					}
				}
			}
		}
	}
	
	public void getInformacao(String nome, String sigla, String capital, double area, int populacao, float PIB, float IDH, estado estadoSimilar, float PIBperCapita, double densidade) {		
		this.nome = nome;
		this.sigla = sigla;
		this.capital = capital;
		this.area = area;
		this.populacao = populacao;
		this.PIB = PIB;
		this.IDH = IDH;
		this.estadoSimilar = estadoSimilar;
		this.PIBperCapita = PIBperCapita;
		this.densidade = densidade;		
	}
} */
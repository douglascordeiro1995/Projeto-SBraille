package br.com.embarcados.comunicaoserial;

public enum AlfabetoBraille {
	
	A(4),
	B(12),
	C(14),
	D(145);
	
	private int valor;
	
	AlfabetoBraille(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	

}

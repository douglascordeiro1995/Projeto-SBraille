package br.com.embarcados.comunicaoserial;

public enum AlfabetoBraille {
	
	A(4),     //0
	B(12),    //1
	C(14),    //2
	D(145),   //3
	E(15),    //4
	F(142),   //5
	G(1425),  //6
	H(125),   //7
	I(42),    //8
	J(425),   //9
	K(13),    //10
	L(123),   //11
	M(143),   //12
	N(1453),  //13
	O(153),   //14
	P(1423),  //15
	Q(14253),  //16
	R(1253),   //17
	S(423),    //18
	T(4253),   //19
	U(136),    //20
	V(1236),//21
	X(1436),//22
	W(4256),//23
	Y(14536),//24
	Z(1536); //25
	
	private int valor;
	
	AlfabetoBraille(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}

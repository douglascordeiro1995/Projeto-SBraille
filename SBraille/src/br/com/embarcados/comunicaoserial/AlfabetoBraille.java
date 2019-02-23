package br.com.embarcados.comunicaoserial;

public enum AlfabetoBraille {
	
	A(4),     //0
	B(12),    //1
	C(14),    //2
	D(145),   //3
	E(15),    //4
	F(124),   //5
	G(1245),  //6
	H(125),   //7
	I(24),    //8
	J(254),   //9
	K(13),//10
	L(123),//11
	M(134),//12
	N(1345),//13
	O(135),//14
	P(1234),//15
	Q(12345),//16
	R(1235),//17
	S(234),//18
	T(2345),//19
	U(136), //20
	V(1236),//21
	X(1436),//22
	W(2456),//23
	Y(13456),//24
	Z(1356); //25
	
	private int valor;
	
	AlfabetoBraille(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}

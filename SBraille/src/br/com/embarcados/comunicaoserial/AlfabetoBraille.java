package br.com.embarcados.comunicaoserial;

import java.util.ArrayList;
import java.util.List;

public enum AlfabetoBraille {
	
	A("4"),     //0
	B("12"),    //1
	C("14"),    //2
	D("145"),   //3
	E("15"),    //4
	F("142"),   //5
	G("1425"),  //6
	H("125"),   //7
	I("42"),    //8
	J("425"),   //9
	K("13"),    //10
	L("123"),   //11
	M("143"),   //12
	N("1453"),  //13
	O("153"),   //14
	P("1423"),  //15
	Q("14253"),  //16
	R("1253"),   //17
	S("423"),    //18
	T("4253"),   //19
	U("136"),    //20
	V("1236"),   //21
	X("1436"),   //22
	W("4256"),   //23
	Y("14536"),  //24
	Z("1536");   //25
	
	private String valor;
	
	AlfabetoBraille(String valor){
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	
	/**
	 * Converte uma letra no seu valor numérico(String) associado em Braille
	 * 
	 * @param letra - letra a ser convertida
	 */
	public static String charToEnumValue(char letra){
        switch(letra){
        case 'a':
            return A.getValor();
        case 'b' :
            return B.getValor();
        case 'c' :
            return C.getValor();
        case 'd' :
            return D.getValor();
        case 'e' :
            return E.getValor();
        case 'f' :
            return F.getValor();
        case 'g' :
            return G.getValor();
        case 'h' :
            return H.getValor();
        case 'i' :
            return I.getValor();
        case 'j' :
            return J.getValor();
        case 'k' :
            return K.getValor();
        case 'l' :
            return L.getValor();
        case 'm' :
            return M.getValor();
        case 'n' :
            return N.getValor();
        case 'o' :
            return O.getValor();
        case 'p' :
            return P.getValor();
        case 'q' :
            return Q.getValor();
        case 'r' :
            return R.getValor();
        case 's' :
            return S.getValor();
        case 't' :
            return T.getValor();
        case 'u' :
            return U.getValor();
        case 'v' :
            return V.getValor();
        case 'w' :
            return W.getValor();
        case 'x' :
            return X.getValor();
        case 'y' :
            return Y.getValor();
        case 'z' :
            return Z.getValor();
        }
        return "X";
    }
	
	/**
	 * Recebe um vetor de caracteres e retorna um Array de caracteres numéricos associados as letras
	 * 
	 * @param letra - vetor de letras passado por referência
	 */
	
	public static ArrayList<Character> montaVLetras(char[] letra) {
		ArrayList<Character> vetorChar = new ArrayList<Character>();
		char[] aux; //vetor auxiliar que guarda os caracteres dos numeros
		int tam = letra.length;
		int indice;
		int tamAux = 0;
		
		for(indice = 0;indice<tam;indice++) {
			System.out.println(letra[indice]); //mostra o caractere que chegou
			aux = charToEnumValue(letra[indice]).toCharArray(); //transformei a letra em um vetor dos numeros discriminados em char
			System.out.println(aux.toString()); //mostra a string dos numeros
			tamAux = aux.length;
			for(int j=0;j<tamAux;j++){
				vetorChar.add(aux[j]); // pega a letra do indice e transforma em um Array de char
				//System.out.println(vetorChar[j]);
			}
		}
		return vetorChar;
	}
	
	
	/**
	 * Monta os vetores de operação 1 2 e 3
	 * 
	 * @param button - Botão que é clicado na interface Java
	 */
	
	public static void montaVetorOP(ArrayList <Character> vetorLetras) { //recebo um vetor de char discriminado ja
		ArrayList<Character> vOP1 = new ArrayList<Character>();
		ArrayList<Character> vOP2 = new ArrayList<Character>();
		ArrayList<Character> vOP3 = new ArrayList<Character>();
		
		for(char e: vetorLetras) {
			if(e == '1' || e == '4') {
				vOP1.add(e);
			}
			else if(e == '2' || e == '5') {
				vOP2.add(e);
			}
			else if(e == '3' || e == '6'){
				vOP3.add(e);
			}
			else {
				System.out.println("NAO ROLOU");
			}
		}
		
		imprimeVetor(vOP1);
		imprimeVetor(vOP2);
		imprimeVetor(vOP3);
	}


	private static void imprimeVetor(ArrayList<Character>v) {
		for(char e: v) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}

	
	
	


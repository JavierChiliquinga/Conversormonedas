package conversor;

public class temperaturas {
private double valor;

public double cenfar(String numero) {
	if(esnumero(numero)) {
		this.valor=(Double.parseDouble(numero)*9/5)+32;
		return this.valor;	
	}else {
		return 0.0;
	}
}
public double farcen(String numero) {
	if(esnumero(numero)) {
		this.valor=(Double.parseDouble(numero)-32)*5/9;
		return this.valor;	
	}else {
		return 0.0;
	}	
}
public double cenkel(String numero) {
	if(esnumero(numero)) {
		this.valor=(Double.parseDouble(numero)+273.15);
		return this.valor;	
	}else {
		return 0.0;
	}	
}
public double kelcen(String numero) {
	if(esnumero(numero)) {
		this.valor=(Double.parseDouble(numero)-273.15);
		return this.valor;	
	}else {
		return 0.0;
	}	
}
public double farkel(String numero) {
	if(esnumero(numero)) {
		this.valor=(Double.parseDouble(numero)-32)*5/9+273.15;
		return this.valor;	
	}else {
		return 0.0;
	}	
}
public double kelfar(String numero) {
	if(esnumero(numero)) {
		this.valor=(Double.parseDouble(numero)-273.15)*9/5+32;
		return this.valor;	
	}else {
		return 0.0;
	}	
}

private static boolean esnumero(String cadena){
	try {
		//Integer.parseInt(cadena);
		Double.parseDouble(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
public double getValor() {
	return valor;
}

}

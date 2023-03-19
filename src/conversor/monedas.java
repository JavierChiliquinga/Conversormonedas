package conversor;

public class monedas {
private double valor;

public double dolareuro(String numero) {
	this.valor=transformar(numero,0.93);
	return this.valor;	
}
public double eurodolar(String numero) {
	this.valor=transformar(numero,1.08);
	return this.valor;	
}
public double dolarlib(String numero) {
	this.valor=transformar(numero,0.82);
	return this.valor;	
}
public double libdolar(String numero) {
	this.valor=transformar(numero,1.22);
	return this.valor;	
}
public double dolaryen(String numero) {
	this.valor=transformar(numero,131.84);
	return this.valor;	
}
public double yendolar(String numero) {
	this.valor=transformar(numero,0.0076);
	return this.valor;	
}
public double dolarwon(String numero) {
	this.valor=transformar(numero,1308.75);
	return this.valor;	
}
public double wondolar(String numero) {
	this.valor=transformar(numero,0.00076);
	return this.valor;
}
public double dolarpesos(String numero) {
	this.valor=transformar(numero,18.91);
	return this.valor;	
}
public double pesosdolar(String numero) {
	this.valor=transformar(numero,0.053);
	return this.valor;	
}
//multiplica el valor por un factor si no es double retorna 0
private double transformar(String numero, double conv) {
	if(esnumero(numero)) {
		valor =Double.parseDouble(numero)*conv;
		return this.valor;	
	}else {
		return 0.0;
	}
}
private static boolean esnumero(String cadena){
	try {
		//verifico si es un double
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

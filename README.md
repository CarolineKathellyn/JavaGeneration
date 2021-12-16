# JavaGeneration
 Repositorio Git/Github
package Exercicio2.ClientePoo;

public class ClienteAvião {

	
	private String mod;
	private double alt;
	private double v;
	public String getMod() {
		return mod;
	}
	public void setMod(String mod) {
		this.mod = mod;
	}
	public double getAlt() {
		return alt;
	}
	public void setAlt(double alt) {
		this.alt = alt;
	}
	public double getV() {
		return v;
	}
	public void setV(double v) {
		this.v = v;
	}
	
	public void acelerar() {
    v += 20;
	}
	public void desacelerar () {
	v -= 20;
	}
	public void subir () {
	alt += 50;
	}
	public void descer() {
	alt -= 50;
	}
	public String toString() {
		String vel = null;
		return ("Aviao [mod ="+ mod + "alt=" + alt + "vel" + vel + "]");
	}

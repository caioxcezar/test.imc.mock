package test.imc.mock;

public class ImcInfo implements IImcInfo {
	private double peso;
	private double altura;
	private boolean isMulher;

	public ImcInfo(double peso, double altura, boolean isMulher) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.isMulher = isMulher;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isMulher() {
		return isMulher;
	}

	public void setMulher(boolean isMulher) {
		this.isMulher = isMulher;
	}

	public double calculo() {
		return peso / (altura * altura);
	}
}

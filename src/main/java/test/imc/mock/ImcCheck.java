package test.imc.mock;

public class ImcCheck {
	public static String checkIMC(IImcInfo imc) {
		String rtn = "";
		double IMC = imc.calculo();
		if (imc.isMulher()) {
			if (IMC < 19.1) {
				rtn = "voc� est� abaixo do peso ideal";
			} else if (IMC <= 25.8) {
				rtn = "voc� est� no peso ideal";
			} else if (IMC <= 27.3) {
				rtn = "voc� est� marginalmente acima do peso ideal";
			} else if (IMC <= 32.3) {
				rtn = "voc� est� acima do peso ideal";
			} else if (IMC > 32.3) {
				rtn = "voc� est� obeso";
			}
		} else {
			if (IMC < 20.7) {
				rtn = "voc� est� abaixo do peso ideal";
			} else if (IMC <= 26.4) {
				rtn = "voc� est� no peso ideal";
			} else if (IMC <= 27.8) {
				rtn = "voc� est� marginalmente acima do peso ideal";
			} else if (IMC <= 31.1) {
				rtn = "voc� est� acima do peso ideal";
			} else if (IMC > 31.1) {
				rtn = "voc� est� obeso";
			}
		}
		return rtn;
	}
}

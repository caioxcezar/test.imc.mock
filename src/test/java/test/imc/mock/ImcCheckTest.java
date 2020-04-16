package test.imc.mock;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ImcCheckTest {

	IImcInfo imcInfo;

	@Before
	public void setUp() throws Exception {
		imcInfo = createMock(IImcInfo.class);
	}

	@Test
	public void testCheckIMC_Mulher_abaixo() {
		expect(imcInfo.calculo()).andReturn(19.0);
		expect(imcInfo.isMulher()).andReturn(true);
		replay(imcInfo);
		assertEquals("você está abaixo do peso ideal", ImcCheck.checkIMC(imcInfo));
	}

	@Test
	public void testCheckIMC_Mulher_pesoIdeal() {
		expect(imcInfo.calculo()).andReturn(25.8);
		expect(imcInfo.isMulher()).andReturn(true);
		replay(imcInfo);
		assertEquals("você está no peso ideal", ImcCheck.checkIMC(imcInfo));
	}

	@Test
	public void testCheckIMC_Mulher_marginalmente() {
		expect(imcInfo.calculo()).andReturn(27.3);
		expect(imcInfo.isMulher()).andReturn(true);
		replay(imcInfo);
		assertEquals("você está marginalmente acima do peso ideal", ImcCheck.checkIMC(imcInfo));
	}

	@Test
	public void testCheckIMC_Mulher_acima() {
		expect(imcInfo.calculo()).andReturn(32.3);
		expect(imcInfo.isMulher()).andReturn(true);
		replay(imcInfo);
		assertEquals("você está acima do peso ideal", ImcCheck.checkIMC(imcInfo));
	}

	@Test
	public void testCheckIMC_Mulher_obeso() {
		expect(imcInfo.calculo()).andReturn(32.4);
		expect(imcInfo.isMulher()).andReturn(true);
		replay(imcInfo);
		assertEquals("você está obeso", ImcCheck.checkIMC(imcInfo));
	}

	@Test
	public void testCheckIMC_Homem_abaixo() {
		expect(imcInfo.calculo()).andReturn(20.6);
		expect(imcInfo.isMulher()).andReturn(false);
		replay(imcInfo);
		assertEquals("você está abaixo do peso ideal", ImcCheck.checkIMC(imcInfo));
	}

	@Test
	public void testCheckIMC_Homem_pesoIdeal() {
		expect(imcInfo.calculo()).andReturn(26.4);
		expect(imcInfo.isMulher()).andReturn(false);
		replay(imcInfo);
		assertEquals("você está no peso ideal", ImcCheck.checkIMC(imcInfo));
	}

	@Test
	public void testCheckIMC_Homem_marginalmente() {
		expect(imcInfo.calculo()).andReturn(27.8);
		expect(imcInfo.isMulher()).andReturn(false);
		replay(imcInfo);
		assertEquals("você está marginalmente acima do peso ideal", ImcCheck.checkIMC(imcInfo));
	}

	@Test
	public void testCheckIMC_Homem_acima() {
		expect(imcInfo.calculo()).andReturn(31.1);
		expect(imcInfo.isMulher()).andReturn(false);
		replay(imcInfo);
		assertEquals("você está acima do peso ideal", ImcCheck.checkIMC(imcInfo));
	}

	@Test
	public void testCheckIMC_Homem_obeso() {
		expect(imcInfo.calculo()).andReturn(31.2);
		expect(imcInfo.isMulher()).andReturn(false);
		replay(imcInfo);
		assertEquals("você está obeso", ImcCheck.checkIMC(imcInfo));
	}

}

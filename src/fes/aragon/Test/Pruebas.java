package fes.aragon.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import fes.aragon.camisa.camisa;
import fes.aragon.tienda.Tienda;

public class Pruebas {
	
	camisa camisaMangaCorta = new camisa();
	camisa camisaCasualMangaLarga = new camisa();
	camisa camisaFormalMangaLarga = new camisa();
	Tienda local = new Tienda();
	
	//Esta linea punteada "---------------------------------------------------------" es un dicativo para 21  diferenciar con mas claridad cada resultado de las prueba

	
	
	@Test
	public void testCMC() {
		
		camisaMangaCorta = local.CMC();
	}

	@Test
	public void testCCML() {
		
		camisaCasualMangaLarga = local.CCML();
		
	}

	@Test
	public void testCFML() {
	
		camisaFormalMangaLarga = local.CFML();
	}

	
	
	@Test
	public void testAñadirCarritoCamisa() {
		local.AñadirCarrito(camisaCasualMangaLarga);
	}

	@Test
	public void testAñadirCarritoCamisaInt() {
		local.AñadirCarrito(camisaMangaCorta, 4);
	}


	@Test
	public void testVerificador() {
		double expected = 0.0;
		Tienda local = new Tienda();
		//TotalPagar
		
		local.Verificador();
		Assert.assertEquals(expected, local.getPreciototal(), 0.0);
		System.out.println("---------------------------------------------------------");
		
		
	}
	
	@Test
	public void testVaciarCarrito() {
		local.VaciarCarrito();
	}
	@Test
	public void testErrorCamisa() {
		double expected = 190.0;
		camisaMangaCorta = local.CCML();
		
		
		local.AñadirCarrito(camisaMangaCorta);
	
		//Error, se pondra un precio incorrecto a esperar
		local.Verificador();
		Assert.assertEquals("No coincide el precio",expected, local.getPreciototal(),0.0);
		System.out.println("---------------------------------------------------------");
	}
	
	
	
	@Test
	public void testPocosArticulos() {
		double expected = 230.0;
		camisaCasualMangaLarga = local.CCML();
		
		
		local.AñadirCarrito(camisaCasualMangaLarga);

		local.Verificador();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
		System.out.println("---------------------------------------------------------");
	}
	
	@Test
	public void testPocosArticulos2() {
		double expected = 310.0;
		camisaFormalMangaLarga = local.CFML();
		
		local.AñadirCarrito(camisaFormalMangaLarga);
	
		
		local.Verificador();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
		System.out.println("---------------------------------------------------------");
	}
	
	@Test
	public void testPocosArticulos3() {
		double expected = 190.0;
		camisaMangaCorta = local.CMC();
		
		
		local.AñadirCarrito(camisaMangaCorta);
	
		
		local.Verificador();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
		System.out.println("---------------------------------------------------------");
	}
	
	
	@Test
	public void testMenosde3Articulos() {
		camisaMangaCorta = local.CMC();
		camisaCasualMangaLarga = local.CCML();
		camisaFormalMangaLarga = local.CFML();
		
		double exp = 500.0;
		
		local.AñadirCarrito(camisaFormalMangaLarga);
		local.AñadirCarrito(camisaMangaCorta);
		
		local.Verificador();
		Assert.assertEquals(local.getPreciototal(),exp,0.0);
		
		System.out.println("---------------------------------------------------------");
	}
	
	@Test
	public void testDe3a5Articulos() {
		camisaMangaCorta = local.CMC();
		camisaCasualMangaLarga = local.CCML();
		camisaFormalMangaLarga = local.CFML();
		
		local.AñadirCarrito(camisaFormalMangaLarga);
		local.AñadirCarrito(camisaMangaCorta);
		local.AñadirCarrito(camisaCasualMangaLarga);
		
		local.Verificador();
		System.out.println("---------------------------------------------------------");
	}
	
	@Test
	public void test20Articulos() {
		double expected = 4784.0;
		camisaMangaCorta = local.CMC();
		camisaCasualMangaLarga = local.CCML();
		camisaFormalMangaLarga = local.CFML();
		
		local.AñadirCarrito(camisaFormalMangaLarga,10);
		local.AñadirCarrito(camisaMangaCorta,5);
		local.AñadirCarrito(camisaCasualMangaLarga,5);
		
		local.Verificador();
		Assert.assertEquals(local.getPreciototal(),expected,0.0);
		System.out.println("---------------------------------------------------------");
	}
	
	
	@Test
	public void test5Articulos() {
		camisaMangaCorta = local.CMC();
		camisaCasualMangaLarga = local.CCML();
		camisaFormalMangaLarga = local.CFML();
		
		local.AñadirCarrito(camisaFormalMangaLarga,2);
		local.AñadirCarrito(camisaMangaCorta,2);
		local.AñadirCarrito(camisaCasualMangaLarga);
		
		local.Verificador();
		System.out.println("---------------------------------------------------------");
	}
	
	@Test
	public void test20Articulos2() {
		camisaMangaCorta = local.CMC();
		camisaCasualMangaLarga = local.CCML();
		camisaFormalMangaLarga = local.CFML();
		
		local.AñadirCarrito(camisaFormalMangaLarga,10);
		local.AñadirCarrito(camisaMangaCorta,5);
		local.AñadirCarrito(camisaCasualMangaLarga,5);
		
		local.Verificador();
		System.out.println("---------------------------------------------------------");
	}
	
	@Test
	public void test8Articulos() {
		camisaMangaCorta = local.CMC();
		camisaCasualMangaLarga = local.CCML();
		camisaFormalMangaLarga = local.CFML();
		
		local.AñadirCarrito(camisaFormalMangaLarga,2);
		local.AñadirCarrito(camisaMangaCorta,2);
		local.AñadirCarrito(camisaCasualMangaLarga,4);
		
		local.Verificador();
		System.out.println("---------------------------------------------------------");
	}
	
	
	
	@Test
	public void TestDeseoCancelar() {
		camisaMangaCorta = local.CMC();
		camisaCasualMangaLarga = local.CCML();
		camisaFormalMangaLarga = local.CFML();
		
		local.AñadirCarrito(camisaFormalMangaLarga,10);
		local.AñadirCarrito(camisaMangaCorta,5);
		local.AñadirCarrito(camisaCasualMangaLarga,5);
		
		local.VaciarCarrito();
		local.Verificador();
		System.out.println("---------------------------------------------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

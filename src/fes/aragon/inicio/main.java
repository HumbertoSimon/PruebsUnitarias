package fes.aragon.inicio;

import fes.aragon.camisa.camisa;
import fes.aragon.tienda.Tienda;

public class main {
	public static void main(String[] args) {
		camisa camisaMangaCorta = new camisa();
		camisa camisaCasualMangaLarga = new camisa();
		camisa camisaFormalMangaLarga = new camisa();
		Tienda local = new Tienda();
		
		camisaMangaCorta = local.CMC();
		camisaCasualMangaLarga = local.CCML();
		camisaMangaCorta = local.CFML();
		
		local.AñadirCarrito(camisaMangaCorta, 4);
		local.AñadirCarrito(camisaCasualMangaLarga);
		local.AñadirCarrito(camisaMangaCorta);
		local.AñadirCarrito(camisaMangaCorta);
		
		local.Verificador();
	}
}


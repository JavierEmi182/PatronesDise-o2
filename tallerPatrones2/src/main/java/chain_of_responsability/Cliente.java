package chain_of_responsability;



public class Cliente {
	private static ManejadorBase getCadena() {
		ManejadorBase mbAsistente = new Asistente();
		ManejadorBase mbTecnico = new Tecnico();
		ManejadorBase mbJefeInv = new JefeInventario();
		ManejadorBase mbGerente = new Gerente();
		mbAsistente.setNext(mbTecnico);
		mbTecnico.setNext(mbJefeInv);
		mbJefeInv.setNext(mbGerente);
			return mbAsistente;	
		}
	
}

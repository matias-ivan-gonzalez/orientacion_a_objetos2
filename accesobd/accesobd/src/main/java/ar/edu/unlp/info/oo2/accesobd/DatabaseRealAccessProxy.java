package ar.edu.unlp.info.oo2.accesobd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DatabaseRealAccessProxy implements DatabaseAccess{
	// Proxy de protección: para validar datos (caso de este ejercicio)
	// Proxy virtual: para un acceso a base de datos eficiente (sólo se cargan los datos cuando son necesarios)
	// Proxy remoto: para representar otro objeto almacenado en otra dirección de memoria

	private DatabaseRealAccess databaseRealAccess;
	
	// Constructor
	public DatabaseRealAccessProxy(DatabaseRealAccess databaseRealAccess) {
		this.databaseRealAccess = databaseRealAccess;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(!checkAccess(databaseRealAccess.getCurrentId())) {
			throw new RuntimeException("accesso denegado");
		}
		return databaseRealAccess.getSearchResults(queryString);			
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(!checkAccess(databaseRealAccess.getCurrentId())) {
			throw new RuntimeException("accesso denegado");
		}
		return databaseRealAccess.insertNewRow(rowData);
	}

	private boolean checkAccess(int currentId) {
		return databaseRealAccess.isAllowed(currentId);
	}
	

}

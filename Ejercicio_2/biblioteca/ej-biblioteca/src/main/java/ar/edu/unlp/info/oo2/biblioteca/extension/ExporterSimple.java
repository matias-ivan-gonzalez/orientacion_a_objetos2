package ar.edu.unlp.info.oo2.biblioteca.extension;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.List;

public class ExporterSimple extends VoorheesExporter {
	
	private JSONArray unArray;
	
	public ExporterSimple() {
		unArray = new JSONArray();
	}
	
	@Override
	public String exportar(List<Socio> listaDeSocios) {
		listaDeSocios.forEach( socio -> this.exportar(socio));
		return unArray.toJSONString();
	}
	
	@SuppressWarnings("unchecked")
	private void exportar(Socio unSocio) {
		JSONObject unJsonObject = new JSONObject();
		unJsonObject.put("Nombre: ", unSocio.getNombre());
		unJsonObject.put("Email: ", unSocio.getEmail());
		unJsonObject.put("Legajo: ", unSocio.getLegajo());
		unArray.add(unJsonObject);
	}
	
}

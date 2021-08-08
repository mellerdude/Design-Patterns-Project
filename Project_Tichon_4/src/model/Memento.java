package model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Memento {
	
	private Map<String,Product> productsMap;
	
	public Memento(Map<String,Product> map) {
		this.productsMap = new LinkedHashMap<String,Product>(map);
	}

	public Map<String,Product> getProductMap(){
		return productsMap;
	}
}

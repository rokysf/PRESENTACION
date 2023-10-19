package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ticket implements Serializable{
	private Long id;
	private static Long index=0L;
	private List<Producte> productes;
	
	public static Long getIndex() {
		return index++;
	}

	
	
	public Ticket() {
		id=getIndex();
		productes = new ArrayList<Producte>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Producte> getProductes() {
		return productes;
	}

	public double getTotalTicket() {
		double total=0;
		for(Producte p: productes)
		total+=p.getPreu();
		return total;
	}


	@Override
	public String toString() {
		return id + "\n";
	}

	

}

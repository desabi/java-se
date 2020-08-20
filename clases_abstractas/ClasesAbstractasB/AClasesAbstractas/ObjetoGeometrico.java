import java.util.Date;

public abstract class ObjetoGeometrico {        
	private String color = "blanco";
	private boolean lleno;
	private Date fechaCreacion;
	
	protected ObjetoGeometrico() {
		fechaCreacion = new Date();
	}
	
	protected ObjetoGeometrico(String color, boolean lleno) {
		fechaCreacion = new Date();
		this.color = color;
		this.lleno = lleno;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public boolean isLleno(){
		return lleno;
	}
	
	public void setLleno(boolean lleno){
		this.lleno = lleno;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimetro();
	
}
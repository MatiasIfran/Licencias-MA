package model;

import java.time.LocalDate;

public class Conductor {
 //
	private String nombre;
	private String apellido;
	private TipoDocumento tipoDoc;
	private int numDoc;
	private TipoGrupoSanguineo tipoGrupoSanguineo;
	private char factorRH;
	private boolean dontanteOrganos;
	private LocalDate fechaNac;
	private String direccion;
	
	public Conductor(String nombre, String apellido, TipoDocumento tipoDoc, int numDoc,
			TipoGrupoSanguineo tipoGrupoSanguineo, char factorRH, boolean dontanteOrganos, LocalDate fechaNac,
			String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDoc = tipoDoc;
		this.numDoc = numDoc;
		this.tipoGrupoSanguineo = tipoGrupoSanguineo;
		this.factorRH = factorRH;
		this.dontanteOrganos = dontanteOrganos;
		this.fechaNac = fechaNac;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public TipoDocumento getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(TipoDocumento tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public int getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(int numDoc) {
		this.numDoc = numDoc;
	}
	public TipoGrupoSanguineo getTipoGrupoSanguineo() {
		return tipoGrupoSanguineo;
	}
	public void setTipoGrupoSanguineo(TipoGrupoSanguineo tipoGrupoSanguineo) {
		this.tipoGrupoSanguineo = tipoGrupoSanguineo;
	}
	public char getFactorRH() {
		return factorRH;
	}
	public void setFactorRH(char factorRH) {
		this.factorRH = factorRH;
	}
	public boolean isDontanteOrganos() {
		return dontanteOrganos;
	}
	public void setDontanteOrganos(boolean dontanteOrganos) {
		this.dontanteOrganos = dontanteOrganos;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}

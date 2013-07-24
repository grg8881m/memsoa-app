package org.memsoa.app.model;

// Generated 8/07/2013 08:12:02 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

	private String codigoCategoria;
	private String nombre;
	private Set patrons = new HashSet(0);
	private Set implementacionCategorias = new HashSet(0);

	public Categoria() {
	}

	public Categoria(String codigoCategoria, String nombre) {
		this.codigoCategoria = codigoCategoria;
		this.nombre = nombre;
	}

	public Categoria(String codigoCategoria, String nombre, Set patrons,
			Set implementacionCategorias) {
		this.codigoCategoria = codigoCategoria;
		this.nombre = nombre;
		this.patrons = patrons;
		this.implementacionCategorias = implementacionCategorias;
	}

	public String getCodigoCategoria() {
		return this.codigoCategoria;
	}

	public void setCodigoCategoria(String codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getPatrons() {
		return this.patrons;
	}

	public void setPatrons(Set patrons) {
		this.patrons = patrons;
	}

	public Set getImplementacionCategorias() {
		return this.implementacionCategorias;
	}

	public void setImplementacionCategorias(Set implementacionCategorias) {
		this.implementacionCategorias = implementacionCategorias;
	}

	/**
	 *@author <a href="mailto:cristian.arboleda@premize.com">Cristian M. Arboleda</a>
	 *@date 23/07/2013
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoCategoria == null) ? 0 : codigoCategoria.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/**
	 *@author <a href="mailto:cristian.arboleda@premize.com">Cristian M. Arboleda</a>
	 *@date 23/07/2013
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (codigoCategoria == null) {
			if (other.codigoCategoria != null)
				return false;
		} else if (!codigoCategoria.equals(other.codigoCategoria))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}

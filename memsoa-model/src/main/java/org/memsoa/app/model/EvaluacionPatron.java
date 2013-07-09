package org.memsoa.app.model;

// Generated 8/07/2013 08:12:02 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EvaluacionPatron generated by hbm2java
 */
public class EvaluacionPatron implements java.io.Serializable {

	private long codigoEvaluacionPatron;
	private Escala escalaByPtAdoptadoEscala;
	private Escala escalaByPtPublicadoEscala;
	private Patron patron;
	private Escala escalaByPtConceptualizadoEscala;
	private Escala escalaByPtImplementadoEscala;
	private Escala escalaByPtDocumentadoEscala;
	private Evaluacion evaluacion;
	private Short ptConceptualizadoPrecision;
	private Short ptDocumentadoPrecision;
	private Short ptPublicadoPrecision;
	private Short ptAdoptadoPrecision;
	private Short ptImplementadoPrecision;
	private String apreciacion;
	private Date fechaActualizacion;
	private Set evaluacionPatronPrincipios = new HashSet(0);

	public EvaluacionPatron() {
	}

	public EvaluacionPatron(long codigoEvaluacionPatron,
			Escala escalaByPtAdoptadoEscala, Escala escalaByPtPublicadoEscala,
			Patron patron, Escala escalaByPtConceptualizadoEscala,
			Escala escalaByPtImplementadoEscala,
			Escala escalaByPtDocumentadoEscala, Evaluacion evaluacion,
			Date fechaActualizacion) {
		this.codigoEvaluacionPatron = codigoEvaluacionPatron;
		this.escalaByPtAdoptadoEscala = escalaByPtAdoptadoEscala;
		this.escalaByPtPublicadoEscala = escalaByPtPublicadoEscala;
		this.patron = patron;
		this.escalaByPtConceptualizadoEscala = escalaByPtConceptualizadoEscala;
		this.escalaByPtImplementadoEscala = escalaByPtImplementadoEscala;
		this.escalaByPtDocumentadoEscala = escalaByPtDocumentadoEscala;
		this.evaluacion = evaluacion;
		this.fechaActualizacion = fechaActualizacion;
	}

	public EvaluacionPatron(long codigoEvaluacionPatron,
			Escala escalaByPtAdoptadoEscala, Escala escalaByPtPublicadoEscala,
			Patron patron, Escala escalaByPtConceptualizadoEscala,
			Escala escalaByPtImplementadoEscala,
			Escala escalaByPtDocumentadoEscala, Evaluacion evaluacion,
			Short ptConceptualizadoPrecision, Short ptDocumentadoPrecision,
			Short ptPublicadoPrecision, Short ptAdoptadoPrecision,
			Short ptImplementadoPrecision, String apreciacion,
			Date fechaActualizacion, Set evaluacionPatronPrincipios) {
		this.codigoEvaluacionPatron = codigoEvaluacionPatron;
		this.escalaByPtAdoptadoEscala = escalaByPtAdoptadoEscala;
		this.escalaByPtPublicadoEscala = escalaByPtPublicadoEscala;
		this.patron = patron;
		this.escalaByPtConceptualizadoEscala = escalaByPtConceptualizadoEscala;
		this.escalaByPtImplementadoEscala = escalaByPtImplementadoEscala;
		this.escalaByPtDocumentadoEscala = escalaByPtDocumentadoEscala;
		this.evaluacion = evaluacion;
		this.ptConceptualizadoPrecision = ptConceptualizadoPrecision;
		this.ptDocumentadoPrecision = ptDocumentadoPrecision;
		this.ptPublicadoPrecision = ptPublicadoPrecision;
		this.ptAdoptadoPrecision = ptAdoptadoPrecision;
		this.ptImplementadoPrecision = ptImplementadoPrecision;
		this.apreciacion = apreciacion;
		this.fechaActualizacion = fechaActualizacion;
		this.evaluacionPatronPrincipios = evaluacionPatronPrincipios;
	}

	public long getCodigoEvaluacionPatron() {
		return this.codigoEvaluacionPatron;
	}

	public void setCodigoEvaluacionPatron(long codigoEvaluacionPatron) {
		this.codigoEvaluacionPatron = codigoEvaluacionPatron;
	}

	public Escala getEscalaByPtAdoptadoEscala() {
		return this.escalaByPtAdoptadoEscala;
	}

	public void setEscalaByPtAdoptadoEscala(Escala escalaByPtAdoptadoEscala) {
		this.escalaByPtAdoptadoEscala = escalaByPtAdoptadoEscala;
	}

	public Escala getEscalaByPtPublicadoEscala() {
		return this.escalaByPtPublicadoEscala;
	}

	public void setEscalaByPtPublicadoEscala(Escala escalaByPtPublicadoEscala) {
		this.escalaByPtPublicadoEscala = escalaByPtPublicadoEscala;
	}

	public Patron getPatron() {
		return this.patron;
	}

	public void setPatron(Patron patron) {
		this.patron = patron;
	}

	public Escala getEscalaByPtConceptualizadoEscala() {
		return this.escalaByPtConceptualizadoEscala;
	}

	public void setEscalaByPtConceptualizadoEscala(
			Escala escalaByPtConceptualizadoEscala) {
		this.escalaByPtConceptualizadoEscala = escalaByPtConceptualizadoEscala;
	}

	public Escala getEscalaByPtImplementadoEscala() {
		return this.escalaByPtImplementadoEscala;
	}

	public void setEscalaByPtImplementadoEscala(
			Escala escalaByPtImplementadoEscala) {
		this.escalaByPtImplementadoEscala = escalaByPtImplementadoEscala;
	}

	public Escala getEscalaByPtDocumentadoEscala() {
		return this.escalaByPtDocumentadoEscala;
	}

	public void setEscalaByPtDocumentadoEscala(
			Escala escalaByPtDocumentadoEscala) {
		this.escalaByPtDocumentadoEscala = escalaByPtDocumentadoEscala;
	}

	public Evaluacion getEvaluacion() {
		return this.evaluacion;
	}

	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}

	public Short getPtConceptualizadoPrecision() {
		return this.ptConceptualizadoPrecision;
	}

	public void setPtConceptualizadoPrecision(Short ptConceptualizadoPrecision) {
		this.ptConceptualizadoPrecision = ptConceptualizadoPrecision;
	}

	public Short getPtDocumentadoPrecision() {
		return this.ptDocumentadoPrecision;
	}

	public void setPtDocumentadoPrecision(Short ptDocumentadoPrecision) {
		this.ptDocumentadoPrecision = ptDocumentadoPrecision;
	}

	public Short getPtPublicadoPrecision() {
		return this.ptPublicadoPrecision;
	}

	public void setPtPublicadoPrecision(Short ptPublicadoPrecision) {
		this.ptPublicadoPrecision = ptPublicadoPrecision;
	}

	public Short getPtAdoptadoPrecision() {
		return this.ptAdoptadoPrecision;
	}

	public void setPtAdoptadoPrecision(Short ptAdoptadoPrecision) {
		this.ptAdoptadoPrecision = ptAdoptadoPrecision;
	}

	public Short getPtImplementadoPrecision() {
		return this.ptImplementadoPrecision;
	}

	public void setPtImplementadoPrecision(Short ptImplementadoPrecision) {
		this.ptImplementadoPrecision = ptImplementadoPrecision;
	}

	public String getApreciacion() {
		return this.apreciacion;
	}

	public void setApreciacion(String apreciacion) {
		this.apreciacion = apreciacion;
	}

	public Date getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Set getEvaluacionPatronPrincipios() {
		return this.evaluacionPatronPrincipios;
	}

	public void setEvaluacionPatronPrincipios(Set evaluacionPatronPrincipios) {
		this.evaluacionPatronPrincipios = evaluacionPatronPrincipios;
	}

}

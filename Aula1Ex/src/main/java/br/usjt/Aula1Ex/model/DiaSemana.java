package br.usjt.Aula1Ex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_diasemana")
public class DiaSemana {
	@Id
	@GeneratedValue
	@Column(nullable = false, length = 200)
	@OneToOne
	@JoinColumn (name = "tb_tempo")
	private String diaSemana;

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}	
}

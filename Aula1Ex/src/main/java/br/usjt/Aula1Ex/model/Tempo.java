package br.usjt.Aula1Ex.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tempo")
public class Tempo implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@OneToOne
	@JoinColumn (name = "tb_diasemana")
	private String nomeDoDiaDaSemana;
	private double temperaturaMinima;
	private double temperaturaMaxima;
	private int humidadeRelativaAr;
	private String descricao;
	private float dataHora;
	private double lat;
	private double log;
	
	public String getNomeDoDiaDaSemana() {
		return nomeDoDiaDaSemana;
	}
	public void setNomeDoDiaDaSemana(String nomeDoDiaDaSemana) {
		this.nomeDoDiaDaSemana = nomeDoDiaDaSemana;
	}
	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}
	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	public double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	public void setTemperaturaMaxima(double temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	public int getHumidadeRelativaAr() {
		return humidadeRelativaAr;
	}
	public void setHumidadeRelativaAr(int humidadeRelativaAr) {
		this.humidadeRelativaAr = humidadeRelativaAr;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getDataHora() {
		return dataHora;
	}
	public void setDataHora(float dataHora) {
		this.dataHora = dataHora;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLog() {
		return log;
	}
	public void setLog(double log) {
		this.log = log;
	}
}

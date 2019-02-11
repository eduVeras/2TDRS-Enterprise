package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.NotFound;

@Entity

@Table(name = "TB_PASTEL")
@SequenceGenerator(name = "pastel", sequenceName = "TB_SQ_PASTEL", allocationSize = 1)
public class Pastel {
	@Id
	@GeneratedValue(generator = "pastel", strategy = GenerationType.SEQUENCE)
	private int codigo;
	private String sabor;

	private float preco;
	private boolean especial;
	@Enumerated(EnumType.STRING)
	private Massa tamanho;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataCriacao;
	
	@Transient
	private int chaveAcesso;
	
	@Lob
	private byte[] foto;
	

}

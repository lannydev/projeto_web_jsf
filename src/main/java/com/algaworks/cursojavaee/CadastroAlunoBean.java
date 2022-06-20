package com.algaworks.cursojavaee;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



@ManagedBean
@ViewScoped
public class CadastroAlunoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String nomeInvertido;
	private int quantidadePalavras;
	//private String email;
	
	/*public void cadastrar(){
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);

	}*/
	
	public void inverter(){
		this.nome = " ";
		this.quantidadePalavras = 0;
		this.nomeInvertido = " ";
		
		if(this.nome != null && !this.nome.isEmpty()){
			this.quantidadePalavras = 1;
		}
		
		for(int i = this.nome.length()-1; i>=0; i--){
			char letra = this.nome.charAt(i);
			this.nomeInvertido += letra;
			
			if(letra == ' '){
				this.quantidadePalavras++;
			}
		}
		
		System.out.println("Nome invertido: " + this.nomeInvertido);
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNomeInvertido(){
		return nomeInvertido;
	}
	
	public int getQuantidadePalavras(){
		return quantidadePalavras;
	}


}

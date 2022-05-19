package br.com.senai.manutencaosenaiapi.view;

import javax.swing.JFrame;

public abstract class JFrameVolta extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	protected JFrameVolta telaAnterior;

	public void setAnterior(JFrameVolta anterior) {
		this.telaAnterior = anterior;
	}
	
	protected void trocarPara(TelaCadastroDeTipoDePeca telaDeCadastroDeTipo) {
		this.setVisible(false);
		telaDeCadastroDeTipo.setLocation(this.getLocation());
		telaDeCadastroDeTipo.setAnterior(this);
		telaDeCadastroDeTipo.setVisible(true);
	}
	
	protected void voltarPara(JFrameVolta tela) {
		this.setVisible(false);
		tela.setLocation(this.getLocation());
		tela.setVisible(true);
	}
	
}
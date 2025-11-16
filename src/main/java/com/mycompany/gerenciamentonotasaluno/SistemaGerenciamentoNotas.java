/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciamentonotasaluno;

/**
 *
 * @author Hideking
 */
public class SistemaGerenciamentoNotas {

  private String alunoNome;
    private double[] notasAluno = new double[3];

    public void setAlunoNome(String AlunonomeCompleto) {
        this.alunoNome = AlunonomeCompleto;
    }
    public String getNomeAluno() {
        return alunoNome;
    }
    public void setNotasAluno(double[] notas) {
        this.notasAluno = notas;
    }
    public double[] getNotasAluno() {
        return notasAluno;
    }

    private double calculoMedia(double[] notas) {
        double mediaAluno  = 0.0;
        notas = this.getNotasAluno();
        for (int i = 0; i < 3;i++) {
            mediaAluno += notas[i];
        }
        mediaAluno = mediaAluno / 3;
        return mediaAluno;
    }
    public double getMediaAluno() {
        return this.calculoMedia(notasAluno);
    }
    
    private String calculoResultado() {

        double mediaAluno = this.calculoMedia(this.getNotasAluno());
        String resultado;
        if (mediaAluno >= 0 && mediaAluno < 6.0) {
            resultado = "Reprovado";
        } else if (mediaAluno >= 6.0 && mediaAluno <= 9.0) {
            resultado = "Aprovado";
        } else if (mediaAluno > 9.0 && mediaAluno <= 10.0) {
            resultado = "Otimo Aproveitamento";
        } else {
            resultado = "Erro! Algo deu errado";
        }
        return resultado;
    }
    
    public String getResultado(){
        return this.calculoResultado();
    }
    
}

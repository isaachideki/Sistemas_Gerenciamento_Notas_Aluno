/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gerenciamentonotasaluno;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class MediaNota {

    public static void main(String[] args) {
        SistemaGerenciamentoNotas s = new SistemaGerenciamentoNotas();

        String nomeCompletoAluno;
        String[] nota = new String[3];
        double[] notas = new double[3];

        System.out.println("");
        nomeCompletoAluno = JOptionPane.showInputDialog(
                null, "Insirá o nome do aluno completo : ", ""
        );
        s.setAlunoNome(nomeCompletoAluno);

        System.out.println("Insirá as três notas do aluno para calcular média : ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota" + i);
            nota[i] = JOptionPane.showInputDialog(
                    null,"Digite a nota " + (i + 1) + ": ", ""
            );
            notas[i] = Double.parseDouble(nota[i]);
        }

        s.setNotasAluno(notas);
        
        System.out.println(" O Resultado eh: \n");
        s.getMediaAluno();
        String mensagem = "";

        mensagem += String.format("""
      O Nome do aluno é : %s                   
      A sua media do aluno é : %.2f
      Resultado: %s""",
                s.getNomeAluno(),
                s.getMediaAluno(),
                s.getResultado()
        );
        JOptionPane.showMessageDialog(null, mensagem, "Resultado da Projeção", JOptionPane.INFORMATION_MESSAGE);
    }
}

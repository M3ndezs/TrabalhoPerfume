package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Base {

    ArrayList lista = new ArrayList();

    public String listar() {
        String resultado = "LISTA DE PRODUTOS \n";
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                resultado += lista.get(i) + "\n";
            }
        } else {
            resultado = "Lista vazia";
        }
        return resultado;
    }

    public void salvar(String produto) {
        lista.add(produto);
    }

    public void excluir(int cod) {
        if (!lista.isEmpty()) {
            cod = cod - 1;
            if (cod >= 0 && cod < lista.size()) {
                //if (JOptionPane.showConfirmDialog(null,
                // "tem certeza que deseja excluir?" + lista.get(cod),
                //"exclusão",
                //JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) { 

                lista.remove(cod);

                //} else {
                //  JOptionPane.showMessageDialog(null, "arregou xiru!");
            }

            //} else {
            // JOptionPane.showMessageDialog(null, "Código informado incorreto!");
            //  }
        } else {
            JOptionPane.showMessageDialog(null, "impossivel excluir uma lista vazia!");

        }
    }

    public void alterar(int cod, String novoNome) {
        if (!lista.isEmpty()) {
            cod = cod - 1;
            if (cod >= 0 && cod < lista.size()) {
                //  if (JOptionPane.showConfirmDialog(null,
                //    "tem certeza que deseja alterar?" + lista.get(cod),
                //   "alteração",
                //   JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                lista.set(cod, novoNome);

                //  } else {
                //      JOptionPane.showMessageDialog(null, "arregou xiru!");
                //   }
                //  } else {
                //    JOptionPane.showMessageDialog(null, "Código informado incorreto!");
                //  }
            } else {
                JOptionPane.showMessageDialog(null, "impossivel alterar uma lista vazia!");

            }
        }
    }

    public void contar(int cod) {
        int tamanho = lista.size();
        JOptionPane.showMessageDialog(null, "você possui " + tamanho + " produtos em sua lista!");
        }
    }


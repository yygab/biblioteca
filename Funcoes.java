package Trabalho;
import java.util.*;
import javax.swing.*;

public class Funcoes {
 public static ArrayList<Pessoa> cliente = new ArrayList <Pessoa>();
  public void cadastrarUsuario() {
	  String nome = JOptionPane.showInputDialog("Informe seu nome: ");
	  String cpf = JOptionPane.showInputDialog("Infome seu cpf: ");
	 Pessoa a = new Pessoa (nome, cpf);
	 Funcoes.cliente.add(a);
  }
  public static ArrayList<Livro> book = new ArrayList <Livro>();
  public void cadastrarLivro() {
	  String name = JOptionPane.showInputDialog("Informe o título do livro: ");
	  String autor = JOptionPane.showInputDialog("Infome o autor: ");
	 Livro b = new Livro (name, autor);
	 Funcoes.book.add(b);
  }
  public void mostrarUser () {
	  String aux = "";
	  for(int i = 0; i <Funcoes.cliente.size(); i++) {
			aux += Funcoes.cliente.get(i).nome + "\n";
	  }
	  JOptionPane.showMessageDialog(null, "Usuarios: " +aux);
  }
	  public void mostrarLivro () {
		  String auxx = "";
		  for(int a = 0; a <Funcoes.book.size(); a++) {
				auxx += Funcoes.book.get(a).name + "\n";
	  }
		  JOptionPane.showMessageDialog(null, "Livros: " +auxx);
}
	  public static ArrayList<Emprestimo> lending = new ArrayList <Emprestimo>();
	  
	   public void emprestarLivro() {
		 int  auxxx= 1;
		 Livro aux = null;
		 String name = JOptionPane.showInputDialog("Informe o título do livro: ");
		 for  (Livro l: book) {
			 if (name.equals(l.name)) {
				 aux = l;
		     }
			 }
		 int auxy = 1;
		 Pessoa auxyy= null;
		 String nome = JOptionPane.showInputDialog ("informe o nome do usuário: ");
		 for (Pessoa p: cliente) {
			 if(nome.equals(p.nome)) {
				 auxyy = p;
			 }
		 }
		 
		 Emprestimo e = new Emprestimo(auxyy, aux , "22");
		 lending.add(e);
		 JOptionPane.showMessageDialog(null, "Emprestimo feito!", "Biblioteca", JOptionPane.PLAIN_MESSAGE);
		 }
	   
	 public void mostrarEmprestimo() {
		 String azz= "";
		 for(int m = 0; m <Funcoes.lending.size(); m++) {
				azz += Funcoes.lending.get(m) + "\n";
		  }
		  JOptionPane.showMessageDialog(null, "Emprestimos: " +azz);
	 }
		   }
	   
	  

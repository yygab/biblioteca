package Trabalho;
 import javax.swing.*;
public class Main {
	public static void main (String[] args) {
		Funcoes f = new Funcoes();
   int op = 1;
   while(op != 0) {
		op = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "********************************************\n"
				+ "*              (1) CADASTRAR USUARIO        *\n"
				+ "*              (2) CADASTRAR LIVRO          *\n"
				+ "*              (3) MOSTRAR USUÁRIO          *\n"
				+ "               (4) MOSTRAR LIVRO            *\n"
				+ "               (5) EMPRÉSTIMO               *\n"
				+ "               (6) MOSTRAR EMPRÉSTIMOS      *\n"
				+ "*****************(************************"));
		switch(op) {
		case 1: 
			f.cadastrarUsuario();
		break;
		case 2: 
			f.cadastrarLivro();
	    break;
		case 3: 
			f.mostrarUser();
	    break;
		case 4:
			f.mostrarLivro();
		break;
		case 5:
			f.emprestarLivro();
			break;
		case 6 :
			f.mostrarEmprestimo();
			break;
		}
}
}
}
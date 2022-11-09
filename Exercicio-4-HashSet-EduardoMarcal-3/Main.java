import package8.*;
import java.util.*;

class Main {

  static List<Aluno> alunos = new ArrayList<>();
  static Scanner kboard = new Scanner(System.in);

  public static void main(String[] args) {
    int i = 1;
    String entrada;
    
    //cadastra aluno
    alunos.add(new Aluno(i++));
    System.out.println("Deseja Cadastrar outro aluno?");
    entrada = kboard.next();
    while (entrada.equals("s")) {
      alunos.add(new Aluno(i++));
      System.out.println("Deseja Cadastrar outro aluno?");
      entrada = kboard.next();
    }

    //exibe Dados Alunos
    for (int j = 0; j < alunos.size(); j++) {
      Iterator itEmail = alunos.get(j).getEmail().iterator();
      Iterator itTel = alunos.get(j).getTelefone().iterator();
      System.out.println("Nome: " + alunos.get(j).getNome());
      System.out.print("E-mail: ");
      while (itEmail.hasNext()) {
        System.out.print(itEmail.next());
        if (itEmail.hasNext()) {
          System.out.print(", ");
        } else {
          System.out.println();
        }
      }
      System.out.print("Telefone: ");
      while (itTel.hasNext()) {
        System.out.print(itTel.next());
        if (itTel.hasNext()) {
          System.out.print(", ");
        } else {
          System.out.println();
        }
      }
    }

  }
}
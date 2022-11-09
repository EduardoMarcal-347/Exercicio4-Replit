package package8;

import java.util.Scanner;
import java.util.HashSet;

public class Aluno{

  private String nome;
  private int numAluno;
  private HashSet<String> email = new HashSet<>();
  private HashSet<String> telefone = new HashSet<>();
  static Scanner kboard = new Scanner(System.in);
  
  
  public Aluno(int numAluno){
    this.numAluno = numAluno;
    cadastrarAluno();
  }

  public String getNome(){
    return nome;
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }

  public HashSet getEmail(){
    return email;
  }
  
  public void setEmail(String endereco){
    email.add(endereco);
  }
  
  public HashSet getTelefone(){
    return telefone;
  }
  
  public void setTelefone(String numero){
    telefone.add(numero);
  }

  

  public void cadastrarAluno(){
    String entrada; 
    
    System.out.println("Nome aluno "+ numAluno +":");
    setNome(kboard.nextLine());
    System.out.println("e-mail do aluno "+ numAluno +":");
    setEmail(kboard.nextLine());
    System.out.println("Deseja cadastrar outro e-mail? : ");
    entrada = kboard.nextLine();
    desejaOutro("email", entrada);
    System.out.println("telefone do aluno "+ numAluno +":");
    setTelefone(kboard.nextLine());
    System.out.println("Deseja cadastrar outro telefone? : ");
    entrada = kboard.nextLine();
    desejaOutro("telefone", entrada);
  }

  public void desejaOutro(String tipo, String entrada){
    while(entrada.equals("s")){
      System.out.println(tipo +" do aluno "+ numAluno +":");
      if(tipo.equals("email")){
        setEmail(kboard.nextLine());
        
      } else if(tipo.equals("telefone")){
        setTelefone(kboard.nextLine());
      }
      System.out.println("Deseja cadastrar outro "+ tipo +"? : ");
      entrada = kboard.nextLine();
    }
  }
  
}
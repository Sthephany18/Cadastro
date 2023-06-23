
package cadastro;


public class Contato {
   
   private String nome;
   private String matricula;
   public String turma;
   public String foto;

    public Contato() {
    }

    public Contato(String matriculada) {
        this.foto = foto;
    }

    public Contato(String nome, String matricula, String turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
     
    public void cadastro(){
        System.out.println("Aluno(a) com nome " + this.getNome ());
        System.out.println("Matricula "+this.matricula);
        System.out.println("A turma e " + this.getTurma());
        System.out.println("Foto "+this.foto);
        System.out.println("foi cadastrado(a) " );
        
    }
    public void alterar(){
         if("sim".equals(this.foto)){
             System.out.println("A pessoa esta matriculada");
         }
         else{
             System.out.println("A matricula foi cancelada");
         }   
        }
    
}


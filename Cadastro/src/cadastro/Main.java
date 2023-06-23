package cadastro;

public class Main  {
    
    public static void main(String[] args) throws Exception{
        AgendaDAO contatoDao = new AgendaDAO();
        
        Contato contato = new Contato();
        
        contato.setNome("alguem");
        contato.setTurma("3tec");
        contato.setMatricula("22");
        contato.setFoto("nao");
        
        contatoDao.save(contato);
        
        
    }
    
    
}

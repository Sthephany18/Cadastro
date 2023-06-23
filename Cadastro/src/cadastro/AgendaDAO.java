package cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AgendaDAO {
    /*
    *CRUD
    *C:CREATE
    *R:READ
    *U:UPDATE
    *D:DELETE
    */
    
   public void save(Contato alunos) throws Exception{
       String sql = "INSERT INTO alunos(nome,turma,matricula,foto) VALUES(?,?,?,?)";
       Connection conn = null;
       PreparedStatement pstm = null;
       
       try{
           conn = ConnectionFactory.createConnectionToMySQL();
           pstm  = (PreparedStatement) conn.prepareStatement(sql);
           pstm.setString(1, alunos.getNome());
           pstm.setString(2, alunos.getTurma());
           pstm.setString(3, alunos.getMatricula());
           pstm.setString(4, alunos.getFoto());
           
           pstm.execute();
       }catch (SQLException e) {
       }finally{
           //fechar conexao
         try{
             if(pstm!=null){
                 pstm.close();
             }
             if (conn!=null){
                 conn.close();
                 
             }
         }catch (SQLException e){
             e.fillInStackTrace();
         }  
          AgendaDAO contatoDao = new AgendaDAO();
        
        Contato contato = new Contato();
        
        contato.setNome("alguem");
        contato.setTurma("3tec");
        contato.setMatricula("22");
        contato.setFoto("nao");
        
        contatoDao.save(contato);
         
           
       }
       
       
   } 
    
    
    
    
    
    
    
}

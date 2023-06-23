package cadastro;

import cadastro.PainelCadastro;
import static com.mysql.cj.conf.PropertyKey.PASSWORD;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static void main(String[] args) throws ClassNotFoundException {
        PainelCadastro form = new PainelCadastro();
        form.setVisible(true);
        String url = "jdbc:mysql://localhost:3306/turma";
        String usuario = "root";
        String senha = "";
        
        Connection conexao = null;
        
        try {
            
    
        
     
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            System.out.println("Conexão estabelecida com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão: " + e.getMessage());
        }
       
        try{
            
            conexao.close();
            System.out.println("Conexao Encerrada com sucesso");
        }catch (SQLException e){
            System.out.println("Erro ao encerrar conexao"+ e.getMessage());
        }
       


    }

    public static Connection createConnectionToMySQL() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola2");
        return connection;
    }
}
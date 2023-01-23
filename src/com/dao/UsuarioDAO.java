package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Usuario;
import com.factory.ConnectionFactory;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO{

    public void save(Usuario usuario) {
        String sql = "INSERT INTO USUARIO(id, Nome, CPF, Data, email, telefone, endereco)  "
                + "VALUES(?, ?, ?, ?, ?, ?, ?);";
		
        Connection conn = null;
        PreparedStatement pstm = null;
		
    try {conn = ConnectionFactory.createConnectionToMySQL();
			
        pstm = conn.prepareStatement(sql);
        pstm.setString(1, usuario.getId());
        pstm.setString(2, usuario.getNome());
        pstm.setString(3, usuario.getCpf());
        pstm.setString(4, usuario.getData());
        pstm.setString(5, usuario.getEmail());
        pstm.setString(6, usuario.getTelefone());
        pstm.setString(7, usuario.getEndereco());

        pstm.execute();
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			
}
    catch(Exception e) {e.printStackTrace();}
        finally{
            try{
                if(pstm!=null){pstm.close();
    }
				
                if(conn!=null){conn.close();
    }
}   catch(Exception e){e.printStackTrace();
            }
        }
    }
    
    public void update(Usuario usuario){
        
        String sql = "UPDATE usuario SET nome = ?, CPF = ?, Data = ?, email = ? ,"
                + "telefone = ?, endereco = ? WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getCpf());
            pstm.setString(3, usuario.getData());
            pstm.setString(4, usuario.getEmail());
            pstm.setString(5, usuario.getTelefone());
            pstm.setString(6, usuario.getEndereco());
            pstm.setString(7, usuario.getId());
            
            pstm.execute();
                                
        }
        catch(Exception e) {e.printStackTrace();}
        finally{
            try{
                if(pstm!=null){pstm.close();
    }
				
                if(conn!=null){conn.close();
    }
}   catch(Exception e){e.printStackTrace();
            }
        }
    }
    public void delete(String Id){
    String sql = "DELETE FROM usuario WHERE id = ?";
    
    Connection conn = null;

    PreparedStatement pstm = null;
    
    try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, Id);
            
            pstm.execute();
                                
        }
        catch(Exception e) {e.printStackTrace();}
        finally{
            try{
                if(pstm!=null){pstm.close();
    }
				
                if(conn!=null){conn.close();
    }
}   catch(Exception e){e.printStackTrace();
            }
        }
    }
    
}
      
  

 
    
    
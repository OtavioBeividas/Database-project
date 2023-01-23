package modelo;

public class Usuario {  
    String id;
    String nome;
    String data;
    String cpf;
    String email;
    String telefone;
    String endereco;
    
    public Usuario(){}
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    } 
    public String getNome() { 
        return nome;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getTelefone() { 
        return telefone;
    } 
    public void setTelefone(String telefone) { 
        this.telefone = telefone;
    } 
    public String getEndereco() { 
        return endereco;
    } 
    public void setEndereco(String endereco) { 
        this.endereco = endereco;
    } 

    public void add(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
 
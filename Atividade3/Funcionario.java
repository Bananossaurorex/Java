public class Funcionario {
    private String codigo; 
    private String nome; 
    private Endereco endereco;
    private String telefone; 
    private String email; 
    private ContaBancaria contaBancaria;

    public Funcionario(String codigo, ContaBancaria contaBancaria, String email, Endereco endereco, String nome, String telefone) {
        this.codigo = codigo;
        this.contaBancaria = contaBancaria;
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }


    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }
    
    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
    
    
    @Override
    public String toString() {
        return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco.toString() + ", telefone=" + telefone
                + ", email=" + email + ", contaBancaria=" + contaBancaria.toString() + "]";
    }
}

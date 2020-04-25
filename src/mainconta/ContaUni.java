package mainconta;
public class ContaUni extends Conta{
    private String curso;

    //CONSTRUTOR 
    
    public ContaUni(String nome_titular, String CPF,String curso){
        super(nome_titular, CPF);
        setCurso(curso); 
    }
    
    
    
    //GETS SETS
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

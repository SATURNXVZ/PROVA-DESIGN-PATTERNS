public abstract class Emprestimo{
    protected double valor;
    protected boolean emprestimoValido;
    protected String mensagem;


    public Emprestimo(Double valor){
        this.valor = valor;
        this.emprestimoValido = false; //comecar invalda
        this.mensagem = "";
    }


    public abstract double calcOperacao();
    public abstract double calcJuros();

    
    public void processar(){

        if(!emprestimoValido){
            this.mensagem = "EMPRESTIMO RECUSADO";
        }
    }

    

}
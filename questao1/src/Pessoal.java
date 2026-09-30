public class Pessoal extends Emprestimo {
    private double juros = 3.5;
    private boolean identidade;
    private boolean comprovanteRenda;
    private double valorfinal;

    
    public Pessoal(Double Valor, boolean identidade, boolean comprovanteRenda) {
        super(valor);
        this.identidade = identidade;
        this.comprovanteRenda = comprovanteRenda;
    }

    @Override
    public double calcJuros(){
        juros = juros * 0.01;
        return juros;
    }

    @Override
    public double calcOperacao(){
        valorfinal *= calcJuros();
        return valorfinal;
    }

    @Override
    public void processar(){
        if()
    }
    


    @Override
    public java.util.List<String> listarDocumentos(){
        java.util.List<String> documentos = new java.util.ArrayList<>();
        documentos.add("CNH");
        documentos.add("CRLV");
        documentos.add("Comprovante de Residência");
        return documentos;
    }


    @Override
    public String getPrefixo(){
        return "AUTO-";
    }

    
}
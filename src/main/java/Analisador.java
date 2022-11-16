
public abstract class Analisador implements Constantes {

    private String nomeArquivoEntrada;

    public Analisador(String nomeArquivoEntrada) {
        this.nomeArquivoEntrada = nomeArquivoEntrada;
    }

    public Analisador() {
        this.nomeArquivoEntrada = NOME_DEFAULT_ARQUIVO_ENTRADA;
    }

    public void setNomeArquivoEntrada(String nomeArquivoEntrada) {
        this.nomeArquivoEntrada = nomeArquivoEntrada;
    }

    public String getNomeArquivoEntrada() {
        return nomeArquivoEntrada;
    }
}

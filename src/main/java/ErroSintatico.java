
public class ErroSintatico extends RuntimeException implements Constantes {

    private Token tokenEncontrado;
    private Token[] tokensEsperados;
    private int linha;
    private int coluna;

    public ErroSintatico(Token _tokenEncontrado, Token[] _tokensEsperados, int linha, int coluna) {
        setTokenEncontrado(_tokenEncontrado);
        setTokensEsperados(_tokensEsperados);
        setLinha(linha);
        setColuna(coluna);
    }

    public ErroSintatico(Token _tokenEncontrado, Token _tokenEsperado, int linha, int coluna) {
        setTokenEncontrado(_tokenEncontrado);        
        this.tokensEsperados = new Token[1];
        tokensEsperados[0] = _tokenEsperado;
        setLinha(linha);
        setColuna(coluna);
    }

    public Token getTokenEncontrado() {
        return tokenEncontrado;
    }

    public void setTokenEncontrado(Token tokenEncontrado) {
        this.tokenEncontrado = tokenEncontrado;
    }

    public Token[] getTokensEsperados() {
        return tokensEsperados;
    }

    public void setTokensEsperados(Token[] tokensEsperados) {
        this.tokensEsperados = tokensEsperados;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    
    @Override
    public String toString() {
        String listaDeTokensEsperados = "";
        for (int i = 0; i < this.tokensEsperados.length; i++) {
            listaDeTokensEsperados += this.tokensEsperados[i] + " ";
        }
        return "Token encontrado: " + this.tokenEncontrado  
                + "\n  Na linha " + linha + " coluna " + coluna
                + "\n  Era(m) esperado(s): " + listaDeTokensEsperados;
    }
}

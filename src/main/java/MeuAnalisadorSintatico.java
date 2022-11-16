public class MeuAnalisadorSintatico extends AnalisadorSintatico {

    public MeuAnalisadorSintatico(String nomeArquivoEntrada) {
        super(nomeArquivoEntrada);
    }

    public void inicio() {
        corpo();
        reconhece(Token.EOF);
    }

    public void corpo() {
        if (proxTokenIs(Token.IDENTIFICADOR)) {
            comandoAtribuicao();
            reconhece(Token.PONTOVIRGULA);
            corpo();
        } else 
            if (proxTokenIs(Token.EOF))	
                ; else {
            Token[] tokensEsperados = {Token.IDENTIFICADOR, Token.EOF};
            throw new ErroSintatico(this.leitor.tokenReconhecido, tokensEsperados);
        }
    }

    public void comandoAtribuicao() {
        reconhece(Token.IDENTIFICADOR);
        reconhece(Token.ATRIBUICAO);
        exp();
    }

    public void exp() {
        if (proxTokenIs(Token.NUMERO)) {
            leProxToken();
        } else if (proxTokenIs(Token.IDENTIFICADOR)) {
            leProxToken();
        } else {
            Token[] tokensEsperados = {Token.NUMERO, Token.IDENTIFICADOR};
            throw new ErroSintatico(this.leitor.tokenReconhecido, tokensEsperados);
        }
    }
}

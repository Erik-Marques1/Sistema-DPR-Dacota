public class Dpr {

    // ATRIBUTOS
    private String lote;
    private String materiaPrima;
    private String produto;
    private int quantidadeFeita;
    private double horimetroInicial;
    private double horimetroFinal;
    private String numeroOperador;
    private String aspecto;
    private int centelhamento;
    private String gravacao;
    private String observacoes;
    private String resultadoFinalizado;



    // CONSTRUTOR
    public Dpr(
            String lote,
            String materiaPrima,
            String produto,
            int quantidadeFeita,
            double horimetroInicial,
            double horimetroFinal,
            String numeroOperador,
            String aspecto,
            int centelhamento,
            String gravacao,
            String observacoes,
            String resultadoFinalizado) {

        this.lote = lote;
        this.materiaPrima = materiaPrima;
        this.produto = produto;
        this.quantidadeFeita = quantidadeFeita;
        this.horimetroInicial = horimetroInicial;
        this.horimetroFinal = horimetroFinal;
        this.numeroOperador = numeroOperador;
        this.aspecto = aspecto;
        this.centelhamento = centelhamento;
        this.gravacao = gravacao;
        this.observacoes = observacoes;
        this.resultadoFinalizado = resultadoFinalizado;
    }


    // GETTERS E SETTERS
    //LOTE
    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    //MATERIA PRIMA
    public String getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    //MATERIAL
    public String getMaterial() {
        return produto;
    }

    public void setMaterial(String material) {
        this.produto = material;
    }

    //QUANTIDADE FEITA
    public int getQuantidadeFeita() {
        return quantidadeFeita;
    }

    public void setQuantidadeFeita(int quantidadeFeita) {
        this.quantidadeFeita = quantidadeFeita;
    }

    //HORIMETRO INICIAL
    public double getHorimetroInicial() {
        return horimetroInicial;
    }

    public void setHorimetroInicial(double horimetroInicial) {
        this.horimetroInicial = horimetroInicial;
    }

    //HORIMETRO FINAL
    public double getHorimetroFinal() {
        return horimetroFinal;
    }

    public void setHorimetroFinal(double horimetroFinal) {
        this.horimetroFinal = horimetroFinal;
    }

    //NUMERO OPERADOR
    public String getNumeroOperador() {
        return numeroOperador;
    }

    public void setNumeroOperador(String numeroOperador) {
        this.numeroOperador = numeroOperador;
    }

    //ASPECTO
    public String getAspecto() {
        return aspecto;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    //CENTELHAMENTO
    public int getCentelhamento() {
        return centelhamento;
    }

    public void setCentelhamento(int centelhamento) {
        this.centelhamento = centelhamento;
    }

    //GRAVAÇÃO
    public String getGravacao() {
        return gravacao;
    }

    public void setGravacao(String gravacao) {
        this.gravacao = gravacao;
    }

    //OBSERVAÇÕES
    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    //RESULTADO FINAL
    public String getResultadoFinalizado() {
        return resultadoFinalizado;
    }

    public void setResultadoFinalizado(String resultadoFinalizado) {
        this.resultadoFinalizado = resultadoFinalizado;
    }





    // MOSTRAR AS INFORMAÇÕES
    public void exibirInformacoes() {

        System.out.println("\n========== DPR ==========");

        System.out.println("Lote: " + lote);
        System.out.println("Matéria-prima: " + materiaPrima);
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade feita: " + quantidadeFeita);

        System.out.println(
                "Horímetro inicial: " + horimetroInicial
        );

        System.out.println(
                "Horímetro final: " + horimetroFinal
        );

        System.out.println(
                "Número do operador: " + numeroOperador
        );

        System.out.println("Aspecto: " + aspecto);

        System.out.println(
                "Centelhamento: " + centelhamento
        );

        System.out.println("Gravação: " + gravacao);

        System.out.println(
                "Observações: " + observacoes
        );

        System.out.println(
                "Resultado final: " + resultadoFinalizado
        );
    }


    // SALVAR DPR
    public void saveDPR() {

        System.out.println("\nDPR salvo com sucesso!");

        System.out.println(
                "Lote: " + lote
        );

        System.out.println(
                "Resultado: " + resultadoFinalizado
        );
    }
}


public class DprComLoteAnterior extends dpr {

        // Atributo exclusivo da classe filha
        private String loteAnterior;


        // CONSTRUTOR
        public DprComLoteAnterior(String lote, String materiaPrima, String produto, int quantidadeProdutoFeito,
           double horimetroInicial, double horimetroFinal, String numeroOperador, String aspecto,
            int centelhamento, String gravacao, String observacoes, String resultadoFinalizado) {

            super( lote, materiaPrima, produto, quantidadeProdutoFeito, horimetroInicial, horimetroFinal, numeroOperador,
                    aspecto, centelhamento, gravacao, observacoes, resultadoFinalizado);
        }



    // GETTER
        public String getLoteAnterior() {
            return loteAnterior;
        }


        // SETTER
        public void setLoteAnterior(String loteAnterior) {
            this.loteAnterior = loteAnterior;
        }


        // POLIMORFISMO / SOBRESCRITA
        @Override
        public void exibirInformacoes() {

            // Mostra primeiro os dados normais do DPR
            super.exibirInformacoes();

            // Depois mostra o dado específico
            System.out.println(
                    "Lote anterior: " + loteAnterior
            );
        }
}


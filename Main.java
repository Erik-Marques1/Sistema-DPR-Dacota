import java.util.Scanner;

    // Verifica se o cabo existe na lista
    public static boolean caboValido(String material, String[] cabos) {

        for (int i = 0; i < cabos.length; i++) {

            if (material.equalsIgnoreCase(cabos[i])) {
                return true;
            }
        }

        return false;
    }




    // Corrige as informações antes de salvar
    public static void corrigirDPR(dpr dpr1, Scanner scanner, String[] cabos) {

        int opcao;

        do {

            System.out.println("\n===== CORRIGIR DPR =====");

            System.out.println("1 - Lote");
            System.out.println("2 - Matéria-prima");
            System.out.println("3 - Material");
            System.out.println("4 - Quantidade");
            System.out.println("5 - Horímetro final");
            System.out.println("6 - Operador");
            System.out.println("7 - Aspecto");
            System.out.println("8 - Centelhamento");
            System.out.println("9 - Gravação");
            System.out.println("10 - Observações");
            System.out.println("0 - Finalizar correção");

            System.out.print("Escolha: ");
            opcao = Integer.parseInt(scanner.nextLine());


            switch (opcao) {

                case 1:

                    System.out.print("Novo lote: ");
                    dpr1.setLote(scanner.nextLine());

                    break;


                case 2:

                    System.out.print("Nova matéria-prima: ");
                    dpr1.setMateriaPrima(scanner.nextLine());

                    break;


                case 3:

                    String novoMaterial;

                    do {

                        System.out.print("Novo material: ");
                        novoMaterial = scanner.nextLine();

                        if (!caboValido(novoMaterial, cabos)) {

                            System.out.println(
                                    "Cabo não cadastrado!"
                            );
                        }

                    } while (!caboValido(novoMaterial, cabos));

                    dpr1.setMateriaPrima(novoMaterial);

                    break;


                case 4:

                    System.out.print("Nova quantidade: ");

                    dpr1.setQuantidadeFeita(
                            Integer.parseInt(scanner.nextLine())
                    );

                    break;


                case 5:

                    double novoHorimetro;

                    do {

                        System.out.print(
                                "Novo horímetro final: "
                        );

                        novoHorimetro =
                                Double.parseDouble(
                                        scanner.nextLine()
                                );

                        if (
                                novoHorimetro <
                                        dpr1.getHorimetroInicial()
                        ) {

                            System.out.println(
                                    "O horímetro final não pode ser "
                                            + "menor que o inicial!"
                            );
                        }

                    } while (
                            novoHorimetro <
                                    dpr1.getHorimetroInicial()
                    );

                    dpr1.setHorimetroFinal(
                            novoHorimetro
                    );

                    break;


                case 6:

                    System.out.print(
                            "Novo número do operador: "
                    );

                    dpr1.setNumeroOperador(
                            scanner.nextLine()
                    );

                    break;


                case 7:

                    System.out.print(
                            "Novo aspecto: "
                    );

                    dpr1.setAspecto(
                            scanner.nextLine()
                    );

                    break;


                case 8:

                    System.out.print(
                            "Novo centelhamento: "
                    );

                    dpr1.setCentelhamento(
                            Integer.parseInt(
                                    scanner.nextLine()
                            )
                    );

                    break;


                case 9:

                    System.out.print(
                            "Nova gravação: "
                    );

                    dpr1.setGravacao(
                            scanner.nextLine()
                    );

                    break;


                case 10:

                    System.out.print(
                            "Novas observações: "
                    );

                    dpr1.setObservacoes(
                            scanner.nextLine()
                    );

                    break;


                case 0:

                    System.out.println(
                            "Correção finalizada."
                    );

                    break;


                default:

                    System.out.println(
                            "Opção inválida."
                    );
            }

        } while (opcao != 0);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Cabos cadastrados no sistema
        String[] cabos = {

                "Veia Controle 1,5mm",
                "Veia Controle 2,5mm",
                "Veia Controle 4mm",
                "Veia Controle 6mm",
                "Veia Controle 10mm"
        };


        // Usuário informa somente o número base
        System.out.print(
                "Digite o número base do DPR: "
        );

        String numeroBase =
                scanner.nextLine();


        int numeroCabo = 1;

        double ultimoHorimetro = 0;

        boolean continuar = true;


        while (continuar) {


            // Exemplo:
            // A69100/01
            // A69100/02
            // A69100/03

            String numeroDpr =
                    numeroBase
                            + "/"
                            + String.format(
                            "%02d",
                            numeroCabo
                    );


            System.out.println(
                    "\n=========================="
            );

            System.out.println(
                    "DPR: " + numeroDpr
            );

            System.out.println(
                    "=========================="
            );


            // LOTE

            System.out.print(
                    "Digite o lote: "
            );

            String lote =
                    scanner.nextLine();


            // MATÉRIA-PRIMA

            System.out.print(
                    "Digite a matéria-prima: "
            );

            String materiaPrima =
                    scanner.nextLine();


            // MATERIAL / CABO

            String material;

            do {

                System.out.print(
                        "Digite o cabo: "
                );

                material =
                        scanner.nextLine();


                if (!caboValido(material, cabos)) {

                    System.out.println(
                            "\nCabo inválido!"
                    );

                    System.out.println(
                            "Cabos cadastrados:"
                    );


                    for (int i = 0;
                         i < cabos.length;
                         i++) {

                        System.out.println(
                                "- " + cabos[i]
                        );
                    }
                }

            } while (
                    !caboValido(material, cabos)
            );


            // QUANTIDADE

            System.out.print(
                    "Quantidade feita: "
            );

            int quantidade =
                    Integer.parseInt(
                            scanner.nextLine()
                    );


            // HORÍMETRO INICIAL

            double horimetroInicial;


            if (numeroCabo == 1) {

                System.out.print(
                        "Horímetro inicial: "
                );

                horimetroInicial =
                        Double.parseDouble(
                                scanner.nextLine()
                        );

            } else {

                horimetroInicial =
                        ultimoHorimetro;

                System.out.println(
                        "Horímetro inicial automático: "
                                + horimetroInicial
                );
            }


            // HORÍMETRO FINAL

            double horimetroFinal;

            do {

                System.out.print(
                        "Horímetro final: "
                );

                horimetroFinal =
                        Double.parseDouble(
                                scanner.nextLine()
                        );


                if (
                        horimetroFinal <
                                horimetroInicial
                ) {

                    System.out.println(
                            "ERRO: Horímetro final "
                                    + "não pode ser menor "
                                    + "que o inicial."
                    );
                }

            } while (
                    horimetroFinal <
                            horimetroInicial
            );


            // OPERADOR

            System.out.print(
                    "Número do operador: "
            );

            String operador =
                    scanner.nextLine();


            // ASPECTO

            System.out.print(
                    "Aspecto (OK/NÃO OK): "
            );

            String aspecto =
                    scanner.nextLine();


            // CENTELHAMENTO

            System.out.print(
                    "Centelhamento: "
            );

            int centelhamento =
                    Integer.parseInt(
                            scanner.nextLine()
                    );


            // GRAVAÇÃO

            System.out.print(
                    "Gravação (OK/NÃO OK): "
            );

            String gravacao =
                    scanner.nextLine();


            // OBSERVAÇÕES

            System.out.print(
                    "Observações: "
            );

            String observacoes =
                    scanner.nextLine();

            //RESULTADO FINAL

            System.out.println("Resultado Final: ");

            String resultadoFinalizado = scanner.nextLine();


            // ==========================
            // LOTE ANTERIOR
            // ==========================

            System.out.print(
                    "Possui lote anterior? (S/N): "
            );

            String possuiLoteAnterior =
                    scanner.nextLine();


            // POLIMORFISMO
            dpr dpr1;


            if (
                    possuiLoteAnterior
                            .equalsIgnoreCase("S")
            ) {

                System.out.print(
                        "Digite o lote anterior: "
                );

                String loteAnterior =
                        scanner.nextLine();


                // HERANÇA
                // DprComLoteAnterior é filho de Dpr
                dpr1 = new DprComLoteAnterior(lote, materiaPrima, material, quantidade, horimetroInicial,
                        horimetroInicial, operador, aspecto, centelhamento, gravacao, observacoes, resultadoFinalizado);

            } else {

                dpr1 = new dpr(lote, materiaPrima, material, quantidade, horimetroInicial, horimetroFinal,
                        operador, aspecto, centelhamento, gravacao, observacoes, resultadoFinalizado);
            }


            boolean confirmado = false;


            // ==========================
            // CONFERIR ANTES DE SALVAR
            // ==========================

            while (!confirmado) {

                System.out.println(
                        "\n===== DADOS DO DPR =====\n"
                );

                System.out.println(
                        "Número: " + numeroDpr
                );

                dpr1.exibirInformacoes();


                System.out.println(
                        "\n1 - Corrigir"
                );

                System.out.println(
                        "2 - Confirmar e salvar"
                );

                System.out.print(
                        "Escolha: "
                );


                int escolha =
                        Integer.parseInt(
                                scanner.nextLine()
                        );


                if (escolha == 1) {

                    corrigirDPR(
                            dpr1,
                            scanner,
                            cabos
                    );

                    // Valida novamente
                    // depois da correção


                } else if (escolha == 2) {

                    confirmado = true;

                    dpr1.saveDPR();

                } else {

                    System.out.println(
                            "Opção inválida."
                    );
                }
            }


            // O horímetro final confirmado
            // vira o inicial do próximo cabo

            ultimoHorimetro =
                    dpr1.getHorimetroFinal();


            // Passa:
            // /01 -> /02 -> /03

            numeroCabo++;


            System.out.println(
                    "\nDeseja cadastrar "
                            + "o próximo cabo?"
            );

            System.out.println(
                    "1 - Sim"
            );

            System.out.println(
                    "2 - Não"
            );

            System.out.print(
                    "Escolha: "
            );


            int escolhaContinuar =
                    Integer.parseInt(
                            scanner.nextLine()
                    );


            if (escolhaContinuar == 2) {

                continuar = false;
            }
        }


        System.out.println(
                "\nSistema encerrado."
        );

        scanner.close();

    }

import  java.util.Scanner ;
 classe  Caixa_eletronico {
	public  static  void  main ( args de seqüência de caracteres  []) {
		Scanner entrada =  novo  Scanner ( System . In);
		duplo sacar, deposito, saldo =  0 ;
		booleano verdadeiro =  falso ;
		while (verdadeiro ! =  true ) {
			Sistema . fora . println ( " \ t \ t CAIXA ELETRÔNICO " );
			Sistema . fora . println ( " 1 - Sacar " );
			Sistema . fora . println ( " 2 - Depositar " );
			Sistema . fora . println ( " 3 - Saldo " );
			Sistema . fora . println ( " 4 - Sair " );
			int opcao = entrada . nextInt ();
			switch (opcao) {
				caso  1 :
					Sistema . fora . println ( " \ n \ n Digite quanto quer sacar: " );
					sacar = entrada . nextDouble ();
					saldo - = sacar;
					pausa ;
				caso  2 :
					Sistema . fora . println ( " \ n \ n Digite quanto quer depositar: " );
					deposito = entrada . nextDouble ();
					saldo + = deposito;
					pausa ;
				caso  3 :
					Sistema . fora . println ( " \ n Seu saldo atual é "  + saldo +  " . " );
					pausa ;
				caso  4 :
						Cadeia resposta =  " caixa " ;
						while (resposta ! =  " S "  || resposta ! =  " N " ) {
						Sistema . fora . println ( " Deseja realmente sair? " );
						Sistema . fora . println ( " [S / N] " );
						resposta = entrada . Próximo();
						if (resposta . equals ( " S " )) {
							verdadeiro =  verdadeiro ;
							pausa ;
						}
						else  if (resposta . é igual ( " N " )) {
							verdadeiro =  falso ;
							pausa ;
						}
						mais {
							Sistema . fora . println ( " ERRO! " );
							Sistema . fora . println ( " Digite uma resposta valida. " );
						}
					}
					pausa ;
				padrão :
					Sistema . fora . println ( " Valor inválido! " );
			}
		}

	}
}

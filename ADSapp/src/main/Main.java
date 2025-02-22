/**
 * src/main > Contém a classe principal do projeto
 * src/main/Main.java > Executa a aplicação
 * src/model > Contém as classes dos objetos (Pessoa, Bola, Carro, etc...)
 * 		Exemplo: src/model/Carro.java
 * 
 * src/controller > Contém a lógica de negócios e manipulação de objetos
 * 
 * src/view > Contém a interface gráfica (Front-End)
 * 		Exemplo: Front-End.java
 * 
 * src/util > Contém o armazenamento das classes utilitarias com métodos auxiliares, funções comuns ou operações genéricas.
 * 
 * pom.xml > é o arquivo de configuração principal do Projeto Java em Maven
 * Uma ferramenta de automação muito útil nos projetos.
 * Usabilidade:
 * Gerenciamento de Dependências > Biblioteca externas necessárias
 * Configuração de compilação > versão do Java, plugins)
 * Empacotamento do Projeto (geração de .jar ou .war)
 * Execução de testes e outras tarefas automatizadas (conexão e versão do banco de dados) 
 */

package main;

import model.*;

// Classe principal que contém o método main (ponto de entrada do programa)
public class Main {
	public static void main (String[] args) {
		//Criando a lista (array) de objetos diferentes
		Objeto[] objetos = { 
				new Carro("Honda Civic", "Sedan")
		};
		for (Objeto obj: objetos) {
			obj.exibirDetalhes();
		}
	}

}

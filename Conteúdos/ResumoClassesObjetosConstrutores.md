# Classes

As classes de programação são projetos de um objeto, aonde têm características e comportamentos, ou seja, permite armazenar propriedades e métodos dentro dela. Para construir uma classe é preciso utilizar o pilar da abstração. Uma classe geralmente representa um substantivo, por exemplo: uma pessoa, um lugar, algo que seja “abstrato”.

• Características das Classes:

- Toda classe possui um nome;
- Possuem visibilidade, exemplo: public, private, protected;
- Possuem membros como: Características e Ações;
- Para criar uma classe basta declarar a visibilidade + digitar a palavra reservada class + NomeDaClasse + abrir e fechar chaves { }.

• Exemplo:

```java
public class Caes {

	public String nome;
	public int peso;
	public String corOlhos;
	public int quantPatas;

	public void falar(){
		//MÉTODO FALAR
	}

	public void andar(){
		//MÉTODO ANDAR
	}

	public void comer(){
		//MÉTODO COMER
	}

	public void dormir(){
		//MÉTODO DORMIR
	}
}
```

# Objetos

Os objetos são características definidas pelas classes. Neles é permitido instanciar objetos da classe para inicializar os atributos e invocar os métodos.
Obs: todo objeto é algo que existe, uma coisa concreta.


# Construtores

O construtor de um objeto é um método especial, pois inicializa seus atributos toda vez que é instanciado (inicializado).

Toda vez que é digitada a palavra reservada NEW, o objeto solicita para a memória do sistema armazená-lo, onde chama o construtor da classe para inicializar o objeto. A identificação de um construtor em uma classe é sempre o mesmo nome da classe.

• Exemplo:
```java
class ConstrutorProg{
	private String nomeCurso;


	public ConstrutorProg(String nome)
	{
		nomeCurso = nome;
	}

	public String getNome()
	{
		return "Nome do Curso retornado "+nomeCurso;
	}

}
```


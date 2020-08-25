<Operadores>

- Aritméticos:  +, -, *, /, % 

(+) = soma
(-) = subtração
(*) = multiplicação
(/) = divisão
(%)= resto

- Unários: --, ++, !

Ex:
//pós-fixados:
int b = a++         //a é atribuído para b (10), e depois a é incrementado (11)
int c = a--        //a é atribuído para c (11), e depois a é dencrementado (10)

//pré-fixados:
int d = ++a       //a é incrementado (11), e depois a é atribuído para d (11)
int e = --a       //a é decrementado (10), e depois a é atribuído para d (10)

//booleanos:
boolean f = true;
f = !f              //inverti o valor de f para false
f = !true           //mantive o valor de f em false
f = !false          //alterei o valor de f para true


- Relacionais de comparação e igualdade: <, >, <=, >=,, ==, !=

(<) = menor q
(>) = maior q
(<=) = menor ou igual q
(>=) = maior ou igual q
(==) = igual q
(!=) = diferente

- Lógicos: &&, ||

(Valores Booleanos): "True" ou "False"

- Ternário: ? "mesmo efeito de um comando if-else"

(?) = comparação, maior ou menor que outro objeto.
Ex: String classificacao = altura > 160 ? "alto" : "baixo";  //classificacao é "alto"

- Atribuição: =, +=, -=, *=, /=, %=, &=, ^=, |=

(=) = igual
(+=) = maior igual a
(-=) = menor igual a
(*=) = vezes iguala 
(/=) = dividido igual a
(%=) = resto igual a
(&=) = operador "AND" igual a
(^=) = elevado igual a
(|=) = operador "OR" igual a

- Avançados

*Relacional*: instanceof
*Deslocamento*: <<, >>, >>>=
*Atribuição com deslocamento*: <<=, >>=, >>>=
*Bitwise*: &, |, ^ (and, or e xor)
*Unário*: ~

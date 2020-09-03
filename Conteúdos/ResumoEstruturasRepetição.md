# Estruturas de Repetição

# While

Obs: É mais interessante usar quando não souber quantas repetições serão necessárias.

```java
while(i<50) {
			int valor = entrada.nextInt();
			int val= valor % 3;
			if(val == 0 ) {
 ```

# Do-While

```java
do {
			valor = entrada.nextInt();
			int x = valor % 2;
			if(valor != 100 && x==0) {
				media+=valor;
				cont++;
			}
		}while(valor != 100);
 ```
 
 # For
 
 Obs: É mais interessante usar quando souber quantas repetições serão necessárias.
		
```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
 ```
 

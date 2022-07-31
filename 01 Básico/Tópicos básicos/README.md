# Tópicos básicos

# Restrições e convênções

Declaração de variáveis:

Errado:

```
int 5minutes;
int salário;
int salario do funcionario;
```

Correto:

```
int _5minutes;
int salario;
int salarioDoFuncionario;
```

camelCase:

- pacotes;
- atributos;
- métodos;
- variáveis e parâmetros;

PascalCase:

- classes;

## Operadores bitwise

Operadores que realizam operações lógicas bit a bit em valores.

| Operador | Significado                        |
|----------|------------------------------------|
| &        | Operação "E" bit a bit.            |
| \|       | Operação "Ou" bit a bit.           |
| ^        | Operação "Ou exclusivo" bit a bit. |

## Funções interessantes para strings

- Formatar: toLowerCase(), toUpperCase(), trim();
- Recortar: substring(inicio), substring(inicio, fim);
- Substituir: replace(char,char), replace(string,string);
- Buscar: IndexOf, LastIndexOf;
- str.split(" ");
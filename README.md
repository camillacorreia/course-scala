# Course Scala <img width="10%" src="github/scala.webp" alt="logo Scala">

* [CURSO UTILIZADO](https://www.udemy.com/course/programacao-scala-orientacao-a-objetos-avancado/)

### INTRODUÇÃO

#### Declaração de Variáveis
- val: imutável
- var: mutável

#### Definição de Métodos

- def functionName ([参数列表]) : [return type]

```
def soma(s: int, b:Int):Int = a + b
```

#### Pattern Matching
```
def patternMatching(candidate: String): Int = {
  candidate match { 
    case "One" => 1 
    case "Two" => 2 
    case _ => -1 
  }
}
```
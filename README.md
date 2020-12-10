# Princípios SOLID

SOLID é um acrônico para cinco princípios de design de código que podem ser aplicados a qualquer linguagem que suporte o paradigma de programação orientada à objetos.

## Benefícios

Os benefícios do uso na prática tornam o software mais fácil de manter, reduzindo acoplamentos, possibilitando extensão e estimulando o reaproveitamento de código.

Evita as dificuldades para manter a qualidade do código por meio de testes, possibilitando uma estrutura mais padronizada e de fácil entendimento. Facilita o isolamento de funcionalidades da mesma maneira que evita códigos duplicados e frágeis a qualquer mudança.

## Princípio da responsabilidade única

**Single responsability principle**

- Uma classe, método, arquivo deve ter apenas uma única responsabilidade/razão para existir
- Classes que seguem este princípio tendem a ser mais reutilizáveis, mais simples de se entender, propagam menos mudanças para o resto do software

## Princípio aberto/fechado

**Open/closed principle** 

- Entidades de softwares (classes, módulos, métodos, etc) devem estar abertas para extensão, mas fechadas para modificação
- Impõe o uso de abstrações e polimorfismo de forma consciente, tornando software mais flexível
- Não deve ser necessário abrir a própria classe para realizar mudanças, a criação de novas classes que extendem o comportamento é o que deve ser feito

## Princípio de substituição de Liskov

**Liskov substitution principle**

- Classes derivadas devem por ser substituídas por suas classes base
- Herança deve ser utilizada com cuidado, evitando "Gato extends Cachorro" apenas por possuírem algo em comum

## Princípio da segregação de interfaces

**Interface segregation principle**

- Classes não devem ser forçados a depender de métodos que não usam
- Muitas interfaces são melhores que uma interface única
- Evita que classes clientes precisem implementar métodos desnecessários causando um alto acoplamento e baixa coesão

## Princípio da inversão de dependência

**Dependency inversion principle** 

- Módulos de alto nível não devem depender de módulos de baixo nível, ambos devem depender de abstrações
- Abstrações não devem depender de detalhes, detalhes é que devem depender de abstrações
- Dependa de uma abstração e não de uma implementação
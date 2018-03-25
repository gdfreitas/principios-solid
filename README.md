# PRINCÍPIOS S.O.L.I.D

## Benefícios do uso em software:
- seja fácil de se manter e se ajustar às alterações de escopo;
- seja testável e de fácil entendimento;
- seja extensível para alterações com o menor esforço necessário;
- forneça o máximo de reaproveitamento;
- permaneça o máximo de tempo possível em utilização;

## Evitando problemas como:
- dificuldade na testabilidade / criação de testes unitários;
- código macarrônico, sem estrutura ou padrão;
- dificuldades em isolar funcionalidades;
- duplicação de código, uma alteração precisa ser feitta em N pontos;
- fragilidade, o código quebra facilmente em vários pontos após mudança;

### **Single responsability principle** _Princípio da responsabilidade única_
- uma classe, método, arquivo deve ter apenas uma única responsabilidade/razão para existir;
- classes que seguem este princípio tendem a ser mais reutilizáveis, mais simples de se entender, propagam menos mudanças para o resto do sistema, etc;

### **Open/closed principle** _Princípio aberto/fechado_
- entidades de softwares (classes, módulos, métodos, etc) devem estar abertas para extensão, mas fechadas para modificação;
- impõe o uso de abstrações e polimorfismo de forma consciente, tornando software mais flexível;
- não deve ser necessário abrir a própria classe para realizar mudanças, a criação de novas classes que extendem o comportamento é o que deve ser feito;

### **Liskov substitution principle** _Princípio de substituição de Liskov_
- classes derivadas devem por ser substituídas por suas classes base;
- herança deve ser utilizada com cuidado, evitando _Gato_ _extends_ _Cachorro_ apenas por possuírem algo em comum; 

### **Interface segregation principle** _Princípio da segregação de interfaces_
- classes não devem ser forçados a depender de métodos que não usam;
- muitas interfaces são melhores que uma interface única;
- evita que classes clientes precisem implementar métodos desnecessários causando um alto acoplamento e baixa coesão;

### **Dependency inversion principle** _Princípio da inversão de dependência_
- módulos de alto nível não devem depender de módulos de baixo nível, ambos devem depender de abstrações;
- abstrações não devem depender de detalhes, detalhes é que devem depender de abstrações;
- dependa de uma abstração e não de uma implementação;

## Conceitos

### Coesão
Está ligado ao princípio que diz que uma classe deve ter apenas uma única responsabilidade e realizá-la de maneira satisfatória, ou seja,
uma classe não deve assumir responsabilidades que não são suas. Ignorado, passamos a ter dificuldades de manutenção e de reuso.

### Acoplamento 
Significa o quanto uma classe depende da outra para funcionar. E quanto maior for esta dependência entre ambas, dizemos
que estas classes elas estão fortemente acopladas. O forte acoplamento também nos traz muitos problemas, problemas
até semelhantes aos que um cenário pouco coeso nos traz.

Um acoplamento mal pensado, teremos os seguintes pontos:
- É difícil de mudar, já que cada mudança afeta muitas outras partes do sistema (Rigidez);
- Ao mudar, seu projeto torna-se um tapete de dominó, e então ao alterar uma peça você acabando quebrando outra peça (Fragilidade);
- Reutilizar se torna inviável, uma vez que não é possível separar as peças a partir da aplicação de corrente (Imobilidade).

**Maior Acoplamento = Menor Coesão**
**Menor Coesão = Dificuldades manutenção e de reuso**

### Interface
Podemos definir como interface o **contrato** entre a classe e o mundo exterior. Quando uma classe implementa uma interface, se
compromete a fornecer o comportamento publicado por esta interface.

As **classes** ajudam a definir um objeto e seu comportamento e as **interfaces** que auxiliam na definição dessas classes. As interfaces são
formadas pela declaração de um ou mais métodos, os quais obrigatoriamente não possuem corpo.

Um objeto de um tipo definido por uma interface **não pode ser instanciado** de forma alguma.

A interface que têm como premissa poder definir uma série de métodos e suas assinaturas, mas nunca conter suas implementações.

Ela apenas expõe **o que o objeto deve fazer**, e não **como o objeto faz** ou **o que ele tem**. **Como ele faz** vai ser definido em
uma **implementação** dessa interface.

### Abstração
Pode-se dizer que as classes abstratas servem como “modelo” para outras classes que dela herdem, não podendo ser instanciada por si só.

Para ter um objeto de uma classe abstrata é necessário criar uma classe mais especializada herdando dela e então instanciar essa nova classe.

Os métodos da classe abstrata devem então serem sobrescritos nas classes filhas.

Por exemplo, é definido que a classe “Animal” seja herdada pelas subclasses “Gato”, “Cachorro”, “Cavalo”, mas ela mesma nunca pode ser instanciada.
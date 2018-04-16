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
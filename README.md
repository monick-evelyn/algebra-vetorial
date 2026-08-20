# Álgebra Vetorial

Projeto acadêmico desenvolvido para a disciplina de **Álgebra Vetorial**, implementando uma calculadora de vetores em **Java** com interface de console, capaz de realizar as principais operações da álgebra vetorial em **2D** e **3D**.

## 📌 Funcionalidades

### Operações 2D
- Produto escalar entre dois vetores
- Ângulo entre vetores (em radianos)
- Verificação de perpendicularidade (ortogonalidade)
- Módulo (norma) do vetor
- Projeção de um vetor sobre outro

### Operações 3D
- Produto escalar entre dois vetores
- Produto vetorial entre dois vetores
- Ângulo entre vetores (em radianos)
- Verificação de perpendicularidade (ortogonalidade)
- Módulo (norma) do vetor
- Projeção de um vetor sobre outro
- Área de paralelogramo formado por dois vetores
- Área de triângulo formado por dois vetores

## 🗂️ Estrutura do projeto

```
calculadoraAlgebraLinear/
└── src/
    ├── model/          # Classes que representam os vetores (Vetor, Vetor2D, Vetor3D)
    ├── sistema/         # Regras de cálculo (SistemaCalculadora)
    ├── controller/      # Camada intermediária entre a interface e o sistema
    ├── console/         # Interface de interação via terminal (ConsoleSistema)
    ├── principal/        # Ponto de entrada da aplicação (Main)
    └── test/             # Testes unitários (JUnit)
```

O projeto segue uma separação em camadas:
- **model** – representa as entidades `Vetor`, `Vetor2D` e `Vetor3D`, com validação de coordenadas e cálculo de módulo.
- **sistema** – concentra a lógica matemática das operações vetoriais.
- **controller** – expõe as operações do sistema para as camadas superiores.
- **console** – trata a entrada e saída de dados via terminal, exibindo o menu de operações.

## ▶️ Como executar

### Pré-requisitos
- [JDK 21](https://www.oracle.com/java/technologies/downloads/) ou superior

### Via terminal

```bash
# Entrar na pasta de código-fonte
cd calculadoraAlgebraLinear/src

# Compilar
javac principal/Main.java -d ../bin

# Executar
java -cp ../bin principal.Main
```

### Via IDE (Eclipse)

O repositório já inclui os arquivos de configuração do Eclipse (`.classpath` e `.project`). Basta importar o projeto como um **Existing Java Project** e executar a classe `principal.Main`.

Ao iniciar, a calculadora exibe um menu interativo no console com todas as operações disponíveis (2D e 3D), bastando digitar as coordenadas dos vetores solicitados.

## 🧪 Testes

O projeto conta com testes unitários (JUnit 4) para a camada de controle, localizados em `src/test/ControladorSistemaTest.java`.

## 🛠️ Tecnologias

- Java (JDK 21)
- JUnit 4

## 👥 Contribuidores

- Monick Évelyn -> [https://github.com/monick-evelyn]
- Carlos Henrique -> [https://github.com/Kafkarlos]
- Marcos Ruan -> [https://github.com/Marcosruan]
- Miguel Luan -> [https://github.com/MiguelLuan]
- Richarlyson -> [https://github.com/Richarlysonfrs]

## 📄 Licença

Este projeto está sob a licença [MIT](LICENSE).

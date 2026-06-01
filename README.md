# Estrutura do Projeto

```text
src/main/java
│
├── domain
│   ├── model
│   │   ├── Livro.java
│   │   ├── Usuario.java
│   │   └── Emprestimo.java
│
├── application
│   ├── ports
│   │   └── LivroRepository.java
│   │
│   └── usecases
│       └── EmprestarLivroUseCase.java
│
├── infrastructure
│   ├── persistence
│   │   ├── entity
│   │   ├── mapper
│   │   ├── repository
│   │   └── LivroRepositoryImpl.java
│
├── presentation
│   └── controller
│       └── LivroController.java
│
└── BibliotecaApplication.java

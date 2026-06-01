# Estrutura do Projeto

```text
src/main/java
│
├── domain
│   └── model
│       ├── Book.java
│       ├── User.java
│       └── BookLoan.java
│
├── application
│   ├── ports
│   │   └── BookRepository.java
│   │
│   └── usecases
│       └── LendBookUseCase.java
│
├── infrastructure
│   └── persistence
│       ├── BookRepositoryImpl.java
│       ├── BookEntity.java
│       ├── BookMapper.java
│       └── JpaBookRepository.java
│
├── presentation
│   └── controller
│       └── BookController.java
│
└── LibraryApplication.java

📝 Task Manager - Console Application
Este é um sistema simples de gerenciamento de tarefas (To-Do List) desenvolvido em Java. O projeto utiliza conceitos de Orientação a Objetos para permitir a criação, visualização e atualização de status de tarefas diretamente pelo console.

🚀 Funcionalidades
Adicionar Tarefa: Cria uma nova tarefa com ID, título, descrição e status inicial.

Alterar Status: Permite atualizar o estado de uma tarefa existente (ex: de PENDING para FINISHED).

Listar Tarefas: Exibe todas as tarefas cadastradas com seus respectivos detalhes e data de criação.

Gerenciamento de Estados: Utiliza Enums para garantir que apenas status válidos sejam atribuídos.

🛠️ Tecnologias Utilizadas
Linguagem: Java 21

Paradigma: Orientação a Objetos (POO)

Entrada de Dados: java.util.Scanner

📁 Estrutura do Projeto
O código está organizado no pacote model, contendo as seguintes classes:

Main.java: Ponto de entrada da aplicação e interface de menu no console.

Task.java: Modelo da entidade tarefa, contendo atributos como ID, título, descrição e data.

TaskList.java: Classe responsável por gerenciar a lista de tarefas (CRUD interno).

TaskStatus.java: Enumeração com os status possíveis (PENDING, INPROGRESS, FINISHED, CANCELED).
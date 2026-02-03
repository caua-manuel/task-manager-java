package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        TaskList taskList = new TaskList();

        while (opcao != 4){
            System.out.println("Digite 1 para adicionar um Task");
            System.out.println("Digite 2 para mudar status de uma Task");
            System.out.println("Digite 3 para ver a lista de Tasks");
            System.out.println("Digite 4 para sair");
            opcao = Integer.parseInt(sc.nextLine());

                if(opcao == 1) {
                    System.out.println("Digite o nome do Task: ");
                    String title = sc.nextLine();

                    System.out.println("Digite o numero do id do Task");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.println("Qual a descrição da Task?");
                    String description = sc.nextLine();

                    System.out.println("Status disponiveis:");
                    for (TaskStatus c : TaskStatus.values()) {
                        System.out.println("- " + c);
                    }
                    System.out.println("Digite o nome do status do Task");
                    TaskStatus status = TaskStatus.valueOf(sc.nextLine().toUpperCase());

                    Task task = new Task(id, description, title, status);

                    taskList.addTask(task);
                    System.out.println("Task adicionada com sucesso!");


                }
                else if(opcao == 2) {
                    System.out.println("Digite o id da Task: ");
                    int id = Integer.parseInt(sc.nextLine());

                    Task task = taskList.findById(id);
                    if (task == null) {
                        System.out.println("Task não encontrada.");
                        continue;
                    }
                    System.out.println("Status disponíveis:");
                    for (TaskStatus status : TaskStatus.values()) {
                        System.out.println("- " + status);
                    }

                    System.out.println("Novo status:");
                    TaskStatus novoStatus =
                            TaskStatus.valueOf(sc.nextLine().toUpperCase());

                    task.setStatus(novoStatus);
                    System.out.println("Status atualizado!");
                }



                else if(opcao == 3) {
                 if (taskList.getTasks().isEmpty()) {
                System.out.println("Nenhuma task cadastrada.");
                } else {
                for (Task task : taskList.getTasks()) {
                    System.out.println(task);
                }
                  }
                }
                else if(opcao == 4) {
                    System.out.println("Saindo...");
                }
            }
        sc.close();
        }





    }


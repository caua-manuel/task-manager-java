package model;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Task task = new Task(1, "Praticar JAVA", "Estudos", LocalDateTime.now(), TaskStatus.PENDING);

        System.out.println(task);




    }
}

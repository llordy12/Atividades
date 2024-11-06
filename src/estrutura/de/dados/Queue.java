package estrutura.de.dados;

import java.util.LinkedList;

public class Queue {
    private LinkedList<String> queue;

    public Queue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(String cliente) {
        queue.addLast(cliente);
        System.out.println("Cliente " + cliente + " adicionado a fila.");
    }

 
    public String dequeue() {
        if (queue.isEmpty()) {
            return null; 
        }
        return queue.removeFirst();
    }

    
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    
    public void listClients() {
        if (queue.isEmpty()) {
            System.out.println("A fila esta vazia.");
        } else {
            System.out.println("Clientes na fila:");
            for (String cliente : queue) {
                System.out.println("- " + cliente);
            }
        }
    }
}

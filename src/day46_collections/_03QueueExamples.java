package day46_collections;

import java.util.*;

public class _03QueueExamples {


    // Queue is -> FIFO yani First-In, First-Out. Insertion order not preserved in queue interface.

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();  // PriorityQueue uses only priority system. Think like sort of V.I.P.
        queue.add(3);
        queue.add(10);
        queue.add(8);
        queue.add(2);
        System.out.println(queue);  // [2, 3, 8, 10]  --> Insertion order NOT preserved in queue interface. In most cases, it is sorted, but not all the time.

        System.out.println(queue.peek());  // 2  --> queue.peek() checks what at the top of the queue
        System.out.println(queue.poll());  // 2  --> Kizlarin dedigi --> queue.poll() methodu -> queue'de peek'te olani remove yapiyor. Ama her remove yaptiginda digerlerinin order'i degisebiliyor. Sonraki peek'in ne olacagini kestiremiyorsun.

        System.out.println(queue);  // [3, 10, 8]    -->// priority changed.
        System.out.println(queue.peek());  // 3
        System.out.println(queue.poll());  // 3
        System.out.println(queue);  // [8, 10]


        System.out.println("===================================");

        /*
        -> ArrayDeque: implementing Deque. More proper queue type
						    - also has access to both side of the collection
						    - does not accept null
         */

        ArrayDeque<String> queue2 = new ArrayDeque<>();  // Sadece Queue reference'ini degil de ArrayDeque'yu kullandik, cunku  sadece Queue reference'ini kullansak sadece onun method'larina falan erisebilecektik, ama ArrayDeque kullanmak sayesinde hem ona hem de ArrayDeque'nun kendi method'larina (( offer, poll, peek )) erisebiliriz
        queue2.offer("java");  //  offer just adds to the queue --> offer method'u add icin kullanilir ama add'den farkli olarak exception'a neden olmaz
        queue2.offer("tuesday");
        queue2.offer("soft skills");
        queue2.offer("automation");

        System.out.println(queue2);  // [java, tuesday, soft skills, automation]
        System.out.println(queue2.peek());  // java  -->// the other method to use is element(). --> peek kullanarak at the top'takini aldik

        System.out.println(queue2.poll()); // java  -->// the other method to use is remove()
        System.out.println(queue2);  // [tuesday, soft skills, automation]

        System.out.println(queue2.peek()); // tuesday
        System.out.println(queue2); // [tuesday, soft skills, automation]

        queue2.offerFirst("API");  // method from Deque
        System.out.println(queue2);  // [API, tuesday, soft skills, automation]

//      queue2.add(null);  // bunu yapip altta System.out.println(queue2); yapinca NullPointerException verdi, cunku --> null is not allowed in queue types
        queue2.pollLast();  // pollLast methodu sondakini cikardi
        System.out.println(queue2);  // [API, tuesday, soft skills]

//      new ArrayDeque<>().remove();  // causes exception -> cunku empty ArrayDeque'den remove yapmaya calisirsam -> NoSuchElementException oluyor
//      new ArrayDeque<>().poll();  // returns null, but no exception --> null print etmesi icin print statement icine yazmak lazim bunu tabii:
//      System.out.println(new ArrayDeque<>().poll());  // null


        System.out.println("===================================");

        List<Integer> list = new LinkedList<>();
        ((Deque)list).addFirst(4);
//      System.out.println(list);  //  [4]



    }
}

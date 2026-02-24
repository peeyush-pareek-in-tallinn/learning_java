package ee.peeyushlearningjava.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueStudent {

    private static class student {

        private final String name;
        private final char grade;

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        public student(String name, char grade) {
            this.name = name;
            this.grade = grade;

        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }

        public static void main(String[] args) {

            PriorityQueue <student> queue = new PriorityQueue<>(new Comparator<student>() {
                @Override
                public int compare(student o1, student o2) {
                    return o1.getGrade() - o2.getGrade();
                }
            });

            queue.offer(new student("ram", 'a'));
            queue.offer(new student("sita", 'b'));
            queue.offer(new student("gita", 'd'));
            queue.offer(new student("shyam", 'b'));
            queue.offer(new student("daphol", 'c'));

            System.out.println(queue);
            System.out.println(queue.size());

            for (int i = 0; i < queue.size() + i; i++) {
                System.out.println(queue.poll());
            }

        }
    }
}

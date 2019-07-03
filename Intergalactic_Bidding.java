import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static ArrayList<Person> persons = new ArrayList<>();
    public static ArrayList<BigInteger> reverseCumSum = new ArrayList<>();
    public static BigInteger s;
    public static ArrayList<Person> currentPersons = new ArrayList<>();
    public static int count = 0;
    public static int n;
    public static ArrayList<Person> curr = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.nextBigInteger();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            persons.add(new Person(sc.next(), sc.nextBigInteger()));
        }

        Collections.sort(persons);
/*
        for(int i = 0; i < n; i++) {
            reverseCumSum.add(BigInteger.ZERO);
        }
        
        reverseCumSum.set(n-1, persons.get(n-1).sum);
        for (int i = n - 2; i > 0; i--) {
            reverseCumSum.set(i, reverseCumSum.get(i + 1).add(persons.get(i).sum));
        }
        reverseCumSum.set(0, persons.get(0).sum.add(reverseCumSum.get(1)));
*/
        search(BigInteger.ZERO, 0);
        System.out.println(0);
    }

    public static void search(BigInteger current, int index) {
        count++;
        if(current.compareTo(s) ==  0) {
            System.out.println(curr.size());
            curr.forEach(System.out::println);
            System.exit(0);
        }

        if(index == n) return;
        if(current.add(persons.get(index).sum.add(persons.get(index).sum)).compareTo(s) < 0) return;
        if(current.compareTo(s) > 0) return;

        search(current, index + 1);

        
        int size = curr.size();
        curr.add(persons.get(index));
        search(current.add(persons.get(index).sum), index + 1);
        curr.remove(size);
    }


    public static class Person implements Comparable<Person>{
        public final BigInteger sum;
        public final String name;


        public Person(String name, BigInteger sum) {
            this.sum = sum;
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int compareTo(Person o) {
            return -sum.compareTo(o.sum);
        }
    }
}
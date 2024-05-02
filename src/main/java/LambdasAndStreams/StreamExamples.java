package LambdasAndStreams;

import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(8,3,1,9,10,12);

//        for (Integer i: numbers) {
//            System.out.println(i);
//        }

        // creating a stream from list
        // Stream<Integer> streams = numbers.stream();

//        numbers.stream()
//                .map(element -> element * element)
//                .forEach(x -> System.out.println(x));

        //numbers.stream().sorted().forEach(z -> System.out.println(z));

        long count = numbers.stream().sorted().filter(n -> n % 2 != 0).count();
        System.out.println(count);
//        numbers.stream()
//                .filter(element -> element % 2 == 0)
//                .forEach(x -> System.out.println(x));

    }
}

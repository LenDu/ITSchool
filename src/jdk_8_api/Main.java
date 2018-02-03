package jdk_8_api;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Lena on 1/20/2018.
 */
public class Main {
    public static void main(String[] args) {
        String.join(":", "foobar", "foo", "bar");
        // =. foobar:foo:bar

        String collect = "fooBarFoobaR"
                .chars()// разбить строку по символам
                .mapToObj(s->(char)s+"") //приводим чары к строкам
                .map(String::toLowerCase)
                .distinct()//убрать все повторяюшие элементы
               // .mapToObj(c->String.valueOf((char)c))
                .sorted()
               // .collect(Collectors.joining()); //собираем строки в одну
                .collect(Collectors.joining(" ")); //собираем строки в одну
        System.out.println(collect);
               // .forEach(System.out::println);
               // .collect(Collectors.toList()

        // => :abfor

        List<Integer> collect1 = Stream
                .generate(() -> new Random().nextInt())
                .limit(10)
                .collect(Collectors.toList());//преобраэовать стрим в list
        //  .forEach(System.out::println);
        System.out.println(collect1);

        Stream
                .generate(() -> new Date())
                .limit(10)
                .forEach(System.out::println);

        String bar = Pattern.compile(":")
                .splitAsStream("foobar:foo:bar")
                .filter(s -> s.contains("bar"))
                .sorted()
                .collect(Collectors.joining(":"));
        System.out.println(bar);

        Pattern pattern =
                Pattern.compile(".*gmail\\.com");
        long count = Stream.of("bob@gmail.com",
                "alice@hotmail.com")
                .filter(pattern.asPredicate())
                .count();
        // => 1
        System.out.println(count);
    }
}

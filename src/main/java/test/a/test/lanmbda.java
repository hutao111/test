package test.a.test;

import java.util.*;
import java.util.stream.Collectors;

public class lanmbda {
    public static void main(String[] args) {

//        List<String> strings = Arrays.asList("6", "", "bc", "efg", "abcd","", "jkl");
//        List<String> filtered = strings.stream().filter(string -> string.contains("d")).collect(Collectors.toList());
//        System.out.println(filtered);
//
//        List<Integer> longs = Arrays.asList(1,5,46,567,678);
//        longs.stream().map(v-> v*9 ).sorted().collect(Collectors.toList()).forEach(System.out::println);


//        Random random = new Random();
//        random.ints().limit(2).sorted().forEach(System.out::print);


        Student stuA = new Student(1, "A", "M", 184);
        Student stuB = new Student(2, "B", "G", 163);
        Student stuC = new Student(3, "C", "M", 175);
        Student stuD = new Student(4, "D", "G", 158);
        Student stuE = new Student(5, "E", "M", 170);
        List<Student> list = new ArrayList<>();
        list.add(stuA);
        list.add(stuB);
        list.add(stuC);
        list.add(stuD);
        list.add(stuE);
        list.stream()
                .map(a->a.getSex()).collect(Collectors.toList());
        list.stream()
                .filter(student -> student.getSex().contains("M")).collect(Collectors.toList());

////        Optional<Integer> max =
//                Stream.of(1, 2, 3, 4, 5).max((o1, o2) -> o1 - o2).ifPresent(new Consumer<Integer>() {
//                    @Override
//                    public void accept(Integer integer) {
//                        System.out.println(integer+6);
//                    }
//                });

        double a= 4.0;
        float b = 4.0f;
        System.out.println(a>b);

       int s = 10;
       Integer f = 10;
       System.out.println(s == f);


       Integer c =200 ;
       Integer d = 200 ;
        System.out.println(c==d);


        byte k =0;
        short j =0;



//        System.out.println((k instanceof int));
    }


    }


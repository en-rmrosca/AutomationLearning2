package error_handling;

import java.util.*;
import java.util.stream.Collectors;

    public class ListOfBooks {
        public static void main(String[] args) throws Exception {

            Map<String, String> book = new HashMap<>();
            book.put("title", "1");
            book.put("author", "abc");
            book.put("publisher", "abc");
            book.put("language", "Romanian");
            book.put("bookType", "A");
            book.put("numberOfPages", "20");

            Map<String, String> book1 = new HashMap<>();
            book1.put("title", "OCA: Oracle Certified Associate Java SE 8");
            book1.put("author", "Jeanne Boyarsky");
            book1.put("publisher", "Sybex");
            book1.put("language", "English");
            book1.put("bookType", "Study Guide");
            book1.put("numberOfPages", "432");


            Map<String, String> book2 = new HashMap<>();
            book2.put("title", "ISTQB Guide 1");
            book2.put("author", "ISTQB");
            book2.put("publisher", "Publisher ISTQB");
            book2.put("language", "English");
            book2.put("bookType", "Exam Preparation");
            book2.put("numberOfPages", "120");

            Map<String, String> book3 = new HashMap<>();
            book3.put("title", "ISTQB Guide 2");
            book3.put("author", "ISTQB");
            book3.put("publisher", "Publisher ISTQB");
            book3.put("language", "English");
            book3.put("bookType", "Exam Preparation");
            book3.put("numberOfPages", "240");

            Map<String, String> book4 = new HashMap<>();
            book4.put("title", "ISTQB Guide 3");
            book4.put("author", "ISTQB");
            book4.put("publisher", "Publisher ISTQB");
            book4.put("language", "English");
            book4.put("bookType", "Exam Preparation");
            book4.put("numberOfPages", "360");


            Map<String, String> book5 = new HashMap<>();
            book5.put("title", "ISTQB Guide 4");
            book5.put("author", "ISTQB");
            book5.put("publisher", "Publisher ISTQB");
            book5.put("language", "English");
            book5.put("bookType", "Exam Preparation");
            book5.put("numberOfPages", "120");


            Map<String, String> book6 = new HashMap<>();
            book6.put("title", "OCP: Oracle Certified Professional SE 8");
            book6.put("author", "Jeanne Boyarsky, Scott Selikoff");
            book6.put("publisher", "Sybex");
            book6.put("language", "Romanian");
            book6.put("bookType", "Exam Preparation");
            book6.put("numberOfPages", "720");


            Map<String, String> book7 = new HashMap<>();
            book7.put("title", "OCP Oracle Certified Professional Java SE 11");
            book7.put("author", "Jeanne Boyarsky, Scott Selikoff");
            book7.put("publisher", "Publisher ISTQB");
            book7.put("language", "Spanish");
            book7.put("bookType", "Exam Preparation");
            book7.put("numberOfPages", "1296");


            List<Map<String, String>> Books = Arrays.asList(book,book1,book2,book3,book4,book5,book6,book7);
            System.out.println("Subtask1");

            SubTask1(Books).forEach((key, value) -> System.out.println(key + ": " + value));
            System.out.println("\nSubTask2");

            SubTask2(Books).forEach(System.out::println);
            System.out.println("\nSubTask3");

            SubTask3(Books).forEach((key, value) -> System.out.println(key + ": " + value));

            System.out.println("\nSubTask4");
            SubTask4(Books).forEach(System.out::println);

            //hello

        }

            public static Map<String, String> SubTask1(List<Map<String, String>> books) throws Exception {
                return books.stream().filter(x -> x.containsValue("Spanish")).findFirst().orElseThrow(() -> new Exception("book doesn't find"));
            }

            public static List<Map<String, String>> SubTask2(List<Map<String, String>> books) {
                return books.stream().sorted(((x, y) -> y.get("author").compareTo(x.get("author")))).collect(Collectors.toList());
            }
                public static Map<String, String> SubTask3(List<Map<String, String>> Books) throws Exception {
                    return Books.stream().max(Comparator.comparing(x -> Integer.parseInt(x.get("numberOfPages")))).orElseThrow(() -> new Exception(""));
                }

                    public static List<Map<String, String>> SubTask4(List<Map<String, String>> books) {
                        return books.stream().filter(x -> Integer.parseInt(x.get("numberOfPages")) > 9000).collect(Collectors.toList());
                    }
                }


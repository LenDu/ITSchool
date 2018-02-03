package strings;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Lena on 12/24/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1000 ml".split("\\s+")[0]);//пазделитель один или больще пробеловб берем 0й элеменит
        System.out.println("1000 ml".split("\\s+")[1]);

        //char a = 'a';
        char a = '\u2573';

        // преобразовать char к String
        String b = a + "";
        System.out.println(b);

        System.out.println(Arrays.toString("abc".getBytes()));
        System.out.println("abc".compareTo("abcd"));
        System.out.println("abc".length());
        System.out.println("abc".codePointAt(0));

        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s = new String(chars, 2, 3);
        System.out.println(s);

        char ch;
        ch = "abc".charAt(1);
        System.out.println(ch);

        String s1 = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end-start];
        s1.getChars(start, end, buf, 0);
        System.out.println(buf);


        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s2==s3); //false
        s3=s3.intern();
        System.out.println(s2==s3); //true

        System.out.println("Footbar".startsWith("bar"));

        String str1 = new String("Hello, How are you");
        String str2 = new String("How");
        String str3 = new String("HOW");

        System.out.print("Result 1:" );
        System.out.println(str1.regionMatches(7, str2, 0, 3));

        System.out.print("Res 2: ");
        System.out.println(str1.regionMatches(true, 7, str3, 0, 3));

        System.out.println(str1.subSequence(0, 10));

        System.out.println(str1.substring(15));
        System.out.println(str1.substring(15, 17));

        System.out.println(str1.indexOf('H'));
        System.out.println(str1.lastIndexOf('H'));
        System.out.println(str1.indexOf('H', 5));
        System.out.println(str1.lastIndexOf('H', 10));

        int i = Integer.parseInt("kitty123".replaceAll("[\\D]", ""));
        int j = Integer.parseInt("1k2it3ty".replaceAll("[\\D]", ""));

        System.out.println(i);
        System.out.println(j);
        String k = "kitty123".replaceAll("\\W", "");
        System.out.println(k);

        String m = " kit  ty 123 ".replaceAll("\\s", "");
        System.out.println(k);

        String s4 = "001234-cat";
        String s5 = s4.replaceFirst("^0*", "");
        System.out.println(s5);

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("buffer = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
        System.out.println(sb.append("two"));
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());

        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println(sb);

        sb.insert(2, "like");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(4, 7);
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        System.out.println(String.join(":", "foobar", "foo", "bar"));

        System.out.println("foobar:foo:bar"
                .chars()
                .distinct()//удаляет повторяюшиеся элементы
                .mapToObj(c->String.valueOf((char)c))
                .sorted()
                .collect(Collectors.joining()));



    }
}

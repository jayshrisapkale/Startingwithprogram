import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Startingwithprogram {

	public static void main(String[] args) {
List<Integer> listno = Arrays.asList(10,15,17,49,54,19);
listno.stream().map(s ->s +"").filter(s -> s.startsWith("1")).forEach(System.out::println);
	}

	
}

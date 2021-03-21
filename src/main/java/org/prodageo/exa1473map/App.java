package org.prodageo.exa1473map;
  
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList(
            "Bus", "Car", "Train", "Train", "Plane" , "Car", "Bus", "Bus", "Plane" ) ;
		

        Map<String, Integer> counts = list.parallelStream().
            collect(Collectors.toConcurrentMap(
                w -> w, w -> 1, Integer::sum));

				
/*				
            Map<String, Integer> counts =
                list.stream().collect(
                    Collectors.toMap(
                        w -> w, w -> 1, Integer::sum));				
*/					
        System.out.println(counts);
    }
}
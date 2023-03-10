package kata3;

/**
 *
 * @author Raúl Marrero Marichal
 */
public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        
        new HistogramDisplay(histogram).execute();
    }
    
}

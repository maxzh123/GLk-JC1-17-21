public class task42 {
    public static void main(String[] args) {

        String s = "House, House, House, Dog, Dog, Dog, Dog";
    Map<String, Integer> occurrences = new HashMap<String, Integer>();

for ( String word : splitWords ) {
        Integer oldCount = occurrences.get(word);
        if ( oldCount == null ) {
            oldCount = 0;
        }
        occurrences.put(word, oldCount + 1);
    }
}

package FifteenClass;
import java.util.HashSet;
public class TwoCommonArrayElements {
    public static void main(String[] args) {
                String[] array1 = {"meme", "bithy", "sayma", "farzana"};
                String[] array2 = {"bithy", "chaity", "meme", "samaratun"};
                findCommonElements(array1, array2);
            }
            public static void findCommonElements(String[] array1, String[] array2) {

                HashSet<String> set1 = new HashSet<>();
                HashSet<String> commonElements = new HashSet<>();
                for (String element : array1) {
                    set1.add(element);
                }
                for (String element : array2) {
                    if (set1.contains(element)) {
                        commonElements.add(element);
                    }
                }
                if (commonElements.isEmpty()) {
                    System.out.println("No common elements found.");
                } else {
                    System.out.println("Common elements: " + commonElements);
                }
            }
        }

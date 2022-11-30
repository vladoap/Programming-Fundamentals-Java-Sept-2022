package ObjectsAndClasses.Exercise;

import java.util.*;

public class P01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomPhrase = new Random();
        Random randomEvent = new Random();
        Random randomAuthor = new Random();
        Random randomCity = new Random();
        int n = Integer.parseInt(scan.nextLine());

        List<String> phrasesList = new ArrayList<>(Arrays.asList(
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        ));

        List<String> eventsList = new ArrayList<>(Arrays.asList(
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"
        ));

        List<String> authorsList = new ArrayList<>(Arrays.asList(
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        ));

        List<String> cityList = new ArrayList<>(Arrays.asList(
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        ));

        for (int i = 1; i <= n ; i++) {
            System.out.printf("%s %s %s – %s.",
                    phrasesList.get(randomPhrase.nextInt(phrasesList.size() - 1)),
                    eventsList.get(randomEvent.nextInt(eventsList.size() - 1)),
                    authorsList.get(randomAuthor.nextInt(authorsList.size() - 1)),
                    cityList.get(randomCity.nextInt(cityList.size() - 1)));
            System.out.println();
        }
    }

}

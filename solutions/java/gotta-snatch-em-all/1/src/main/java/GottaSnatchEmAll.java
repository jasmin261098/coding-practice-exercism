import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> newCollection = new HashSet<>(cards);
        return newCollection;
    }

    static boolean addCard(String card, Set<String> collection) {

        if (collection.contains(card)) {
            return false;
        } else {
            collection.add(card);
            return true;
        }
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> myUnique = new HashSet<>(myCollection);
        myUnique.removeAll(theirCollection);

        Set<String> theirUnique = new HashSet<>(theirCollection);
        theirUnique.removeAll(myCollection);

        return !myUnique.isEmpty() && !theirUnique.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCards = new HashSet<>(collections.get(0));
        
        for (int i = 1; i < collections.size(); i++)  {
            commonCards.retainAll(collections.get(i));
        }

        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>(collections.get(0));

        for (Set<String> collection : collections) {
            allCards.addAll(collection);
        }

        return allCards;
    }
}

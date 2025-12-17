import java.util.*;

class RelativeDistance {

    private final Map<String, Set<String>> graph = new HashMap<>();

    RelativeDistance(Map<String, List<String>> familyTree) {
        // Build an undirected graph:
        // - parent <-> child
        // - sibling <-> sibling (so siblings are distance 1)
        for (Map.Entry<String, List<String>> entry : familyTree.entrySet()) {
            String parent = entry.getKey();
            List<String> children = entry.getValue();

            // Ensure nodes exist
            graph.computeIfAbsent(parent, k -> new HashSet<>());
            for (String child : children) {
                graph.computeIfAbsent(child, k -> new HashSet<>());
                // parent-child connections
                connect(parent, child);
                connect(child, parent);
            }

            // sibling-sibling connections
            for (int i = 0; i < children.size(); i++) {
                for (int j = i + 1; j < children.size(); j++) {
                    String a = children.get(i);
                    String b = children.get(j);
                    connect(a, b);
                    connect(b, a);
                }
            }
        }
    }

    private void connect(String from, String to) {
        graph.computeIfAbsent(from, k -> new HashSet<>()).add(to);
    }

    int degreeOfSeparation(String personA, String personB) {
        if (personA == null || personB == null) return -1;
        if (personA.equals(personB)) return 0;
        if (!graph.containsKey(personA) && !graph.containsKey(personB)) return -1;

        Queue<String> queue = new ArrayDeque<>();
        Map<String, Integer> distances = new HashMap<>();

        queue.offer(personA);
        distances.put(personA, 0);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int currentDistance = distances.get(current);

            for (String neighbor : graph.getOrDefault(current, Collections.emptySet())) {
                if (distances.containsKey(neighbor)) continue;

                int nextDistance = currentDistance + 1;
                distances.put(neighbor, nextDistance);

                if (neighbor.equals(personB)) {
                    return nextDistance;
                }
                queue.offer(neighbor);
            }
        }
        return -1;
    }
}
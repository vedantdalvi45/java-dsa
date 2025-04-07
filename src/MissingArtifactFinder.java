import java.util.HashSet;
import java.util.Set;

public class MissingArtifactFinder {

    public static void main(String[] args) {
        // Example artifact numbers
        int[] artifacts = {-1, 2, 3, 5, 6};

        // Find and print the smallest missing artifact number
        int missingArtifact = findSmallestMissingArtifact(artifacts);
        System.out.println("The smallest missing artifact number is: " + missingArtifact);
    }

    public static int findSmallestMissingArtifact(int[] artifacts) {
        Set<Integer> artifactSet = new HashSet<>();

        // Add all artifact numbers to the set
        for (int artifact : artifacts) {
            artifactSet.add(artifact);
        }

        // Check for the smallest missing positive integer
        int missingNumber = 1; // Start checking from 1
        while (artifactSet.contains(missingNumber)) {
            missingNumber++;
        }

        return missingNumber;
    }
}

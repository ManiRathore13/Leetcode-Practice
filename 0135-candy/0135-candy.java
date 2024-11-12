public class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // Give each child at least 1 candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Left to right pass: ensure right child has more candies if they have a higher rating
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left pass: ensure left child has more candies if they have a higher rating
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Calculate the total candies
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}

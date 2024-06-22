public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth += accounts[i][j];
            }
            if (customerWealth > maxWealth) {
                maxWealth = customerWealth;
            }
        }
        
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};

        System.out.println(maximumWealth(accounts1));  // Output: 6
        System.out.println(maximumWealth(accounts2));  // Output: 10
    }
}

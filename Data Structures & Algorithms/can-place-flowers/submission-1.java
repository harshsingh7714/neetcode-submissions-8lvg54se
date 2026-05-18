class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         for(int i = 0; i < flowerbed.length; i++) {

            // current spot should be empty
            if(flowerbed[i] == 0) {

                // check left side
                int left = (i == 0) ? 0 : flowerbed[i - 1];

                // check right side
                int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];

                // if both sides are empty
                if(left == 0 && right == 0) {

                    flowerbed[i] = 1; // plant flower
                    n--;

                    if(n == 0) {
                        return true;
                    }
                }
            }
        }

        return n<=0;
    }
}
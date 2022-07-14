package PracticePrograms.Arrays;

public class GreatestCandies {
    public static void main(String args[])
    {
        int[] candies = {1 , 2 , 5 , 6 , 7};
        int extraCandies = 2;
        for(boolean x : kidsWithCandies(candies , extraCandies))
            System.out.print(x + " ");
    }
    static boolean[] kidsWithCandies(int[] candies , int extraCandies)
    {
        int n = candies.length , maxCandies = 0;
        for(int i = 0 ; i < n ; i++)
            if(candies[i] > maxCandies)
                maxCandies = candies[i];
        boolean[] result = new boolean[n];
        for(int i = 0 ; i < n ; i++)
            result[i] = (candies[i] + extraCandies >= maxCandies);
        return result;
    }
}

//{
//        List <Boolean> ans = new ArrayList<>();
//        for (int i = 0; i < candies.length; i++) {
//        boolean test1 = false;
//        for (int j = 0; j < candies.length; j++) {
//        if (candies[i] + extraCandies < j){
//        test1 = true;
//        break;
//        }
//        }
//        if(test1){
//        ans.add(false);
//        }else{
//        ans.add(true);
//        }
//        }
//        return ans;
//        }
//        }
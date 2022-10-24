/**
 * Wing Li
 * October 19, 2022
 * Outputs the least number of swings it takes to get a golf ball in the hole
 */
public class Q3Golf {
    public static int golf(int[] clubs, int distance, int club) {
        if (distance == 0) {
            return 0;
        }
        if (distance - clubs[club] < 0) {
            if (club == clubs.length - 1) {
                //Final club, but the distance is too small
                return -1;
            }
            
            return golf(clubs, distance, club + 1);
        }
        int attempt = golf(clubs, distance - clubs[club], club);
        return -99;
    }
}

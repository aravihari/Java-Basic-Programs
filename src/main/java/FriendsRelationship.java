// url
// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/friends-relationship-1/

//Jack is your friend and Sophia is his girlfriend. But due to some unknown reason
//( unknown for us, they know it) Sophia started hating to Jack. Now, Jack is in big trouble but
//he has a solution, He knows that if he will gift T patterns of a particular type ( For pattern observation
//see the sample test cases) then Sophia will start loving again to Jack. But Jack is depressed now and need
//your help to gift her that type patterns of '*' and '#' of N lines. So, it's your responsibility to save your
//friend's relationship.
//
//Constraints :
//
//1 ≤  T ≤ 100
//
//1 ≤  N ≤ 30
//
//Input :
//
//First Line contains T i.e. number of test case.
//Each of the next T lines contain an integer N.
//
//Output:
//
//For each test case print the pattern of N lines then after a blank line.

//Sample Input
//3
//9
//2
//5

//Sample Output
//*################*
//**##############**
//***############***
//****##########****
//*****########*****
//******######******
//*******####*******
//********##********
//******************
//
//*##*
//****
//
//*########*
//**######**
//***####***
//****##****
//**********

import java.util.Scanner;

public class FriendsRelationship {
    private StringBuilder desiredPattern = new StringBuilder();

    public String generateOutput(int inputValue){
        desiredPattern.setLength(0);
        for (int itr = 1; itr <= inputValue; itr++){
            executeRepeatAppending(itr, "*");
            executeRepeatAppending(2*(inputValue - itr), "#");
            executeRepeatAppending(itr, "*");
            desiredPattern.append("\n");
        }
        return desiredPattern.toString();
    }

    private void executeRepeatAppending(int numberOfTimes, String value){
        for (int itr = 1; itr<= numberOfTimes; itr++){
            desiredPattern.append(value);
        }
    }

    public static void main(String[] args) {
        FriendsRelationship friendsRelationship = new FriendsRelationship();
        Scanner scanner = new Scanner(System.in);
        int linesOfPattern = scanner.nextInt();
        for (int itr = 1; itr <= linesOfPattern; itr++) {
            System.out.println(friendsRelationship.generateOutput(scanner.nextInt()));
        }
    }
}
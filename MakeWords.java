import java.util.ArrayList;
import java.util.List;
public class MakeWords{
  public static List<String> makeAllWords(int k, int maxLetter){
    ArrayList<String> L = new ArrayList(exp(maxLetter, k));
    helper(k, maxLetter, "", L);
    return L;
  }

  //My own exponent function
  private static int exp(int base, int exp){
    if (exp == 0){
      return 1;
    }
    return exp(base*base, exp - 1);
  }

  private static void helper(int k, int maxLetter, String s, ArrayList<String> L){
    //Base case: k == 0--> Add to the list
    //System.out.println("k: "+k+", String: "+s);
    if (k==0){
      L.add(s);
    }
    //Otherwise, decrease k by 1 and call the recursive maxLetter times
    //Loop through the alphabet to find the correct character
    else{
      for (int i = 0; i < maxLetter; i++){
        helper(k-1, maxLetter, s+(char)(97+i), L); //Call the recursive on each letter
      }
    }
  }

//makeAllWords(1,26) returns the list:
//    ["a","b","c",..."z"]

//makeAllWords(2,26) returns the list:
//    ["aa","ab","ac",..."az",
//     "ba","bb","bc",..."bz",
//     ...
//     "za","zb","zc",..."zz"]

//makeAllWords(3,3) returns the list:
//    ["aaa","aab","aac",
//     "aba","abb","abc",
//     ...
//     "cca","ccb","ccc"]

//makeAllWords(4,2) returns the list:
//    ["aaaa","aaab"
//     "aaba","aabb"
//     ...
//     "bbaa","bbab",
//     "bbba","bbbb"]
}

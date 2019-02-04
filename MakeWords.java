import java.util.ArrayList;
public class MakeWords{
  public static List<String> makeAllWords(int k, int maxLetter){
    ArrayList L = new ArrayList(exp(maxLetter, k));
    return helper(k, maxLetter, L);
  }

  //My own exponent function
  private static int exp(int base, int exp){
    if (exp == 0){
      return 1;
    }
    return exp(base*base, exp - 1);
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

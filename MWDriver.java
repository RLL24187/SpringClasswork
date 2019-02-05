public class MWDriver{
  public static void main(String[] args){
    System.out.println("Testing MakeWords");
    System.out.println("makeAllWords(1,26) returns the list:\n    [\"a\",\"b\",\"c\",...\"z\"]");
    System.out.println(MakeWords.makeAllWords(1,26));

    System.out.println("makeAllWords(2,26) returns the list:\n    [\"aa\",\"ab\",\"ac\",...\"az\",\n     \"ba\",\"bb\",\"bc\",...\"bz\",\n     ...\n     \"za\",\"zb\",\"zc\",...\"zz\"]");
    System.out.println(MakeWords.makeAllWords(2,26));

    System.out.println("makeAllWords(3,3) returns the list:\n    [\"aaa\",\"aab\",\"aac\",\n     \"aba\",\"abb\",\"abc\",\n     ...\n     \"cca\",\"ccb\",\"ccc\"]");
    System.out.println(MakeWords.makeAllWords(3, 3));
    
    System.out.println("makeAllWords(4,2) returns the list:\n    [\"aaaa\",\"aaab\"\n     \"aaba\",\"aabb\"\n     ...\n     \"bbaa\",\"bbab\",\n     \"bbba\",\"bbbb\"]");
    System.out.println(MakeWords.makeAllWords(4, 2));
  }
}

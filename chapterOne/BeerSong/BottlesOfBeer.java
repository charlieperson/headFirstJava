public class BottlesOfBeer {
  public static void main(String[] args) {
    int beernum = 99;
    String word = "bottles";
    while(beernum > 0) {
      if(beernum == 1) word = "bottle";
      System.out.println(beernum + " " + word + " of beer on the wall, ");
      System.out.println(beernum + " " + word + " of beer-");
      System.out.println("take one down, ");
      System.out.println("pass it around, ");
      beernum = beernum - 1;
      if(beernum == 0) word = "bottles";
      if(beernum == 1) word = "bottle";
      System.out.println(beernum + " " + word + " of beer on the wall.");
    }
    System.out.println("No more bottles of beer on the wall.");
  }
}

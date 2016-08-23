public class PhraseOMatic {
  public static void main(String[] args) {
    String[] words1 = {"big", "tiny", "teeny-weeny", "small", "gigantic", "massive", "average"};
    String[] words2 = {"hairy", "scary", "fluffly", "bold", "chilly", "persistent", "giggly"};
    String[] words3 = {"octopus", "clam shell", "old man", "legend", "mall", "dog", "oyster"};

    int random1 = (int) (Math.random() * words1.length);
    int random2 = (int) (Math.random() * words2.length);
    int random3 = (int) (Math.random() * words3.length);

    System.out.print(words1[random1] + " " + words2[random2] + " " + words3[random3]);
  }
}

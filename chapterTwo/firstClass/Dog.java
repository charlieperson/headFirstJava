class Dog {
  int mSize;
  String mBreed;
  String mName;

  Dog(String name, String breed, int size) {
    mName = name;
    mBreed = breed;
    mSize = size;
  }

  void bark() {
    System.out.println("Ruff! Ruff!");
  }
}

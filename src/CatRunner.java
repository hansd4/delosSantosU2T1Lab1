public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murple", 3, 12.7);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Rascal", 8, 19.2);
        cat2.introduce();
        cat2.printCatInfo();
    }
}

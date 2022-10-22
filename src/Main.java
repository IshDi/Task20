public class Main {
    static String textLoremIpsum =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        WordsChecker userWord = new WordsChecker(textLoremIpsum);
        System.out.println(userWord.hasWord("dolore"));
        System.out.println(userWord.hasWord("sunt"));
        System.out.println(userWord.hasWord("wwww"));
        System.out.println(userWord.hasWord("reprehenderit"));
    }
}

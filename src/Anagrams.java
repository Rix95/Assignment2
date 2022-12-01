public class Anagrams {

    public static void main(String[] args) {
        System.out.println("Welcome to the anagram finder!\n");

        if (args.length != 1) {
            System.out.println("  usage: java Anagram some-text.txt\n");
            System.exit(0);
        }

        System.out.println("  reading file " + args[0] + "...");

        WordReader wr = new WordReader(args[0]);

    }
}

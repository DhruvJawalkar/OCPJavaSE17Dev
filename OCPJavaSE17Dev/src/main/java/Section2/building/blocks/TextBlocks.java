package Section2.building.blocks;

public class TextBlocks {
    public static void main(String[] args) {
        String textBlock = """
                "Hi, this is a text block"
                  text block line 2
                """;

        System.out.println(textBlock);
        System.out.println(textBlock + "Hello!");
    }
}

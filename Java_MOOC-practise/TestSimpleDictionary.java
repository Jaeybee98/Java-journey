public class TestSimpleDictionary {
	public static void main(String[] args) {
		SimpleDictionary dictionary = new SimpleDictionary();

        	dictionary.addTranslation("hello", "hola");
        	dictionary.addTranslation("world", "mundo");

        	String translation1 = dictionary.translate("hello");
        	String translation2 = dictionary.translate("world");
        	String translation3 = dictionary.translate("java");

        	System.out.println("Translation of 'hello': " + translation1);
        	System.out.println("Translation of 'world': " + translation2);
        	System.out.println("Translation of 'java': " + translation3);
	}
}

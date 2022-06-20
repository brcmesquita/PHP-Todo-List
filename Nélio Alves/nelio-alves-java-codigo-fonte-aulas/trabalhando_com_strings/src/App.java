public class App {
    public static void main(String[] args) throws Exception {
        
        String original = "abcde FGHIJ ABC abc DEFG     ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace("a", "x");
        String s07 = original.replace("abc", "xyz");
        int i01 = original.indexOf("bc");
        int i02 = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + '-');
        System.out.println("toLowerCase: -" + s01 + '-');
        System.out.println("toUpperCase: -" + s02 + '-');
        System.out.println("trim: -" + s03 + '-');
        System.out.println("substring: -" + s04 + '-');
        System.out.println("substring: -" + s05 + '-');
        System.out.println("replace ('a', 'x'): -" + s06 + '-');
        System.out.println("replace ('abc', 'xyz'): -" + s07 + '-');
        System.out.println("indexOf ('bc'): -" + i01 + '-');
        System.out.println("lastIndexOf ('bc'): -" + i02 + '-');

        // =====================================
        // Usando Split

        String food = "Hot-dog Hamburger Pizza Pasta Lasagna";
        String[] foods = food.split(" ");

        System.out.println(foods[0]);
        System.out.println(foods[1]);
        System.out.println(foods[2]);
        System.out.println(foods[3]);
        System.out.println(foods[4]);
        
        String pizza = foods[2];
        System.out.println("-> " + pizza);

    }
}

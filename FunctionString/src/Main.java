public class Main {
    public static void main(String[] args) {
    String original = "abcde FGHIJ ABC abc DEFG";

            String s01 = original.toLowerCase(); //minusculo
            String s02 = original.toUpperCase(); //maíusculo
            String s03 = original.trim(); //elimina os espaços no final
            String s04 = original.substring(2); //dois em diante
            String s05 = original.substring(2,9); //recorta 2 abaixo do caractere 9
            String s06 = original.replace('a','x'); //toda vez que ver "a" trocar por "x"
            String s07 = original.replace("abc","xy");  //toda vez que ver "abc" trocar por "xy"
            int i = original.indexOf("bc"); //primeira ocorrencia bc (local da String)
            int j  = original.lastIndexOf("bc");  //última ocorrência do bc (local da String)





            System.out.println("Original: -" + original +"-");
            System.out.println("toLowerCase: -"+ s01 +"-");
            System.out.println("toUpperCase: -"+s02+"-");
            System.out.println("Trim: -"+s03+"-");
            System.out.println("Substring(2): -"+s04+"-");
            System.out.println("Substring(2,9): -"+s05+"-");
            System.out.println("replace('a','x'): -"+s06+"-");
            System.out.println("replace('abc','xy'): -"+s07+"-");
            System.out.println("Index of 'bc': " + i);
            System.out.println("Index of 'bc': " + j);
        }
    }
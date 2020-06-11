package by.epamte.StringTask;

public class StringTask {

    //Task 1
    private static String[] getEvenOddStringsFromString(String inputString) {
        StringBuilder evenStringBuilder = new StringBuilder();
        StringBuilder oddStringBuilder = new StringBuilder();

        for (int index = 0; index < inputString.length(); index++) {
            if (index % 2 == 0) {
                evenStringBuilder.append(inputString.charAt(index));
            } else {
                oddStringBuilder.append(inputString.charAt(index));
            }
        }

        return new String[]{evenStringBuilder.toString(), oddStringBuilder.toString()};
    }

    //Task 2
    private static double getLowerAndUpperLettersPercentage(String inputString) {
        int upperLetterQuantity = 0;
        int lowerLetterQuantity = 0;
        char[] charArray = inputString.toCharArray();

        for (char ch : charArray) {
            if (ch == ' ') {
                continue;
            }

            if (Character.isUpperCase(ch)) {
                upperLetterQuantity++;
            } else {
                lowerLetterQuantity++;
            }
        }

        if ((lowerLetterQuantity != 0) && (upperLetterQuantity == 0)) {
            return 100;
        } else {
            return (double) lowerLetterQuantity / upperLetterQuantity * 100;
        }
    }

    //Task 3
    private static String getStringWithoutDuplicatedLetters(String inputString) {
        final int NOT_FOUND_INDEX = -1;
        StringBuilder stringBuilderWithoutDuplicates = new StringBuilder();

        for (int index = 0; index < inputString.length(); index++) {
            String letter = inputString.substring(index, index + 1);
            if (stringBuilderWithoutDuplicates.indexOf(letter) == NOT_FOUND_INDEX) {
                stringBuilderWithoutDuplicates.append(letter);
            }
        }

        return stringBuilderWithoutDuplicates.toString();
    }

    //Task 4
    private static int getSymbolMatchQuantity(String inputString, char symbol) {
        final int NOT_FOUND_INDEX = -1;
        String subString = inputString;
        int index = subString.indexOf(symbol);
        int quantity = 0;

        while (index != NOT_FOUND_INDEX) {
            subString = subString.substring(index + 1);
            index = subString.indexOf(symbol);
            quantity++;
        }

        return quantity;
    }

    //Task 5
    private static String getReversedString(String inputString) {
        StringBuilder reversedStringBuilder = new StringBuilder(inputString);

        reversedStringBuilder.reverse();

        return reversedStringBuilder.toString();
    }

    //Task 6
    private static String getStringWithInsertedSub(String inputString, String subString, int offset) {
        StringBuilder resultStringBuilder = new StringBuilder(inputString);

        resultStringBuilder.insert(offset, subString);

        return resultStringBuilder.toString();
    }

    //Task 7
    private static String getStringWithoutSub(String inputString, String subString) {
        return inputString.replace(subString, "");
    }

    //Task 8
    private static String getPartFromString(String inputString, int startIndex, int endIndex) {
        return inputString.substring(startIndex, endIndex);
    }

    //Task 9
    private static int getStringLength(String inputString) {
        return inputString.length();
    }

    //Task 10
    private static int getSubstringMatchQuantity(String inputString, String subString) {
        final int NOT_FOUND_INDEX = -1;
        String uncheckedString = inputString;
        int index = uncheckedString.indexOf(subString);
        int quantity = 0;

        while (index != NOT_FOUND_INDEX) {
            uncheckedString = uncheckedString.substring(index + 1);
            index = uncheckedString.indexOf(subString);
            quantity++;
        }

        return quantity;
    }

    //Task 11
    private static String getReversedWordsString(String inputString) {
        String[] words = inputString.split(" ");
        StringBuilder resultBuilder = new StringBuilder();

        for (int index = words.length - 1; index > 0; index--) {
            resultBuilder.append(words[index] + " ");
        }

        return resultBuilder.toString().trim();
    }

    //Task 12
    private static String getReplacedSpacesString(String inputString) {
        return inputString.replaceAll("[\\s]+", "*");
    }

    //Task 13
    private static String getStringWithReplacement(String inputString) {
        String[] words = inputString.split(" ");
        StringBuilder resultStringBuilder = new StringBuilder();
        int longestWordIndex = 0;

        for (int index = 1; index < words.length; index++) {
            if (words[index].length() > words[longestWordIndex].length()) {
                longestWordIndex = index;
            }
        }
        words[longestWordIndex] = words[longestWordIndex].replaceAll("a", "b");
        for (String word : words) {
            resultStringBuilder.append(word + " ");
        }

        return resultStringBuilder.toString().trim();
    }

    //Task 14
    private static int getLengthOfShortestWord(String inputString) {
        String[] words = inputString.split(" ");
        int shortestWordIndex = 0;

        for (int index = 1; index < words.length; index++) {
            if (words[index].length() < words[shortestWordIndex].length()) {
                shortestWordIndex = index;
            }
        }

        return words[shortestWordIndex].length();
    }

    //Task 15
    private static int getQuantityOfWords(String inputString) {
        return inputString.split(" ").length;
    }

    //Task 16
    private static String getStringWithWordReplacement(String inputString, int firstWordIndex, int secondWordIndex) {
        String[] words = inputString.split(" ");
        StringBuilder resultStringBuilder = new StringBuilder();
        String tempWord = words[firstWordIndex];

        words[firstWordIndex] = words[secondWordIndex];
        words[secondWordIndex] = tempWord;

        for (String word : words) {
            resultStringBuilder.append(word + " ");
        }
        return resultStringBuilder.toString().trim();
    }

    //Task 17
    private static String getStringWithoutLastWord(String inputString) {
        return inputString.substring(0, inputString.lastIndexOf(' '));
    }

    //Task 18
    private static String getStringWithSpacesInserted(String inputString, int position, int quantity) {
        StringBuilder resultStringBuilder = new StringBuilder(inputString);

        for (int index = 0; index < quantity; index++) {
            resultStringBuilder.insert(position, " ");
        }

        return resultStringBuilder.toString();
    }

    //Task 19
    private static boolean isPalindrome(String inputString) {
        String reversedString = new StringBuilder(inputString).reverse().toString();

        return inputString.equals(reversedString);
    }

    //Task 20
    private static String getSubStringSwapped(String inputString, String subString, String replaceWith) {
        return inputString.replaceAll(subString, replaceWith);
    }

    //Task 21
    private static String getSum(String firstNumber, String secondNumber) {
        StringBuilder result = new StringBuilder();
        int perenos = 0;
        StringBuilder biggerNumStringBuilder;
        StringBuilder lowerNumStringBuilder;
        int sum;

        if (firstNumber.length() > secondNumber.length()) {
            biggerNumStringBuilder = new StringBuilder(firstNumber);
            lowerNumStringBuilder = new StringBuilder(secondNumber);
        } else {
            biggerNumStringBuilder = new StringBuilder(secondNumber);
            lowerNumStringBuilder = new StringBuilder(firstNumber);
        }
        biggerNumStringBuilder.reverse();
        lowerNumStringBuilder.reverse();

        for (int index = 0; index < lowerNumStringBuilder.length(); index++) {
            int a = Character.getNumericValue(biggerNumStringBuilder.charAt(index));
            int b = Character.getNumericValue(lowerNumStringBuilder.charAt(index));

            sum = a+b + perenos;
            perenos = 0;
            if(sum / 10 > 0) {
                perenos = (a + b) / 10;
                sum %= 10;
            }
            result.append(sum);
        }

        for (int index = lowerNumStringBuilder.length(); index < biggerNumStringBuilder.length(); index++) {
                int a = Character.getNumericValue(biggerNumStringBuilder.charAt(index));
                a += perenos;
                perenos = a / 10;
                a %= 10;
                result.append(a);
        }
        if(perenos > 0) {
            result.append(perenos);
        }

        return result.reverse().toString();
    }

    //Task 22
    private static String getStringWithDeletedWordsOfLength(String inputString, int length) {
        String[] words = inputString.split(" ");
        StringBuilder resultStringBuilder = new StringBuilder();

        for (String word : words) {
            if(word.length() == length) {
                continue;
            }
            resultStringBuilder.append(word + " ");
        }
        return resultStringBuilder.toString().trim();
    }

    //Task 23
    private static String getStringWithoutDuplicateSpaces(String inputString) {
        return inputString.replaceAll("[\\s]+", " ").trim();
    }

    //Task 24
    private static String[] getWordsFromString(String inputString) {
        return inputString.split(" ");
    }

    public static void main(String[] args) {
        String input = "HELLO world";
        String[] evenAndOddStrings = getEvenOddStringsFromString(input);
        System.out.println(evenAndOddStrings[0] + " | " + evenAndOddStrings[1]);

        double percentage = getLowerAndUpperLettersPercentage(input);
        System.out.printf("Percentage is %.2f%%\n", percentage);

        System.out.println(getStringWithoutDuplicatedLetters(input));

        char symbol = 'L';
        int duplicateQuantity = getSymbolMatchQuantity(input, symbol);

        System.out.printf("Symbol %s is repeated %d times\n", symbol, duplicateQuantity);

        System.out.printf("%s reversed is %s\n", input, getReversedString(input));

        System.out.println(getStringWithInsertedSub(input, "_hey_", 10));

        System.out.println(getStringWithoutSub(input, "LL"));

        System.out.println(getPartFromString(input, 1, 5));

        System.out.println(getStringLength(input));

        System.out.println(getSubstringMatchQuantity("Hello HellNo Hello", "Hello"));

        System.out.println(getReversedWordsString("Hello My Dear Friend"));

        System.out.println(getReplacedSpacesString("Hello World    World hello"));

        System.out.println(getStringWithReplacement("heay heayy aaaheyyyyy ahaay"));

        System.out.println(getLengthOfShortestWord("hesssy hesssy as hesssssy"));

        System.out.println(getQuantityOfWords(input));

        System.out.println(getStringWithWordReplacement("hesssy hessy as hesssssy", 0, 2));

        System.out.println(getStringWithoutLastWord("hesssy hessy as hesssssy"));

        System.out.println(getStringWithSpacesInserted("12345678", 5, 5));

        System.out.println(isPalindrome("heeeh"));

        System.out.println(getSubStringSwapped("hesssy hessy as hesssssy", "as", "like"));

        System.out.println(getSum("12345678","98765432"));

        System.out.println(getStringWithDeletedWordsOfLength("HEEEY HEY HEEY HEEEY HEEEY HEEEEY",5));

        System.out.println(getStringWithoutDuplicateSpaces("   HELLO       BROTHER S "));
    }

}

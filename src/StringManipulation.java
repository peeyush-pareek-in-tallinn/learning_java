class StringManipulation {

    public static void main(String[] args) {
        String firstName = "Something";
        String secondName = "OtherThing";
        String fullName = firstName + " " + secondName;
        String fullNameConcatenateChaning = firstName.concat(" ").concat(secondName);
        System.out.printf("With \"printf\": %S %S\n", firstName, secondName);
        System.out.println("With normal concatenation: " + fullName.toUpperCase());
        System.out.println("With Concatenation Chain: " + fullNameConcatenateChaning.toUpperCase());
    }

}

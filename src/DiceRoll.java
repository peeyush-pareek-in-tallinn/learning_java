class DiceRoll {

    int roll () {
//        return (int)(Math.random() * 6) + 1; // Strictly 1-6. No possibility of rolling a '0'
        return (int) Math.ceil((Math.random() * 6)); // Rolls 1-6 but, Rare possibility of rolling a '0'
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Dice Roll\n");
        DiceRoll diceRoll = new DiceRoll();
        for (int i = 0; i < 100; i++) {
            System.out.println(diceRoll.roll());
        }
    }
}

class in {
    public static void main(String[] args) {
        
        //input the String value

        String name = io.inputS("what is your name: ");
        io.print(name + "\n");

        //input the int value

        int id = io.inputI("what is your id: ");
        io.print(id + "\n");

        //input the double value

        double mark = io.inputD("what is your mark: ");
        io.print(mark + "\n");

        //input the float value

        float weight = io.inputF("what is your weight: ");
        io.print(weight + "\n");

        //input the char value

        char char_enter = io.inputC("what is your character: ");
        io.print(char_enter + "\n");

        //input the boolean value

        boolean tr_fa = io.inputB("Are you a boy: ");
        io.print(tr_fa + "\n");

    }
}

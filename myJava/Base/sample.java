class sample {
    public static void main(String[] args) {
      
        String name = io.inputS("what is your name: ");
        io.print(name + "\n");

        int id = io.inputI("what is your id: ");
        io.print(id + "\n");

        double mark = io.inputD("what is your mark: ");
        io.print(mark + "\n");

        float weight = io.inputF("what is your weight: ");
        io.print(weight + "\n");

        char char_enter = io.inputC("what is your character: ");
        io.print(char_enter + "\n");

        boolean tr_fa = io.inputB("Are you a boy: ");
        io.print(tr_fa + "\n");

    }
}

package day03;

public class Caesar extends Encryption {

    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toUpperCase().toCharArray()) {
            if (c != ' ') {
                int originalPosInAlphabet = c - 'A';
                int newPosInAlphabet = (originalPosInAlphabet + offset) % 26;
                sb.append((char) ('A' + newPosInAlphabet));
            } else sb.append(c);
        }

        return sb.toString();
    }

}

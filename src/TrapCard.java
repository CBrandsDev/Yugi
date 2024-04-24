public class TrapCard extends Card {
    private String effect;

    public TrapCard(String name, String e) {
        super(name);
        effect = e;
    }

    public void setTrapCard() {
        String[] lines = {
            "::MMMMMM@@MM++MMmmmmmmmm::++mm",
            "+ "+super.name+"                          +",
            "MM..::::::::::::++::::::..::++",
            "mm----::--..--::::::::--::::::",
            "++..                        ::",
            "++::                        ::",
            "mm::                        ::",
            "::--                        ::       Effect:",
            "++::                        ::       "+effect+"",
            "++::                        ::",
            "mm--                        ::",
            "mm--                        ::",
            "@@--                        ::",
            "@@--                        ::",
            "@@::                        ::",
            "MM::@@@@@@####@@@@##@@@@####::",
            "MMmm                        mm       ",
            "mm++                        mm",
            "::mm                        mm",
            "++++                        mm",
            "mm++::++--::::++++++::::++++--"
        };
        
        for (String line : lines) {
            if (line.contains(name)) {
                int spaces = line.length() - name.length() - 13;
                String formattedLine = String.format("++ %s%" + spaces + "s++", name, "");
                System.out.println(formattedLine);
            } else {
                System.out.println(line);
            }
        }
    }
}
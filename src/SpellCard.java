public class SpellCard extends Card {
    String type;
    String effect;

    public SpellCard(String name, String t, String e) {
        super(name);
        type = t;
        effect = e;
    }

    public void setSpellCard() {
        String[] lines = {
            "::MMMMMM@@MM++MMmmmmmmmm::++mm",
            "+ "+super.name+"                          +",
            "MM..::::::::::::++::::::..::++",
            "mm----::--..--::::::::--::::::",
            "++..                        ::",
            "++::                        ::",
            "mm::                        ::",
            "::--                        ::       "+type+" Card",
            "++::                        ::",
            "++::                        ::       Effect:",
            "mm--                        ::       "+effect+"",
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
                int spaces = line.length() - name.length() - 18;
                String formattedLine = String.format("++ %s%" + spaces + "s++", name, "");
                System.out.println(formattedLine);
            } else {
                System.out.println(line);
            }
        }
    }
}

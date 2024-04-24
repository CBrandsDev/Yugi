public class MonsterCard extends Card {
    private int levelStar;
    private int attack;
    private int defense;
    private String effect;
    private String type;
    private String attribute;

    public MonsterCard(String name, int ls, int at, int df, String e, String t, String a) {
        super(name);
        levelStar = ls;
        attack = at;
        defense = df;
        effect = e;
        type = t;
        attribute = a;
    }

    public void setMonsterCard() {
        String[] lines = {
            "::MMMMMM@@MM++MMmmmmmmmm::++mm",
            "++ "+super.name+"                 ++",
            "MM..::::::::::::++::::::..::++",
            "mm----::--..--::::::::--::::::",
            "++..          Star Level  "+levelStar+" ::",
            "++::                        ::",
            "mm::                        ::",
            "::--                        ::       "+type+"",
            "++::                        ::       "+attribute+"",
            "++::                        ::",
            "mm--                        ::       Effect:",
            "mm--                        ::       "+effect+"",
            "@@--                        ::",
            "@@--                        ::",
            "@@::                        ::",
            "MM::@@@@@@####@@@@##@@@@####::",
            "MMmm                        mm       ",
            "mm++                        mm",
            "::mm               ATK  DFS mm",
            "++++              "+attack+"/"+defense+" mm",
            "mm++::++--::::++++++::::++++--"
        };
        
        for (String line : lines) {
            if (line.contains(name)) {
                int spaces = line.length() - name.length() - 8;
                String formattedLine = String.format("++ %s%" + spaces + "s++", name, "");
                System.out.println(formattedLine);
            } else {
                System.out.println(line);
            }
        }
        
    }
}
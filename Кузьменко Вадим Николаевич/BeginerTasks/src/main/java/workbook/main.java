public class main {
    public static void main(String[] args) {
        int n = 0;
        String str = "афла,1.айа!,..,.........ca";
        char sym;
        for (int i = 0; i < str.length(); i++) {
            sym = str.charAt(i);
            if (sym == ',') {
                n++;
            } else {
                if (sym == '?') {
                    n++;
                } else {
                    if (sym == '!') {
                        n++;
                    } else {
                        if (sym == '.') {
                            n++;
                        } else {
                            if (sym == ',') {
                                n++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(n);
    }
}
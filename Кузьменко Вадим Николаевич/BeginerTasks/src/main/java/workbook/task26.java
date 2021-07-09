package workbook;
//FIXME 1. Исходники должны выть валидными и корректными.
//FIXME 2. Данное задание на регулярные выражения. В частности где обработка многоточия.
public class task26 {
    public static void main(String[] args) {
        int n = 0;
        String str = "1414ю141,1141.?1.14.141151!!,15ппвыо";
        char sym;
        for (int i = 0; i < str.length(); i++) {
            sym = str.charAt(i);
            if (sym == ',') {
                n++;
            } else {
                if (sym == '?') {
                    n++;
                } else {
                    if (sym == '.') {
                        n++;
                    } else {
                        if (sym == '!') {
                            n++;
                        }
                    } //?

                }
            }
        }

        System.out.println(n);
    }
}


package by.ita.telegram.menu;

import by.ita.telegram.bot.TegramMenu;

public enum TestMenu implements TegramMenu {
 param1("кнопка 1"),param2("кнопка 2"),param3("кнопка 2");
    private final String label;
    TestMenu(String label){
        this.label=label;
    }
    @Override
    public String getLabel() {
        return this.label;
    }
}

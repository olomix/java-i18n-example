package example;

import java.text.MessageFormat;
import java.util.Locale;

import static example.I18NUtils._;
import static example.I18NUtils.ngettext;

public class Main {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        System.out.println(_("Hello World!"));
        int rand = (int) (Math.random() * 100);
        System.out.println(MessageFormat.format(
                ngettext(
                        "Something random happened {0} time",
                        "Something random happened {0} times",
                        rand
                ),
                new Object[]{rand}
        ));
    }
}


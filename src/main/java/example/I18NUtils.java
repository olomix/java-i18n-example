package example;

import gnu.gettext.GettextResource;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NUtils {
    private static ResourceBundle resource =
            ResourceBundle.getBundle("example.messages", Locale.getDefault());

    public static String gettext(String text) {
        return GettextResource.gettext(resource, text);
    }

    public static String _(String text) {
        return gettext(text);
    }

    public static String ngettext(String msgid, String msgid_plural, long n) {
        return GettextResource.ngettext(resource, msgid, msgid_plural, n);
    }
}

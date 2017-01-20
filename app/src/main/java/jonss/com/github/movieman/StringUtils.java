package jonss.com.github.movieman;

import java.util.Locale;

/**
 * Created by joao on 19/01/17.
 */

public class StringUtils {

    public static String getLanguage() {
        return Locale.getDefault().getLanguage()
                .concat("-")
                .concat(Locale.getDefault().getCountry());
    }
}

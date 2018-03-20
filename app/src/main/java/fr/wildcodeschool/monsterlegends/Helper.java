package fr.wildcodeschool.monsterlegends;

import android.graphics.Typeface;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by bastienwcs on 20/03/18.
 */

public class Helper {

    /**
     * Méthode qui permet de changer les polices d'écritures
     */
    public static void setFont(TextView textView, String fontName) {
        if (fontName != null) {
            try {
                Typeface typeface = Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + fontName);
                textView.setTypeface(typeface);
            } catch (Exception e) {
                Log.e("FONT", fontName + " not found", e);
            }
        }
    }
}

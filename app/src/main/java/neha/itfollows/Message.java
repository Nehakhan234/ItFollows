package neha.itfollows;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Neha on 2/12/2018.
 */

public class Message
{
    public static void message(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
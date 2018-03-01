package neha.itfollows;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by Neha on 2/13/2018.
 */

public class AboutActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.neha2);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 600);

       /* ImageView circularImageView = (ImageView)findViewById(R.id.imageView);
        circularImageView.setImageBitmap(circularBitmap);
*/
        TextView mLink = (TextView) findViewById(R.id.textView7);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mLink1 = (TextView) findViewById(R.id.textView8);
        if (mLink1 != null) {
            mLink1.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TextView mLink2 = (TextView) findViewById(R.id.textView9);
        if (mLink2 != null) {
            mLink2.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

}
package prof.mo.ed.sunshine2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    /* Field to store our TextView */
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        /* Typical usage of findViewById... */
        mDisplayText = (TextView) findViewById(R.id.tv_display);

        // TODO (3) Use the getIntent method to store the Intent that started this Activity in a variable

        // TODO (4) Create an if statement to check if this Intent has the extra we passed from MainActivity

        // TODO (5) If the Intent contains the correct extra, retrieve the text

        // TODO (6) If the Intent contains the correct extra, use it to set the TextView text
    }
}
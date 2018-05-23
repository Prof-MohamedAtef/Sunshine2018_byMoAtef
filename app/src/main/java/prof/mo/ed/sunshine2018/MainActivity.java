package prof.mo.ed.sunshine2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private static final String LIFECYCLE_CALLBACKS_TEXT_KEY = "callbacks";


    private static final String ON_CREATE = "onCreate";
    private static final String ON_START = "onStart";
    private static final String ON_RESUME = "onResume";
    private static final String ON_PAUSE = "onPause";
    private static final String ON_STOP = "onStop";
    private static final String ON_RESTART = "onRestart";
    private static final String ON_DESTROY = "onDestroy";
    private static final String ON_SAVE_INSTANCE_STATE = "onSaveInstanceState";

    private TextView mLifecycleDisplay;

    // TODO (1) Declare and instantiate a static ArrayList of Strings called mLifecycleCallbacks
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLifecycleDisplay = (TextView) findViewById(R.id.tv_lifecycle_events_display);
        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey(LIFECYCLE_CALLBACKS_TEXT_KEY)) {
                String allPreviousLifecycleCallbacks = savedInstanceState
                        .getString(LIFECYCLE_CALLBACKS_TEXT_KEY);
                mLifecycleDisplay.setText(allPreviousLifecycleCallbacks);
            }
        }

        // TODO (4) Iterate backwards through mLifecycleCallbacks, appending each String and a newline to mLifecycleDisplay

        // TODO (5) Clear mLifecycleCallbacks after iterating through it

        logAndAppend(ON_CREATE);
    }

    @Override
    protected void onStart() {
        super.onStart();

        logAndAppend(ON_START);
    }

    @Override
    protected void onResume() {
        super.onResume();

        logAndAppend(ON_RESUME);
    }

    @Override
    protected void onPause() {
        super.onPause();

        logAndAppend(ON_PAUSE);
    }

    /**
     * Called when the activity is no longer visible to the user, because another activity has been
     * resumed and is covering this one. This may happen either because a new activity is being
     * started, an existing one is being brought in front of this one, or this one is being
     * destroyed.
     *
     * Followed by either onRestart() if this activity is coming back to interact with the user, or
     * onDestroy() if this activity is going away.
     */
    @Override
    protected void onStop() {
        super.onStop();

        // TODO (2) Add the ON_STOP String to the front of mLifecycleCallbacks

        logAndAppend(ON_STOP);
    }

    /**
     * Called after your activity has been stopped, prior to it being started again.
     *
     * Always followed by onStart()
     */
    @Override
    protected void onRestart() {
        super.onRestart();

        logAndAppend(ON_RESTART);
    }
    
    /**
     * The final call you receive before your activity is destroyed. This can happen either because
     * the activity is finishing (someone called finish() on it, or because the system is
     * temporarily destroying this instance of the activity to save space. You can distinguish
     * between these two scenarios with the isFinishing() method.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();

        // TODO (3) Add the ON_DESTROY String to the front of mLifecycleCallbacks

        logAndAppend(ON_DESTROY);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        logAndAppend(ON_SAVE_INSTANCE_STATE);
        String lifecycleDisplayTextViewContents = mLifecycleDisplay.getText().toString();
        outState.putString(LIFECYCLE_CALLBACKS_TEXT_KEY, lifecycleDisplayTextViewContents);
    }

    /**
     * Logs to the console and appends the lifecycle method name to the TextView so that you can
     * view the series of method callbacks that are called both from the app and from within
     * Android Studio's Logcat.
     *
     * @param lifecycleEvent The name of the event to be logged.
     */
    private void logAndAppend(String lifecycleEvent) {
        Log.d(TAG, "Lifecycle Event: " + lifecycleEvent);

        mLifecycleDisplay.append(lifecycleEvent + "\n");
    }

    /**
     * This method resets the contents of the TextView to its default text of "Lifecycle callbacks"
     *
     * @param view The View that was clicked. In this case, it is the Button from our layout.
     */
    public void resetLifecycleDisplay(View view) {
        mLifecycleDisplay.setText("Lifecycle callbacks:\n");
    }
}

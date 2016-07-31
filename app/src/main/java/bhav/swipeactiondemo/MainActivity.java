package bhav.swipeactiondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import bhav.swipeaction.SwipeAction;

public class MainActivity extends AppCompatActivity {

    private SwipeAction swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipe = (SwipeAction) findViewById(R.id.swipe);

        swipe.addOnPullListener(new SwipeAction.OnPullListener() {
            @Override
            public void onPull() {
                // your code here
                swipe.setWorking(false);
            }
        });
    }
}

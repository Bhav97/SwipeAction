package bhav.swipeactiondemo;

import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import bhav.swipeaction.SwipeAction;

public class MainActivity extends AppCompatActivity {

    private SwipeAction swipe;
    private boolean circle = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipe = (SwipeAction) findViewById(R.id.swipe);

        swipe.setIcon(getDrawable(R.drawable.ic_back));
        swipe.setPadding(16, 16, 16, 16);
        final Shape rect = new RectShape();
        final Shape circ = new OvalShape();

        swipe.setBackgroundColor(R.color.colorAccent);

        swipe.addOnPullListener(new SwipeAction.OnPullListener() {
            @Override
            public void onPull() {
                // your code here
                swipe.setBackgroundShape(circle ? circ : rect);
                circle = !circle;
                swipe.setWorking(circle);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(swipe.isActing()) {
         swipe.setWorking(false);
        } else {
            super.onBackPressed();
        }
    }
}

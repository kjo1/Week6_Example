package nc.prog1415;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TintableImageSourceView;

import android.os.Bundle;
import android.os.Handler;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo info)
    {


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView iv = findViewById(R.id.imageView);

        final int ids[] = {R.drawable.marsha, R.drawable.peter, R.drawable.dino};
        int index = 0;
        Runnable intro = new Runnable() {
            @Override
            public void run() {
                final int subscript = index;
                iv.setImageResource(ids[subscript]);
                if(++index < ids.length)
                    iv.postDelayed(this, 2000);

            }
        };
        Handler h = new Handler();
        h.post(intro);
    }

    class MyThread implements Runnable {
        @Override
        public void run() {
            while (true) {

            }
        }
    }
}

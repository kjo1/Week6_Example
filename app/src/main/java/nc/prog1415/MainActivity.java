package nc.prog1415;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TintableImageSourceView;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = findViewById(R.id.imageView);

        final int[] id = [R.drawable.marsha,R.drawable.peter,R.drawable.dino];
    }

    class MyThread implements Runnable
    {
        @Override
        public void run() {

        }
    }
}

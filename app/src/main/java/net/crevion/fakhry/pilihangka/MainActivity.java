package net.crevion.fakhry.pilihangka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final int min = 20;
    final int max = 80;
    int randLeft = 0, randRight = 0;
    Button btLeft, btRight;
    TextView statText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Random random = new Random();
//        int randLeft = random.nextInt((max - min) + 1) + min;
//        int randRight = random.nextInt((max - min) +1) + min;
        btLeft = (Button) findViewById(R.id.btLeft);
        btRight = (Button) findViewById(R.id.btRight);
        statText = (TextView) findViewById(R.id.statText);

//        String left = String.valueOf(randomAngka());
//        String right = String.valueOf(randomAngka());

//        btLeft.setText(left);
//        btRight.setText(right);

        randomAngka();

        btLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (randLeft > randRight){
                    statText.setText("BENAR");
                }else{
                    statText.setText("SALAH");
                }
                randomAngka();
            }
        });

        btRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (randRight > randLeft){
                    statText.setText("BENAR");
                }else{
                    statText.setText("SALAH");
                }
                randomAngka();
            }
        });
//        int random = Random.nextInt((max - min) + 1) + min;
    }

    public void randomAngka(){
        Random random = new Random();
        randLeft = random.nextInt((max - min) + 1) + min;
        randRight = random.nextInt((max - min) +1) + min;
        String rand1 = String.valueOf(randLeft);
        String rand2 = String.valueOf(randRight);
        btLeft.setText(rand1);
        btRight.setText(rand2);
    }
}

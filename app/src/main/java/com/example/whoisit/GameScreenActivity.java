package com.example.whoisit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameScreenActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView andres;
    private ImageView berenice;
    private ImageView eduardo;
    private ImageView enrique;
    private ImageView ismael;
    private ImageView juan;
    private ImageView lorena;
    private ImageView sebastian;
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        List<Character> characterList = new ArrayList<>();
        characterList.add(new Character("Andres", false, true, false));
        characterList.add(new Character("Berenice", false, false, true));
        characterList.add(new Character("Eduardo", true, false, false));
        characterList.add(new Character("Enrique", true, false, false));
        characterList.add(new Character("Ismael", false, false, true));
        characterList.add(new Character("Juan Pablo", false, false, true));
        characterList.add(new Character("Lorena", false, true, false));
        characterList.add(new Character("Sebastian", true, false, false));

        Character randomChar = getRandomChar(characterList);
        textView = findViewById(R.id.textView2);
        textView.setText(randomChar.getName());

        andres = findViewById(R.id.imageView2);
        berenice = findViewById(R.id.imageView3);
        eduardo = findViewById(R.id.imageView4);
        enrique = findViewById(R.id.imageView5);
        ismael = findViewById(R.id.imageView6);
        juan = findViewById(R.id.imageView7);
        lorena = findViewById(R.id.imageView8);
        sebastian = findViewById(R.id.imageView9);

        button = findViewById(R.id.button2);
        button2 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!randomChar.isBald()) {
                    closeCard(eduardo);
                    closeCard(enrique);
                    closeCard(sebastian);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!randomChar.isBlonde()){
                    closeCard(berenice);
                    closeCard(ismael);
                    closeCard(juan);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!randomChar.isHat()){
                    closeCard(andres);
                    closeCard(lorena);
                }
            }
        });

    }

    public static Character getRandomChar(List<Character> characterList) {
        Random random = new Random();
        int randomIndex = random.nextInt(characterList.size());
        return characterList.get(randomIndex);
    }

    public void closeCard(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.closed);
    }
}


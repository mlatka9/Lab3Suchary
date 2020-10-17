package m.latka.suchar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> jokesList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jokesList.add(getResources().getString(R.string.joke1));
        jokesList.add(getResources().getString(R.string.joke2));
        jokesList.add(getResources().getString(R.string.joke3));
        jokesList.add(getResources().getString(R.string.joke4));
        jokesList.add(getResources().getString(R.string.joke5));

    }

    public void draw(View view) {

        int randomJokeNumber = (int)(Math.random()*jokesList.size());
        TextView textView = findViewById(R.id.textView);
        textView.setText(jokesList.get(randomJokeNumber));
    }

}
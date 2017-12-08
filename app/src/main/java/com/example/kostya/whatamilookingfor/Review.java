package com.example.kostya.whatamilookingfor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_review, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        TextView title = (TextView) findViewById(R.id.titleOfReview);

        TextView experiTit = (TextView) findViewById(R.id.experience);
        TextView exProgTit = (TextView) findViewById(R.id.experience_programm);
        TextView aboutmTit = (TextView) findViewById(R.id.aboutMyself);
        TextView contacTit = (TextView) findViewById(R.id.contacts);

        TextView experiText = (TextView) findViewById(R.id.eperienceText);
        TextView exProgText = (TextView) findViewById(R.id.experience_programmText);
        TextView aboutmText = (TextView) findViewById(R.id.aboutMyselfText);
        TextView contacText = (TextView) findViewById(R.id.contactsText);


        switch (id){
            case R.id.blackBg:
                title.setBackgroundColor(getResources().getColor(R.color.BLACK));
                experiTit.setBackgroundColor(getResources().getColor(R.color.BLACK));
                exProgTit.setBackgroundColor(getResources().getColor(R.color.BLACK));
                aboutmTit.setBackgroundColor(getResources().getColor(R.color.BLACK));
                contacTit.setBackgroundColor(getResources().getColor(R.color.BLACK));
                experiText.setBackgroundColor(getResources().getColor(R.color.BLACK));
                exProgText.setBackgroundColor(getResources().getColor(R.color.BLACK));
                aboutmText.setBackgroundColor(getResources().getColor(R.color.BLACK));
                contacText.setBackgroundColor(getResources().getColor(R.color.BLACK));

                title.setTextColor(getResources().getColor(R.color.WHITE));
                 experiTit.setTextColor(getResources().getColor(R.color.WHITE));
                 exProgTit.setTextColor(getResources().getColor(R.color.WHITE));
                 aboutmTit.setTextColor(getResources().getColor(R.color.WHITE));
                 contacTit.setTextColor(getResources().getColor(R.color.WHITE));
                experiText.setTextColor(getResources().getColor(R.color.WHITE));
                exProgText.setTextColor(getResources().getColor(R.color.WHITE));
                aboutmText.setTextColor(getResources().getColor(R.color.WHITE));
                contacText.setTextColor(getResources().getColor(R.color.WHITE));

                return true;
            case R.id.whiteBg:
                title.setBackgroundColor(getResources().getColor(R.color.WHITE));
                 experiTit.setBackgroundColor(getResources().getColor(R.color.WHITE));
                 exProgTit.setBackgroundColor(getResources().getColor(R.color.WHITE));
                 aboutmTit.setBackgroundColor(getResources().getColor(R.color.WHITE));
                 contacTit.setBackgroundColor(getResources().getColor(R.color.WHITE));
                experiText.setBackgroundColor(getResources().getColor(R.color.WHITE));
                exProgText.setBackgroundColor(getResources().getColor(R.color.WHITE));
                aboutmText.setBackgroundColor(getResources().getColor(R.color.WHITE));
                contacText.setBackgroundColor(getResources().getColor(R.color.WHITE));

                title.setTextColor(getResources().getColor(R.color.BLACK));
                 experiTit.setTextColor(getResources().getColor(R.color.BLACK));
                 exProgTit.setTextColor(getResources().getColor(R.color.BLACK));
                 aboutmTit.setTextColor(getResources().getColor(R.color.BLACK));
                 contacTit.setTextColor(getResources().getColor(R.color.BLACK));
                experiText.setTextColor(getResources().getColor(R.color.BLACK));
                exProgText.setTextColor(getResources().getColor(R.color.BLACK));
                aboutmText.setTextColor(getResources().getColor(R.color.BLACK));
                contacText.setTextColor(getResources().getColor(R.color.BLACK));

                return true;
            case R.id.bigSize:
                title.setTextSize(getResources().getDimension(R.dimen.bigTitle));
                experiTit.setTextSize(getResources().getDimension(R.dimen.bigTitle));
                exProgTit.setTextSize(getResources().getDimension(R.dimen.bigTitle));
                aboutmTit.setTextSize(getResources().getDimension(R.dimen.bigTitle));
                contacTit.setTextSize(getResources().getDimension(R.dimen.bigTitle));

                experiText.setTextSize(getResources().getDimension(R.dimen.big));
                exProgText.setTextSize(getResources().getDimension(R.dimen.big));
                aboutmText.setTextSize(getResources().getDimension(R.dimen.big));
                contacText.setTextSize(getResources().getDimension(R.dimen.big));
                return true;

            case R.id.midSize:
                title.setTextSize(getResources().getDimension(R.dimen.middleTitle));
                experiTit.setTextSize(getResources().getDimension(R.dimen.middleTitle));
                exProgTit.setTextSize(getResources().getDimension(R.dimen.middleTitle));
                aboutmTit.setTextSize(getResources().getDimension(R.dimen.middleTitle));
                contacTit.setTextSize(getResources().getDimension(R.dimen.middleTitle));

                experiText.setTextSize(getResources().getDimension(R.dimen.middle));
                exProgText.setTextSize(getResources().getDimension(R.dimen.middle));
                aboutmText.setTextSize(getResources().getDimension(R.dimen.middle));
                contacText.setTextSize(getResources().getDimension(R.dimen.middle));
                return true;

            case R.id.smlSize:
                title.setTextSize(getResources().getDimension(R.dimen.smallTitle));
                experiTit.setTextSize(getResources().getDimension(R.dimen.smallTitle));
                exProgTit.setTextSize(getResources().getDimension(R.dimen.smallTitle));
                aboutmTit.setTextSize(getResources().getDimension(R.dimen.smallTitle));
                contacTit.setTextSize(getResources().getDimension(R.dimen.smallTitle));

                experiText.setTextSize(getResources().getDimension(R.dimen.small));
                exProgText.setTextSize(getResources().getDimension(R.dimen.small));
                aboutmText.setTextSize(getResources().getDimension(R.dimen.small));
                contacText.setTextSize(getResources().getDimension(R.dimen.small));

                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryView;
    private Button mTop,mBottom;
    private int state = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryView = (TextView) findViewById(R.id.storyTextView);
        mTop = (Button) findViewById(R.id.buttonTop);
        mBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state==1 || state==2) {
                    mStoryView.setText(R.string.T3_Story);
                    mTop.setText(R.string.T3_Ans1);
                    mBottom.setText(R.string.T3_Ans2);
                    state = 3;
                }
                else if(state==3)
                {
                    mStoryView.setText(R.string.T6_End);
                    state = -1;
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }
            }
        });


        

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state==1)
                {
                    mStoryView.setText(R.string.T2_Story);
                    mTop.setText(R.string.T2_Ans1);
                    mBottom.setText(R.string.T2_Ans2);
                    state = 2;
                }
                else if(state==2)
                {
                    mStoryView.setText(R.string.T4_End);
                    state=-1;
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }
                else if(state==3)
                {
                    mStoryView.setText(R.string.T5_End);
                    state=-1;
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }
            }
        });

    }
}

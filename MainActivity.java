package com.gugan.credit;

import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int dp(float v) { return (int)(v * getResources().getDisplayMetrics().density + 0.5f); }

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(dp(20), dp(28), dp(20), dp(20));
        root.setBackgroundColor(Color.rgb(245,247,250));

        TextView title = new TextView(this);
        title.setText("GUGAN CREDIT & COMPANY");
        title.setTextSize(24);
        title.setTextColor(Color.rgb(16,42,67));
        title.setGravity(Gravity.CENTER);
        title.setTypeface(null, 1);
        root.addView(title, new LinearLayout.LayoutParams(-1, dp(60)));

        TextView sub = new TextView(this);
        sub.setText("Two-Wheeler Finance & Refinance");
        sub.setTextSize(16);
        sub.setGravity(Gravity.CENTER);
        root.addView(sub, new LinearLayout.LayoutParams(-1, dp(45)));

        String[] buttons = {
            "Customer Registration",
            "Two-Wheeler Loan Application",
            "Refinance Application",
            "EMI Calculator",
            "Loan / EMI Status"
        };

        for (String text : buttons) {
            Button b = new Button(this);
            b.setText(text);
            b.setAllCaps(false);
            b.setTextSize(16);
            LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(-1, dp(58));
            p.setMargins(0, dp(7), 0, dp(7));
            root.addView(b, p);
            b.setOnClickListener(v ->
                Toast.makeText(this, text + " — coming soon", Toast.LENGTH_SHORT).show()
            );
        }

        TextView footer = new TextView(this);
        footer.setText("© Gugan Credit & Company");
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(0, dp(20), 0, 0);
        root.addView(footer, new LinearLayout.LayoutParams(-1, -2));

        setContentView(root);
    }
}

package com.gugan.credit;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private int dp(float value) {
        return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(dp(20), dp(28), dp(20), dp(20));
        root.setBackgroundColor(Color.rgb(245, 247, 250));

        TextView title = new TextView(this);
        title.setText("SRI GUGAN CREDIT COMPANY");
        title.setTextSize(24);
        title.setTextColor(Color.rgb(16, 42, 67));
        title.setGravity(Gravity.CENTER);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        root.addView(title, new LinearLayout.LayoutParams(-1, dp(60)));

        TextView sub = new TextView(this);
        sub.setText("Two-Wheeler Finance & Refinance");
        sub.setTextSize(16);
        sub.setTextColor(Color.DKGRAY);
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
            Button button = new Button(this);
            button.setText(text);
            button.setAllCaps(false);
            button.setTextSize(16);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(-1, dp(58));
            params.setMargins(0, dp(7), 0, dp(7));
            root.addView(button, params);
            button.setOnClickListener(v ->
                Toast.makeText(this, text + " — coming soon", Toast.LENGTH_SHORT).show()
            );
        }

        TextView footer = new TextView(this);
        footer.setText("© SRI GUGAN CREDIT COMPANY");
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(0, dp(20), 0, 0);
        root.addView(footer, new LinearLayout.LayoutParams(-1, -2));

        setContentView(root);
    }
}

package sg.edu.rp.c346.practicalquizp12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spn1;
    WebView wvMyPage;
    ArrayList<String> alNumbers;
    ArrayAdapter<String> aaNumbers;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn1 = findViewById(R.id.spinner);
        wvMyPage = findViewById(R.id.webView);
        wvMyPage.setWebViewClient(new WebViewClient());
        alNumbers = new ArrayList<>();


        //Get the string-array and store as an Array
        String[] strNumbers = getResources().getStringArray(R.array.Website);

        //Convert Array to List and add to the ArrayList
        alNumbers.addAll(Arrays.asList(strNumbers));

        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spn1.getSelectedItemPosition() == 0){
                    String url = "https://www.google.com";
                    wvMyPage.loadUrl(url);
//                    wvMyPage.getSettings().setJavaScriptEnabled(true);
                }
                else if (spn1.getSelectedItemPosition() == 1){
                    String url = "https://www.rp.edu.sg";
                    wvMyPage.loadUrl(url);
//                    wvMyPage.getSettings().setJavaScriptEnabled(true);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}

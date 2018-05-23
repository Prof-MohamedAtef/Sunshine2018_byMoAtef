/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package prof.mo.ed.sunshine2018;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenWebpageButton(View v) {
        String urlAsString = "http://www.udacity.com";
        openWebPage(urlAsString);
    }


    public void onClickOpenAddressButton(View v) {

        String addressString = "1600 Amphitheatre Parkway, CA";

        Uri.Builder builder = new Uri.Builder();
        builder.scheme("geo")
                .path("0,0")
                .query(addressString);
        Uri addressUri = builder.build();
        showMap(addressUri);
    }

    public void onClickShareTextButton(View v) {
        Toast.makeText(this, "TODO: Share text when this is clicked", Toast.LENGTH_LONG).show();
    }

    public void createYourOwn(View v) {
        Toast.makeText(this,
                "TODO: Create Your Own Implicit Intent",
                Toast.LENGTH_SHORT)
                .show();
    }

    private void openWebPage(String url) {

        Uri webpage = Uri.parse(url);

        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }


    private void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
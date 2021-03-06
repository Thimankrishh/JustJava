package com.thiman.android.justjava;

/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 *
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int noOfCoffees = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {


            display(noOfCoffees);
            displayPrice(noOfCoffees * 10);

    }

    public void incrementOrder(View view){
        noOfCoffees = noOfCoffees + 1;

        increment(noOfCoffees);
    }

    public  void decrementOrder(View view){
        noOfCoffees = noOfCoffees - 1;
        decrement(noOfCoffees);
    }
    /**
     * This method displays the given quantity value on the screen.
     */



    private void display(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);


    }
 private void displayPrice(int number ){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view2);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
 }

 private  void increment(int number){
     TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
     quantityTextView.setText("" + number);
 }

    private  void decrement(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

}
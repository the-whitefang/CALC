package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calc.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String data ="";
    String expression="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);



        binding.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = data + "0";
                binding.txtResult.setText(data);
            }
        });

        binding.one.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       data = data + "1";
                       binding.txtResult.setText(data);
                    }
                }
        );

        binding.two.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "2";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.three.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "3";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.four.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "4";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.five.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "5";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.six.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "6";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.seven.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "7";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.eight.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "8";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.nine.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "9";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.dot.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + ".";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.percent.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "%";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.divide.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "÷";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.product.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "×";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.sub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "-";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.add.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data = data + "+";
                        binding.txtResult.setText(data);
                    }
                }
        );

        binding.clear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        binding.txtResult.setText("");
                        binding.txtResult.setHint("0.");
                        data = "";
                    }
                }
        );

        binding.delete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((binding.txtResult.getText()).length()> 0){
                            String ob = String.valueOf(binding.txtResult.getText());
                            ob.subSequence(0,ob.length()-1);
                            binding.txtResult.setText(ob);
                        }
                        else{
                            binding.txtResult.setText("");
                            binding.txtResult.setText("0.");
                        }
                    }
                }
        );

        binding.equals.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        );

    }
}
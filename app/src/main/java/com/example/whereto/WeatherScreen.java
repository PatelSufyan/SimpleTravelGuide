package com.example.whereto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import com.example.whereto.databinding.ActivityMainBinding;
import com.example.whereto.databinding.ActivityWeatherScreenBinding;
import com.example.whereto.weatherapi.InterfaceApi;
import com.example.whereto.weatherapi.main;
import com.example.whereto.weatherapi.weather;
import com.example.whereto.weatherapi.weatherData;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherScreen extends AppCompatActivity {

    ActivityWeatherScreenBinding binding;

    ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWeatherScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        constraintLayout = findViewById(R.id.constraint_layout);

        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        String currentDate = format.format(new Date());

        binding.date.setText(currentDate);

        fetchWeather("Bangalore");

        binding.search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hideKeyBoard();

                if (TextUtils.isEmpty(binding.searchCity.getText().toString())) {

                    binding.searchCity.setError("Enter a city");
                    return;
                }

                String CITY_NAME = binding.searchCity.getText().toString();

                fetchWeather(CITY_NAME);
            }
        });

    }

    void hideKeyBoard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(constraintLayout.getApplicationWindowToken(), 0);
    }

    void fetchWeather(String cityName) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        InterfaceApi interfaceApi = retrofit.create(InterfaceApi.class);

        Call<weatherData> call = interfaceApi.getData(cityName, "0cc08e1d282ab06437f6258c4c6d02b0", "metric");

        call.enqueue(new Callback<weatherData>() {
            @Override
            public void onResponse(Call<weatherData> call, Response<weatherData> response) {

                if (response.isSuccessful()) {

                    weatherData weatherData = response.body();

                    main to = weatherData.getMain();

                    binding.mainTemp.setText(String.valueOf(to.getTemp()) + "\u2103");
                    binding.maxTempValue.setText(String.valueOf(((main) to).getTemp_max()));
                    binding.minTempValue.setText(String.valueOf(to.getTemp_min()));

                    binding.pressureValue.setText(String.valueOf(to.getPressure()));
                    binding.humidityValue.setText(String.valueOf(to.getHumidity()));

                    binding.cityName.setText(weatherData.getName());

                    List<weather> description = weatherData.getWeather();

                    for (weather data : description) {

                        binding.description.setText(data.getDescription());
                    }
                }
            }

            @Override
            public void onFailure(Call<weatherData> call, Throwable t) {

            }
        });


    }

}

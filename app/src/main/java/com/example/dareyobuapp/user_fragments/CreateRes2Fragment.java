package com.example.dareyobuapp.user_fragments;


import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TimePicker;

import com.example.dareyobuapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreateRes2Fragment extends Fragment implements View.OnClickListener {

    private TextInputLayout inputLayoutStartDate, inputLayoutStartTime, inputLayoutEndDate, inputLayoutEndTime;
    private TextInputEditText inputEditTextStartDate, inputEditTextStartTime, inputEditTextEndDate, inputEditTextEndTime;
    private int mYear, mMonth, mDay, mHour, mMinute;
    private final Calendar c = Calendar.getInstance();
    private String startDate, endDate, startTime, endTime;

    public CreateRes2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_res2, container, false);

        inputLayoutStartDate = (TextInputLayout) view.findViewById(R.id.textInputLayout_startdate);
        inputLayoutStartTime = (TextInputLayout) view.findViewById(R.id.textInputLayout_startTime);
        inputLayoutEndDate = (TextInputLayout) view.findViewById(R.id.textInputLayout_enddate);
        inputLayoutEndTime = (TextInputLayout) view.findViewById(R.id.textInputLayout_endtime);
        inputEditTextStartDate = (TextInputEditText) view.findViewById(R.id.textInputEditText_startdate);
        inputEditTextStartTime = (TextInputEditText) view.findViewById(R.id.textInputEditText_startTime);
        inputEditTextEndDate = (TextInputEditText) view.findViewById(R.id.textInputEditText_enddate);
        inputEditTextEndTime = (TextInputEditText) view.findViewById(R.id.textInputEditText_endtime);

        inputEditTextStartTime.setOnClickListener(this);
        inputEditTextEndTime.setOnClickListener(this);
        inputEditTextStartDate.setOnClickListener(this);
        inputEditTextEndDate.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.textInputEditText_startdate:
                getStartDate();
                break;
            case R.id.textInputEditText_startTime:
                getStartTime();
                break;
            case R.id.textInputEditText_enddate:
                getEndDate();
                break;
            case R.id.textInputEditText_endtime:
                getEndTime();
                break;
        }
    }

    private void getStartDate() {
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int month, int dayOfMonth) {
                        Calendar mCalendar = Calendar.getInstance();
                        mCalendar.set(year, month, dayOfMonth);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy");
                        startDate = simpleDateFormat.format(mCalendar.getTime());

                        inputEditTextStartDate.setText(startDate);
                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }

    private void getStartTime() {
        mHour = c.get(Calendar.HOUR_OF_DAY);
        mMinute = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(),
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        startTime = (hourOfDay+":"+minute);
                        inputEditTextStartTime.setText(startTime);
                    }
                }, mHour, mMinute, true);
        timePickerDialog.show();
      }

    private void getEndTime() {
        mHour = c.get(Calendar.HOUR_OF_DAY);
        mMinute = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(),
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        endTime = (hourOfDay+":"+minute);
                        inputEditTextEndTime.setText(endTime);
                    }
                }, mHour, mMinute, true);
        timePickerDialog.show();
    }

    private void getEndDate() {
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int month, int dayOfMonth) {
                        Calendar mCalendar = Calendar.getInstance();
                        mCalendar.set(year, month, dayOfMonth);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy");
                        endDate = simpleDateFormat.format(mCalendar.getTime());

                        inputEditTextEndDate.setText(endDate);
                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }

}

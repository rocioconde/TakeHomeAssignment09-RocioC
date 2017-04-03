package com.example.android.takehomeassignment09_rocioc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference schoolRef = database.getReference("school");


    private EditText schoolName;
    private EditText numberOfStudents;
    private CheckBox doesItHaveProgrammingCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        schoolName = (EditText) findViewById(R.id.school_name);
        numberOfStudents = (EditText) findViewById(R.id.number_of_students);
        doesItHaveProgrammingCourse = (CheckBox) findViewById(R.id.has_programming_course);
    }

    public void addToFirebase(View view) {

        String schoolName1 = schoolName.getText().toString();
        String students = numberOfStudents.getText().toString();
        int numberOfStudents1 = Integer.parseInt(students);
        boolean hasProgrammingC = doesItHaveProgrammingCourse.isChecked();

        School s = new School(schoolName1, hasProgrammingC, numberOfStudents1);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        schoolRef.push().setValue(new School(schoolName1, hasProgrammingC, numberOfStudents1));

    }
}

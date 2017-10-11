package com.android.realtimedatabase;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.android.realtimedatabase.databinding.QuizLayoutBinding;

/**
 * Created by admin on 11-10-2017.
 */

public class QuizActivity extends AppCompatActivity {
    QuizLayoutBinding binding;
    static Boolean QUES1 = false, QUES2 = false, QUES3 = false, QUES4 = false, QUES5 = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.quiz_layout);
        activateQuestionWindow();
    }

    void activateQuestionWindow() {
        binding.includeQues1.tvQues.setText("Question1");
        binding.includeQues1.tvQues.setOnClickListener(view -> {
            QUES1 = !QUES1;
            binding.includeQues1.quesLayout.setVisibility(QUES1 ? View.VISIBLE : View.GONE);
            binding.includeQues1.tvQues.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, QUES1 ? R.drawable.ic_arrow1_t : R.drawable.ic_arrow1_b, 0);
        });
        binding.includeQues2.tvQues.setText("Question2");
        binding.includeQues2.tvQues.setOnClickListener(view -> {
            QUES2 = !QUES2;
            binding.includeQues2.quesLayout.setVisibility(QUES2 ? View.VISIBLE : View.GONE);
            binding.includeQues2.tvQues.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, QUES2 ? R.drawable.ic_arrow1_t : R.drawable.ic_arrow1_b, 0);
        });
        binding.includeQues3.tvQues.setText("Question3");
        binding.includeQues3.tvQues.setOnClickListener(view -> {
            QUES3 = !QUES3;
            binding.includeQues3.quesLayout.setVisibility(QUES3 ? View.VISIBLE : View.GONE);
            binding.includeQues3.tvQues.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, QUES3 ? R.drawable.ic_arrow1_t : R.drawable.ic_arrow1_b, 0);

        });
        binding.includeQues4.tvQues.setText("Question4");
        binding.includeQues4.tvQues.setOnClickListener(view -> {
            QUES4 = !QUES4;
            binding.includeQues4.quesLayout.setVisibility(QUES4 ? View.VISIBLE : View.GONE);
            binding.includeQues4.tvQues.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, QUES4 ? R.drawable.ic_arrow1_t : R.drawable.ic_arrow1_b, 0);

        });
        binding.includeQues5.tvQues.setText("Question5");
        binding.includeQues5.tvQues.setOnClickListener(view -> {
            QUES5 = !QUES5;
            binding.includeQues5.quesLayout.setVisibility(QUES5 ? View.VISIBLE : View.GONE);
            binding.includeQues5.tvQues.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, QUES5 ? R.drawable.ic_arrow1_t : R.drawable.ic_arrow1_b, 0);

        });

    }
}

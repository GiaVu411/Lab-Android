package com.example.lab_ui_sample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lab_ui_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Bắt sự kiện khi bấm nút ĐĂNG KÝ
        binding.btnRegister.setOnClickListener {
            val name = binding.edtName.text?.toString()?.trim().orEmpty()
            val email = binding.edtEmail.text?.toString()?.trim().orEmpty()
            val password = binding.edtPassword.text?.toString()?.trim().orEmpty()

            // Kiểm tra nhập đủ thông tin
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
package com.example.a54

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.time.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(a: Int, b: Int): String {
                var answer = ""
                val localdate :LocalDate = LocalDate.of(2016,a,b)
                val dayOfWeek = localdate.dayOfWeek
                answer = dayOfWeek.toString().substring(0..2)
                return answer
            }
        }
        val a = Solution()
        a.solution(5,24)
    }
}
@file:Suppress("UNREACHABLE_CODE")

package com.example.test

object QuizeObj {

    fun getQuestions(): ArrayList<QuizData> {
        val questionsList = ArrayList<QuizData>()

        // 1
        val que1 = QuizData(
            1, "What country does this flag belong to?",
            R.drawable.flag1chad,
            "Chad", "Australia",
            "Armenia", "Austria", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = QuizData(
            2, "What country does this flag belong to?",
            R.drawable.flag2moldova,
            "Angola", "Austria",
            "Moldova", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = QuizData(
            3, "What country does this flag belong to?",
            R.drawable.flag3rominia,
            "Belarus", "Belize",
            "Brunei", "Rominia", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = QuizData(
            4, "What country does this flag belong to?",
            R.drawable.flag4uk,
            "Bahamas", "UK",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = QuizData(
            5, "What country does this flag belong to?",
            R.drawable.flag5japonia,
            "Gabon", "France",
            "Japonia", "Finland", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = QuizData(
            6, "What country does this flag belong to?",
            R.drawable.flag6france,
            "France", "Georgia",
            "Greece", "Moldova", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = QuizData(
            7, "What country does this flag belong to?",
            R.drawable.flag7germany,
            "Dominica", "Egypt",
            "Germany", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = QuizData(
            8, "What country does this flag belong to?",
            R.drawable.flag8egypt,
            "Ireland", "Iran",
            "Hungary", "Egypt", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = QuizData(
            9, "What country does this flag belong to?",
            R.drawable.flag9usa,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = QuizData(
            10, "What country does this flag belong to?",
            R.drawable.flag10northkorea,
            "North Korea", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)

        return questionsList
    }
    // END
}
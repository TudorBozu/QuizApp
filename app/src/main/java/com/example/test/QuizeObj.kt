package com.example.test

object QuizeObj {

    fun getQuizData():ArrayList<QuizData> {
        val quieztionList = ArrayList<QuizData>()

        //1
        val que1 = QuizData(
            1,"What country does this flag belong to?",
            R.drawable.flag1chad,
            "Rominia",
             "Chad",
             "Russia",
             "Austria",
             2
        )
        quieztionList.add(que1)
        return quieztionList

        //2
        val que2 = QuizData(
            2,"What country does this flag belong to?",
            R.drawable.flag2moldova,
            "Rominia",
            "Moldova",
            "Russia",
            "Austria",
            2
        )
        quieztionList.add(que2)
        return quieztionList

        //3
        val que3 = QuizData(
            3,"What country does this flag belong to?",
            R.drawable.flag3rominia,
            "Rominia",
            "Moldova",
            "Russia",
            "Austria",
            1
        )
        quieztionList.add(que3)
        return quieztionList

        //4
        val que4 = QuizData(
            4,"What country does this flag belong to?",
            R.drawable.flag5japonia,
            "Rominia",
            "Chad",
            "Japonia",
            "Austria",
            3
        )
        quieztionList.add(que4)
        return quieztionList

        //5
        val que5 = QuizData(
            5,"What country does this flag belong to?",
            R.drawable.flag6france,
            "Rominia",
            "Chad",
            "France",
            "Austria",
            3
        )
        quieztionList.add(que5)
        return quieztionList

        // 6
        val que6 = QuizData(
            6,"What country does this flag belong to?",
            R.drawable.flag4uk,
            "Rominia",
            "Chad",
            "Russia",
            "UK",
            4
        )
        quieztionList.add(que6)
        return quieztionList

        // 7
        val que7 = QuizData(
            7,"What country does this flag belong to?",
            R.drawable.flag7germany,
            "Rominia",
            "Germany",
            "Russia",
            "Austria",
            2
        )
        quieztionList.add(que7)
        return quieztionList

        val que8 = QuizData(
            8,"What country does this flag belong to?",
            R.drawable.flag8egypt,
            "Rominia",
            "Chad",
            "Russia",
            "Egypt",
            2
        )
        quieztionList.add(que8)
        return quieztionList

        val que9 = QuizData(
            9,"What country does this flag belong to?",
            R.drawable.flag9usa,
            "Rominia",
            "Chad",
            "USA",
            "Austria",
            3
        )
        quieztionList.add(que9)
        return quieztionList

        val que10 = QuizData(
            10,"What country does this flag belong to?",
            R.drawable.flag10northkorea,
            "Rominia",
            "Chad",
            "North Korea",
            "Austria",
            3
        )
        quieztionList.add(que10)
        return quieztionList
    }
}
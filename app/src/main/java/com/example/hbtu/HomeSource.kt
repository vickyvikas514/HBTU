package com.example.hbtu

object HomeSource {
    val homeDP: List<HomeDP> = listOf(
        HomeDP("Attandence","https://erp.hbtu.co.in/StudentAttendance.aspx"),
        HomeDP("Erp","https://erp.hbtu.co.in/slogin.aspx"),
        HomeDP("Syllabus","syllabus"),
        HomeDP("Departments","department"),
        HomeDP("Main Website","https://hbtu.ac.in/"),
    )
    val Department: List<HomeDP> = listOf(
        HomeDP("Electronics","https://hbtu.ac.in/electronics-engineering-2/"),
        HomeDP("Computer Science","https://hbtu.ac.in/computer-science-engineering-2/"),HomeDP("Mechanical","https://hbtu.ac.in/mechanical-engineering-2/"),
        HomeDP("Electrical","https://hbtu.ac.in/electrical-engineering-2/"),HomeDP("Leather","https://hbtu.ac.in/leather-technology/"),
        HomeDP("Bio-Chemical","https://hbtu.ac.in/bio-chemical-engineering-2/"),HomeDP("Civil","https://hbtu.ac.in/civil-engineering-2/"),
        HomeDP("Chemical","https://hbtu.ac.in/chemical-engineering-2/"),HomeDP("Information and Technology","https://hbtu.ac.in/computer-science-engineering-2/"),
        HomeDP("Paint","https://hbtu.ac.in/paint-technology-2/"),HomeDP("Food","https://hbtu.ac.in/food-technology/"),
        HomeDP("Plastic","https://hbtu.ac.in/plastic-technology-2/"),HomeDP("Oil","https://hbtu.ac.in/oil-technology/"),
  )
    val Syllabus: List<HomeDP> = listOf(
        HomeDP("Electronics","1.pdf"),
        HomeDP("Computer Science","2.pdf"),HomeDP("Mechanical","5.pdf"),
        HomeDP("Electrical","4.pdf"),HomeDP("Leather","11.pdf"),
        HomeDP("Bio-Chemical","12.pdf"),HomeDP("Civil","6.pdf"),
        HomeDP("Chemical","1c.pdf"),HomeDP("Information and Technology","2.pdf"),
        HomeDP("Paint","7.pdf"),HomeDP("Food","10.pdf"),
        HomeDP("Plastic","8.pdf"),HomeDP("Oil","9.pdf"),
    )
}
package data

class Laptop (val name: String) // secara default ada Any

open class HandPhone(val name: String)

class SmartPhone(name: String, val os: String): HandPhone(name)


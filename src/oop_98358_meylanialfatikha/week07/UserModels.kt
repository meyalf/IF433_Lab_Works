package oop_98358_meylanialfatikha.week07

// Regular class biasa
class RegularUser(val name: String, val age: Int)

// Data class - otomatis punya equals(), hashCode(), toString(), copy()
data class DataUser(val name: String, val age: Int)
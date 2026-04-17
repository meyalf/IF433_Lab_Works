package oop_98358_meylanialfatikha.week08

class City(val name: String)
class Address(val city:City?)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)
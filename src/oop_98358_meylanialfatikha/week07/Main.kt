package oop_98358_meylanialfatikha.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()
    println("Status: ${DatabaseManager.connectionStatus}")

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}") // False

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}") // True (Structural Equality)

    println("\n=== TEST COPY & DESTRUCTURING ===")
    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"  // Tambahkan ini!
    }
    println(uiMessage)

    // ===== CHECKPOINT 18: TEST GAME MANAGER SINGLETON =====
    println("\n=== TEST GAME MANAGER ===")
    GameManager.startGame() // Pertama kali, game mulai
    GameManager.startGame() // Kedua kali, harus ditolak!

    // ===== CHECKPOINT 19: TEST RARITY & FACTORY =====
    println("\n=== TEST RARITY & FACTORY ===")
    println("Drop chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterSword = Weapon.forgeStarterSword()
    println("Senjata awal: $starterSword")

    }

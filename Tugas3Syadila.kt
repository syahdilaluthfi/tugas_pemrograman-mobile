class StudentCard(
    val nim: String,
    var nama: String,
    val prodi: String
) {
    var totalSks: Int = 0
        private set

    val status: String
        get() = if (totalSks > 0) "Aktif" else "Baru"

    init {
        require(nim.length >= 7) { "NIM tidak valid" }
    }

    fun ambilSks(jumlah: Int) {
        if (jumlah > 0 && totalSks + jumlah <= 24) {
            totalSks += jumlah
        }
    }

    fun ringkasan() =
        "$nim · $nama · $prodi · $totalSks SKS"
}

fun main() {
    // Membuat objek dari class StudentCard
    val mhs = StudentCard(
        "2409020064",
        "Syadila Ayu Luthfiyyah",
        "Teknologi Informasi"
    )

    // Menampilkan properti dengan tanda titik
    println("NIM: ${mhs.nim}")
    println("Nama: ${mhs.nama}")
    println("Prodi: ${mhs.prodi}")

    // Menampilkan SKS dan status awal
    println("Sebelum ambil SKS: ${mhs.totalSks} SKS, status: ${mhs.status}")

    // Mengambil 10 SKS
    mhs.ambilSks(10)
    println("Setelah ambil 10 SKS: ${mhs.totalSks} SKS")

    // Memanggil method ringkasan()
    println(mhs.ringkasan())
}

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

        fun main() {
            //Membuat objek dari class studentcard
            val mhs = studentcard("2409020064","Syadila Ayu", "Teknologi Informasi")

            //Menampilkan properti dengan tanda titik
            println("Nim    :${mhs.nim}")
            println("Nama    :${mhs.nama}")
            println("Prodi    :${mhs.prodi}")

            //Mengubah nilai property var
            mhs.nama = "Syadila AyU Luthfiyyah"
            println("Nama setelah diubah: ${mhs.nama}")

            //Computed property status (pakai if-else di get())
            println("Status awal: ${mhs.status}")

            //Mengambil method ambilsks()
            mhs.ambilsks(13)
            println("Setelah ambil 13 sks: ${mhs.status} SKS, status: ${mhs.status}")

            mhs.ambilsks(5)
            println("Setelah ambil 5 sks: ${mhs.totalSks} SKS")

            //Ditolak karena 22 + 5 = 27, lebih dari 24
            mhs.ambilsks(7)
            println("Setelah ambil 7 sks: ${mhs.totalSks} SKS")

            //Memanggil methof ringkasan()
            println(mhs.ringkasan())
    }

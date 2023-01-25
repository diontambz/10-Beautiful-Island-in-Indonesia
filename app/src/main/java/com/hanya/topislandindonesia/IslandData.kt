package com.hanya.topislandinindonesia

import com.hanya.topislandindonesia.Island
import com.hanya.topislandindonesia.R

object IslandData {
    private val islandNames = arrayOf("Pulau Padar",
        "Gili Terawangan",
        "Nusa Penida",
        "Pulau Seribu",
        "Pulau Abang",
        "Kepulauaan Gili",
        "Pulau Menjangan",
        "Pulau Mandeh",
        "Pulau Gili Air",
        "Pulau Pahawang")

    private val islandDetails = arrayOf("Pulau Padar adalah pulau ketiga terbesar di kawasan Taman Nasional Komodo, setelah Pulau Komodo dan Pulau Rinca. Pulau ini relatif lebih dekat ke Pulau Rinca daripada ke Pulau Komodo, yang dipisahkan oleh Selat Lintah. Pulau Padar tidak dihuni oleh ora. Di sekitar pulau ini terdapat pula tiga atau empat pulau kecil.",
        "Gili Trawangan adalah yang terbesar dari ketiga pulau kecil atau gili yang terdapat di sebelah barat laut Lombok. Trawangan juga satu-satunya gili yang ketinggiannya di atas permukaan laut cukup signifikan. Dengan panjang 3 km dan lebar 2 km, Trawangan berpopulasi sekitar 800 jiwa.",
        "Nusa Penida adalah sebuah pulau bagian dari negara Republik Indonesia yang terletak di sebelah tenggara Bali yang dipisahkan oleh Selat Badung. Di dekat pulau ini terdapat juga pulau-pulau kecil lainnya yaitu Nusa Ceningan dan Nusa Lembongan.",
        "Kepulauan Seribu merupakan salah satu wilayah yang masuk ke dalam administrasi Pemerintah Provinsi DKI Jakarta. Secara geografis, Kepulauan Seribu memiliki total wilayah seluas 4.745,62 km2 yang terdiri dari 8,76 km2 daratan, dan terdiri lebih dari 110 pulau.",
        "Pulau Abang merupakan salah satu pulau yang mampu menarik banyak wisatawan karena keindahan alam bawah lautnya. Terletak di sebelah selatan pulau Batam, pulau ini memiliki jarak yang cukup jauh dari pusat Kota Batam. Pulau Abang terkenal dengan keindahan alam bawah lautnya. Banyak pengunjung yang mengatakan bahwa keindahan bawah laut pulau Abang tidak kalah dengan Raja Ampat maupun Bunaken. Sehingga banyak wisatawan baik lokal maupun mancanegara berkunjung ke pulau ini untuk menyelam.",
        "Kepulauan Gili atau juga dikenal sebagai Tiga Gili merupakan kepulauan terkenal akan keindahan alam dan menjadi salah satu tempat wisata terbaik di Nusa Tenggara Barat. Kepulauan initerdiri dari tiga pulau kecil atau pulau Gili kembar tiga yaitu Gili Trawangan, Gili Meno, dan Gili Air. Kepulauan Gili atau juga dikenal sebagai Tiga Gili merupakan kepulauan terkenal akan keindahan alam dan menjadi salah satu tempat wisata terbaik di Nusa Tenggara Barat. Hal yang menjadikan kepulauan ini disebut Tiga Gili karena terdapat tiga pulau kembar dengan keindahan khas masing-masing. Setiap pulau memiliki sanggraloka kecil, terdiri dari beberapa pondok untuk pengunjung, restoran, kolam kecil, dan masih banyak lainnya.",
        "Pulau Menjangan berlokasi di bagian Utara Pulau Bali. Kawasan ini merupakan teritorial Kabupaten Buleleng. Pulau Menjangan memiliki luas 6000 hektar. Ini merupakan wilayah kepulauan sendiri seperti halnya Nusa Penida serta Lembongan. Merupakan sebuah pulau yang mempunyai keindahan alam bawah laut yang paling dicari oleh para pecinta diving. Pada kawasan wisata ini, anda dapat menikmati keindahan matahari terbit dengan mudah. Penting untuk anda ketahui, Menjangan adalah salah satu pulau yang tidak berpenghuni oleh manusia.",
        "Kawasan Pulau Mandeh adalah perpaduan perbukitan dengan keindahan teluk yang dihiasi gugus pulau-pulau kecil yang berada di bagian tengah Teluk Carocok Tarusan. Dari Puncak Mandeh, kita dapat melihat gugusan pulau melingkar seperti Pulau Taraju, Pulau Setan atau Sutan, Pulau Sironjong Besar, Pulau Sironjong Ketek, dan Pulau Marak.",
        "Pulau Gili Air merupakan gili yang paling dekat dengan Wisata Lombok. Gili ini merupakan gili dengan jumlah penduduk lebih banyak dari pada dua gili lainnya, akan tetapi tidak terlalu ramai. Suasananya tenang serta penduduk yang ramah pada setiap wisatawan yang datang. Karena berada di tengah-tengah laut, gili ini menawarkan keindahan alam bawah laut yang masih terjaga keasrian dan kealamiannya. Ketika berwisata ke gili ini wisatawan juga akan disuguhi keragaman hayati laut Indonesia.",
        "Pulau Pahawang adalah pulau terbesar di sekitar Teluk Ratai. Telah menjadi destinasi wisata favorit wisatawan dari berbagai daerah di Indonesia. Secara administratif masuk wilayah Kecamatan Punduh Pidada, Kabupaten Pasawaran, Provinsi Lampung. Pulau Pahawang adalah salah satu tujuan wisata favorit dan populer di Provinsi Lampung. Terkenal akan keindahan baharinya, termasuk bawah lautnya. Saat ini sudah banyak penginapan di sekitar pulau dengan berbagai kelebihannya.")

    private val islandImage = intArrayOf(R.drawable.pulaupadar,
        R.drawable.gilitrawangan,
        R.drawable.pulaunusapenida,
        R.drawable.pulauseribu,
        R.drawable.pulauabang,
        R.drawable.kepulauangili,
        R.drawable.pulaumenjangan,
        R.drawable.pulaumandeh,
        R.drawable.giliair,
        R.drawable.pulaupahawang)

    val listData: ArrayList<Island>
        get() {
            val list = arrayListOf<Island>()
            for (position in islandNames.indices) {
                val island = Island()
                island.name = islandNames[position]
                island.detail = islandDetails[position]
                island.photo = islandImage[position]
                list.add(island)
            }
            return list
        }
}
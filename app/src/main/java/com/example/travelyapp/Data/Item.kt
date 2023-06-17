package com.example.travelyapp.Data

import com.example.travelyapp.R

data class Item(val itemsTitle: String, val itemsCity: String, val itemsDescription: String, val itemsImages: Int, val itemsUrl: String)

    val items = arrayOf(
        Item(
            "Mont Saint-Michel",
            "France",
            "Mont Saint-Michel adalah sebuah pulau batu yang terletak di Normandia, Prancis. Dikenal karena keindahan arsitektur abad pertengahan, pulau ini menarik wisatawan dengan biara ikoniknya yang menjulang tinggi di atas kota kecil yang menawan. Mont Saint-Michel juga terkenal dengan pasang surut laut yang dramatis, yang membuatnya terlihat seperti \"kastil di atas awan\" saat air pasang datang. Tempat ini menjadi salah satu tujuan wisata paling populer di Prancis, menawarkan pengalaman sejarah, pemandangan alam yang menakjubkan, serta atmosfer yang magis.",
            R.drawable.image1,
            "https://id.wikipedia.org/wiki/Mont_Saint-Michel"
        ),

        Item(
            "Disneyland Paris",
            "France",
            "Disneyland Paris adalah taman hiburan yang terletak di Marne-la-Vallée, Prancis. Dikenal sebagai \"tempat impian\" bagi penggemar Disney, taman ini menawarkan pengalaman ajaib yang memadukan pesona dunia animasi dengan kegembiraan atraksi yang menarik. Pengunjung dapat menjelajahi berbagai tanah ajaib seperti Main Street, Adventureland, Fantasyland, Frontierland, dan Discoveryland, serta menikmati pertunjukan menakjubkan, parade yang meriah, dan pertemuan dengan karakter Disney yang ikonik. Disneyland Paris merupakan destinasi yang sempurna untuk seluruh keluarga yang ingin mengalami keajaiban dan kegembiraan dunia Disney di tengah pesona Prancis.",
            R.drawable.image2,
            "https://id.wikipedia.org/wiki/Disneyland_Paris"
        ),

        Item(
            "Bazilica sacré cœur",
            "France",
            "Bazilika Sacré-Cœur adalah sebuah gereja Katolik yang terletak di bukit Montmartre, Paris, Prancis. Disebut juga sebagai \"Basilika Jantung Kudus\", gereja ini menonjol dengan desain arsitektur Romawi-Byzantine yang megah dan kubah putihnya yang mencolok. Dari atas bukit, pengunjung dapat menikmati pemandangan indah kota Paris yang menakjubkan. Dengan suasana yang damai dan spiritual, Bazilika Sacré-Cœur menjadi tempat yang populer untuk beribadah, serta menjadi daya tarik bagi para wisatawan yang mencari keindahan sejarah dan panorama kota yang spektakuler.",
            R.drawable.image3,
            "https://id.wikipedia.org/wiki/Basilika_Sacr%C3%A9_C%C5%93ur"
        ),

        Item(
            "Santorini",
            "Greece",
            "Santorini adalah sebuah pulau yang terletak di Kepulauan Yunani, Mediterania. Terkenal dengan pemandangan yang memukau, pulau ini menawarkan panorama indah yang terdiri dari rumah putih dengan atap biru yang mencolok, tebing-tebing vulkanik yang curam, dan laut biru yang mempesona. Destinasi ini juga menawarkan matahari terbenam yang luar biasa di atas Laut Aegea yang mengagumkan. Selain keindahannya, Santorini juga menawarkan kebudayaan yang kaya, kelezatan kuliner khas, serta suasana yang romantis, menjadikannya salah satu tempat liburan yang paling menarik dan berkesan di dunia.",
            R.drawable.image4,
            "https://id.wikipedia.org/wiki/Santorini"
        ),

        Item(
            "Taj Mahal , Agra",
            "India",
            "Taj Mahal adalah sebuah monumen yang terletak di Agra, India. Dianggap sebagai salah satu keajaiban dunia, bangunan ini menggambarkan keindahan arsitektur Mughal yang memukau. Dibangun sebagai tanda cinta abadi oleh Kaisar Shah Jahan untuk istrinya yang meninggal, Taj Mahal mempesona dengan marmer putihnya yang bersinar, atap kubah yang elegan, dan detail ukiran yang rumit. Monumen ini juga dikenal karena keindahan simetri dan taman yang indah. Sebagai ikon budaya India, Taj Mahal adalah destinasi yang must-visit, mengundang pengunjung dari seluruh dunia untuk menyaksikan keajaiban sejarah dan romansa yang tak terlupakan.",
            R.drawable.image5,
            "https://id.wikipedia.org/wiki/Taj_Mahal"
        ),

        Item(
            "Petronas Twin Towers",
            "Malaysia",
            "Petronas Twin Towers adalah dua menara kembar yang terletak di Kuala Lumpur, Malaysia. Dikenal sebagai simbol kemajuan dan keindahan arsitektur modern, menara ini menjulang tinggi dengan desain yang megah dan inovatif. Dengan ketinggian yang mencapai 452 meter, Petronas Twin Towers pernah menjadi bangunan tertinggi di dunia. Pengunjung dapat menikmati panorama yang menakjubkan dari Skybridge yang menghubungkan dua menara, serta menjelajahi pusat perbelanjaan, galeri seni, dan ruang pameran di dalamnya. Menara kembar ini menjadi ikon Kuala Lumpur yang mengesankan, menarik wisatawan dari seluruh penjuru dunia untuk mengagumi keindahan dan kecanggihan teknologi modern yang dihadirkannya.",
            R.drawable.image6,
            "https://id.wikipedia.org/wiki/Menara_Kembar_Petronas"
        ),

        Item(
            "El Nido",
            "Phillippines",
            "El Nido adalah sebuah destinasi pariwisata yang terletak di pulau Palawan, Filipina. Terkenal dengan keindahan alamnya yang menakjubkan, El Nido menawarkan pantai-pantai berpasir putih, air laut yang jernih berwarna biru-turquoise, dan tebing-tebing karst yang menjulang tinggi di atasnya. Pulau ini juga memiliki beragam situs menyelam yang menakjubkan dan terumbu karang yang kaya akan kehidupan laut. Dikelilingi oleh keindahan alam yang masih alami, El Nido menjadi surga bagi para pecinta pantai, penyelam, dan penikmat keindahan alam yang menawarkan pengalaman liburan yang tak terlupakan.",
            R.drawable.image7,
            "https://www.klook.com/id/activity/4169-el-nido-island-hopping-tour-c-palawan/"
        ),

        Item(
            "Sahara Desert",
            "Africa",
            "Sahara Desert adalah padang pasir terluas di dunia yang terletak di Afrika Utara. Dengan cakrawala yang tak terbatas, gundukan pasir yang menjulang tinggi, dan panorama gurun yang memikat, Sahara Desert menawarkan keindahan alam yang luar biasa. Pengunjung dapat menyaksikan matahari terbit dan terbenam yang spektakuler, menjelajahi oase yang tersembunyi, serta merasakan ketenangan dan kebesaran gurun yang menakjubkan. Sahara Desert menghadirkan pengalaman eksotis yang memukau, membawa pengunjung ke dalam dunia yang berbeda dan mempesona di tengah tandusnya pasir dan keheningan gurun yang tak terlupakan.",
            R.drawable.image8,
            "https://id.wikipedia.org/wiki/Gurun_Sahara"
        )
    )
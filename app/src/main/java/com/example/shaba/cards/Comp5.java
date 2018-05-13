package com.example.shaba.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Comp5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String s = "<html lang=\"ru\" prefix=\"og: http://ogp.me/ns#\"><head><meta charset=\"UTF-8\">\n" +
                "            <link rel=\"canonical\" href=\"https://zen.yandex.ru/media/elektronik/dlia-chego-nujny-svetodiody-elektronika-dlia-chainikov-5ac872299d5cb33d7907b781\">\n" +
                "        <title>Для чего нужны светодиоды? Электроника для чайников. | ЗАМЕТКИ ЭЛЕКТРОТЕХНИКА | Яндекс Дзен</title><meta property=\"og:title\" content=\"Для чего нужны светодиоды? Электроника для чайников.\">\n" +
                "<meta property=\"og:description\" content=\"Светодиоды постепенно вытесняют обычные лампы. Сейчас это лучший способ для освещения, который можно применять абсолютно везде.\n" +
                "\">\n" +
                "<meta property=\"og:image\" content=\"https://avatars.mds.yandex.net/get-zen_doc/29317/pub_5aca7543a4de1800b8c26027_5aca7543a4de1800b8c26028/orig\">\n" +
                "<meta property=\"og:url\" content=\"https://zen.yandex.ru/media/elektronik/dlia-chego-nujny-svetodiody-elektronika-dlia-chainikov-5ac872299d5cb33d7907b781\">\n" +
                "<meta name=\"twitter:card\" content=\"summary_large_image\">\n" +
                "<meta property=\"og:site_name\" content=\"Яндекс Дзен | Платформа для авторов, издателей и брендов\">\n" +
                "<meta name=\"twitter:image:alt\" content=\"Для чего нужны светодиоды? Электроника для чайников.\">\n" +
                "<meta name=\"description\" content=\"Светодиоды постепенно вытесняют обычные лампы. Сейчас это лучший способ для освещения, который можно применять абсолютно везде.\n" +
                "\">\n" +
                "                <meta name=\"viewport\" content=\"width=device-width,minimum-scale=1,maximum-scale=1,initial-scale=1,user-scalable=no, minimal-ui\"><link rel=\"prefetch\" href=\"https://an.yandex.ru/system/context.js\"><meta property=\"mobile-web-app-capable\" content=\"yes\"><link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-57x57.png\" sizes=\"57x57\">\n" +
                "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-60x60.png\" sizes=\"60x60\">\n" +
                "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-72x72.png\" sizes=\"72x72\">\n" +
                "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-76x76.png\" sizes=\"76x76\">\n" +
                "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-114x114.png\" sizes=\"114x114\">\n" +
                "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-120x120.png\" sizes=\"120x120\">\n" +
                "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-144x144.png\" sizes=\"144x144\">\n" +
                "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-152x152.png\" sizes=\"152x152\">\n" +
                "\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-logos/files/favicons/favicon-16x16.png\" sizes=\"16x16\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-logos/files/favicons/favicon-32x32.png\" sizes=\"32x32\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-logos/files/favicons/favicon-96x96.png\" sizes=\"96x96\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-logos/files/favicons/favicon-160x160.png\" sizes=\"160x160\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-logos/files/favicons/favicon-196x196.png\" sizes=\"196x196\">\n" +
                "<link rel=\"icon\" href=\"//yastatic.net/zen-logos/files/favicons/icon.svg\" type=\"image/svg+xml\" sizes=\"any\">\n" +
                "<script type=\"text/javascript\" async=\"\" src=\"https://mc.yandex.ru/metrika/watch.js\"></script><script type=\"text/javascript\" async=\"\" src=\"https://mc.yandex.ru/metrika/watch.js\"></script>\n" +
                " \n" +
                "</head><body>Светодиоды постепенно вытесняют обычные лампы. Сейчас это лучший способ для освещения, который можно применять абсолютно везде.\n" +
                "\n" +
                "<h3 class=\"article-block\">Строение светодиода\n" +
                "</h3>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 1134px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac872299d5cb33d7907b781_5aca6aa861049385b65f48f4\"><img itemprop=\"image\" class=\"article-block-image__image \" src=\"https://avatars.mds.yandex.net/get-zen_doc/198359/pub_5ac872299d5cb33d7907b781_5aca6aa861049385b65f48f4/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/198359/pub_5ac872299d5cb33d7907b781_5aca6aa861049385b65f48f4/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/198359/pub_5ac872299d5cb33d7907b781_5aca6aa861049385b65f48f4/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/198359/pub_5ac872299d5cb33d7907b781_5aca6aa861049385b65f48f4/scale_720 2x\" alt=\"\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Светодиоды- разновидность диодов, обладающие способностью излучать свет.</strong>\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">Внутри светодиода находится кристалл, который как раз таки испускает свет. От вида кристалла, от того из какого материала он изготовлен, зависит цвет и яркость излучаемого им света. Зачастую в одном светодиоде используют сразу несколько кристаллов, из-за чего получается очень яркое свечение.\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 663px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac872299d5cb33d7907b781_5aca6a888c8be3993481da5e\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/61319/pub_5ac872299d5cb33d7907b781_5aca6a888c8be3993481da5e/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/61319/pub_5ac872299d5cb33d7907b781_5aca6a888c8be3993481da5e/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/61319/pub_5ac872299d5cb33d7907b781_5aca6a888c8be3993481da5e/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/61319/pub_5ac872299d5cb33d7907b781_5aca6a888c8be3993481da5e/scale_720 2x\" alt=\"строение светодиода\" src=\"https://avatars.mds.yandex.net/get-zen_doc/61319/pub_5ac872299d5cb33d7907b781_5aca6a888c8be3993481da5e/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/61319/pub_5ac872299d5cb33d7907b781_5aca6a888c8be3993481da5e/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/61319/pub_5ac872299d5cb33d7907b781_5aca6a888c8be3993481da5e/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/61319/pub_5ac872299d5cb33d7907b781_5aca6a888c8be3993481da5e/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\">строение светодиода</figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">Чем выше сила тока, тем ярче получается освещение от светодиода. Но если превысить ее допустимое значение для данного диода, то кристалл, находящийся внутри перегреется и выйдет из строя.\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">Изображение на схеме\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 960px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac872299d5cb33d7907b781_5aca72a55991d307755478f1\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/112656/pub_5ac872299d5cb33d7907b781_5aca72a55991d307755478f1/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/112656/pub_5ac872299d5cb33d7907b781_5aca72a55991d307755478f1/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/112656/pub_5ac872299d5cb33d7907b781_5aca72a55991d307755478f1/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/112656/pub_5ac872299d5cb33d7907b781_5aca72a55991d307755478f1/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/112656/pub_5ac872299d5cb33d7907b781_5aca72a55991d307755478f1/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/112656/pub_5ac872299d5cb33d7907b781_5aca72a55991d307755478f1/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/112656/pub_5ac872299d5cb33d7907b781_5aca72a55991d307755478f1/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/112656/pub_5ac872299d5cb33d7907b781_5aca72a55991d307755478f1/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<h3 class=\"article-block\">Разновидность светодиодов\n" +
                "</h3>\n" +
                "<p class=\"article-block article-block-unstyled\">Существует 2 основных видов светодиодов: для подсветки и для освещения. Первый вид служит дольше, так как для него нужен меньший ток, поэтому кристалл изнашивается меньше, чем у второго. Но все-равно и те и другие часто используются людьми и служат очень большой срок.\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 1000px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac872299d5cb33d7907b781_5aca6ed9bcf1bcb73f89f907\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/51081/pub_5ac872299d5cb33d7907b781_5aca6ed9bcf1bcb73f89f907/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/51081/pub_5ac872299d5cb33d7907b781_5aca6ed9bcf1bcb73f89f907/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/51081/pub_5ac872299d5cb33d7907b781_5aca6ed9bcf1bcb73f89f907/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/51081/pub_5ac872299d5cb33d7907b781_5aca6ed9bcf1bcb73f89f907/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/51081/pub_5ac872299d5cb33d7907b781_5aca6ed9bcf1bcb73f89f907/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/51081/pub_5ac872299d5cb33d7907b781_5aca6ed9bcf1bcb73f89f907/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/51081/pub_5ac872299d5cb33d7907b781_5aca6ed9bcf1bcb73f89f907/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/51081/pub_5ac872299d5cb33d7907b781_5aca6ed9bcf1bcb73f89f907/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">У светодиодов точно такие же параметры, как и у диодов.\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">Максимальный допустимый ток для простых светодиодов ограничивается 50 мА, а предельное обратное напряжение не больше 10 Вольт, а для осветительных гораздо больше. При подключении обычного диода всегда подключают вместе с ним последовательно резистор.\n" +
                "</p>\n" +
                "<h3 class=\"article-block\">Преимущества светодиодов над альтернативными типами освещения\n" +
                "</h3>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 800px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac872299d5cb33d7907b781_5aca73e89b403c82899fc66e\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca73e89b403c82899fc66e/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca73e89b403c82899fc66e/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca73e89b403c82899fc66e/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca73e89b403c82899fc66e/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca73e89b403c82899fc66e/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca73e89b403c82899fc66e/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca73e89b403c82899fc66e/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca73e89b403c82899fc66e/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\"><strong> •</strong> <strong>Светодиоды потребляют очень мало электроэнергии, но стоимость их достаточно большая.</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong> • Долговечность</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"> <strong>• Надежность</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong> • Возможность изменения яркости и цвета </strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong> • Не греются</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong> • Сделаны из экологически чистых материалов</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<h3 class=\"article-block\"><strong>Светодиодная лента</strong>\n" +
                "</h3>\n" +
                "<p class=\"article-block article-block-unstyled\">Сейчас очень большим спросом пользуются светодиодные ленты, состоящие из множества светодиодов.  Они очень удобны в использовании и выглядит это невероятно красиво.\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 1024px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac872299d5cb33d7907b781_5aca74d5db0cd9b1065043da\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca74d5db0cd9b1065043da/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca74d5db0cd9b1065043da/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca74d5db0cd9b1065043da/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca74d5db0cd9b1065043da/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca74d5db0cd9b1065043da/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca74d5db0cd9b1065043da/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca74d5db0cd9b1065043da/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1137439/pub_5ac872299d5cb33d7907b781_5aca74d5db0cd9b1065043da/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "\n" +
                "\n" +
                "\n" +
                "        \n" +
                "        \n" +
                "\n" +
                "<div style=\"position: fixed; left: -99px;\"><div id=\"sf-2868262685\" style=\"width: 1px; height: 1px; position: relative;\"><iframe frameborder=\"no\" scrolling=\"no\" allowtransparency=\"true\" hidefocus=\"true\" tabindex=\"-1\" marginwidth=\"0\" marginheight=\"0\" name=\"%7B%22id%22%3A%22sf-2868262685%22%2C%22html%22%3A%22%3Cscript%3Evar%20config%3D%7B%5C%22rtb%5C%22%3A%7B%5C%22matchUrls%5C%22%3A%5B%5D%7D%7D%3C%2Fscript%3E%3Cscript%3E%5C%22use%20strict%5C%22%3Bfunction%20t(t%2Ce%2Cn)%7Bvar%20s%3Dt%2B%5C%22%3D1%5C%22%3Bif(-1%3D%3D%3Ddocument.cookie.indexOf(s))%7Bvar%20a%3D86400*e*1e3%2Cc%3Dnew%20Date%2Cr%3Dnew%20Date(Number(c)%2Ba).toUTCString()%3Bdocument.cookie%3Ds%2B%5C%22%3B%20expires%3D%5C%22%2Br%2Cn()%7D%7Dfunction%20e(t)%7B(new%20Image).src%3Dt%7Dif(config.rtb)%7Bvar%20n%3Dconfig.rtb.matchUrls%3Bt(%5C%22pcs3%5C%22%2C1%2Cfunction()%7Bvar%20t%2Ce%3Bt%3D%5C%22https%3A%2F%2Fyastatic.net%2Fq%2Fset%2Fs%2Frsya-tag-users%2Fbundle.js%5C%22%2C(e%3Ddocument.createElement(%5C%22script%5C%22)).src%3Dt%2Cdocument.body.appendChild(e)%7D)%2Cs%3D.2%2CMath.random()%3Cs%26%26t(%5C%22pcssspb%5C%22%2C14%2Cfunction()%7Bfor(var%20t%3D0%3Bt%3Cn.length%3Bt%2B%2B)e(n%5Bt%5D)%7D)%2Ce(%5C%22https%3A%2F%2Fysa-static.passport.yandex.ru%2Fstatic%2F1%2Fd959d7e39d5067fad30d9c06204866e9%2Fd.png%3Fex%3Dyes%5C%22)%7Dvar%20s%3B%3C%2Fscript%3E%22%2C%22pmGuid%22%3A%22_1525975277061_79_3%22%2C%22geom%22%3A%7B%22win%22%3A%7B%22t%22%3A0%2C%22l%22%3A0%2C%22w%22%3A360%2C%22h%22%3A640%2C%22b%22%3A640%2C%22r%22%3A360%7D%2C%22self%22%3A%7B%22t%22%3A4724%2C%22l%22%3A-99%2C%22b%22%3A4725%2C%22r%22%3A-98%2C%22w%22%3A1%2C%22h%22%3A1%2C%22xiv%22%3A0%2C%22yiv%22%3A0%2C%22iv%22%3A0%2C%22z%22%3A0%7D%2C%22exp%22%3A%7B%22t%22%3A4724%2C%22l%22%3A0%2C%22r%22%3A458%2C%22b%22%3A0%2C%22xs%22%3A0%2C%22ys%22%3A0%7D%7D%2C%22hasFocus%22%3Atrue%2C%22supports%22%3A%7B%22exp-ovr%22%3Atrue%2C%22exp-push%22%3Afalse%2C%22read-cookie%22%3Afalse%2C%22write-cookie%22%3Afalse%7D%2C%22css%22%3A%22%22%2C%22bg%22%3A%22transparent%22%2C%22posMeta%22%3A%7B%22sharedData%22%3A%7B%22sf_ver%22%3A%221-1-0%22%2C%22ck_o%22%3A1%2C%22flash_ver%22%3A0%7D%2C%22ownerKey%22%3A%22%22%2C%22privateData%22%3A%7B%7D%7D%2C%22target%22%3A%22_blank%22%2C%22basePath%22%3A%22%22%7D\" src=\"//yastatic.net/safeframe-bundles/0.33/1-1-0/render.html\" width=\"1\" height=\"1\" style=\"width: 1px; height: 1px; top: 0px; left: 0px; position: absolute;\"></iframe></div></div></body></html>";
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadData(s,"text/html; charset=utf-8", "utf-8");
    }
}

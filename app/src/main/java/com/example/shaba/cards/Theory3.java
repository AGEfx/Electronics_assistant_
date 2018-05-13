package com.example.shaba.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Theory3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String s = "<html lang=\"ru\" prefix=\"og: http://ogp.me/ns#\"><head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Электричество на пальцах. Сила тока, напряжение, сопротивление понятным языком. | ЗАМЕТКИ ЭЛЕКТРОТЕХНИКА | Яндекс Дзен</title>\n" +
                "        <link rel=\"canonical\" href=\"https://zen.yandex.ru/media/elektronik/elektrichestvo-na-palcah-sila-toka-napriajenie-soprotivlenie-poniatnym-iazykom-5ac10d2c55876b8b1c40a60b\">\n" +
                "        <meta name=\"description\" content=\"Сейчас давайте поговорим об основных токовых величинах. Их три: Сила тока, напряжение, сопротивление.\">\n" +
                "    <meta property=\"og:title\" content=\"Электричество на пальцах. Сила тока, напряжение, сопротивление понятным языком.\">\n" +
                "<meta property=\"og:description\" content=\"Сейчас давайте поговорим об основных токовых величинах. Их три: Сила тока, напряжение, сопротивление.\">\n" +
                "<meta property=\"og:image\" content=\"https://avatars.mds.yandex.net/get-zen_doc/58826/pub_5ac3b47982ae6b00b6801d29_5ac3b47982ae6b00b6801d2a/orig\">\n" +
                "<meta property=\"og:url\" content=\"https://zen.yandex.ru/media/elektronik/elektrichestvo-na-palcah-sila-toka-napriajenie-soprotivlenie-poniatnym-iazykom-5ac10d2c55876b8b1c40a60b\">\n" +
                "<meta name=\"twitter:card\" content=\"summary_large_image\">\n" +
                "<meta property=\"og:site_name\" content=\"Яндекс Дзен | Платформа для авторов, издателей и брендов\">\n" +
                "<meta name=\"twitter:image:alt\" content=\"Электричество на пальцах. Сила тока, напряжение, сопротивление понятным языком.\">\n" +
                "\n" +
                "    <link rel=\"prefetch\" href=\"https://an.yandex.ru/system/context.js\">\n" +
                "        <link rel=\"preload\" href=\"//yastatic.net/zen-publishers/auto/article.logos.0ecfe427cd4f05eeb414f7cbb7d92ec7.css\" as=\"style\">\n" +
                "        <link rel=\"shortcut icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue_16.png\" sizes=\"16x16\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue_32.png\" sizes=\"32x32\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue_96.png\" sizes=\"96x96\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue_160.png\" sizes=\"160x160\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue_196.png\" sizes=\"196x196\">\n" +
                "<link rel=\"icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue.svg\" type=\"image/svg+xml\" sizes=\"any\">\n" +
                "\n" +
                "\n" +
                "</head><body class=\"page page_article\">\n" +
                "\n" +
                "\n" +
                "    <div id=\"content\"></div>\n" +
                "        <article class=\"article\" itemscope=\"\" itemtype=\"http://schema.org/Article\">\n" +
                "            <div class=\"article__content\">\n" +
                "                \n" +
                "                <div class=\"article__middle\">\n" +
                "                    <div class=\"article__zoom-overlay\"></div><h1 class=\"article__title\" itemprop=\"headline\">Электричество на пальцах. Сила тока, напряжение, сопротивление понятным языком.\n" +
                "    <div itemprop=\"articleBody\">\n" +
                "        <p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 1021px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac10d2c55876b8b1c40a60b_5ac20f4f9f43472248ac8214\"><img itemprop=\"image\" class=\"article-block-image__image \" src=\"https://avatars.mds.yandex.net/get-zen_doc/49613/pub_5ac10d2c55876b8b1c40a60b_5ac20f4f9f43472248ac8214/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/49613/pub_5ac10d2c55876b8b1c40a60b_5ac20f4f9f43472248ac8214/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/49613/pub_5ac10d2c55876b8b1c40a60b_5ac20f4f9f43472248ac8214/scale_1200 2x\" alt=\"\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "<p class=\"article-block article-block-unstyled\">Сейчас давайте поговорим об основных токовых величинах. Их три: <strong>Сила тока, напряжение, сопротивление.</strong>\n" +
                "\n" +
                "</p><p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 300px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac10d2c55876b8b1c40a60b_5ac11953a815f1eea199782d\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/96748/pub_5ac10d2c55876b8b1c40a60b_5ac11953a815f1eea199782d/orig\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/96748/pub_5ac10d2c55876b8b1c40a60b_5ac11953a815f1eea199782d/orig\" srcset=\"\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">Электричество можно представить как поток воды в трубе. Как мы уже знаем <strong>электрический ток - это упорядоченное движение свободно заряженных частиц. </strong>Вода по нашей трубе тоже движется и у нее есть какая-то скорость, с которой на течет.\n" +
                "</p>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Сила тока</strong> - это величина, равная скорости движения электрического заряда через поперечное сечение проводника.\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong><u>Формула: I = q/t</u></strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>I - сила тока</strong> (в нашем случае с водой это ее скорость)\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>q - электрический заряд проходящий через поперечное сечение проводника</strong> (в нашем случае с водой это поток)\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>t - время</strong> (в нашем случае с водой - время за которое вода проходит от начала до конца пути)\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Сила тока измеряется в Амперах.</strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Амперметр - </strong>прибор для измерения силы тока.\n" +
                "</blockquote>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">С этим думаю все понятно. Перейдем к напряжению.\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">Чтобы вода начала течь необходимо толкнуть её(оказать на нее давление).Получается напряжение это давление, под действие которого вода движется и приобретает скорость.\n" +
                "</p>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Напряжение</strong> - это величина, равная работе электрического поля по перемещению положительного единичного заряда из одной точки в другую.\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Формула: U = A / q</strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>U - напряжение </strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>A - работа электрического поля по перемещению заряда или работа тока</strong>(то есть то давление которое действует на поток воды)\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>q - заряд, над которым электрическое поле совершает работу</strong>(поток воды)\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Напряжение измеряется в Вольтах</strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Вольтметр - прибор для измерения напряжения.</strong>\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">И последняя основная токовая величина - <strong>сопротивление. </strong>Представим, что нашу трубу наполнили камнями. Тогда воде будет труднее течь, и ее скорость уменьшится. Сопротивление зависит от длины проводника, по которому течет ток (длины трубы при аналогии с водой), площади сечения проводника (диаметр трубы) и от материала из которого изготовлен проводник(вид камней).\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">Чем длиннее труба, тем больше в ней свободного места, также и с проводником с током. Чем шире труба, также в ней больше свободного места, с проводником точно также. И если камни плоские то, воде течь легче, а если наоборот шершавые, то сложнее. Думаю не так сложно и достаточно понятно. \n" +
                "</p>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Сопротивление</strong> - величина, препятствующая прохождению электрического тока через проводник.\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Формула: R = p*l/S</strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>R - сопротивление</strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>p - удельное сопротивление вещества из которого изготовлен проводник.</strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>l - длина проводника</strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>S - площадь поперечного сечения проводника</strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Сопротивление измеряется в Омах.</strong>\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Омметр</strong> - прибор для измерения сопротивления.\n" +
                "</blockquote>\n" +
                "\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "\n" +
                "                </h1></div>\n" +
                "                \n" +
                "            </div>\n" +
                "        </article>\n" +
                "        <div id=\"content-ending\"></div>\n" +
                "\n" +
                "    \n" +
                "\n" +
                "        <link rel=\"stylesheet\" href=\"//yastatic.net/zen-publishers/auto/article.logos.0ecfe427cd4f05eeb414f7cbb7d92ec7.css\">\n" +
                "\n" +
                "    <script src=\"//yastatic.net/zen-publishers/auto/client-errors.js?1524928332478\" defer=\"\"></script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div style=\"position: fixed; left: -99px;\"><div id=\"sf-2195282196\" style=\"width: 1px; height: 1px; position: relative;\"><iframe frameborder=\"no\" scrolling=\"no\" allowtransparency=\"true\" hidefocus=\"true\" tabindex=\"-1\" marginwidth=\"0\" marginheight=\"0\" name=\"%7B%22id%22%3A%22sf-2195282196%22%2C%22html%22%3A%22%3Cscript%3Evar%20config%3D%7B%5C%22rtb%5C%22%3A%7B%5C%22matchUrls%5C%22%3A%5B%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fbidswitch%2F%5C%22%2C%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Frubicon%2F%5C%22%2C%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fgoogle%2F%5C%22%2C%5C%22https%3A%2F%2Fdmg.digitaltarget.ru%2F1%2F119%2Fi%2Fi%3Fi%3D1525890032%5C%22%2C%5C%22https%3A%2F%2Fyandex-dmp-sync.rutarget.ru%2Fsync%5C%22%2C%5C%22https%3A%2F%2Fyandex-sync.rutarget.ru%2Fsync%5C%22%2C%5C%22https%3A%2F%2Fx01.aidata.io%2F0.gif%3Fpid%3DYANDEX%5C%22%2C%5C%22https%3A%2F%2Fsync.1dmp.io%2Fpixel.gif%3Fcid%3D3cbc2ec8-1421-4677-89fe-2ac6fc52a09a%26pid%3Dw%26o%3Dau%5C%22%2C%5C%22https%3A%2F%2Fredirect.frontend.weborama.fr%2Fredirect%2Fstandard%3Furl%3Dhttps%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fdmpweborama%2F%7BWEBO_CID%7D%5C%22%2C%5C%22https%3A%2F%2Ffront.facetz.net%2Fcollect%3Fsync_redirect%3Dyandexdmp%5C%22%5D%7D%7D%3C%2Fscript%3E%3Cscript%3E%5C%22use%20strict%5C%22%3Bfunction%20t(t%2Ce%2Cn)%7Bvar%20s%3Dt%2B%5C%22%3D1%5C%22%3Bif(-1%3D%3D%3Ddocument.cookie.indexOf(s))%7Bvar%20a%3D86400*e*1e3%2Cc%3Dnew%20Date%2Cr%3Dnew%20Date(Number(c)%2Ba).toUTCString()%3Bdocument.cookie%3Ds%2B%5C%22%3B%20expires%3D%5C%22%2Br%2Cn()%7D%7Dfunction%20e(t)%7B(new%20Image).src%3Dt%7Dif(config.rtb)%7Bvar%20n%3Dconfig.rtb.matchUrls%3Bt(%5C%22pcs3%5C%22%2C1%2Cfunction()%7Bvar%20t%2Ce%3Bt%3D%5C%22https%3A%2F%2Fyastatic.net%2Fq%2Fset%2Fs%2Frsya-tag-users%2Fbundle.js%5C%22%2C(e%3Ddocument.createElement(%5C%22script%5C%22)).src%3Dt%2Cdocument.body.appendChild(e)%7D)%2Cs%3D.2%2CMath.random()%3Cs%26%26t(%5C%22pcssspb%5C%22%2C14%2Cfunction()%7Bfor(var%20t%3D0%3Bt%3Cn.length%3Bt%2B%2B)e(n%5Bt%5D)%7D)%2Ce(%5C%22https%3A%2F%2Fysa-static.passport.yandex.ru%2Fstatic%2F1%2Fd959d7e39d5067fad30d9c06204866e9%2Fd.png%3Fex%3Dyes%5C%22)%7Dvar%20s%3B%3C%2Fscript%3E%22%2C%22pmGuid%22%3A%22_1525890031844_55_2%22%2C%22geom%22%3A%7B%22win%22%3A%7B%22t%22%3A0%2C%22l%22%3A0%2C%22w%22%3A1280%2C%22h%22%3A918%2C%22b%22%3A918%2C%22r%22%3A1280%7D%2C%22self%22%3A%7B%22t%22%3A3617%2C%22l%22%3A-99%2C%22b%22%3A3618%2C%22r%22%3A-98%2C%22w%22%3A1%2C%22h%22%3A1%2C%22xiv%22%3A0%2C%22yiv%22%3A0%2C%22iv%22%3A0%2C%22z%22%3A0%7D%2C%22exp%22%3A%7B%22t%22%3A3617%2C%22l%22%3A0%2C%22r%22%3A1378%2C%22b%22%3A0%2C%22xs%22%3A0%2C%22ys%22%3A0%7D%7D%2C%22hasFocus%22%3Atrue%2C%22supports%22%3A%7B%22exp-ovr%22%3Atrue%2C%22exp-push%22%3Afalse%2C%22read-cookie%22%3Afalse%2C%22write-cookie%22%3Afalse%7D%2C%22css%22%3A%22%22%2C%22bg%22%3A%22transparent%22%2C%22posMeta%22%3A%7B%22sharedData%22%3A%7B%22sf_ver%22%3A%221-1-0%22%2C%22ck_o%22%3A1%2C%22flash_ver%22%3A0%7D%2C%22ownerKey%22%3A%22%22%2C%22privateData%22%3A%7B%7D%7D%2C%22target%22%3A%22_blank%22%2C%22basePath%22%3A%22%22%7D\" src=\"//yastatic.net/safeframe-bundles/0.33/1-1-0/render.html\" width=\"1\" height=\"1\" style=\"width: 1px; height: 1px; top: 0px; left: 0px; position: absolute;\"></iframe></div></div></body></html>";

        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadData(s,"text/html; charset=utf-8", "utf-8");
    }
}

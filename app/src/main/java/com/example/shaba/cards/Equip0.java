package com.example.shaba.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Equip0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String s = "<html lang=\"ru\" prefix=\"og: http://ogp.me/ns#\"><head><meta charset=\"UTF-8\">\n" +
                "            <link rel=\"canonical\" href=\"https://zen.yandex.ru/media/elektronik/kak-rabotaet-ampermetr-elektropribory-5ac5347fdd248450844730ac\">\n" +
                "        <title>Как работает амперметр. Электроприборы. | ЗАМЕТКИ ЭЛЕКТРОТЕХНИКА | Яндекс Дзен</title><meta property=\"og:title\" content=\"Как работает амперметр. Электроприборы.\">\n" +
                "<meta property=\"og:description\" content=\"Для чего вообще он нужен и как им пользоваться?\n" +
                "\">\n" +
                "<meta property=\"og:image\" content=\"https://avatars.mds.yandex.net/get-zen_doc/51081/pub_5ac5c1d6d27a8e00b9446c48_5ac5c1d6d27a8e00b9446c49/orig\">\n" +
                "<meta property=\"og:url\" content=\"https://zen.yandex.ru/media/elektronik/kak-rabotaet-ampermetr-elektropribory-5ac5347fdd248450844730ac\">\n" +
                "<meta name=\"twitter:card\" content=\"summary_large_image\">\n" +
                "<meta property=\"og:site_name\" content=\"Яндекс Дзен | Платформа для авторов, издателей и брендов\">\n" +
                "<meta name=\"twitter:image:alt\" content=\"Как работает амперметр. Электроприборы.\">\n" +
                "<meta name=\"description\" content=\"Для чего вообще он нужен и как им пользоваться?\n" +
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
                "<script type=\"text/javascript\" async=\"\" src=\"https://mc.yandex.ru/metrika/watch.js\"></script>\n" +
                "\n" +
                "</head><body><p class=\"article-block article-block-unstyled\"><strong>Амперметр - это прибор, с помощью которого измеряют силу электрического тока.</strong>\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 800px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac5347fdd248450844730ac_5ac53637bcf1bcca1feb76a8\"><img itemprop=\"image\" class=\"article-block-image__image \" src=\"https://avatars.mds.yandex.net/get-zen_doc/125920/pub_5ac5347fdd248450844730ac_5ac53637bcf1bcca1feb76a8/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/125920/pub_5ac5347fdd248450844730ac_5ac53637bcf1bcca1feb76a8/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/125920/pub_5ac5347fdd248450844730ac_5ac53637bcf1bcca1feb76a8/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/125920/pub_5ac5347fdd248450844730ac_5ac53637bcf1bcca1feb76a8/scale_720 2x\" alt=\"Амперметр\"></div></div><figcaption class=\"article-block-image__caption\">Амперметр</figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Мы знаем, что сила тока измеряется в Амперах, поэтому на всех амперметрах есть буква \"А\". На электрических схемах он изображается кружком, внутри которого буква \"А\".</strong>\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 644px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac5347fdd248450844730ac_5ac536ce57906a19424a32f8\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5ac5347fdd248450844730ac_5ac536ce57906a19424a32f8/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5ac5347fdd248450844730ac_5ac536ce57906a19424a32f8/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5ac5347fdd248450844730ac_5ac536ce57906a19424a32f8/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5ac5347fdd248450844730ac_5ac536ce57906a19424a32f8/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5ac5347fdd248450844730ac_5ac536ce57906a19424a32f8/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5ac5347fdd248450844730ac_5ac536ce57906a19424a32f8/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5ac5347fdd248450844730ac_5ac536ce57906a19424a32f8/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5ac5347fdd248450844730ac_5ac536ce57906a19424a32f8/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Необходимо знать как правильно подключать амперметр. </strong>Амперметр подключается в сеть последовательно, как показано на картинке выше.\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Также очень важно!</strong> Перед подключение необходимо убедится на какой ток данный амперметр расcчитан: переменный или постоянный, а также какое максимально допустимое значение он может измерить. В противном случае прибор выйдет из строя. Так что не стоит мерить ток в 5 Ампер миллиамперметром, рассчитанным на 1 Ампер. \n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Конечно если Вы пользуетесь современным цифровым амперметром, то такие проблемы Вам не страшны</strong>. К тому же электронный амперметр намного точнее посчитает, нежели Вам придется для получения приближенных показателей на электромеханическом определять цену деления и дальше высчитывать.\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 314px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac5347fdd248450844730ac_5ac539e5d7bf21a2c74f1d33\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac5347fdd248450844730ac_5ac539e5d7bf21a2c74f1d33/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac5347fdd248450844730ac_5ac539e5d7bf21a2c74f1d33/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac5347fdd248450844730ac_5ac539e5d7bf21a2c74f1d33/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac5347fdd248450844730ac_5ac539e5d7bf21a2c74f1d33/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac5347fdd248450844730ac_5ac539e5d7bf21a2c74f1d33/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac5347fdd248450844730ac_5ac539e5d7bf21a2c74f1d33/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac5347fdd248450844730ac_5ac539e5d7bf21a2c74f1d33/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac5347fdd248450844730ac_5ac539e5d7bf21a2c74f1d33/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<h3 class=\"article-block\"><strong>Сопротивление амперметра</strong>\n" +
                "</h3>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Конечно как и у всего амперметр имеет тоже свое внутреннее сопротивление. Но оно намного меньше сопротивления цепи.</strong>\n" +
                "</p>       \n" +
                "\n" +
                "<div style=\"position: fixed; left: -99px;\"><div id=\"sf-810243344\" style=\"width: 1px; height: 1px; position: relative;\"><iframe frameborder=\"no\" scrolling=\"no\" allowtransparency=\"true\" hidefocus=\"true\" tabindex=\"-1\" marginwidth=\"0\" marginheight=\"0\" name=\"%7B%22id%22%3A%22sf-810243344%22%2C%22html%22%3A%22%3Cscript%3Evar%20config%3D%7B%5C%22rtb%5C%22%3A%7B%5C%22matchUrls%5C%22%3A%5B%5D%7D%7D%3C%2Fscript%3E%3Cscript%3E%5C%22use%20strict%5C%22%3Bfunction%20t(t%2Ce%2Cn)%7Bvar%20s%3Dt%2B%5C%22%3D1%5C%22%3Bif(-1%3D%3D%3Ddocument.cookie.indexOf(s))%7Bvar%20a%3D86400*e*1e3%2Cc%3Dnew%20Date%2Cr%3Dnew%20Date(Number(c)%2Ba).toUTCString()%3Bdocument.cookie%3Ds%2B%5C%22%3B%20expires%3D%5C%22%2Br%2Cn()%7D%7Dfunction%20e(t)%7B(new%20Image).src%3Dt%7Dif(config.rtb)%7Bvar%20n%3Dconfig.rtb.matchUrls%3Bt(%5C%22pcs3%5C%22%2C1%2Cfunction()%7Bvar%20t%2Ce%3Bt%3D%5C%22https%3A%2F%2Fyastatic.net%2Fq%2Fset%2Fs%2Frsya-tag-users%2Fbundle.js%5C%22%2C(e%3Ddocument.createElement(%5C%22script%5C%22)).src%3Dt%2Cdocument.body.appendChild(e)%7D)%2Cs%3D.2%2CMath.random()%3Cs%26%26t(%5C%22pcssspb%5C%22%2C14%2Cfunction()%7Bfor(var%20t%3D0%3Bt%3Cn.length%3Bt%2B%2B)e(n%5Bt%5D)%7D)%2Ce(%5C%22https%3A%2F%2Fysa-static.passport.yandex.ru%2Fstatic%2F1%2Fd959d7e39d5067fad30d9c06204866e9%2Fd.png%3Fex%3Dyes%5C%22)%7Dvar%20s%3B%3C%2Fscript%3E%22%2C%22pmGuid%22%3A%22_1525977323135_20_3%22%2C%22geom%22%3A%7B%22win%22%3A%7B%22t%22%3A0%2C%22l%22%3A0%2C%22w%22%3A685%2C%22h%22%3A831%2C%22b%22%3A831%2C%22r%22%3A685%7D%2C%22self%22%3A%7B%22t%22%3A3081%2C%22l%22%3A-99%2C%22b%22%3A3082%2C%22r%22%3A-98%2C%22w%22%3A1%2C%22h%22%3A1%2C%22xiv%22%3A0%2C%22yiv%22%3A0%2C%22iv%22%3A0%2C%22z%22%3A0%7D%2C%22exp%22%3A%7B%22t%22%3A3081%2C%22l%22%3A0%2C%22r%22%3A783%2C%22b%22%3A0%2C%22xs%22%3A0%2C%22ys%22%3A0%7D%7D%2C%22hasFocus%22%3Atrue%2C%22supports%22%3A%7B%22exp-ovr%22%3Atrue%2C%22exp-push%22%3Afalse%2C%22read-cookie%22%3Afalse%2C%22write-cookie%22%3Afalse%7D%2C%22css%22%3A%22%22%2C%22bg%22%3A%22transparent%22%2C%22posMeta%22%3A%7B%22sharedData%22%3A%7B%22sf_ver%22%3A%221-1-0%22%2C%22ck_o%22%3A1%2C%22flash_ver%22%3A0%7D%2C%22ownerKey%22%3A%22%22%2C%22privateData%22%3A%7B%7D%7D%2C%22target%22%3A%22_blank%22%2C%22basePath%22%3A%22%22%7D\" src=\"//yastatic.net/safeframe-bundles/0.33/1-1-0/render.html\" width=\"1\" height=\"1\" style=\"width: 1px; height: 1px; top: 0px; left: 0px; position: absolute;\"></iframe></div></div></body></html>";
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadData(s,"text/html; charset=utf-8", "utf-8");
    }
}

package com.example.shaba.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Equip1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 String s = "<html lang=\"ru\" prefix=\"og: http://ogp.me/ns#\"><head><meta charset=\"UTF-8\">\n" +
         "            <link rel=\"canonical\" href=\"https://zen.yandex.ru/media/elektronik/kak-pravilno-polzovatsia-multimetrom-5accf0cd482677a4ef052836\">\n" +
         "        <title>Как правильно пользоваться мультиметром? | ЗАМЕТКИ ЭЛЕКТРОТЕХНИКА | Яндекс Дзен</title><meta property=\"og:title\" content=\"Как правильно пользоваться мультиметром?\">\n" +
         "<meta property=\"og:description\" content=\"Мультиметр - комбинированный электроизмерительный прибор. Он включает в себя функции амперметра, вольтметра и омметра.\n" +
         "Данный прибор просто необходим не только начинающему электротехнику, но и опытному электрику.\n" +
         "Сперва стоит разобраться с обозначениями расположенными на мультиметре. Возьмем среднестатистический мультиметр, если так можно сказать.\n" +
         "Мы определились в какое положение необходимо поста\">\n" +
         "<meta property=\"og:image\" content=\"https://avatars.mds.yandex.net/get-zen_doc/198938/pub_5accfaad87cf1200b7bbc29d_5accfaad87cf1200b7bbc29e/orig\">\n" +
         "<meta property=\"og:url\" content=\"https://zen.yandex.ru/media/elektronik/kak-pravilno-polzovatsia-multimetrom-5accf0cd482677a4ef052836\">\n" +
         "<meta name=\"twitter:card\" content=\"summary_large_image\">\n" +
         "<meta property=\"og:site_name\" content=\"Яндекс Дзен | Платформа для авторов, издателей и брендов\">\n" +
         "<meta name=\"twitter:image:alt\" content=\"Как правильно пользоваться мультиметром?\">\n" +
         "<meta name=\"description\" content=\"Мультиметр - комбинированный электроизмерительный прибор. Он включает в себя функции амперметра, вольтметра и омметра.\n" +
         "Данный прибор просто необходим не только начинающему электротехнику, но и опытному электрику.\n" +
         "Сперва стоит разобраться с обозначениями расположенными на мультиметре. Возьмем среднестатистический мультиметр, если так можно сказать.\n" +
         "Мы определились в какое положение необходимо поста\">\n" +
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
         "<script type=\"text/javascript\" async=\"\" src=\"https://mc.yandex.ru/metrika/watch.js\"></script><script type=\"text/javascript\" async=\"\" src=\"https://mc.yandex.ru/metrika/watch.js\"></script></head><body>Мультиметр - комбинированный электроизмерительный прибор. Он включает в себя функции амперметра, вольтметра и омметра.\n" +
         "<p></p>\n" +
         "<p class=\"article-block article-block-unstyled\">Данный прибор просто необходим не только начинающему электротехнику, но и опытному электрику. \n" +
         "</p>\n" +
         "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 522px;\"><div class=\"article-block-image__zoom\" id=\"pub_5accf0cd482677a4ef052836_5accf3ea482677a4ef052857\"><img itemprop=\"image\" class=\"article-block-image__image \" src=\"https://avatars.mds.yandex.net/get-zen_doc/171054/pub_5accf0cd482677a4ef052836_5accf3ea482677a4ef052857/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/171054/pub_5accf0cd482677a4ef052836_5accf3ea482677a4ef052857/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/171054/pub_5accf0cd482677a4ef052836_5accf3ea482677a4ef052857/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/171054/pub_5accf0cd482677a4ef052836_5accf3ea482677a4ef052857/scale_720 2x\" alt=\"\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
         "\n" +
         "<p class=\"article-block article-block-unstyled\">Сперва стоит разобраться с обозначениями расположенными на мультиметре. Возьмем среднестатистический мультиметр, если так можно сказать.\n" +
         "</p>\n" +
         "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 1024px;\"><div class=\"article-block-image__zoom\" id=\"pub_5accf0cd482677a4ef052836_5accf433c3321b8a7c257464\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5accf0cd482677a4ef052836_5accf433c3321b8a7c257464/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5accf0cd482677a4ef052836_5accf433c3321b8a7c257464/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5accf0cd482677a4ef052836_5accf433c3321b8a7c257464/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5accf0cd482677a4ef052836_5accf433c3321b8a7c257464/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5accf0cd482677a4ef052836_5accf433c3321b8a7c257464/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5accf0cd482677a4ef052836_5accf433c3321b8a7c257464/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5accf0cd482677a4ef052836_5accf433c3321b8a7c257464/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/171120/pub_5accf0cd482677a4ef052836_5accf433c3321b8a7c257464/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
         "\n" +
         "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 430px;\"><div class=\"article-block-image__zoom\" id=\"pub_5accf0cd482677a4ef052836_5accf6b1db0cd9b106505f19\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/230865/pub_5accf0cd482677a4ef052836_5accf6b1db0cd9b106505f19/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/230865/pub_5accf0cd482677a4ef052836_5accf6b1db0cd9b106505f19/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/230865/pub_5accf0cd482677a4ef052836_5accf6b1db0cd9b106505f19/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/230865/pub_5accf0cd482677a4ef052836_5accf6b1db0cd9b106505f19/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/230865/pub_5accf0cd482677a4ef052836_5accf6b1db0cd9b106505f19/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/230865/pub_5accf0cd482677a4ef052836_5accf6b1db0cd9b106505f19/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/230865/pub_5accf0cd482677a4ef052836_5accf6b1db0cd9b106505f19/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/230865/pub_5accf0cd482677a4ef052836_5accf6b1db0cd9b106505f19/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
         "\n" +
         "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 796px;\"><div class=\"article-block-image__zoom\" id=\"pub_5accf0cd482677a4ef052836_5accf6d1581669575714478f\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf6d1581669575714478f/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf6d1581669575714478f/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf6d1581669575714478f/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf6d1581669575714478f/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf6d1581669575714478f/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf6d1581669575714478f/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf6d1581669575714478f/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf6d1581669575714478f/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
         "\n" +
         "<p class=\"article-block article-block-unstyled\">Мы определились в какое положение необходимо поставить крутилку. Теперь надо понять, как подключать щупы.\n" +
         "</p>\n" +
         "<p class=\"article-block article-block-unstyled\">Смотрим на картинку\n" +
         "</p>\n" +
         "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 1200px;\"><div class=\"article-block-image__zoom\" id=\"pub_5accf0cd482677a4ef052836_5accf7d95f49678719630f5d\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf7d95f49678719630f5d/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf7d95f49678719630f5d/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf7d95f49678719630f5d/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf7d95f49678719630f5d/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf7d95f49678719630f5d/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf7d95f49678719630f5d/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf7d95f49678719630f5d/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1328418/pub_5accf0cd482677a4ef052836_5accf7d95f49678719630f5d/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
         "\n" +
         "<p class=\"article-block article-block-unstyled\"><strong>1 гнездо с надписью 10A</strong> -  Для измерения силы тока до 10 Ампер.\n" +
         "</p>\n" +
         "<p class=\"article-block article-block-unstyled\"><strong>2 гнездо с надписью mA</strong> - Для измерения силы тока до 200 миллиАмпер.\n" +
         "</p>\n" +
         "<p class=\"article-block article-block-unstyled\"><strong>3 гнездо с надписью V Ω</strong> - Для измерения напряжения, сопротивления, температуры, а также для прозвонки диодов\n" +
         "</p>\n" +
         "<p class=\"article-block article-block-unstyled\"><strong>4 гнездо с надписью COM</strong> - сюда вставляется обычно щуп черного цвета\n" +
         "</p>\n" +
         "<p class=\"article-block article-block-unstyled\">Например чтобы измерить сопротивление, то вставляем черный щуп в 4 гнездо, а красный в 3 гнездо. (цвет щупов значения не имеет, просто так принято)\n" +
         "</p>\n" +
         "<p class=\"article-block article-block-unstyled\">В случае, если необходимо измерить емкость, то щупы нужно вставлять в разъемы 2 и 3.\n" +
         "</p>\n" +
         "<p class=\"article-block article-block-unstyled\"><strong>И не забывайте, что при измерении тока подсоединяем мультиметр последовательно, а для всего остального - параллельно.</strong>\n" +
         "</p>\n" +
         "<p class=\"article-block article-block-unstyled\">Надеюсь все понятно!\n" +
         "</p>\n" +
         "       \n" +
         "        \n" +
         "\n" +
         "<div style=\"position: fixed; left: -99px;\"><div id=\"sf-1798090447\" style=\"width: 1px; height: 1px; position: relative;\"><iframe frameborder=\"no\" scrolling=\"no\" allowtransparency=\"true\" hidefocus=\"true\" tabindex=\"-1\" marginwidth=\"0\" marginheight=\"0\" name=\"%7B%22id%22%3A%22sf-1798090447%22%2C%22html%22%3A%22%3Cscript%3Evar%20config%3D%7B%5C%22rtb%5C%22%3A%7B%5C%22matchUrls%5C%22%3A%5B%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fbidswitch%2F%5C%22%2C%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Frubicon%2F%5C%22%2C%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fgoogle%2F%5C%22%2C%5C%22https%3A%2F%2Fdmg.digitaltarget.ru%2F1%2F119%2Fi%2Fi%3Fi%3D1525978786%5C%22%2C%5C%22https%3A%2F%2Fyandex-dmp-sync.rutarget.ru%2Fsync%5C%22%2C%5C%22https%3A%2F%2Fyandex-sync.rutarget.ru%2Fsync%5C%22%2C%5C%22https%3A%2F%2Fx01.aidata.io%2F0.gif%3Fpid%3DYANDEX%5C%22%2C%5C%22https%3A%2F%2Fsync.1dmp.io%2Fpixel.gif%3Fcid%3D3cbc2ec8-1421-4677-89fe-2ac6fc52a09a%26pid%3Dw%26o%3Dau%5C%22%2C%5C%22https%3A%2F%2Fredirect.frontend.weborama.fr%2Fredirect%2Fstandard%3Furl%3Dhttps%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fdmpweborama%2F%7BWEBO_CID%7D%5C%22%2C%5C%22https%3A%2F%2Ffront.facetz.net%2Fcollect%3Fsync_redirect%3Dyandexdmp%5C%22%5D%7D%7D%3C%2Fscript%3E%3Cscript%3E%5C%22use%20strict%5C%22%3Bfunction%20t(t%2Ce%2Cn)%7Bvar%20s%3Dt%2B%5C%22%3D1%5C%22%3Bif(-1%3D%3D%3Ddocument.cookie.indexOf(s))%7Bvar%20a%3D86400*e*1e3%2Cc%3Dnew%20Date%2Cr%3Dnew%20Date(Number(c)%2Ba).toUTCString()%3Bdocument.cookie%3Ds%2B%5C%22%3B%20expires%3D%5C%22%2Br%2Cn()%7D%7Dfunction%20e(t)%7B(new%20Image).src%3Dt%7Dif(config.rtb)%7Bvar%20n%3Dconfig.rtb.matchUrls%3Bt(%5C%22pcs3%5C%22%2C1%2Cfunction()%7Bvar%20t%2Ce%3Bt%3D%5C%22https%3A%2F%2Fyastatic.net%2Fq%2Fset%2Fs%2Frsya-tag-users%2Fbundle.js%5C%22%2C(e%3Ddocument.createElement(%5C%22script%5C%22)).src%3Dt%2Cdocument.body.appendChild(e)%7D)%2Cs%3D.2%2CMath.random()%3Cs%26%26t(%5C%22pcssspb%5C%22%2C14%2Cfunction()%7Bfor(var%20t%3D0%3Bt%3Cn.length%3Bt%2B%2B)e(n%5Bt%5D)%7D)%2Ce(%5C%22https%3A%2F%2Fysa-static.passport.yandex.ru%2Fstatic%2F1%2Fd959d7e39d5067fad30d9c06204866e9%2Fd.png%3Fex%3Dyes%5C%22)%7Dvar%20s%3B%3C%2Fscript%3E%22%2C%22pmGuid%22%3A%22_1525978783559_95_3%22%2C%22geom%22%3A%7B%22win%22%3A%7B%22t%22%3A0%2C%22l%22%3A0%2C%22w%22%3A685%2C%22h%22%3A831%2C%22b%22%3A831%2C%22r%22%3A685%7D%2C%22self%22%3A%7B%22t%22%3A4206%2C%22l%22%3A-99%2C%22b%22%3A4207%2C%22r%22%3A-98%2C%22w%22%3A1%2C%22h%22%3A1%2C%22xiv%22%3A0%2C%22yiv%22%3A0%2C%22iv%22%3A0%2C%22z%22%3A0%7D%2C%22exp%22%3A%7B%22t%22%3A4206%2C%22l%22%3A0%2C%22r%22%3A783%2C%22b%22%3A0%2C%22xs%22%3A0%2C%22ys%22%3A0%7D%7D%2C%22hasFocus%22%3Atrue%2C%22supports%22%3A%7B%22exp-ovr%22%3Atrue%2C%22exp-push%22%3Afalse%2C%22read-cookie%22%3Afalse%2C%22write-cookie%22%3Afalse%7D%2C%22css%22%3A%22%22%2C%22bg%22%3A%22transparent%22%2C%22posMeta%22%3A%7B%22sharedData%22%3A%7B%22sf_ver%22%3A%221-1-0%22%2C%22ck_o%22%3A1%2C%22flash_ver%22%3A0%7D%2C%22ownerKey%22%3A%22%22%2C%22privateData%22%3A%7B%7D%7D%2C%22target%22%3A%22_blank%22%2C%22basePath%22%3A%22%22%7D\" src=\"//yastatic.net/safeframe-bundles/0.33/1-1-0/render.html\" width=\"1\" height=\"1\" style=\"width: 1px; height: 1px; top: 0px; left: 0px; position: absolute;\"></iframe></div></div></body></html>";
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadData(s,"text/html; charset=utf-8", "utf-8");
    }
}

package com.example.shaba.cards;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class Theory6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView webView = new WebView(this);
        setContentView(webView);
        String s = "<html lang=\"ru\" prefix=\"og: http://ogp.me/ns#\"><head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Электричество на пальцах. Параллельное соединение. | ЗАМЕТКИ ЭЛЕКТРОТЕХНИКА | Яндекс Дзен</title>\n" +
                "        <link rel=\"canonical\" href=\"https://zen.yandex.ru/media/elektronik/elektrichestvo-na-palcah-parallelnoe-soedinenie-5ac33432fd96b19621fe7f60\">\n" +
                "        <meta name=\"description\" content=\"В электрических цепях элементы могут соединятся по разному, в том числе они могут быть соединены последовательно и параллельно. Очень важно знать какое соединение нужно применить в конкретной схеме, так как от этого зависят показатели тока. \">\n" +
                "    <meta property=\"og:title\" content=\"Электричество на пальцах. Параллельное соединение.\">\n" +
                "<meta property=\"og:description\" content=\"В электрических цепях элементы могут соединятся по разному, в том числе они могут быть соединены последовательно и параллельно. Очень важно знать какое соединение нужно применить в конкретной схеме, так как от этого зависят показатели тока. \">\n" +
                "<meta property=\"og:image\" content=\"https://avatars.mds.yandex.net/get-zen_doc/197791/pub_5ac3b088040c3800b8facba9_5ac3b088040c3800b8facbaa/orig\">\n" +
                "<meta property=\"og:url\" content=\"https://zen.yandex.ru/media/elektronik/elektrichestvo-na-palcah-parallelnoe-soedinenie-5ac33432fd96b19621fe7f60\">\n" +
                "<meta name=\"twitter:card\" content=\"summary_large_image\">\n" +
                "<meta property=\"og:site_name\" content=\"Яндекс Дзен | Платформа для авторов, издателей и брендов\">\n" +
                "<meta name=\"twitter:image:alt\" content=\"Электричество на пальцах. Параллельное соединение.\">\n" +
                "\n" +
                "\n" +
                "\n" +
                "    </head><body>\n" +
                "        <article class=\"article\" itemscope=\"\" itemtype=\"http://schema.org/Article\">\n" +
                "            <div class=\"article__content\">\n" +
                "                \n" +
                "                <div class=\"article__middle\">\n" +
                "                    <div class=\"article__zoom-overlay\"></div><h1 class=\"article__title\" itemprop=\"headline\">Электричество на пальцах. Параллельное соединение.</h1>\n" +
                "    <div itemprop=\"articleBody\">\n" +
                "        <p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 988px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac33432fd96b19621fe7f60_5ac342ad5816697b783af76b\"><img itemprop=\"image\" class=\"article-block-image__image \" src=\"https://avatars.mds.yandex.net/get-zen_doc/60857/pub_5ac33432fd96b19621fe7f60_5ac342ad5816697b783af76b/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/60857/pub_5ac33432fd96b19621fe7f60_5ac342ad5816697b783af76b/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/60857/pub_5ac33432fd96b19621fe7f60_5ac342ad5816697b783af76b/scale_1200 2x\" alt=\"\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">В прошлой статье Вы узнали про последовательное соединение, а также должны быть решить задачку. \n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 604px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac33432fd96b19621fe7f60_5ac33bfcd7bf2113e95dceda\"><img itemprop=\"image\" class=\"article-block-image__image \" src=\"https://avatars.mds.yandex.net/get-zen_doc/51182/pub_5ac33432fd96b19621fe7f60_5ac33bfcd7bf2113e95dceda/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/51182/pub_5ac33432fd96b19621fe7f60_5ac33bfcd7bf2113e95dceda/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/51182/pub_5ac33432fd96b19621fe7f60_5ac33bfcd7bf2113e95dceda/scale_1200 2x\" alt=\"\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Правильный ответ: вариант  A</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 472px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac33432fd96b19621fe7f60_5ac33d3e48267788694d6f64\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/175962/pub_5ac33432fd96b19621fe7f60_5ac33d3e48267788694d6f64/orig\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/175962/pub_5ac33432fd96b19621fe7f60_5ac33d3e48267788694d6f64/orig\" srcset=\"\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">Подключим лампы параллельно: каждая лампа подключена к батарее напрямую, других ламп между ней и батареей нет. Так каждая лампочка получает полное напряжение и светит так же ярко, как обычно.Проводка в домах прокладывается именно так, чтобы обеспечить полное напряжение на всех электроприборах.\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Первое правило: U = U1 = U2 = U3...</strong>\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 557px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac33432fd96b19621fe7f60_5ac33eb29d5cb350233b9cc4\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/175962/pub_5ac33432fd96b19621fe7f60_5ac33eb29d5cb350233b9cc4/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/175962/pub_5ac33432fd96b19621fe7f60_5ac33eb29d5cb350233b9cc4/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/175962/pub_5ac33432fd96b19621fe7f60_5ac33eb29d5cb350233b9cc4/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/175962/pub_5ac33432fd96b19621fe7f60_5ac33eb29d5cb350233b9cc4/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/175962/pub_5ac33432fd96b19621fe7f60_5ac33eb29d5cb350233b9cc4/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/175962/pub_5ac33432fd96b19621fe7f60_5ac33eb29d5cb350233b9cc4/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">А что с током? Ток при параллельном соединении делится на три части и течет по трем участкам цепи.\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Второе правило: Y = Y1 + Y2 + Y3...</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">Общее сопротивление цепи равно одной трети сопротивления одной лампы, так как сечение нашей \"трубы с камнями\", по которой течет вода, утроилось. Значит, по закону Ома, через всю цепь в целом сможет пройти в три раза больше тока.\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Третье правило: 1/R = 1/R1 + 1/R2 + 1/R3...</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<h3 class=\"article-block\"><strong>Соберем все правила параллельного соединения вместе:</strong>\n" +
                "</h3>\n" +
                "<blockquote class=\"article-block article-block-quote\"> <strong>Первое правило: U = U1 = U2 = U3...</strong> \n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"> <strong>Второе правило: Y = Y1 + Y2 + Y3...</strong> \n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"> <strong>Третье правило: 1/R = 1/R1 + 1/R2 + 1/R3...</strong> \n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Общее сопротивление находится по формуле: R = R1 * R2* R3 / R1 + R2 + R3</strong>\n" +
                "</blockquote>\n" +
                "\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "\n" +
                "                </div>\n" +
                "                \n" +
                "            </div>\n" +
                "        </article>\n" +
                "        <div id=\"content-ending\"></div>\n" +
                "\n" +
                "    <footer id=\"footer\"><div class=\"article-footer article-footer_empty\"><div class=\"editor-help-buttons\"><div class=\"help-button help-button_hidden editor-help-buttons__button\"><span class=\"help-button__help-text\">?</span></div><div class=\"help-button editor-help-buttons__button\"><a class=\"help-button__link\" href=\"https://forms.yandex.ru/surveys/6674/?znchnlid=5ac0ee4ff031731b9711bf06\" target=\"_blank\" rel=\" noopener nofollow\"><div class=\"help-button__feedback-icon\"></div></a></div></div></div></footer>\n" +
                "\n" +
                "        <link rel=\"stylesheet\" href=\"//yastatic.net/zen-publishers/auto/article.logos.0ecfe427cd4f05eeb414f7cbb7d92ec7.css\">\n" +
                "\n" +
                "    <script src=\"//yastatic.net/zen-publishers/auto/client-errors.js?1524928332478\" defer=\"\"></script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div style=\"position: fixed; left: -99px;\"><div id=\"sf-3514256248\" style=\"width: 1px; height: 1px; position: relative;\"><iframe frameborder=\"no\" scrolling=\"no\" allowtransparency=\"true\" hidefocus=\"true\" tabindex=\"-1\" marginwidth=\"0\" marginheight=\"0\" name=\"%7B%22id%22%3A%22sf-3514256248%22%2C%22html%22%3A%22%3Cscript%3Evar%20config%3D%7B%5C%22rtb%5C%22%3A%7B%5C%22matchUrls%5C%22%3A%5B%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fbidswitch%2F%5C%22%2C%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Frubicon%2F%5C%22%2C%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fgoogle%2F%5C%22%2C%5C%22https%3A%2F%2Fdmg.digitaltarget.ru%2F1%2F119%2Fi%2Fi%3Fi%3D1525892174%5C%22%2C%5C%22https%3A%2F%2Fyandex-dmp-sync.rutarget.ru%2Fsync%5C%22%2C%5C%22https%3A%2F%2Fyandex-sync.rutarget.ru%2Fsync%5C%22%2C%5C%22https%3A%2F%2Fx01.aidata.io%2F0.gif%3Fpid%3DYANDEX%5C%22%2C%5C%22https%3A%2F%2Fsync.1dmp.io%2Fpixel.gif%3Fcid%3D3cbc2ec8-1421-4677-89fe-2ac6fc52a09a%26pid%3Dw%26o%3Dau%5C%22%2C%5C%22https%3A%2F%2Fredirect.frontend.weborama.fr%2Fredirect%2Fstandard%3Furl%3Dhttps%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fdmpweborama%2F%7BWEBO_CID%7D%5C%22%2C%5C%22https%3A%2F%2Ffront.facetz.net%2Fcollect%3Fsync_redirect%3Dyandexdmp%5C%22%5D%7D%7D%3C%2Fscript%3E%3Cscript%3E%5C%22use%20strict%5C%22%3Bfunction%20t(t%2Ce%2Cn)%7Bvar%20s%3Dt%2B%5C%22%3D1%5C%22%3Bif(-1%3D%3D%3Ddocument.cookie.indexOf(s))%7Bvar%20a%3D86400*e*1e3%2Cc%3Dnew%20Date%2Cr%3Dnew%20Date(Number(c)%2Ba).toUTCString()%3Bdocument.cookie%3Ds%2B%5C%22%3B%20expires%3D%5C%22%2Br%2Cn()%7D%7Dfunction%20e(t)%7B(new%20Image).src%3Dt%7Dif(config.rtb)%7Bvar%20n%3Dconfig.rtb.matchUrls%3Bt(%5C%22pcs3%5C%22%2C1%2Cfunction()%7Bvar%20t%2Ce%3Bt%3D%5C%22https%3A%2F%2Fyastatic.net%2Fq%2Fset%2Fs%2Frsya-tag-users%2Fbundle.js%5C%22%2C(e%3Ddocument.createElement(%5C%22script%5C%22)).src%3Dt%2Cdocument.body.appendChild(e)%7D)%2Cs%3D.2%2CMath.random()%3Cs%26%26t(%5C%22pcssspb%5C%22%2C14%2Cfunction()%7Bfor(var%20t%3D0%3Bt%3Cn.length%3Bt%2B%2B)e(n%5Bt%5D)%7D)%2Ce(%5C%22https%3A%2F%2Fysa-static.passport.yandex.ru%2Fstatic%2F1%2Fd959d7e39d5067fad30d9c06204866e9%2Fd.png%3Fex%3Dyes%5C%22)%7Dvar%20s%3B%3C%2Fscript%3E%22%2C%22pmGuid%22%3A%22_1525892174426_85_2%22%2C%22geom%22%3A%7B%22win%22%3A%7B%22t%22%3A0%2C%22l%22%3A0%2C%22w%22%3A1280%2C%22h%22%3A918%2C%22b%22%3A918%2C%22r%22%3A1280%7D%2C%22self%22%3A%7B%22t%22%3A4234%2C%22l%22%3A-99%2C%22b%22%3A4235%2C%22r%22%3A-98%2C%22w%22%3A1%2C%22h%22%3A1%2C%22xiv%22%3A0%2C%22yiv%22%3A0%2C%22iv%22%3A0%2C%22z%22%3A0%7D%2C%22exp%22%3A%7B%22t%22%3A4234%2C%22l%22%3A0%2C%22r%22%3A1378%2C%22b%22%3A0%2C%22xs%22%3A0%2C%22ys%22%3A0%7D%7D%2C%22hasFocus%22%3Atrue%2C%22supports%22%3A%7B%22exp-ovr%22%3Atrue%2C%22exp-push%22%3Afalse%2C%22read-cookie%22%3Afalse%2C%22write-cookie%22%3Afalse%7D%2C%22css%22%3A%22%22%2C%22bg%22%3A%22transparent%22%2C%22posMeta%22%3A%7B%22sharedData%22%3A%7B%22sf_ver%22%3A%221-1-0%22%2C%22ck_o%22%3A1%2C%22flash_ver%22%3A0%7D%2C%22ownerKey%22%3A%22%22%2C%22privateData%22%3A%7B%7D%7D%2C%22target%22%3A%22_blank%22%2C%22basePath%22%3A%22%22%7D\" src=\"//yastatic.net/safeframe-bundles/0.33/1-1-0/render.html\" width=\"1\" height=\"1\" style=\"width: 1px; height: 1px; top: 0px; left: 0px; position: absolute;\"></iframe></div></div></body></html>";

        webView.loadData(s,"text/html; charset=utf-8", "utf-8");
    }

}
